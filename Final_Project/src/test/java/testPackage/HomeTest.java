package testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_Package.BaseClass;
import pages_Package.HomePage;

public class HomeTest extends BaseClass{

HomePage homepage;
	
	public HomeTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();
	}

	@Test(priority = 1, description = "searching products")
	public void searchItemsTest(String item) {
		homepage.searchItem(item);
	}
	
	@Test(priority = 5, description = "checking walmart logo available")
	public void walmartLogoTest() {
		boolean b3 = homepage.walmartLogo();
		Assert.assertTrue(b3);
	}
	
	@Test(priority = 2,groups = "links", description = "navigate to sign in page")
	public void goToLoginPageTest() {
		homepage.goToLoginPage();
	}
	
	@Test(priority = 4, description = "checking products by departments")
	public void departmentsTest() {
		homepage.departments();
	}
	
	@Test(priority = 7,groups = "links", description = "clickin on clothing link")
	public void ClothingLinkTest() {
		homepage.ClothingLink();
	}
	
	@Test(priority = 6,groups = "links", description = "clickin on deals link")
	public void dealsLinkTest() {
		homepage.dealsLink();
	}
	
	@Test(priority = 8,groups = "links", description = "clickin on pets link")
	public void PetsLinkTest() {
		homepage.PetsLink();
	}
	
	@Test(priority = 9,groups = "links", description = "clickin on toys link")
	public void ToysinkTest() {
		homepage.Toysink();
	}
	
	@Test(priority = 11,groups = "links", description = "clickin on office link")
	public void OfficeLinkTest() {
		homepage.OfficeLink();
	}
	
	@Test(priority = 10,groups = "links", description = "clickin on electronics link")
	public void ElectronicsLinkTest() {
		homepage.ElectronicsLink();
	}
	
	@Test(priority = 12,groups = "links", description = "clickin on health link")
	public void HealthLinkTest() {
		homepage.HealthLink();
	}
	
	@Test(priority = 13,groups = "links", description = "clickin on shopGrocery link")
	public void shopGroceryLinkTest() {
		homepage.shopGroceryLink();
	}
	
	@Test(priority = 15,groups = "links", description = "clickin on storeFinder link")
	public void storeFinderLinkTest() {
		homepage.storeFinderLink();
	}
	
	@Test(priority = 14,groups = "links", description = "clickin on flyres link")
	public void flyresLinkTest() {
		homepage.flyresLink();
	}
	
	@Test(priority = 16,groups = "links", description = "clickin on fasteDlivery link")
	public void fasteDliveryLinkTest() {
		homepage.fasteDliveryLink();
	}
	
	@AfterMethod
	public void quitBrowser() {
		
		driver.quit();
	}



	
}
