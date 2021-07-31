package package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Phphomepage extends Basepage {

	@FindBy(linkText = "Demo")
	private WebElement lnkDemo;
	
	@FindBy(linkText = "Pricing")
	private WebElement lnkPricing;
	@FindBy(xpath = "//*[@id=\'Main\']/div[6]/div/div[1]/section/div[2]/div[2]/div/div[4]/span[1]")
			private WebElement txtandroidappprice;
	public  Phphomepage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getlinkdemo() {
		return lnkDemo;
	}
	
	
	public String gettxtLinkDemo() {
		return lnkDemo.getText();
	}
	
	
	public int getAndroidprc() {
		String price = txtandroidappprice.getText();
		return Integer.parseInt(price);
	}
	
	public WebElement getlinkpricing() {
		return lnkPricing;
	}
	
}
