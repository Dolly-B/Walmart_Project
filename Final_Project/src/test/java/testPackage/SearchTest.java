package testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_Package.BaseClass;
import pages_Package.SearchPage;

public class SearchTest extends BaseClass{
	
SearchPage searchpage;
	
	public SearchTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(String product) {
		initialization();
		searchpage = new SearchPage();
	}
	
	@Test(priority = 1, groups = "Search an item")
	public void searchItemTest(String item){
		
		searchpage.searchItem(item);	
	}
	
	@Test(priority = 2, groups = "sort by")
	public void chooseClearanceItemsTest() {
		boolean b4 = searchpage.chooseClearanceItems();
		Assert.assertTrue(b4, "Clearance items checkbox is not selected");
	}
	
	@Test(priority = 3, groups = "filter by")
	public void ItemsSoldAndShippedByWalTest() {
		searchpage.ItemsSoldAndShippedByWal();
	}
	
	@Test(priority = 4, groups = "filter by")
	public void filterByCategoryTest() {
		
		searchpage.filterByCategory();
	}
	
	@Test(priority = 5, groups = "filter by")
	public void filterByCustomerRatingsTest() {
		boolean b7 = searchpage.filterByCustomerRatings();
		Assert.assertTrue(b7, "Unable to filter by customer ratings");
	}
	
	@Test(priority = 6, groups = "filter by")
	public void filterByBrandTest() {
		boolean b8 = searchpage.filterByBrand();
		Assert.assertTrue(b8, "Unable to filter by Brand");
	}

	@Test(priority = 7, groups = "filter by")
	public void filterByPriceTest(String minimum_price, String  maximum_price) {
		searchpage.filterByPrice(minimum_price, maximum_price);
	}
	
	@Test(priority = 8, groups = "filter by")
	public void filterByAvailabilityTest() {
		searchpage.filterByAvailability();
	}
	
	@Test(priority = 9, groups = "filter by")
	public void filterBySoldAndShippedTest() {
		searchpage.filterBySoldAndShipped();
	}

	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}




}
