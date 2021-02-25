package testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_Package.BaseClass;
import pages_Package.HomePage;
import pages_Package.LoginPage;

public class LoginTest extends BaseClass{

	LoginPage loginpage;
	HomePage homepage;
	
	public LoginTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginpage = new LoginPage();
		homepage.goToLoginPage();
	}
	
	@Test(priority = 1, description = "Login successful")
	public void loginTest(String email, String pswrd) {
		
		loginpage.login(email, pswrd);
	}
	
	@Test(priority = 2, description = "Invalid email")
	public void InvalidEmailTest(String invalid_email, String pswrd) {
		loginpage.invalidEmail(invalid_email, pswrd);
		Assert.assertEquals(true,loginpage.emailError());
	}
	
	@Test(priority = 3, description = "Empty password field")
	public void emptyPasswordTest(String email, String empty_pswrd) {
		loginpage.emptyPassword(email, empty_pswrd);
		Assert.assertEquals(true,loginpage.emptyPassworderror());
	}
	
	@Test(priority = 4, description = "error message")
	public void errorMessageTest(String invalid_email, String invalid_pswrd) {
		loginpage.invalidCredentials(invalid_email, invalid_pswrd);
		Assert.assertEquals(true,loginpage.errorMessage());
	}
	
	
	@Test(priority = 9 , description = "checking walmart logo is available")
	public void walmartLogo1Test() {
		boolean b3 = loginpage.logotest();
		Assert.assertTrue(b3);
	}
	
	@Test(priority = 5, description = "show password")
	public void showPasswordTest() {
		
		loginpage.showPassword();
	}
	
	@Test (priority = 6, description = "forgot password link")
	public void forgotPasswordTest(String email) {
		loginpage.forgotPassword(email);
	}
	
	@Test (priority = 8 , description = "keep me signed in checkbox")
	public void KeepMeSignedIn() {
		loginpage.keepMeSignedIn();
	}
	
	@Test(priority = 7, description = "navigate to registrationpage")
	public void goToRegistrationPageTest() {
		loginpage.goToRegistrationPage();
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
	}


	
}
