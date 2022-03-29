package net.ietm.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.ietm.pages.LoginPage;
import net.ietm.utility.OpenBrowser;

public class LoginStepDef {
	
	WebDriver driver;
	OpenBrowser ob = new OpenBrowser();
	LoginPage loginPage;

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		driver = ob.browserOpen(browsername);
	 loginPage = new LoginPage(driver);
		
		
		}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		driver.get(url);
	}
	@Then("user validates Title of the page")
	public void user_validates_title_of_the_page() {
	}
	@Then("user verifies URL of the page")
	public void user_verifies_url_of_the_page() {
	}
	@Then("user is able to see the IETM login page")
	public void user_is_able_to_see_the_ietm_login_page() {
	}

	@Then("user is to verify the text {string}")
	public void user_is_to_verify_the_text(String string) {
	}
	@Then("user is to verify the Image {string}")
	public void user_is_to_verify_the_image(String string) {
	}
	@Then("user is to verify disabled button {string}")
	public void user_is_to_verify_disabled_button(String string) {
	}



	
	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
		loginPage.enterUsername(username);
	}
	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}
	@When("user clicks on {string}")
	public void user_clicks_on(String string) {
		loginPage.clickSubmit();
	}


	@After
	public void closeBrowser()
	{
		System.out.println("************************************************");
	//	driver.close();
	}



}
