package getRequest;
import Common_utils.CSVUtils;
import Common_utils.Repsitory;
import HotelInfoPojos.HexSearchHotel;
import HotelInfoPojos.Search;
import HotelInfoPojos.Store;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import static com.jayway.restassured.RestAssured.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import ApiTesting.HexHotelSearchwithPost;
import ApiTesting.roomwisePaxInfo;



public class HexHotelSearch extends Repsitory  {
	public List<Store> data = new ArrayList<Store>();
	
	
	@Test(priority=2)
	public void writeIntoExcel() throws Exception {
		//Write data into Excel
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		File csvFile = new File("./result/numberofhotels" + timestamp + ".csv");
        FileWriter writer = new FileWriter(csvFile);
        
        for(Store store : data) {
        	List<String> columns = new ArrayList<String>();
        	columns.add(store.cityName);
        	columns.add(store.checkInDate);
        	columns.add(store.checkOutDate);        	
        	columns.add(store.counts);
            CSVUtils.writeLine(writer, columns);
        }
        writer.flush();
        writer.close();
	}
	
	@DataProvider(name="Inputdata")
	public Object[][] getData() throws BiffException, FileNotFoundException, IOException {

		Workbook wb = Workbook.getWorkbook(new FileInputStream("./src/main/resources/inputFiles/HotelSearchinputOYOcities.xls"));

		Sheet sh = wb.getSheet(0);


		int row = sh.getRows();
		int col = sh.getColumns();

		Object[][] data = new Object[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i][j] = sh.getCell(j, i).getContents();
			}
		}

		return data;

	}
	
	@Test(dataProvider="Inputdata",priority=1)
	public void searchHotels(String cityName,String checkinDate,String checkoutDate) {
		roomwisePaxInfo room=new roomwisePaxInfo();
		room.setRoomNo("1");
		room.setNum_adults("2");
		
		HexHotelSearchwithPost hotel=new HexHotelSearchwithPost();
		hotel.setCity(cityName);
		hotel.setRooms("1");
		hotel.setCheck_in_date(checkinDate);
		hotel.setCheck_out_date(checkoutDate);
		hotel.setKey("AXR-LIB");
		hotel.setBuyer_id("91");
		hotel.setCorporate_buyer_id("123");
		hotel.setRoomwisePax(new roomwisePaxInfo[]{room});
		
		Response resp=given().
		body(hotel).
		when().
		contentType(ContentType.JSON).
		post("http://hex.axisrooms.com/hexapi/hotelsearch");
		System.out.println(resp.asString());
		
		Search searchHotel = new Gson().fromJson(resp.body().asString(),Search.class);
		List<HexSearchHotel> hotels = searchHotel.hotels;
		System.out.println("Hotel Counts: "+hotels.size());
		
		Store store = new Store();
		store.checkInDate = checkinDate;
		store.checkOutDate = checkoutDate;
		store.counts = String.valueOf(hotels.size());
		store.cityName = cityName;
		
		data.add(store);
		createLogs(Integer.toString(hotels.size()));
	
		
	}

}
