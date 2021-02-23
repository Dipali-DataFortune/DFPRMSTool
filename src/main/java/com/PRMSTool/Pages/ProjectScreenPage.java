package com.PRMSTool.Pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.PRMSTool.base.TestBase;

public class ProjectScreenPage extends TestBase{

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@FindBy(xpath = "//span[contains(text(),'ADD NEW ')]")
	WebElement addNew;
	
	@FindBy(xpath = "//input[@alt='Export']")
	List <WebElement> downloadFile;
	
	@FindBy(xpath = "(//span[contains(text(),'Project')])[1]")
	WebElement project;
	
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement projectFile;
	
	@FindBy(xpath = "//mat-select[@name='ClientId']")
	WebElement clientDropdown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Appointlink Portal Solutions ')]")
	WebElement appointlink;
	
	@FindBy(id = "mat-input-2")
	WebElement projectName;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button' and @type='button'])[1]")
	WebElement startDate;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button' and @type='button'])[2]")
	WebElement endDate;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button' and @type='button'])[3]")
	WebElement AStartDate;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button' and @type='button'])[4]")
	WebElement AEndDate;

	@FindBy(xpath = "//table[@class='mat-calendar-table']//td")
	List<WebElement> allDates;
	
	@FindBy(id = "mat-input-7")
	WebElement resources;
	
	@FindBy(id = "mat-input-8")
	WebElement duration;
	
	@FindBy(id = "mat-select-5")
	WebElement PM;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Shailendra Pardeshi (DS1129) ')]")
	WebElement PM1;
	
	@FindBy(id = "mat-select-6")
	WebElement PL;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Dipali Vaidya (DS1167) ')]")
	WebElement PL1;
	
	@FindBy(id = "mat-select-7")
	WebElement projectType;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' QA Automation ')]")
	WebElement projectType1;
	
	@FindBy(id = "mat-select-8")
	WebElement projectSubType;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Others ')]")
	WebElement projectSubType1;
	
	@FindBy(id = "mat-select-9")
	WebElement category;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Fixed ')]")
	WebElement category1;
	
	@FindBy(id = "mat-select-10")
	WebElement PStatus;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Active ')]")
	WebElement PStatus1;
	
	@FindBy(id = "mat-input-9")
	WebElement description;
	
	@FindBy(xpath = "//input[@placeholder='Search for a project']")
	WebElement searchBox;
	
	@FindBy(xpath="//mat-cell[@role='gridcell']")
	List<WebElement> searchBoxValues;
	
	@FindBy(xpath = "//button[@class='iconbutton mat-icon-button ng-tns-c41-157 mat-primary ng-star-inserted']")
	WebElement editButton;
	
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
	WebElement billing;
	
	@FindBy(id = "mat-select-11")
	WebElement reviewCycle;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Monthly ')]")
	WebElement reviewCycle1;
	
	@FindBy(id = "mat-input-10")
	WebElement MBillingRate;
	
	@FindBy(id = "mat-input-11")
	WebElement WBillingRate;
	
	@FindBy(id = "mat-input-12")
	WebElement HBillingRate;
	
	public ProjectScreenPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnProject()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(project));
		
		project.click();
	}
		
	public void downloadFile() throws InterruptedException
	{
		String downloadFilePath= "C:\\Users\\Dipali.vaidya\\Downloads";
		HashMap<String, Object> chromePref= new HashMap<String, Object>();
		chromePref.put("profile.default_content_settings.popups", 0);
		chromePref.put("download.default_directory", downloadFilePath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePref);
		
		highLightElement(driver, projectFile);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", projectFile);
		downloadFile.get(0).click();
		Thread.sleep(5000);
		System.out.println("File downloaded successfully");
	}
	
	public void clickOnAddNew() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addNew));
		highLightElement(driver, addNew);
		
		Thread.sleep(5000);
		addNew.click();
	}
	
	public void addProjectDetails() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(clientDropdown));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", clientDropdown);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()", appointlink);
		
		Thread.sleep(5000);
		projectName.sendKeys("test");	
	}
	
	public void selectStartDate() throws InterruptedException
	{
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
			if (date.equalsIgnoreCase("18")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("Start date selected");
		//Thread.sleep(5000);
	}
	
	public void selectEndDate() throws InterruptedException
	{
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
			if (date.equalsIgnoreCase("25")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("End date selected");
		//Thread.sleep(5000);
	}
	
	public void selectActualStartDate() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(AStartDate));
		highLightElement(driver, AStartDate);
		//AStartDate.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", AStartDate);
		Thread.sleep(2000);
			
		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("22")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("Actual start date selected");
	}
	
	public void selectActualEndDate() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(AEndDate));
		highLightElement(driver, AEndDate);
		//AEndDate.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", AEndDate);
		
		Thread.sleep(2000);
			
		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("24")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("Actual end date selected");
	}
	
	public void addProjectDetails1() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(resources));
		
		resources.clear();
		resources.sendKeys("4");
		
		duration.sendKeys("12");
		
		scrollToElement(PM);
		wait.until(ExpectedConditions.visibilityOf(PM));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", PM);
		PM.click();
		PM1.click();
		Thread.sleep(3000);
	
		wait.until(ExpectedConditions.visibilityOf(PL));
		PL.click();
		PL1.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(projectType));
		projectType.click();
		projectType1.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(projectSubType));
		projectSubType.click();
		projectSubType1.click();
		Thread.sleep(3000);
		
		scrollToElement(category);
		wait.until(ExpectedConditions.visibilityOf(category));
		category.click();
		category1.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(PStatus));
		PStatus.click();
		PStatus1.click();
		Thread.sleep(3000);
		
		scrollToElement(description);
		wait.until(ExpectedConditions.visibilityOf(description));		
		description.sendKeys("test");		
	}
	
	public void addBillingDetails() throws InterruptedException
	{
		scrollToElement(billing);
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(billing));
		
		billing.click();
		
		wait.until(ExpectedConditions.visibilityOf(reviewCycle));
		reviewCycle.click();
		reviewCycle1.click();
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(MBillingRate));
		MBillingRate.clear();
		MBillingRate.sendKeys("5000");
		
		wait.until(ExpectedConditions.visibilityOf(WBillingRate));
		WBillingRate.clear();
		WBillingRate.sendKeys("3000");
		
		wait.until(ExpectedConditions.visibilityOf(HBillingRate));
		HBillingRate.clear();
		HBillingRate.sendKeys("2000");
		
		Thread.sleep(5000);
		
		System.out.println("Billing details added successfully");
	}
}
