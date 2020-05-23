package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage {
   
	WebDriver driver;

	@FindBy(xpath = ".//input[@name='reserveFlights']")
	private WebElement message;    
    
    public SelectFlightPage(WebDriver driver){
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	    
    public boolean IsButtonDisplayed(String un) {
	    
    	return message.getAttribute("name").equals(un);

    } 
}
