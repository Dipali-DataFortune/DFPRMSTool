package com.PRMSTool.util;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.PRMSTool.base.TestBase;

public class UtilityClass extends TestBase{
	
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@FindBy(xpath = "//span[contains(text(),'ADD')]")
	WebElement addButton;
	
	@FindBy(xpath = "//input[@placeholder='Search for a project']")
	WebElement searchBox;
		
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement downloadFile;
	
	@FindBy(xpath = "//span[contains(text(),'Update')]")
	WebElement updateButton;
	
	@FindBy(xpath = "(//mat-icon[contains(text(),'edit')])[1]")
	WebElement editButton;

	@FindBy(xpath = "//button[@class='mat-raised-button']")
	WebElement NoButton;
	
	@FindBy(xpath = "//mat-select[@role='listbox' and @placeholder='Status']")
	WebElement status;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' All ')]")
	WebElement status1;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' Inactive ')]")
	WebElement status2;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' Active ')]")
	WebElement status3;
	
	@FindBy(xpath = "//mat-select[@role='listbox' and @placeholder='BusinessUnit']")
	WebElement businessUnit;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' All ')]")
	WebElement businessUnit1;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' vResourcing ')]")
	WebElement businessUnit2;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' ROW ')]")
	WebElement businessUnit3;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' Licence ')]")
	WebElement businessUnit4;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' Practices ')]")
	WebElement businessUnit5;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' SafeGuard ')]")
	WebElement businessUnit6;	
	
	public UtilityClass(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void clickOnAdd() throws InterruptedException {
		// addButton.click();
		scrollToElement(addButton);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", addButton);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}
	
	public void clickOnEditButton() {
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(editButton));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//editButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", editButton);
	}
	
	public void clickOnUpdateButton() {
		scrollToElement(updateButton);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(updateButton));
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//updateButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", updateButton);
	}
	
	public void downloadFile() throws InterruptedException {
		String downloadFilePath = "C:\\Users\\Dipali.vaidya\\Downloads";
		HashMap<String, Object> chromePref = new HashMap<String, Object>();
		chromePref.put("profile.default_content_settings.popups", 0);
		chromePref.put("download.default_directory", downloadFilePath);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePref);

		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(downloadFile));
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//downloadFile.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", downloadFile);
		//Thread.sleep(3000);

		System.out.println("File downloaded successfully");
	}
	
	public void displayAllStatusList() throws InterruptedException 
	{
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(status));
				
		//highLightElement(driver, status);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", status);
		//status.click();
		
		wait.until(ExpectedConditions.visibilityOf(status1));
			
		status1.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status1);
		
		Thread.sleep(3000);
		
		System.out.println("All the active and inactive client list displayed");		
	}
	
	public void displayInactiveStatusList() throws InterruptedException
	{
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(status));
				
		highLightElement(driver, status);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
		status.click();
		
		wait.until(ExpectedConditions.visibilityOf(status2));
		status2.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status2);
		
		Thread.sleep(5000);
		
		System.out.println("All the inactive client list displayed");		
	}
	
	public void displayActiveStatusList() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(status));
				
		highLightElement(driver, status);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		status.click();
		
		wait.until(ExpectedConditions.visibilityOf(status3));
		status3.click();
		//js.executeScript("arguments[0].click()", status3);
		
		Thread.sleep(5000);
		
		System.out.println("All the active client list displayed");		
	}
	
	public void displayvResourcingBusinessUnit() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(businessUnit));
				
		highLightElement(driver, businessUnit);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		businessUnit.click();
		
		wait.until(ExpectedConditions.visibilityOf(businessUnit2));
		businessUnit2.click();
		//js.executeScript("arguments[0].click()", status3);
		
		Thread.sleep(5000);
		
		System.out.println("vResourcing business unit list displayed");		
	}
	
	public void displayROWBusinessUnit() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(businessUnit));
				
		highLightElement(driver, businessUnit);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		businessUnit.click();
		
		wait.until(ExpectedConditions.visibilityOf(businessUnit3));
		businessUnit3.click();
		//js.executeScript("arguments[0].click()", status3);
		
		Thread.sleep(5000);
		
		System.out.println("ROW business unit list displayed");		
	}
	
	public void displayLicenceBusinessUnit() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(businessUnit));
				
		highLightElement(driver, businessUnit);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		businessUnit.click();
		
		wait.until(ExpectedConditions.visibilityOf(businessUnit4));
		businessUnit4.click();
		//js.executeScript("arguments[0].click()", status3);
		
		Thread.sleep(5000);
		
		System.out.println("Licence business unit list displayed");		
	}
	
	public void displayPracticesBusinessUnit() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(businessUnit));
				
		highLightElement(driver, businessUnit);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		businessUnit.click();
		
		wait.until(ExpectedConditions.visibilityOf(businessUnit5));
		businessUnit5.click();
		//js.executeScript("arguments[0].click()", status3);
		
		Thread.sleep(5000);
		
		System.out.println("Practices business unit list displayed");		
	}
	
	public void displaySafeGuardBusinessUnit() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(businessUnit));
				
		highLightElement(driver, businessUnit);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		businessUnit.click();
		
		wait.until(ExpectedConditions.visibilityOf(businessUnit6));
		businessUnit6.click();
		//js.executeScript("arguments[0].click()", status3);
		
		Thread.sleep(5000);
		
		System.out.println("SafeGuard business unit list displayed");		
	}
	
	public void displayAllBusinessUnit() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(businessUnit));
				
		highLightElement(driver, businessUnit);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		businessUnit.click();
		
		wait.until(ExpectedConditions.visibilityOf(businessUnit1));
		businessUnit1.click();
		//js.executeScript("arguments[0].click()", status3);
		
		Thread.sleep(5000);
		
		System.out.println("All the business units list displayed");		
	}
}
