package net.ietm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//WebElement interactiveHeader = driver.findElement(By.xpath("//b[contains(text(),'Interactive')]"));
	
	@FindBy(how= How.XPATH ,using= "//b[contains(text(),'Interactive')]")
	WebElement interactiveHeader;
	
	@FindBy(how= How.XPATH ,using= "//b[contains(text(),'IETM')]")
	WebElement ietmHeader;
	
	@FindBy(how= How.XPATH ,using= "//b[contains(text(),'Level')]")
	WebElement levelHeader;
		
	@FindBy(how= How.XPATH ,using= "//a[@class='ietm_logo']/img[1]")
	WebElement ietmLogo;
	
	@FindBy(how= How.XPATH ,using= "//div[@class='col ietm_logo_right']/img[1]")
	WebElement ietmrightLogo;
	
	@FindBy(how= How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how= How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how= How.ID ,using= "snbtn")
	WebElement submit;
	
	
	public void enterUsername(String usernameValue)
	{
		username.click();
		username.clear();
		username.sendKeys(usernameValue);
	}
	
	public void enterPassword(String passwordValue)
	{
		password.click();
		password.clear();
		password.sendKeys(passwordValue);
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
	
	

}
