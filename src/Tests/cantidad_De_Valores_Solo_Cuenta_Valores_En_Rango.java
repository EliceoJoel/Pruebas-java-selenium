package EYADS.prueba;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class cantidad_De_Valores_Solo_Cuenta_Valores_En_Rango {
	
	WebDriver driver;
	private page index; 
  @Test
  public void totalValorSoloCuentaValoresEnRango() {
	  index = new page(driver);
		
	  Assert.assertEquals(index.Test6("25,50,52,46,3000,2000", "1", "1000"), "4");
	  System.out.println("Verificar que la cantidad de total valido solo cuenta los numeros dentro del rango");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://primer-parcial-eyads.netlify.app/");
	  
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
