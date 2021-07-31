package package2;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import package1.Phphomepage;
import package1.PricingObject;

public class PricingTest {

	PricingObject homepage;
	PricingObject bc;

	public PricingTest() {
		// TODO Auto-generated constructor stub

		homepage = new PricingObject();
		
	}

	@Test
	public void Verifybuynowbtn() {

		int androidprice = homepage.getAndroidPrice();
		homepage.clickBuyNow();
		int popupprice = homepage.getPriceFromPopup();

		Assert.assertTrue(androidprice == popupprice);
	}

	
	
	
	@Test
	public void verifyapp() {
		homepage.clickBuyNow();
	 
	}
}
