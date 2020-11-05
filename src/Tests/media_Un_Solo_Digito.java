package EYADS.prueba;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class media_Un_Solo_Digito {

	WebDriver driver;
	private page index; 
  @Test
  public void mensajeErrorUnSoloDigitoMedia() {
	  index = new page(driver);
		
	  Assert.assertEquals(index.Test5("1", "25", "43"), "La cantidad minina de numeros es de almenos 2");
	  System.out.println("Verificar que muestre un mensaje de error al intentar sacar la media de un solo digito");
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
