package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.IndexPage;


public class TestCase2 {
	String baseUrl = "https://primer-parcial-eyads.netlify.app/";
	public WebDriver driver;
		private IndexPage index;
	
	@Test
	public void Calcular_media_de_cien_numeros_validos() {
		 index = new IndexPage(driver);
	     calculo.introducirValores("1,2,3,4,5,6,7,8,9,6,11,12,15,12,6,7,8,9,6,11,12,15,12,12,6,7,8,9,6,11,1,24,3,4,5,6,7,8,9,6,71,2,3,4,5,6,7,8,91,6,1,2,34,4,5,6,17,8,9,6,1,2,3,44,5,6,7,8,9,6,1,2,3,4,5,6,7,8,9,62,1,27,3,4,57,6,7,8,9,6,1,2,3,4,5,6,7,8,9,16", "0", "100");
         Assert.assertEquals(calculo.calcularResultado(),"Media:10.01  Total entradas:100  Total validos:100");  
	   
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
