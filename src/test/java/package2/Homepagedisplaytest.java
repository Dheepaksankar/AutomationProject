package package2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

import package1.Basepage;
import package1.HomePageObjects;





	@Test
	public class Homepagedisplaytest {

		HomePageObjects homePage;
		Basepage bp;
		public   void HomePageTest() {
			homePage = new HomePageObjects();
			bp = new Basepage();
		
		}
		@Test
		public void verifynavigation() 
		{
			homePage.Women();
			Assert.assertTrue(homePage.getTitlte());
		
	}
	}