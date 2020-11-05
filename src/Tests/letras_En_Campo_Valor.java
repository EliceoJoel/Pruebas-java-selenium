package EYADS.prueba;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class letras_En_Campo_Valor {
	
	
	WebDriver driver;
	private page index; 
  @Test
  public void mensajeErrorLetras() {
	  index = new page(driver);
		
	  Assert.assertEquals(index.Test4("hola que tal", "4", "8"), "No se puede ingresar letras, solo numeros!");
	  System.out.println("Verificar que muestre un mensaje de error al introducir letras en el campo valor");
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
