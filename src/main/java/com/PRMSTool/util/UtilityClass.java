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
	
	@FindBy(xpath = "//span[@class='mat-button-wrapper']//span[contains(text(),'Update')]")
	WebElement updateButton;
	
	@FindBy(xpath = "(//mat-icon[contains(text(),'edit')])[1]")
	WebElement editButton;

	@FindBy(xpath = "//button[@class='mat-raised-button']")
	WebElement NoButton;
	
	public UtilityClass(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void clickOnAdd() {
		// addButton.click();
		scrollToElement(addButton);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", addButton);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void clickOnEditButton() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(editButton));

		editButton.click();
	}
	
	public void clickOnUpdateButton() {
		scrollToElement(updateButton);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(updateButton));

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
		downloadFile.click();
		Thread.sleep(3000);

		System.out.println("File downloaded successfully");
	}
}
