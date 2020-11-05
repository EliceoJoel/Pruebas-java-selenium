package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Paginas.MediaNumeros;


public class TestCase3 {
	String baseUrl = "https://primer-parcial-eyads.netlify.app/";
	public WebDriver driver;
	private MediaNumeros calculo;
	
	@Test
	public void Calcular_media_cuando_valor_es_mayor_a_maximo() {
	    calculo=new MediaNumeros(driver);
		calculo.introducirValores("10,11", "1", "9");
	    Assert.assertEquals(calculo.calcularResultado(),"Media:-999  Total entradas:2  Total validos:0");  
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
