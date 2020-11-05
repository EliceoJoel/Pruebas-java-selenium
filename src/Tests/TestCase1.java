package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.IndexPage;


public class TestCase1 {
	String baseUrl = "https://primer-parcial-eyads.netlify.app/";
	public WebDriver driver;
	private IndexPage index;
	
	@Test
	public void Calcular_media_cuando_valor_es_incorrecto() {
		 index = new IndexPage(driver);
		 //                         valor   | minimo|maximo
		 calculo.introducirValores("-999, 2", "15", "55");
	     Assert.assertEquals(calculo.calcularResultado(),"Media:-999  Total entradas:0  Total validos:0");  
	}
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Janneth\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();					  									
		driver.get(baseUrl);	
	}
	
    @AfterTest
    public void quit() {   	
    	driver.close();	
    }
}
