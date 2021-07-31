package package1;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects  extends Basepage {

	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")
	private WebElement Women;
	
	@FindBy (xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
	private WebElement Dresses;
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
	private WebElement TShirt;
	
	
	
	
	
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
    
	
	public void Women() {
		Women.click();
	}
	
	public void Dresses () {
		Dresses.click();
	}
	
	public void Tshirt() {
		TShirt.click();
		

	}
	
	public boolean verifydisplay() {
		return elementFound(Women);
	}
	

	
	
}



