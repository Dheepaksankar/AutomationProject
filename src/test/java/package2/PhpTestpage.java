package package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import package1.Basepage;
import package1.HomePageObjects;
import package1.Phphomepage;

public class PhpTestpage {
	Phphomepage homepage;
    Phphomepage bc;
	public PhpTestpage() {
		homepage = new Phphomepage();
		bc = new Phphomepage();
	}

	@Test
	public void verifyDemolink() {
		WebElement element = homepage.getlinkdemo();
		Assert.assertTrue(bc.elementFound(element));
		Assert.assertTrue(homepage.gettxtLinkDemo().equals("Demo"));
	}
	
	@Test
	public void verifypricelink() {
		WebElement element = homepage.getlinkpricing();
		Assert.assertTrue(bc.elementFound(element));
		Assert.assertTrue(homepage.getlinkpricing().getText().equals("Pricing"));
		
	}
	
	@Test
	public void verifyAnroidprice() {
		Assert.assertTrue(homepage.getAndroidprc()<1000);
	}
}
