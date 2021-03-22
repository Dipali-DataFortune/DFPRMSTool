package com.PRMSTool.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.PRMSTool.base.TestBase;

public class ProjectResourceScreenPage extends TestBase{

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath = "(//a[@href='/projectresource'])[1]")
	//(//a[@href='/project'])[1]
	WebElement projectResource;
	
	@FindBy(xpath = "//input[@placeholder='Search for a project resource']")
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@class='add-project-button fuse-white mt-24 mt-md-0 mat-raised-button']")
	WebElement addNew;
	
	@FindBy(xpath = "//mat-select[@name='ClientId']")
	WebElement clientDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Appointlink Portal Solutions ')]")
	WebElement client1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' ABC ')]")
	WebElement client2;
	
	@FindBy(xpath = "//mat-select[@placeholder='Project']")
	WebElement projectDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' test1 ')]")
	WebElement project1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' test ')]")
	WebElement project2;
	
	@FindBy(xpath = "//mat-select[@role='listbox' and @placeholder='Status']")
	WebElement statusDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' All ')]")
	WebElement statusAll;
	
	@FindBy(xpath = "//mat-select[@name='ResourceId']")
	WebElement resourceDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Test (DS123) ')]")
	WebElement resource1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Test1 (DS12) ')]")
	WebElement resource2;
	
	@FindBy(xpath = "//input[@placeholder='Role']")
	WebElement role;
	
	@FindBy(xpath = "(//label[@class='mat-radio-label'])[1]")
	WebElement radioButton1;
	
	@FindBy(xpath = "//mat-select[@name='BillingCycleId']")
	WebElement BillingCycleDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Monthly ')]")
	WebElement BillingCycle;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Weekly ')]")
	WebElement BillingCycle1;
	
	@FindBy(xpath = "//mat-select[@name='CurrencyId']")
	WebElement currencyDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' INR ')]")
	WebElement Currency;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' USD ')]")
	WebElement Currency1;
	
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
	
	//@FindBy(xpath = "//div[@class='mat-slider-track-wrapper']")
	@FindBy(xpath = "//mat-slider[@role='slider']")	
	WebElement percentageAllocationmarker;
		
	@FindBy(xpath = "//span[@class='mat-slider-thumb-label-text']")
	WebElement sliderValue;
		
	@FindBy(xpath = "//textarea[@placeholder='Remark']")
	WebElement remark;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'delete')]")
	WebElement deleteButton;

	@FindBy(xpath = "//button[@class='mat-raised-button mat-primary']")
	WebElement yesButton;
	
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement downloadFile;
	
	@FindBy(xpath = "//mat-select[@placeholder='BusinessUnit']")
	WebElement businessUnitDropDown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' All ')]")
	WebElement businessUnitAll;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' vResourcing ')]")
	WebElement businessUnitVRes;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' ROW ')]")
	WebElement businessUnitRow;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' Licence ')]")
	WebElement businessUnitLicence;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' Practices ')]")
	WebElement businessUnitPractices;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' Others ')]")
	WebElement businessUnitOthers;
	
	public ProjectResourceScreenPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnProjectResource() throws InterruptedException
	{
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, 120);
		//wait.until(ExpectedConditions.visibilityOf(projectResource));

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//projectResource.click();		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", projectResource);
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
		Thread.sleep(5000);
		scrollToElement(clientDropDown);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(clientDropDown));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", clientDropDown);
		//clientDropDown.click();
		js.executeScript("arguments[0].click()", client2);
		//client1.click();
				
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
		
		Thread.sleep(5000);
		
		scrollToElement(percentageAllocation);
		
		wait.until(ExpectedConditions.visibilityOf(percentageAllocation));
		
		highLightElement(driver, percentageAllocation);
		//percentageAllocation.click();
		//js.executeScript("arguments[0].click()", percentageAllocation);
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(percentageAllocation);
		//actions.moveByOffset(-12, -75);
		actions.dragAndDropBy(percentageAllocationmarker, (int)-12.5, -50);
		
		actions.build().perform();
										
		System.out.println("Percentage allocation is: " +sliderValue.getText());
		
		Thread.sleep(3000);
		
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
			
	public void searchProjectResource(String name) throws InterruptedException {
		
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		highLightElement(driver, searchBox);
		Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys(name);

		Thread.sleep(5000);
	}
	
	public void deleteProjectResource(String name) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys(name);

		deleteButton.click();
		/*
		 * Alert objalert=driver.switchTo().alert();
		 * System.out.println(objalert.getText()); objalert.accept();
		 */
		//yesButton.click();
		wait.until(ExpectedConditions.visibilityOf(yesButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", yesButton);
		
		System.out.println("Projet resource deleted successfully");
	}
	
	public void editProjectResourceInformation() throws InterruptedException
	{
		//scrollToElement(clientDropDown);
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(clientDropDown));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", clientDropDown);
		//clientDropDown.click();
		client2.click();
				
		Thread.sleep(5000);
		
		
		  wait.until(ExpectedConditions.visibilityOf(projectDropDown));
		  
		  projectDropDown.click(); 
		  project2.click();
		  
			/*
			 * wait.until(ExpectedConditions.visibilityOf(resourceDropDown));
			 * resourceDropDown.click(); resource2.click();
			 */
		 
		
		wait.until(ExpectedConditions.visibilityOf(role));
		role.clear();
		role.sendKeys("Software engineer");
		
		wait.until(ExpectedConditions.visibilityOf(radioButton1));
		//radioButton1.click();
		
		js.executeScript("arguments[0].click()", radioButton1);
		
		wait.until(ExpectedConditions.visibilityOf(BillingCycleDropDown));
		BillingCycleDropDown.click();
		//BillingCycle.click();
		js.executeScript("arguments[0].click()", BillingCycle1);
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOf(currencyDropDown));
		currencyDropDown.click();
		//Currency.click();
		js.executeScript("arguments[0].click()", Currency1);
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOf(rate));
		rate.clear();
		rate.sendKeys("2");

		Thread.sleep(5000);
		scrollToElement(percentageAllocation);
		wait.until(ExpectedConditions.visibilityOf(percentageAllocation));
		highLightElement(driver, percentageAllocation);
		Thread.sleep(5000);
		
		Actions objAct = new Actions(driver);
		objAct.dragAndDropBy(percentageAllocation, -12, 75).perform();
		
		Thread.sleep(5000);
		
		System.out.println("Percentage allocation is: " +sliderValue.getText());
		
		scrollToElement(remark);
		wait.until(ExpectedConditions.visibilityOf(remark));
		remark.clear();
		remark.sendKeys("Edit project resource");
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
	
	public void selectBusinessUnitAll()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(businessUnitDropDown));
		
		businessUnitDropDown.click();
		businessUnitAll.click();		
		System.out.println("Business unit all");
	}
	
	public void selectBusinessUnitVResource()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(businessUnitDropDown));
		
		businessUnitDropDown.click();
		//businessUnitVRes.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", businessUnitVRes);
		System.out.println("Business unit VResourcing");
	}
	
	public void selectBusinessUnitRow()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(businessUnitDropDown));
		
		businessUnitDropDown.click();
		businessUnitRow.click();
		System.out.println("Business unit row");
	}
	
	public void selectBusinessUnitPractices()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(businessUnitDropDown));
		
		businessUnitDropDown.click();
		businessUnitPractices.click();
		System.out.println("Business unit practices");
	}
	
	public void selectBusinessUnitLicence()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(businessUnitDropDown));
		
		businessUnitDropDown.click();
		businessUnitLicence.click();
		System.out.println("Business unit licence");
	}
	
	public void selectBusinessUnitOthers()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(businessUnitDropDown));
		
		businessUnitDropDown.click();
		businessUnitOthers.click();
		System.out.println("Business unit others");
	}
}
