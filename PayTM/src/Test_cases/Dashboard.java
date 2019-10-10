package Test_cases;

import org.testng.annotations.Test;


import common_utils.Repository;

public class Dashboard extends Repository {
 //@Test(priority=3)
  public void searchHotel() throws InterruptedException {
	  
	 Thread.sleep(1000);
		 if(isAvailable(driver, dashboardpage.createHotel)) 
		 {
		   dashboardpage.searchProperty();
		  
		  if(isVisible(driver,dashboardpage.Active )) {
			  System.out.println("Hotel is active");
        }
		  else if(isVisible(driver, dashboardpage.inActive)) {
			  System.out.println("Hotel is inactive");
		  }
		  dashboardpage.selectProperty();
		  
		 }
  }
  
  @Test(priority=2)
  public void createHotel() throws InterruptedException {
	  Thread.sleep(1000);
	  if(isAvailable(driver, dashboardpage.createButton))
	  {
		  dashboardpage.clickCreate();
		  
	  }
  }
}
