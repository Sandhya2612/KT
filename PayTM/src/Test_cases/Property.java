package Test_cases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common_utils.Repository;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Property extends Repository{
	
	@DataProvider(name="getData")// to read the excel file that contains all the hotel details used to create property
	public Object[][] getData() throws BiffException, FileNotFoundException, IOException {

		Workbook wb = Workbook.getWorkbook(new FileInputStream("./data/CreateHotel.xls"));

		Sheet sh = wb.getSheet(0);


		int row = sh.getRows();
		int col = sh.getColumns();

		Object[][] data = new Object[row][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i][j] = sh.getCell(j, i).getContents();
			}
		}

		return data;

	}
  @Test(dataProvider="getData", priority=3)
  public void createProperty() {
	  
	  
	  
  }
}
