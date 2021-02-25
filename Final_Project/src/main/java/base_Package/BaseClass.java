package base_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilPackage.CommonUtilities;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {
		
		   try {
				
				prop = new Properties();
				FileInputStream ip = new FileInputStream(System.getProperty("/Users/gaurangpatel/eclipse-workspace/Final_Project/src/main/java/configPackage/config.Properties"));
				prop.load(ip);
				
			} 
			catch(FileNotFoundException e1) {
				e1.printStackTrace();
				
			} catch (IOException e1) {
				e1.printStackTrace();
				
			} 
	}
	
	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
	}
	
	public static void waituntilelement(String xpath) {
		By temp = By.xpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(temp));
		element.click();
	}
	
	public static void initialization( ) {
		
		System.setProperty("webdriver.gecko.driver","/Users/gaurangpatel/Downloads/BrowserDrivers/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(CommonUtilities.pageloadTimeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(CommonUtilities.implicitWait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		driver.quit();
	
}
}

