/**
 * 
 */
package com.PRMSTool.Pages;

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

/**
 * @author dipali.vaidya
 *
 */
public class SalesLeadScreenPage extends TestBase{
	
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@FindBy(xpath = "(//a[@href='/saleslead'])[1]")
	WebElement saleslead;
	
	@FindBy(xpath = "//input[@placeholder='Search for a Sales Lead']")
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@class='add-saleslead-button fuse-white mt-24 mt-md-0 mat-raised-button']")
	WebElement addNew;
	
	@FindBy(xpath = "//input[@mattooltip='Cloud Upload']")
	WebElement uploadFile;
	
	@FindBy(xpath = "//div[@class='fileupload']")
	WebElement chooseFile;
	
	@FindBy(xpath = "//input[@mattooltip='Download Sample Template']")
	WebElement downloadFile;
	
	@FindBy(xpath = "//button[@class='mr-0 mr-sm-16 mat-icon-button']")
	WebElement FileUploadBackButton;
	
	

	public SalesLeadScreenPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnSalesLead() throws InterruptedException
	{
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, 120);
		//wait.until(ExpectedConditions.visibilityOf(projectResource));

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//projectResource.click();		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", saleslead);
	}
			
	public void clickOnAddNew() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addNew));
		highLightElement(driver, addNew);

		Thread.sleep(5000);
		addNew.click();
	}
	
	public void clickOnCloudUpload()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addNew));
		
		uploadFile.click();
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
		Thread.sleep(3000);

		System.out.println("File downloaded successfully");
	}
	
	public void clickOnFileUploadBack()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(FileUploadBackButton));
		
		FileUploadBackButton.click();		
	}
	
	public void searchSalesLead(String name) throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		highLightElement(driver, searchBox);
		//Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys(name);

		Thread.sleep(5000);
	}
}
