package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.IndexPage;

public class entradas_igual_Cantidad {
	
	String baseUrl = "https://primer-parcial-eyads.netlify.app/";
	public WebDriver driver;
	private IndexPage index;
	
	@Test
	public void VerificarEntradasIgualCantidad() {
		index = new IndexPage(driver);
		//Introducimos datos y expectativa de cantidad
	    Assert.assertEquals(index.test2("1,2,3", "4", "8"), "3");
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
