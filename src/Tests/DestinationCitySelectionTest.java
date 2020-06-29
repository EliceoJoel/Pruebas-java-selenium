package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FlightFinderPage;
import Pages.IndexPage;
import Pages.SelectFlightPage;

public class DestinationCitySelectionTest {
	
	String baseUrl = "http://newtours.demoaut.com/mercurywelcome.php";
	public WebDriver driver;
	private IndexPage signInPage;
	private FlightFinderPage FlightPage;
	private SelectFlightPage SelectPage;
	
	@Test
	public void VerifyTheDestinationCitySelection() {
	    
		signInPage = new IndexPage(driver);
		FlightPage = new FlightFinderPage(driver);
		SelectPage = new SelectFlightPage(driver);
		/*Se envia el usuario y contrasena*/
		signInPage.EnterCredentials("EliceoH", "e12345");
		/*Se envia la ciudad de destino*/
		FlightPage.destinationCity("New York");
	    Assert.assertTrue(SelectPage.IsButtonDisplayed("reserveFlights"), "Button was not displayed");
	  }
	
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","F:\\projects in eclipse/chromedriver.exe");					
		driver = new ChromeDriver();					  									
		driver.get(baseUrl);
		
	}
	
    @AfterTest
    public void quit() {   	
    	driver.close();	
    }
    

}
