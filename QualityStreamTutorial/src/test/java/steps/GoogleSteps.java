package steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {
	
	GooglePage google = new GooglePage();
	
	@Given("^abrir el navegador$")
	public void navigateToGoogle(){
		google.navigateToGoogle();
		
	}
	
	@When("^seleccionar el boton registrar$")
	public void enterSearchCriteria(){
		google.enterSearchCriteria("Admin");
		google.testlastName("admin123");
		google.clickLocation();
//		google.clickGoogleSearch();
	}
	
	@And("^ingresar formulario$")
	public void clickSearchButton(){
		google.clickDevices();
		google.clickLastStep();
		google.enterSearchName("Diana");
		google.testlast("Fernandez");
		google.testname("Arias");
		google.checkBoxSecond();
		google.userName("PruebasDiana");
		google.passOne("Fa1234567@");
		google.passTwo("Fa1234567@");
		google.clickLastSave();
		
	
	}
	

}
