package Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	
	WebDriver driver;
	
	
	@FindBy(xpath = ".//*[@id='valor']")
	private WebElement valor;
	
	@FindBy(xpath = ".//*[@id='minimo']")
	private WebElement minimo;
	
	@FindBy(xpath = ".//*[@id='maximo']")
	private WebElement maximo;
	
	@FindBy(xpath = ".//button[@type='submit']")
	private WebElement calcular;
	
	@FindBy(xpath = ".//*[@id='media']")
	private WebElement media;
	
	@FindBy(xpath = ".//*[@id='entradas']")
	private WebElement entradas;
	
	@FindBy(xpath = ".//*[@id='valido']")
	private WebElement valido;
	
	@FindBy(xpath = ".//*[@id='errorValor']")
	private WebElement errorValor;
	
    
    public IndexPage(WebDriver driver){
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public String test1(String valores, String min, String max) {
    	
    	valor.clear();			
    	minimo.clear();	
    	maximo.clear();
    	valor.sendKeys(valores);					
    	minimo.sendKeys(min);	
    	maximo.sendKeys(max);
    	calcular.click();
    	
    	return media.getText();
    }  
    
    public String test2(String valores, String min, String max) {
    	
    	valor.clear();			
    	minimo.clear();	
    	maximo.clear();
    	valor.sendKeys(valores);					
    	minimo.sendKeys(min);	
    	maximo.sendKeys(max);
    	calcular.click();
    	
    	return entradas.getText();
    }  
    
    public String test3(String valores, String min, String max) {
    	
    	valor.clear();			
    	minimo.clear();	
    	maximo.clear();
    	valor.sendKeys(valores);					
    	minimo.sendKeys(min);	
    	maximo.sendKeys(max);
    	calcular.click();
    	
    	return media.getText();
    }  
    
    
    public String test4() {
    	
    	calcular.click();
    	
    	return errorValor.getText();
	}  
	public String Test4 (String a, String b  , String c) {
    	
    	valor.clear();			
    	minimo.clear();
    	maximo.clear();	
 
    	valor.sendKeys(a);				
    	minimo.sendKeys(b);	
    	maximo.sendKeys(c);	
    	calcular.click();
    	
    	return errorValor.getText();
    	
    	
    }  
public String Test5 (String a, String b  , String c) {
	
	valor.clear();			
	minimo.clear();
	maximo.clear();	

	valor.sendKeys(a);				
	minimo.sendKeys(b);	
	maximo.sendKeys(c);	
	calcular.click();
	
	return errorValor.getText();
	
	
} 

public String Test6 (String a, String b  , String c) {
	
	valor.clear();			
	minimo.clear();
	maximo.clear();	

	valor.sendKeys(a);				
	minimo.sendKeys(b);	
	maximo.sendKeys(c);	
	calcular.click();
	
	return valido.getText();
	
	
} 


}
