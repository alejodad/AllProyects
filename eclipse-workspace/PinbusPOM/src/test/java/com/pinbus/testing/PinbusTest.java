package com.pinbus.testing;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.pinbus.HomePagePinbus;
import com.pinbus.PagerSearch;
import com.pinbus.PinbusPOM;

public class PinbusTest extends BaseTest
{
	HomePagePinbus objHomePagepinbus;
	PinbusPOM objPimbusPOM;
	PagerSearch objPagerSearch;
	
	@Test
	public void Test_Pinbus_Search() throws Exception 
	{
		 String strIda="Bogota";
		 String strRegreso="Medellin";
		 String[] strDepartureDate= {"18","septiembre","2019"};
		 String[] srtReturnDate = {"25","noviembre","2019"};
		 
		 objHomePagepinbus= new HomePagePinbus(driver, wait);
		 objPimbusPOM = new PinbusPOM(driver, wait);
		 objPagerSearch = new PagerSearch(driver, wait);
		 
		 
		 Thread.sleep(5000);
		 objPimbusPOM.FntWriteOrigin(strIda);
		 objPimbusPOM.FntWriteDestiny(strRegreso);
		 objPimbusPOM.FtnSetDateDeparture(strDepartureDate);
		 objPimbusPOM.FtnSetDateReturn(srtReturnDate);
		 objPimbusPOM.FtnClickSearch();
		 
		 assertNotNull(objPagerSearch.FtnGetElement());
	}

}
