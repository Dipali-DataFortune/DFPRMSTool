/**
 * 
 */
package com.PRMSTool.Pages;

import java.util.HashMap;
import java.util.List;
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
public class SalesLeadScreenPage extends TestBase {

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
	WebElement backButton;

	@FindBy(xpath = "//mat-icon[contains(text(),'delete')]")
	WebElement deleteButton;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement yesButton;

	@FindBy(xpath = "//input[@name='Salutation']")
	WebElement salutation;

	@FindBy(xpath = "//input[@name='Suffix']")
	WebElement suffix;

	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='MiddleName']")
	WebElement middleName;

	@FindBy(xpath = "//input[@name='LastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@name='JobTitle']")
	WebElement jobTitle;

	@FindBy(xpath = "//input[@name='JobFunction']")
	WebElement jobFunction;

	@FindBy(xpath = "//input[@name='ManagementLevel']")
	WebElement managementLevel;

	@FindBy(xpath = "//input[@name='MobileDirectDial']")
	WebElement mobile;

	@FindBy(xpath = "//input[@name='EmailAddress']")
	WebElement emailID;

	@FindBy(xpath = "//input[@name='PersonStreet']")
	WebElement street;

	@FindBy(xpath = "//input[@name='Country']")
	WebElement country;

	@FindBy(xpath = "//input[@name='PersonCity']")
	WebElement city;

	@FindBy(xpath = "//input[@name='PersonState']")
	WebElement state;

	@FindBy(xpath = "//input[@name='PersonZip']")
	WebElement zip;

	@FindBy(xpath = "//input[@placeholder='Revenue']")
	WebElement revenue;

	@FindBy(xpath = "//input[@placeholder='Revenue Range']")
	WebElement revenueRange;

	@FindBy(xpath = "//input[@placeholder='Employees']")
	WebElement employees;

	@FindBy(xpath = "//input[@placeholder='Employees Range']")
	WebElement employeesRange;

	@FindBy(xpath = "//input[@placeholder='Email/Phone']")
	WebElement emailOrPhone;

	@FindBy(xpath = "//input[@placeholder='Comment']")
	WebElement comment;

	@FindBy(xpath = "//button[@class='save-saleslead-button mat-raised-button ng-tns-c43-81 ng-star-inserted']")
	WebElement addButton;

	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[1]")
	WebElement salesLeadInformation;

	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
	WebElement companyDetails;

	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[3]")
	WebElement otherDetails;
	
	@FindBy(xpath = "//input[@placeholder='Company Name']")
	WebElement companyName;
	
	@FindBy(xpath = "//input[@placeholder='Company Domain Name']")
	WebElement companyDomainName;
	
	@FindBy(xpath = "//input[@placeholder='Company Phone Number']")
	WebElement companyPhoneNumber;
	
	@FindBy(xpath = "//input[@placeholder='Company Street Address']")
	WebElement companyStreet;
	
	@FindBy(xpath = "//input[@placeholder='Company Country']")
	WebElement companyCountry;
	
	@FindBy(xpath = "//input[@placeholder='State']")
	WebElement companyState;
	
	@FindBy(xpath = "//input[@placeholder='City']")
	WebElement companyCity;
	
	@FindBy(xpath = "//input[@placeholder='Zip']")
	WebElement companyZip;
	
	@FindBy(xpath = "//input[@placeholder='Industry Label']")
	WebElement industryLabel;
	
	@FindBy(xpath = "//input[@placeholder='Secondary Industry Label']")
	WebElement secIndustryLabel;
	
	@FindBy(xpath = "//input[@placeholder='Industry Hierarchical Category']")
	WebElement industryCategory;
	
	@FindBy(xpath = "//input[@placeholder='Secondary Industry Hierarchical Category']")
	WebElement secIndustryCategory;
	
	@FindBy(xpath = "//input[@placeholder='SIC1']")
	WebElement SIC1;
	
	@FindBy(xpath = "//input[@placeholder='SIC2']")
	WebElement SIC2;
	
	@FindBy(xpath = "//input[@placeholder='NAICS1']")
	WebElement NAICS1;
	
	@FindBy(xpath = "//input[@placeholder='NAICS2']")
	WebElement NAICS2;
	
	@FindBy(xpath = "//input[@placeholder='Attempt1']")
	WebElement attempt1;
	
	@FindBy(xpath = "//input[@placeholder='Attempt2']")
	WebElement attempt2;
	
	@FindBy(xpath = "//input[@placeholder='BDE']")
	WebElement BDE;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement lastUpdatedDate;

	@FindBy(xpath = "//button[@class='mat-icon-button' and @type='button']")
	WebElement FUPDate;
	
	@FindBy(xpath = "//div[@class='mat-calendar-controls']")
	WebElement DateMonths;

	@FindBy(xpath = "//table[@class='mat-calendar-table']//td")
	List<WebElement> allDates;

	@FindBy(xpath = "//button[@class='mat-calendar-next-button mat-icon-button' and @type='button']")
	WebElement DateNavButton;
	
	public SalesLeadScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSalesLead() throws InterruptedException {
		Thread.sleep(5000);
		// WebDriverWait wait = new WebDriverWait(driver, 120);
		// wait.until(ExpectedConditions.visibilityOf(projectResource));

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// projectResource.click();
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

	public void clickOnCloudUpload() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(uploadFile));

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
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// downloadFile.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", downloadFile);
		Thread.sleep(3000);

		System.out.println("File downloaded successfully");
	}

	public void clickOnBackButton() {
		scrollToElement(backButton);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(backButton));

		backButton.click();
	}

	public void searchSalesLead(String name) throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		Thread.sleep(5000);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		highLightElement(driver, searchBox);
		// Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys(name);

		Thread.sleep(5000);
	}

	public void deleteSalesLead(String name) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(2000);

		searchBox.clear();
		searchBox.sendKeys(name);
		Thread.sleep(8000);

		deleteButton.click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", yesButton);

		Thread.sleep(5000);

		System.out.println("SalesLead deleted successfully");
	}

	public void addSalesLeadInformation() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(salesLeadInformation));
		
		softAssert.assertEquals(salesLeadInformation.isDisplayed(), true);
		softAssert.assertEquals(companyDetails.isDisplayed(), true);
		softAssert.assertEquals(otherDetails.isDisplayed(), true);

		wait.until(ExpectedConditions.visibilityOf(salutation));

		salutation.clear();
		salutation.sendKeys("Ms");

		suffix.clear();
		suffix.sendKeys("test");

		firstName.clear();
		firstName.sendKeys("Dipali");

		middleName.clear();
		middleName.sendKeys("Sambhaji");

		lastName.clear();
		lastName.sendKeys("Vaidya");

		jobTitle.clear();
		jobTitle.sendKeys("CTO");

		jobFunction.clear();
		jobFunction.sendKeys("Other");

		managementLevel.clear();
		managementLevel.sendKeys("Other");

		//mobile.clear();
		//mobile.sendKeys("911234567890");

		emailID.clear();
		emailID.sendKeys("dipali.vaidya@datafortune.com");

		street.clear();
		street.sendKeys("16530 Ventura Blvd");

		scrollToElement(country);
		country.clear();
		country.sendKeys("USA");

		state.clear();
		state.sendKeys("CA");

		city.clear();
		city.sendKeys("Los Angeles");

		zip.clear();
		zip.sendKeys("91436");

		revenue.clear();
		revenue.sendKeys("12 million");

		revenueRange.clear();
		revenueRange.sendKeys("10 - 20 Million");

		employees.clear();
		employees.sendKeys("1000");

		employeesRange.clear();
		employeesRange.sendKeys("500-1000");

		emailOrPhone.clear();
		emailOrPhone.sendKeys("9876543210, dipali123@gmail.com");

		comment.clear();
		comment.sendKeys("All the sales lead information added successfully");
	}
	
	public void selectLastUpdatedDate() throws InterruptedException {
		scrollToElement(lastUpdatedDate);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(lastUpdatedDate));
		
		highLightElement(driver, lastUpdatedDate);
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click()", lastUpdatedDate);
		 
		  //Thread.sleep(2000);
			
			while(!DateMonths.getText().contains("APR 2021"))
			{
				js.executeScript("arguments[0].click()", DateNavButton);
			}

			int total_nodes = allDates.size();

			for (int i = 0; i < total_nodes; i++) {
				String date = allDates.get(i).getText();
				if (date.equalsIgnoreCase("30")) {
					allDates.get(i).click();
					break;
				}
			}
		  		
		System.out.println("Last updated date selected");
		Thread.sleep(3000);
	}
	
	public void clickOnCompanyDetails()
	{
		scrollToElement(companyDetails);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(companyDetails));
		
		companyDetails.click();
	}
	
	public void addCompanyDetails()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(companyName));
		
		companyName.clear();
		companyName.sendKeys("mpulsemobile test");
		
		companyDomainName.clear();
		companyDomainName.sendKeys("mpulsemobiletest.com");
		
		companyPhoneNumber.clear();
		companyPhoneNumber.sendKeys("1234567890");
		
		companyStreet.clear();
		companyStreet.sendKeys("16530 Ventura Blvd");
		
		companyCountry.clear();
		companyCountry.sendKeys("USA");
		
		companyState.clear();
		companyState.sendKeys("CA");
		
		companyCity.clear();
		companyCity.sendKeys("Los Angeles");
		
		companyZip.clear();
		companyZip.sendKeys("91436");
		
		scrollToElement(industryLabel);
		industryLabel.clear();
		industryLabel.sendKeys("Hospitals/Clinics");
		
		secIndustryLabel.clear();
		secIndustryLabel.sendKeys("Test Sec Label");
		
		industryCategory.clear();
		industryCategory.sendKeys("Test Category");
		
		secIndustryCategory.clear();
		secIndustryCategory.sendKeys("Test Sec Category");
	}
	
	public void clickOnOtherDetails()
	{
		scrollToElement(otherDetails);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(otherDetails));
		
		otherDetails.click();
	}
	
	public void addOtherDetails()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(SIC1));
		
		SIC1.clear();
		SIC1.sendKeys("Test SIC1");
		
		SIC2.clear();
		SIC2.sendKeys("Test SIC2");
		
		NAICS1.clear();
		NAICS1.sendKeys("Test NAICS1");
		
		NAICS2.clear();
		NAICS2.sendKeys("Test NAICS2");
		
		attempt1.clear();
		attempt1.sendKeys("Closed");
		
		attempt2.clear();
		attempt2.sendKeys("Test attempt 2");
		
		BDE.clear();
		BDE.sendKeys("Test BDE");
	}
	
	public void selectFUPDate() throws InterruptedException
	{
		scrollToElement(FUPDate);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(FUPDate));
		
		highLightElement(driver, FUPDate);
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click()", FUPDate);
		 
		  //Thread.sleep(2000);
			
			while(!DateMonths.getText().contains("MAY 2021"))
			{
				js.executeScript("arguments[0].click()", DateNavButton);
			}

			int total_nodes = allDates.size();

			for (int i = 0; i < total_nodes; i++) {
				String date = allDates.get(i).getText();
				if (date.equalsIgnoreCase("10")) {
					allDates.get(i).click();
					break;
				}
			}
		  		
		System.out.println("FUP date selected");
		Thread.sleep(3000);
	}
}
