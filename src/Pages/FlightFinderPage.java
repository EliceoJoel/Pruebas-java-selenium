package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightFinderPage {
   
	WebDriver driver;
    
	@FindBy(xpath = ".//*[@value='roundtrip']")
	private WebElement checkIdaVuelta;
	@FindBy(xpath = ".//*[@value='oneway']")
	private WebElement checkUnCamino;
	@FindBy(xpath = ".//*[@name='passCount']")
	private WebElement pasajeros;
	@FindBy(xpath = ".//*[@name='fromPort']")
	private WebElement partiendoDe;
	@FindBy(xpath = ".//*[@name='fromMonth']")
	private WebElement enMes;
	@FindBy(xpath = ".//*[@name='fromDay']")
	private WebElement enDia;
	@FindBy(xpath = ".//*[@name='toPort']")
	private WebElement llevarA;
	@FindBy(xpath = ".//*[@name='toMonth']")
	private WebElement volviendoMes;
	@FindBy(xpath = ".//*[@name='toDay']")
	private WebElement volviendoDia;
	@FindBy(xpath = ".//*[@value='Coach']")
	private WebElement claseEconomica;
	@FindBy(xpath = ".//*[@value='Business']")
	private WebElement claseNegocios;
	@FindBy(xpath = ".//*[@value='First']")
	private WebElement clasePrimera;
	@FindBy(xpath = ".//*[@name='findFlights']")
	private WebElement Continue;
    
    
    public FlightFinderPage(WebDriver driver){
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public SelectFlightPage departureCity(String ciudadOrigen) {
    	
    	partiendoDe.sendKeys(ciudadOrigen);
    	
    	Continue.click();
    	return new SelectFlightPage(driver);
    }  
    
    public SelectFlightPage destinationCity(String ciudadDestino) {
    	
    	llevarA.sendKeys(ciudadDestino);
    	
    	Continue.click();
    	return new SelectFlightPage(driver);
    } 

}
