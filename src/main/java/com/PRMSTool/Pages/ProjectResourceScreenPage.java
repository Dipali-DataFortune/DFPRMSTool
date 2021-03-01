package com.PRMSTool.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.PRMSTool.base.TestBase;

public class ProjectResourceScreenPage extends TestBase{

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath = "(//span[contains(text(),'Project-Resource')])[1]")
	WebElement projectResource;
	
	@FindBy(xpath = "//button[@class='add-project-button fuse-white mt-24 mt-md-0 mat-raised-button']")
	WebElement addNew;
	
	@FindBy(xpath = "//mat-select[@name='ClientId']")
	WebElement clientDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Appointlink Portal Solutions ')]")
	WebElement client1;
	
	@FindBy(xpath = "//mat-select[@placeholder='Project']")
	WebElement projectDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' SeatGen QA Automation ')]")
	WebElement project1;
	
	@FindBy(xpath = "//mat-select[@role='listbox' and @placeholder='Status']")
	WebElement statusDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' All ')]")
	WebElement statusAll;
	
	@FindBy(xpath = "//mat-select[@name='ResourceId']")
	WebElement resourceDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Dipali Vaidya (DS1167) ')]")
	WebElement resource1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Shailendra Pardeshi (DS1129) ')]")
	WebElement resource2;
	
	@FindBy(xpath = "//input[@placeholder='Role']")
	WebElement role;
	
	@FindBy(xpath = "(//label[@class='mat-radio-label'])[1]")
	WebElement radioButton1;
	
	@FindBy(xpath = "//mat-select[@name='BillingCycleId']")
	WebElement BillingCycleDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Monthly ')]")
	WebElement BillingCycle;
	
	@FindBy(xpath = "//mat-select[@name='CurrencyId']")
	WebElement currencyDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' INR ')]")
	WebElement Currency;
	
	@FindBy(xpath = "//input[@placeholder='Rate']")
	WebElement rate;

	@FindBy(xpath = "(//button[@class='mat-icon-button' and @type='button'])[1]")
	WebElement startDate;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button' and @type='button'])[2]")
	WebElement endDate;
	
	@FindBy(xpath = "//table[@class='mat-calendar-table']//td")
	List<WebElement> allDates;
	
	@FindBy(xpath = "//div[@class='mat-slider-thumb']")
	WebElement percentageAllocation;
	
	@FindBy(xpath = "//span[@class='mat-slider-thumb-label-text']")
	WebElement sliderValue;
		
	@FindBy(xpath = "//textarea[@placeholder='Remark']")
	WebElement remark;
	
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement downloadFile;
	
	public ProjectResourceScreenPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnProjectResource()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(projectResource));

		projectResource.click();		
	}
			
	public void clickOnAddNew() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addNew));
		highLightElement(driver, addNew);

		Thread.sleep(5000);
		addNew.click();
	}
	
	public void addProjectResourceDetails() throws InterruptedException
	{
		scrollToElement(clientDropDown);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(clientDropDown));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].click()", clientDropDown);
		//clientDropDown.click();
		client1.click();
				
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOf(projectDropDown));
		
		projectDropDown.click();
		project1.click();
		
		wait.until(ExpectedConditions.visibilityOf(resourceDropDown));
		resourceDropDown.click();
		resource1.click();
		
		wait.until(ExpectedConditions.visibilityOf(role));
		role.clear();
		role.sendKeys("QA Automation");
		
		wait.until(ExpectedConditions.visibilityOf(radioButton1));
		//radioButton1.click();
		
		js.executeScript("arguments[0].click()", radioButton1);
		
		wait.until(ExpectedConditions.visibilityOf(BillingCycleDropDown));
		BillingCycleDropDown.click();
		//BillingCycle.click();
		js.executeScript("arguments[0].click()", BillingCycle);
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOf(currencyDropDown));
		currencyDropDown.click();
		//Currency.click();
		js.executeScript("arguments[0].click()", Currency);
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOf(rate));
		rate.clear();
		rate.sendKeys("5");
		
		scrollToElement(remark);
		wait.until(ExpectedConditions.visibilityOf(remark));
		remark.clear();
		remark.sendKeys("test resource");
	}

	public void selectStartDate() throws InterruptedException
	{
		scrollToElement(startDate);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(startDate));
		highLightElement(driver, startDate);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", startDate);
		//startDate.click();
		
		Thread.sleep(2000);
			
		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("24")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("Start date selected");
		//Thread.sleep(5000);
	}
	
	public void selectEndDate() throws InterruptedException
	{
		scrollToElement(endDate);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(endDate));
		highLightElement(driver, endDate);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", endDate);
		//endDate.click();
		
		Thread.sleep(2000);
			
		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("26")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("End date selected");
		//Thread.sleep(5000);
	}
	
	public void selectPercentageAllocation() throws InterruptedException
	{
		scrollToElement(percentageAllocation);
		highLightElement(driver, percentageAllocation);
		
		Actions objAct = new Actions(driver);
		objAct.dragAndDropBy(percentageAllocation, -12, 75).perform();
		
		System.out.println("Percentage allocation is: " +sliderValue.getText());
	}
	
	public void downloadFile() throws InterruptedException
	{
		String downloadFilePath= "C:\\Users\\Dipali.vaidya\\Downloads";
		HashMap<String, Object> chromePref= new HashMap<String, Object>();
		chromePref.put("profile.default_content_settings.popups", 0);
		chromePref.put("download.default_directory", downloadFilePath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePref);
		Thread.sleep(5000);
		downloadFile.click();
		Thread.sleep(5000);
		System.out.println("File downloaded successfully");
	}
}
