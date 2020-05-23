package Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	
	WebDriver driver;
	
	@FindBy(xpath = ".//*[@name='userName']")
	private WebElement userName;
	@FindBy(xpath = ".//*[@name='password']")
	private WebElement password;
	@FindBy(xpath = ".//*[@name='login']")
	private WebElement submit;
    
    
    public IndexPage(WebDriver driver){
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public FlightFinderPage EnterCredentials(String un, String pass) {
    	
    	userName.clear();			
    	password.clear();			
    	userName.sendKeys(un);					
    	password.sendKeys(pass);	
    	submit.click();
    	return new FlightFinderPage(driver);
    }  

}
