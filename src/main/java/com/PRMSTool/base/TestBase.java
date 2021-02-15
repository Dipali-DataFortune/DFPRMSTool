/**
 * 
 */
package com.PRMSTool.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author dipali.vaidya
 *
 */
public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static String currentDirectory = System.getProperty("user.dir");
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream IP = new FileInputStream(currentDirectory + "\\config.properties");
			prop.load(IP);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeSuite

	public void OpenBrowserGrade() throws InterruptedException {
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {

			// System.setProperty("webdriver.chrome.driver", currentDirectory +
			// "\\Driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dipali.vaidya\\Documents\\ChromeDriver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			
			System.out.println("Chrome browser opened successfully");

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	}

	@AfterSuite()
	public void finish() {
		driver.quit();
	}
	
	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}
	
	public static void scrollToElement(WebElement Element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}
	
	public static void staleElementClick(int loopCount, WebElement element, int time) {

		new WebDriverWait(driver, time).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.visibilityOf(element));
		highLightElement(driver, element);

		for (int i = 0; i <= loopCount; i++) {
			try {
				element.click();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
