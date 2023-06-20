package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.ExcelReader;

import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Base {
	
	public static WebDriver driver; //default
	public static FileInputStream fis;
	public static Properties config;
	public static String host;
	public static ExcelReader excelReader;
	public static List<Map<String,String>> testData;
	//public static WebDriver firefoxDriver; //default
	
	
	public static void navigateURL(String url) {
		driver.get(url);
	}
	
	public static void click(By locator) {
		driver.findElement( locator ).click();
	}
	
	public static void clear(By locator) {
		driver.findElement( locator ).clear();
	}
	
	
	public static void sendkeys(By locator, String value) {
		driver.findElement( locator ).sendKeys( value  );
	}
	
	public static String getElementText(By locator) {
		//Get the Text of that Element (H3) Online Access
		WebElement element =  driver.findElement( locator );
		//get the text of that element
		String s = element.getText();	
		return s;
	}
	
	public static int getTotalElementsCount(By locator) {
	    List<WebElement> webElements = driver.findElements( locator );
	    int totalCount = webElements.size();		
		return totalCount;
	}
	
	public static void selectDropDownMenu(By locator, String textToSelect) {
		Select dropDownWebElement;
		dropDownWebElement = new Select( driver.findElement( locator ) );
		dropDownWebElement.selectByVisibleText(textToSelect);
	}

	public static void mouseHover(){
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement element = (WebElement)js.executeScript("return document.querySelector('hgf-c360nav').shadowRoot.querySelector('header.c360-nav>div>div>nav.utility-nav.show>ul.utility-icons>li.utility-icons-items.login>hgf-c360login').shadowRoot.querySelector('hgf-popover>hgf-button.utility-button>span:nth-child(2)')");
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

	}

	public static void clickSalesfore(){
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement element1 = (WebElement)js.executeScript("return document.querySelector('hgf-c360nav').shadowRoot.querySelector('header.c360-nav>div>div>nav.utility-nav.show>ul.utility-icons>li.utility-icons-items.login>hgf-c360login').shadowRoot.querySelector('hgf-popover.hgf-popover>div>div>a')");
		element1.click();
	}
	
	
}