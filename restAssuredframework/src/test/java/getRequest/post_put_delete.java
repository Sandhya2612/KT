package getRequest;


import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class post_put_delete {
	
		
		@Test 
		public void test_02() {
			Response resp=given().
			body("{ \"city\": \"Delhi\"," + 
					"\"rooms\": \"1\"," + 
					"	\"check_in_date\": \"04/10/2019\"," + 
					"	\"check_out_date\": \"05/10/2019\"," + 
					"	\"key\": \"AXR-LIB\"," + 
					"	\"buyer_id\": 91,\n" + 
					"	\"corporate_buyer_id\": 123," + 
					"		\"roomwisePax\":" + 
					"		[ " + 
					"			{" + 
					"				\"roomNo\": \"1\"," + 
					"				\"num_adults\": \"2\"" + 
					"				 }" + 
					"		]" + 
					
					"}").
			when().
			contentType(ContentType.JSON).
			post("http://hex.axisrooms.com/hexapi/hotelsearch");
			System.out.println(resp.asString());
			
			
	}
}


