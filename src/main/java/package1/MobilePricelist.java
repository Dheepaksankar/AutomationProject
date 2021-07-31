package package1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MobilePricelist extends Basepage {
	
	
	@FindBy(id = "dropdown1_0")
	private WebElement mobileDD;
	
	@FindBys(@FindBy (xpath ="//*[@id=\"acs-product-block-38\"]/div[2]/span[1]/span[2]/span[2]" ) )
	private List<WebElement> Pricelist;
	
	public  MobilePricelist() {
		PageFactory.initElements(driver, this);
	}
	
	public void dropdown() {
		Select select = new Select((WebElement) mobileDD);
		select.selectByIndex(1);
	}
	
	public ArrayList<String> arraylist(){
		ArrayList<String> list = new ArrayList<String>();
	
           for (WebElement string : Pricelist) {
	list.add(string.getText()) ;
}
return list;

}
}
