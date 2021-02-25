package pages_Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base_Package.BaseClass;

public class SearchPage extends BaseClass{

Actions actions = new Actions(driver);
	
	@FindBy(xpath = "//input[@role = 'search']")
	WebElement type_text;

	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement search_button;
	
	@FindBy(xpath = "//div[@data-automation = 'online-savings-dropdown-text']")
	WebElement online_saving_dd;
	
	@FindBy(xpath = "//label[@for = '32']")
	WebElement clearance_ckbox;
	
	@FindBy(xpath = "//label[@for = '38']")
	WebElement reduced_price_ckbox;
	
	@FindBy(xpath = "//label[@for = '31']")
	WebElement rollback_ckbox;
	
	@FindBy(xpath = "//div[@data-automation = 'sort-by-dropdown-text']")
	WebElement sortby_dd;
	
	@FindBy(xpath = "//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[1]/div/div[2]/div[2]/button/div[2]/div/div[2]/div[2]/li/a/span[1]")
	WebElement lowTohighPrice;
	
	@FindBy(xpath = "//label[@for = '10000041']")
	WebElement sold_shipped_Walmart;
	
	@FindBy(xpath = "//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[2]/div/div/div/div[1]/button/div/span/svg/path")
	WebElement category;
	
	@FindBy(xpath = "//span[@data-automation = 'category-item-name-10003']")
	WebElement electronics;
	
	@FindBy(xpath = "//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[3]/div/div/div/div[1]/button/div/span/svg/path")
	WebElement Customer_ratings;
	
	@FindBy(id = "51")
	WebElement five_Star_rating;
	
	@FindBy(xpath = "//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[4]/div/div/div/div[1]/button/div/span/svg/path")
	WebElement Brand;
	
	@FindBy(xpath = "//label[@for = '51087427']")
	WebElement NEM_ckbox;
	
	@FindBy(xpath = "//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[6]/div/div/div/div[1]/button/div/span/svg/path")
	WebElement price;
	
	@FindBy(xpath = "//input[@aria-label = 'price-min-input']")
	WebElement min_Price;
	
	@FindBy(xpath = "//input[@aria-label = 'price-max-input']")
	WebElement max_Price;
	
	@FindBy(xpath = "//span[@class = 'css-s5it7i e9pqgm91']")
	WebElement clear_Price;
	
	@FindBy(xpath = "//button[@data-automation = 'filter-apply-button']")
	WebElement apply_Price;
	
	@FindBy(xpath = "//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[7]/div/div/div/div[1]/button/div/span/svg/path")
	WebElement availability;
	
	@FindBy(xpath = "//label[@for = '11']")
	WebElement avail_online;
	
	@FindBy(xpath = "//label[@for = '12']")
	WebElement avail_InStore;
	
	@FindBy(xpath = "//label[@for = '13']")
	WebElement schedule_order;
	
	@FindBy(xpath = "//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[14]/div/div/div/div[1]/button/div/span/svg/path")
	WebElement sold_Ship_By;
	
	@FindBy(xpath = "//label[@for = '10002138']")
	WebElement express_elect;
	
	public SearchPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void searchItem(String item) {
		
		type_text.sendKeys(item);
		actions.moveToElement(search_button).click().perform();	
	}
	
	public boolean chooseClearanceItems() {
		
		Select select = new Select(online_saving_dd);
		select.selectByVisibleText("32");
		return clearance_ckbox.isSelected();
		
	}

	public void ItemsSoldAndShippedByWal() {
		
		actions.moveToElement(sold_shipped_Walmart).click().perform();
	}
	
	public void filterByCategory() {
		
		actions.moveToElement(category).click().perform();
		actions.moveToElement(electronics).click().perform();
	}
	
	public boolean filterByCustomerRatings() {
		
		actions.moveToElement(Customer_ratings).click().perform();
		actions.moveToElement(five_Star_rating).click().perform();
		return five_Star_rating.isSelected();	
	}
	
	public boolean filterByBrand() {
		
		actions.moveToElement(Brand).click().perform();
		actions.moveToElement(NEM_ckbox).click().perform();
		return NEM_ckbox.isSelected();
	}
	
	public void filterByPrice(String minimum_price, String maximum_price) {
		
		actions.moveToElement(price).click().perform();
		scrollDown();
		waituntilelement("//button[@data-automation = 'filter-apply-button']");
		min_Price.sendKeys(minimum_price);
		max_Price.sendKeys(maximum_price);
		actions.moveToElement(apply_Price).click().perform();
	}
	
	public void filterByAvailability() {
		
		scrollDown();
		waituntilelement("//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[7]/div/div/div/div[1]/button/div/span/svg/path");
		actions.moveToElement(availability).click().perform();
		scrollDown();
		waituntilelement("//label[@for = '13']");
		actions.moveToElement(avail_InStore).click().perform();
	}

	public void filterBySoldAndShipped() {
		
		scrollDown();
		waituntilelement("//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[14]/div/div/div/div[1]/button/div/span/svg/path");
		actions.moveToElement(sold_Ship_By).click().perform();
		scrollDown();
		waituntilelement("//label[@for = '10002138']");
		actions.moveToElement(express_elect).click().perform();
	}
	
}
