package pages_Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_Package.BaseClass;

public class CartPage extends BaseClass{

Actions actions = new Actions(driver);
	
	@FindBy(xpath = "//input[@role = 'search']")
	WebElement search;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement search_button;
	
	@FindBy(xpath = "//img[@alt = 'Vtech Two Handset Cordless Answering System with Caller ID']")
	WebElement phone_img;
	
	@FindBy(xpath = "//*[@id=\"product-results\"]/div[8]/div/div/button")
	WebElement add_to_cart;
	
	@FindBy(xpath = "//button[@aria-label = 'Add one more']")
	WebElement add_One_More;
	
	@FindBy(xpath = "//*[@id=\"cartoutline_a\"]")
	WebElement cart_icon;
	
	@FindBy(xpath = "//button[@aria-label = 'Remove one']")
	WebElement remove_One;
	
	@FindBy(xpath = "//button[@class = 'css-d4je81 ei50f4d14']")
	WebElement remove_AllItems;
	
	@FindBy(xpath = "//div[@aria-label = 'Return Policy Update ']")
	WebElement return_policy;
	
	@FindBy(xpath = "//button[@data-automation = 'checkout-btn']")
	WebElement checkout_button;
	
	public CartPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart(String item) {
		
		search.sendKeys(item);
		actions.moveToElement(search_button).click().perform();	

		waituntilelement("//img[@alt = 'Vtech Two Handset Cordless Answering System with Caller ID']");
		scrollDown();
		waituntilelement("//*[@id=\"product-results\"]/div[8]/div/div/button");
		actions.moveToElement(add_to_cart).click().perform();
	}
	
	public void addItem() {
		
		actions.moveToElement(add_One_More).click().perform();
	}
	
	public void proceedToCheckout() {
		
		actions.moveToElement(checkout_button).click().perform();
	}
	
	public void removeOneItem() {
		
		actions.moveToElement(remove_One).click().perform();
	}
	
	public void removeAllItems() {
		
		actions.moveToElement(remove_AllItems).click().perform();
	}
	
	public void LearnMore() {
		
		actions.moveToElement(return_policy).click().perform();
	}
		
}
