package package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

import package1.Basepage;
import package1.HomePageObjects;

@Test
public class HomePageTest {

	HomePageObjects homePage;
	Basepage bp;

	public void HomePageTest() {
		homePage = new HomePageObjects();
		bp = new Basepage();

	}

	@Test
	public void verifynavigation() {
		homePage.Women();
		Assert.assertTrue(homePage.getTitlte().contains("Women"));

		homePage.Dresses();
		Assert.assertTrue(homePage.getTitlte().contains("Dress"));

		homePage.Tshirt();
		Assert.assertTrue(homePage.getTitlte().contains("T-shirt"));
	}

	@Test
	public void verifydisply() {
		Assert.assertTrue(homePage.verifydisplay());

	}

}