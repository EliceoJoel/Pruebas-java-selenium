package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.IndexPage;

public class ningun_valido {
	
	String baseUrl = "https://primer-parcial-eyads.netlify.app/";
	public WebDriver driver;
	private IndexPage index;
	
	@Test
	public void VerificarMedia() {
		index = new IndexPage(driver);
	    Assert.assertEquals(index.test1("1,2,3", "4", "8"), "-999");
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
