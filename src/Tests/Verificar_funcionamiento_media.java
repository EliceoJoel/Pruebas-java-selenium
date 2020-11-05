package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.IndexPage;

public class Verificar_funcionamiento_media {
	
	String baseUrl = "https://primer-parcial-eyads.netlify.app/";
	public WebDriver driver;
	private IndexPage index;
	
	@Test
	public void VerificarMedia() {
		index = new IndexPage(driver);
	    Assert.assertEquals(index.test3("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15", "11", "15"), "13");
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

