package pages_Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_Package.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//input[@role = 'search']")
	WebElement search;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement search_button;
	
	@FindBy(xpath = "//button[@data-automation = 'sign-in-button']")
	WebElement Sign_in;
	
	@FindBy(xpath = "//div[@data-automation = 'dept-btn-text']")
	WebElement departments_link;
	
	@FindBy(xpath = "//a[@id='1']")
	WebElement automotives;
	
	@FindBy(linkText = "Deals")
	WebElement deals_link;
	
	@FindBy(linkText = "Clothing")
	WebElement Clothing_link;
	
	@FindBy(linkText = "Pets")
	WebElement Pets_link;
	
	@FindBy(linkText = "Toys")
	WebElement Toys_link;
	
	@FindBy(linkText = "Office")
	WebElement Office_link;
	
	@FindBy(linkText = "Electronics")
	WebElement Electronics_link;
	
	@FindBy(linkText = "Health")
	WebElement Health_link;
	
	@FindBy(xpath = "//span[@class = 'css-1k7qv8r e1xmck041']")
	WebElement shopGrocery;
	
	@FindBy(xpath = "//span[@class = 'css-0 en07u8q1']")
	WebElement storeFinder;
	
	@FindBy(xpath = "//span[@class = 'css-0 e18kvv91']")
	WebElement flyres;
	
	@FindBy(xpath = "//button[@data-automation = 'sign-in-button']")
	WebElement signin_link;
	
	@FindBy(id = "walmartblue_Layer_1")
	WebElement walmart_image;
	
	@FindBy(xpath = "//div[@src='https://i5.walmartimages.com/dfw/8822aef6-560e/k2-_e20166e5-367e-415a-baec-0f16ddcf410c.v1.gif']")
	WebElement fast_delivery;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
		
	public SearchPage searchItem(String item) {
		
		search.sendKeys(item);
		search_button.click();
		return new SearchPage();
	}
	
	public boolean walmartLogo() {
		
		driver.get("https://www.walmart.ca/en");
		return walmart_image.isDisplayed();
	}
	
	public LoginPage goToLoginPage(){
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Sign_in).click().perform();
		return new LoginPage();
	}
	
	public void departments() {
		
		Actions action = new Actions(driver);
		action.moveToElement(departments_link).build().perform();
		automotives.click();
	}
	
	public void dealsLink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(deals_link).click().perform();
	}
	
	public void ClothingLink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Clothing_link).click().perform();
	}
	
	public void PetsLink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Pets_link).click().perform();
	}
	
	public void Toysink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Toys_link).click().perform();
	}
	
	public void OfficeLink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Office_link).click().perform();
	}
	
	public void ElectronicsLink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Electronics_link).click().perform();
	}
	
	public void HealthLink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Health_link).click().perform();
	}
	
	public void shopGroceryLink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(shopGrocery).click().perform();
	}
	
	public void storeFinderLink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(storeFinder).click().perform();
	}
	
	public void flyresLink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(flyres).click().perform();
	}
	
	public void fasteDliveryLink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(fast_delivery).click().perform();
	}

}

