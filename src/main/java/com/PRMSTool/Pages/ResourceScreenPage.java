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

public class ResourceScreenPage extends TestBase {

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath = "(//span[contains(text(),'Resource')])[1]")
	WebElement resource;

	@FindBy(xpath = "//input[@placeholder='Search for a resource']")
	//@FindBy(xpath = "//div[@class='search']")	
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@class='add-resource-button fuse-white mt-24 mt-md-0 mat-raised-button']")
	//@FindBy(xpath = "//span[contains(text(),'ADD NEW')]")
	WebElement addNew;

	@FindBy(xpath = "//input[@name='ResourceName']")
	WebElement resourceName;

	@FindBy(xpath = "//input[@name='EmployeeId']")
	WebElement employeeID;

	@FindBy(xpath = "(//button[@type='button'])[1]")
	WebElement birthDate;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement joiningDate;

	@FindBy(xpath = "//div[@class='mat-calendar-controls']")
	WebElement DateMonths;

	@FindBy(xpath = "//table[@class='mat-calendar-table']//td")
	List<WebElement> allDates;

	@FindBy(xpath = "//button[@class='mat-calendar-next-button mat-icon-button' and @type='button']")
	WebElement DateNavButton;
	
	@FindBy(xpath = "//input[@name='DateOfBirth']")
	WebElement DateOfBirth;
	
	@FindBy(xpath = "//button[@class='mat-calendar-period-button mat-button']")
	WebElement Months;
	
	@FindBy(xpath = "//div[@class='mat-calendar-content']//td")
	List<WebElement> allMonths;
	
	@FindBy(xpath = "//textarea[@placeholder='Address']")
	WebElement address;
	
	@FindBy(xpath = "//mat-select[@placeholder='Country']")
	WebElement country;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' India ')]")
	WebElement country1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' USA ')]")
	WebElement country2;

	@FindBy(xpath = "//mat-select[@placeholder='State']")
	WebElement state;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Maharashtra ')]")
	WebElement state1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Alaska ')]")
	WebElement state2;
	
	@FindBy(xpath = "//mat-select[@placeholder='City']")
	WebElement city;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Pune ')]")
	WebElement city1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Adak ')]")
	WebElement city2;
	
	@FindBy(xpath = "//input[@placeholder='Zip']")
	WebElement zip;
	
	@FindBy(xpath = "(//input[@placeholder='Contact Number'])[1]")
	WebElement contactNumber;
	
	@FindBy(xpath = "(//input[@placeholder='Contact Number'])[2]")
	WebElement alternateContactNumber;
	
	@FindBy(xpath = "//input[@placeholder='Email Id']")
	WebElement emailID;
	
	@FindBy(xpath = "//mat-select[@placeholder='Year Bucket']")
	WebElement yearBucket;
	
	@FindBy(xpath = "//mat-select[@placeholder='Tech Category']")
	WebElement techCategory;
	
	@FindBy(xpath = "//mat-select[@placeholder='Reporting To']")
	WebElement reportingTo;
	
	@FindBy(xpath = "//mat-select[@placeholder='Designation']")
	WebElement designation;
	
	@FindBy(xpath = "//mat-select[@placeholder='Status']")
	WebElement status;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' 5 to 10 ')]")
	WebElement YBucket;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' QA Automation')]")
	WebElement TCategory;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Dipali Vaidya (DS1167) ')]")
	WebElement Reporting;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Senior Automation Tester Engineer ')]")
	WebElement Desig;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Active ')]")
	WebElement StatusActive;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' 3 to 5 ')]")
	WebElement YBucket1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Accounts ')]")
	WebElement TCategory1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Dipali Vaidya (DS1167) ')]")
	WebElement Reporting1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Senior Automation Tester Engineer ')]")
	WebElement Desig1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Inactive ')]")
	WebElement StatusInactive;
	
	@FindBy(xpath = "//input[@placeholder='Tenure In Months']")
	WebElement PExp;
	
	@FindBy(xpath = "//input[@placeholder='Tenure In Years']")
	WebElement tenureInYears;
	
	@FindBy(xpath = "//input[@placeholder='Total Years']")
	WebElement totalYears;
	
	@FindBy(xpath = "//input[@placeholder='Primary skill']")
	WebElement PriSkill;
	
	@FindBy(xpath = "//input[@placeholder='Secondary skill']")
	WebElement SecSkill;
			
	@FindBy(xpath = "//input[@placeholder='Strengths']")
	WebElement Strengths;
	
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement downloadFile;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'delete')]")
	WebElement deleteButton;

	@FindBy(xpath = "//button[@class='mat-raised-button mat-primary']")
	WebElement yesButton;
	
	public ResourceScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnResource() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(resource));

		resource.click();
	}
	
	public void clickOnAddNew() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addNew));
		highLightElement(driver, addNew);

		Thread.sleep(5000);
		addNew.click();
	}

	public void addResourceDetails() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(resourceName));

		resourceName.clear();
		resourceName.sendKeys("TestDelete");
		
		employeeID.clear();
		employeeID.sendKeys("DS412");
		Thread.sleep(5000);
		
		address.clear();
		address.sendKeys("Hadapsar");
		
		scrollToElement(country);
		wait.until(ExpectedConditions.visibilityOf(country));
		country.click();
		country1.click();		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(state));
		state.click();
		state1.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(city));
		city.click();
		city1.click();
		Thread.sleep(3000);
		
		zip.clear();
		zip.sendKeys("411028");
		
		contactNumber.clear();
		contactNumber.sendKeys("9876543210");
		
		alternateContactNumber.clear();
		alternateContactNumber.sendKeys("1234567890");
		
		emailID.clear();
		emailID.sendKeys("test@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOf(yearBucket));
		yearBucket.click();
		YBucket.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(techCategory));
		techCategory.click();
		TCategory.click();
		Thread.sleep(3000);
		
		scrollToElement(reportingTo);
		wait.until(ExpectedConditions.visibilityOf(reportingTo));
		reportingTo.click();
		Reporting.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(designation));
		designation.click();
		Desig.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(status));
		status.click();
		StatusActive.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(PExp));
		PExp.clear();
		PExp.sendKeys("70");
		
		scrollToElement(tenureInYears);
		wait.until(ExpectedConditions.visibilityOf(tenureInYears));
		tenureInYears.clear();
		tenureInYears.sendKeys("5");
		
		wait.until(ExpectedConditions.visibilityOf(totalYears));
		totalYears.clear();
		totalYears.sendKeys("6");
		
		wait.until(ExpectedConditions.visibilityOf(PriSkill));
		PriSkill.clear();
		PriSkill.sendKeys("Automation Testing");
		
		wait.until(ExpectedConditions.visibilityOf(SecSkill));
		SecSkill.clear();
		SecSkill.sendKeys("Manual Testing");
		
		wait.until(ExpectedConditions.visibilityOf(Strengths));
		Strengths.clear();
		Strengths.sendKeys("Test");
	}

	public void selectBirthDate() throws InterruptedException {
		scrollToElement(birthDate);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(birthDate));
		
		highLightElement(driver, birthDate);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", birthDate);
		
		Thread.sleep(2000);
				
		while(!DateMonths.getText().contains("MAY 2021"))
		{
			//birthDateNavButton.click();			
			js.executeScript("arguments[0].click()", DateNavButton);
		}

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("8")) {
				allDates.get(i).click();
				break;
			}
		}

		System.out.println(DateOfBirth.getText());
		System.out.println("Birth date selected");
		Thread.sleep(5000);
	}
	
	public void selectJoiningDate() throws InterruptedException {
		scrollToElement(joiningDate);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(joiningDate));
		
		highLightElement(driver, joiningDate);
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click()", joiningDate);
		 
		  Thread.sleep(2000);
			
			while(!DateMonths.getText().contains("APR 2021"))
			{
				//birthDateNavButton.click();			
				js.executeScript("arguments[0].click()", DateNavButton);
			}

			int total_nodes = allDates.size();

			for (int i = 0; i < total_nodes; i++) {
				String date = allDates.get(i).getText();
				if (date.equalsIgnoreCase("21")) {
					allDates.get(i).click();
					break;
				}
			}
		  		
		System.out.println("Joining date selected");
		Thread.sleep(3000);
	}
	
	public void searchResource(String name) throws InterruptedException {
				
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		highLightElement(driver, searchBox);
		Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys(name);

		Thread.sleep(5000);
	}
	
	public void deleteResource(String name) throws InterruptedException {
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
		
		System.out.println("Client deleted successfully");
	}
	
	public void editResourceInformation()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(resourceName));

		resourceName.clear();
		resourceName.sendKeys("Test2");
		
		//employeeID.clear();
		//employeeID.sendKeys("DS8");
				
		address.clear();
		address.sendKeys("Pune");
		
		scrollToElement(country);
		wait.until(ExpectedConditions.visibilityOf(country));
		country.click();
		country2.click();		
				
		wait.until(ExpectedConditions.visibilityOf(state));
		state.click();
		state2.click();
				
		wait.until(ExpectedConditions.visibilityOf(city));
		city.click();
		city2.click();
				
		zip.clear();
		zip.sendKeys("99546");
		
		contactNumber.clear();
		contactNumber.sendKeys("7890654321");
		
		alternateContactNumber.clear();
		alternateContactNumber.sendKeys("9087654321");
		
		emailID.clear();
		emailID.sendKeys("test2@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOf(yearBucket));
		yearBucket.click();
		YBucket.click();
				
		wait.until(ExpectedConditions.visibilityOf(techCategory));
		techCategory.click();
		TCategory.click();
				
		scrollToElement(reportingTo);
		wait.until(ExpectedConditions.visibilityOf(reportingTo));
		reportingTo.click();
		Reporting.click();
				
		wait.until(ExpectedConditions.visibilityOf(designation));
		designation.click();
		Desig.click();
				
		wait.until(ExpectedConditions.visibilityOf(status));
		status.click();
		StatusActive.click();
				
		wait.until(ExpectedConditions.visibilityOf(PExp));
		PExp.clear();
		PExp.sendKeys("50");
		
		scrollToElement(tenureInYears);
		wait.until(ExpectedConditions.visibilityOf(tenureInYears));
		tenureInYears.clear();
		tenureInYears.sendKeys("4");
		
		wait.until(ExpectedConditions.visibilityOf(totalYears));
		totalYears.clear();
		totalYears.sendKeys("5");
		
		wait.until(ExpectedConditions.visibilityOf(PriSkill));
		PriSkill.clear();
		PriSkill.sendKeys("Automation Testing");
		
		wait.until(ExpectedConditions.visibilityOf(SecSkill));
		SecSkill.clear();
		SecSkill.sendKeys("Manual Testing");
		
		wait.until(ExpectedConditions.visibilityOf(Strengths));
		Strengths.clear();
		Strengths.sendKeys("Test 2 added");
	}	
}
