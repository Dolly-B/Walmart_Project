package testPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_Package.BaseClass;
import pages_Package.CartPage;

public class CartTest extends BaseClass{

CartPage cartpage;
	
	public CartTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(String product) {
		initialization();
		cartpage = new CartPage();	
	}
	
	@Test(priority = 1, description = "add one item to cart")
	public void addToCartTest(String item) {
		
		cartpage.addToCart(item);
	}
	
	@Test(priority = 3, description = "add same item one more time to cart")
	public void addItemTest(){
		cartpage.addItem();	
	}
	
	@Test(priority = 4, description = "remove one item from cart")
	public void removeOneItemTest() {
		cartpage.removeOneItem();
	}
	
	@Test(priority = 5, description = "add all items from cart")
	public void removeAllItemsTest() {
		cartpage.removeAllItems();
	}
	
	@Test(priority = 6, description = "learn more about safety policy")
	public void LearnMoreTest() {
		cartpage.LearnMore();
	}

	@Test(priority = 2, description = "navigate to checkout page")
	public void proceedToCheckoutTest() {
		cartpage.proceedToCheckout();
	}
	
	@AfterMethod
	public void quitBrowser() {
		
		driver.quit();
	}


	
}
