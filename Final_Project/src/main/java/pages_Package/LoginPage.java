package pages_Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_Package.BaseClass;

public class LoginPage extends BaseClass{
	
Actions actions = new Actions(driver);
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@data-automation = 'sign-in-button']")
	WebElement login_link;
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/div/div[3]/div/button/span")
	WebElement show_button;
	
	@FindBy(linkText = "Forgot your password?")
	WebElement forgot_password;
	
	@FindBy(xpath = "//label[@class = 'css-12k6l22 ega94xn0']")
	WebElement checkbox;
	
	@FindBy(linkText = "signed in")
	WebElement signed_in;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/div[1]/section[3]/form/fieldset/label[3]/input")
	WebElement email_error;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/div[1]/section[3]/form/fieldset/label[3]/span[2]")
	WebElement pwd_error;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/div[1]/section[3]/form/fieldset/label[1]/div/p")
	WebElement error_msg;
	
	@FindBy(xpath = "//button[@class = 'css-vfxkzw edzik9p0']")
	WebElement Signin_btn;
	
	@FindBy(linkText = "Create account")
	WebElement Create_account;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/a/svg/path[1]")
	WebElement walmart_logo;
	
	@FindBy(id = "email")
	WebElement recovery_email;
	
	@FindBy(xpath = "//button[@data-automation='continue-btn']")
	WebElement continue_button;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public Boolean logotest() {
		driver.get("https://www.walmart.ca/en");
		return walmart_logo.isDisplayed();
	}
	
	public void login(String email, String pswrd) {
		
		username.sendKeys(email);
		password.sendKeys(pswrd);
		Signin_btn.click();
	}
	
	public void loginLink() {
		actions.moveToElement(login_link).click().perform();
	}
	
	public void showPassword() {
		
		actions.moveToElement(show_button).click().perform();
	}
	
	public void forgotPassword(String email) {
		
		forgot_password.click();
		recovery_email.sendKeys(email);
		continue_button.click();
	}
	
	public boolean keepMeSignedIn() {
		
		actions.moveToElement(checkbox).click().perform();
		return checkbox.isSelected();
	}
	
	public void invalidEmail(String invalid_email, String pswrd) {	
		
		username.sendKeys(invalid_email);
		password.sendKeys(pswrd);
		Signin_btn.click();
	}
	
	public boolean emailError() {
		System.out.println(email_error.getText());
		return email_error.isDisplayed();
	}
	
	public void emptyPassword(String email, String empty_pswrd) {
		
		username.sendKeys(email);
		password.sendKeys(empty_pswrd);
		Signin_btn.click();
	}
	
	public boolean emptyPassworderror() {

		System.out.println(pwd_error.getText());		
		return pwd_error.isDisplayed();
	}
	
	public void invalidCredentials(String invalid_email, String invalid_pswrd) {
		
		username.sendKeys(invalid_email);
		password.sendKeys(invalid_pswrd);
		Signin_btn.click();
	}
	
	public boolean errorMessage() {
		
		System.out.println(error_msg.getText());
		return error_msg.isDisplayed();
	}
	
	public void goToRegistrationPage() {
		
		actions.moveToElement(Create_account).click().perform();
	}



}
