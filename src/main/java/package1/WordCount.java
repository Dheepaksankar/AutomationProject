package package1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WordCount extends Basepage {
	
	@FindBy(xpath = "/html/body/header/div/nav/div[2]/span")
	private WebElement prdctDD;
	
	
	@FindBy (xpath = "/html/body/div[2]/main/div[2]/div/p")
	private WebElement textcount;
	
	public  WordCount() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void productbtn() {
		Actions action = new Actions(driver);
		action.moveToElement(prdctDD).perform();
	}
	 
	public void dropdown() {
		Select select = new Select(prdctDD);
		select.selectByIndex(1);
	}

	
	public int wordscount() {
		String word = textcount.getText();
		int split=	word.split(" ").length;
		
		return split; 
		
		
	}
}
