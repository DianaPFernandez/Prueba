package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GooglePage extends BasePage {
	
	private String searchButton = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";
	private String testFirstName = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input";
	private String testlastName = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input";
	private String buttonLocation = "//form[@name='userForm']//span[contains(text(),'Next: Location')]";
	private String titleStep2 = "//*[@id='regs_container']/div/div[2]/div/div[1]/div/div/h1/span[2]";
	private String buttonDevices = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span"; 
	private String titleStep3 = "//h1/span[contains(text(),'Tell us about your devices')]";
	private String buttonLastStep = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button";
	private String testPassword = "//*[@id='password']";
	private String titleStep4 = "//h1/span[contains(text(),'The last step')]";
	private String testConfirmPass = "//*[@id='confirmPassword']";
	private String checkBoxOne = "//form/div[5]/label/span[@class='checkmark signup-consent__checkbox error']";
	private String checkBoxSecond = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span";
	private String btnCompleteSetup= "//*[@id='laddaBtn']/span[contains(text(),'Complete Setup')]";
	private String Title= "//*[@id='regs_container']/div/div[2]/div/div[1]/div/div/h1/span[2]";
	
	private String testFirst = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input";
	private String testlast = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input";
	private String testname = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input";
	private String userName = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input";
	private String passOne = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input";
	private String passTwo = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input";
	private String buttonSave ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]";
	
	//private String testCity = "//*[@id='city2']"; 
	
	Actions act = new Actions(driver);
	
	public GooglePage (){
		super(driver);
	}
	
	public void navigateToGoogle(){
		navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	/*
	public String Title(){
		return textFromElement(Title);
	}*/
	
	public void enterSearchCriteria(String criteria){
		write(testFirstName, criteria);
	}
	
	public void testlastName(String criteria){
		write(testlastName, criteria);
	}

	public void clickLocation(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		clickElement(searchButton);
	}
	
	public void clickDevices(){
		try {     Thread.sleep(7000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		clickElement(buttonDevices);
	}
	public void clickLastStep(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		clickElement(buttonLastStep);
	}
	
	public void enterSearchName(String criteria){
		write(testFirst, criteria);
	}
	
	public void testlast(String criteria){
		write(testlast, criteria);
	}
	public void testname(String criteria){
		write(testname, criteria);
	}
	
	public void checkBoxSecond(){
		clickElement(checkBoxSecond);
		
	}
	public void userName(String criteria){
		write(userName, criteria);
	}
	public void passOne(String criteria){
		write(passOne, criteria);
	}
	
	public void passTwo(String criteria){
		write(passTwo, criteria);
	}
	
	public void clickLastSave(){
		try {     Thread.sleep(5000);
		// Espera 5 segundos (el tiempo está en milisegundos)
		} catch (InterruptedException e) {     e.printStackTrace(); }
		clickElement(buttonSave);
	}
	
	
	
	
	

}
