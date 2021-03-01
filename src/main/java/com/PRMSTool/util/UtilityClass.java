package com.PRMSTool.util;

import java.util.HashMap;

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
	
	@FindBy(xpath = "//input[@placeholder='Search for a project']")
	WebElement searchBox;
	
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement downloadFile;
	
	@FindBy(xpath = "//span[contains(text(),'Update')]")
	WebElement updateButton;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'edit')]")
	WebElement editButton;

	@FindBy(xpath = "//mat-icon[contains(text(),'delete')]")
	WebElement deleteButton;

	@FindBy(xpath = "//button[@class='mat-raised-button mat-primary']")
	WebElement yesButton;

	@FindBy(xpath = "//button[@class='mat-raised-button']")
	WebElement NoButton;
	
	public UtilityClass(WebDriver driver) {
		this.driver = driver;
	}

	public void search(String name) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		highLightElement(driver, searchBox);
		Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys(name);

		Thread.sleep(5000);
	}
	
	public void delete(String name) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys(name);

		deleteButton.click();
		Thread.sleep(3000);
		/*
		 * Alert objalert=driver.switchTo().alert();
		 * System.out.println(objalert.getText()); objalert.accept();
		 */
		yesButton.click();

		System.out.println("Client deleted successfully");
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

		updateButton.click();
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

		System.out.println("Client file downloaded successfully");
	}
}
