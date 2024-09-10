package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;
import junit.framework.Assert;

public class BasePage {
	
	protected static WebDriver driver;
	private static WebDriverWait wait;
	
	static{
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(10));
		
	}
	
	public BasePage(WebDriver driver){
		BasePage.driver = driver;
		wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(10));		
	}
	
	public void navigateTo(String url){
		driver.get(url);
	}
	//cierra el browser
	public static void closeBrowser(){
		driver.quit();
	}
	
	//espera que aparezca los elementos
	private WebElement Find(String locator){
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		
	}
	//click sobre un elemento
	public void clickElement(String locator){
		Find(locator).click();
	}
	//llenar un campo
	public void write(String locator, String textToWrite){
		Find(locator).sendKeys(textToWrite);
		
	}
	// seleccionar una lista, locator como encontrar la lista y valueToSelect como seleccionar el valor de la lista
	/*public void selectFromDropdownByValue(String locator, String valueToSelect){
		Select dropdown = new Select(Find(locator)); 
		dropdown.selectByValue(valueToSelect);
	}
	
	public void selectFromDropdownByIndex(String locator, int valueToSelect){
		Select dropdown = new Select(Find(locator));
		dropdown.selectByIndex(valueToSelect);
	}*/

	// seleccionar una lista, locator como encontrar la lista y valueToSelect como seleccionar el valor de la lista
	public void selectFromDropdownByText(String locator, String valueToSelect){
		Select dropdown = new Select(Find(locator));
		dropdown.selectByVisibleText(valueToSelect);
    }
	//assert
	public boolean elementIsDisplayed(String locator){
		return Find(locator).isDisplayed();
	}
	// funcion que devuelve un texto 
	public String textFromElement(String locator){
		return Find(locator).getText();
	}
}
