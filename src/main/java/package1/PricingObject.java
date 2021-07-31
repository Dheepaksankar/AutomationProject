package package1;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricingObject extends Basepage {


	@FindBy(xpath="//div[@class='cards']/div[2]//span[contains(text(),'Buy now')]")
	private WebElement btnbuyNowAndroid;;
	
	@FindBy(xpath="//div[@id='android']//strong")
	private WebElement txtPriceAndroidFromDialog;
	
	@FindBy(xpath="//div[@id='android']//button[@class='close']")
	private WebElement iconCloseDialog;
	
	@FindBy(xpath ="//div[@class='bottom wow fadenIn animated']/div[1]//div[.//*[@fill ='#2E4CE6")
	private WebElement listtick;
	
	public PricingObject() {
		PageFactory.initElements(driver, this);
	}
	
	public int getAndroidPrice() {
		String price = txtPriceAndroidFromDialog.getText();
		return Integer.parseInt(price);
		
	}
	
	public void clickBuyNow() {
		btnbuyNowAndroid.click();
		
	}
	
	public int getPriceFromPopup() {
		String price = txtPriceAndroidFromDialog.getText().replace("$", "").trim();
		return Integer.parseInt(price);
		
	}
	
	public void closeDialog() {
		iconCloseDialog.click();
	}
	
	public ArrayList<String> getlisttick[];{
		ArrayList<String> list= new ArrayList<String>();
		for (WebElement element : list) {
			list.add(element.getText())
		}
		
	}
	
}