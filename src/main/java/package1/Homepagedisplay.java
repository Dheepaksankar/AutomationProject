package package1;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class Homepagedisplay extends Basepage {
	
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")
	private WebElement Women;
	
	
	public Homepagedisplay() {
		PageFactory.initElements(driver, this);
	}

	public boolean women() {
		Women.getText();
		return false;
	}
	
	
	
}
