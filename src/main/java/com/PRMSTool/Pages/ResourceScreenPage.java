package com.PRMSTool.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
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

	//@FindBy(xpath = "(//span[contains(text(),'Resource')])[1]")
	@FindBy(xpath = "(//a[@href='/resource'])[1]")
	WebElement resource;

	@FindBy(xpath = "//input[@placeholder='Search for a resource']")
	//@FindBy(xpath = "//div[@class='search']")	
	WebElement searchBox;
	
	//@FindBy(xpath = "//button[@class='add-resource-button fuse-white mt-24 mt-md-0 mat-raised-button']")
	@FindBy(xpath = "//button[@class='add-resource-button fuse-white mt-md-0 mat-raised-button']")
	//@FindBy(xpath = "//span[contains(text(),'ADD NEW')]")
	WebElement addNew;

	@FindBy(xpath = "//input[@placeholder='ResourceName']")
	WebElement resourceName;

	@FindBy(xpath = "//input[@placeholder='Employee Id']")
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
	
	@FindBy(xpath = "//button[@class='mat-calendar-previous-button mat-icon-button' and @type='button']")
	WebElement DateNavPrevButton;
	
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
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Software Test Engineer ')]")
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

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement yesButton;
	
	public ResourceScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnResource() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOf(resource));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", resource);
		//resource.click();
	}
	
	public void clickOnAddNew() throws InterruptedException {

		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addNew));
		highLightElement(driver, addNew);

		
		//addNew.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", addNew);
	}

	public void addResourceDetails() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(resourceName));

		resourceName.clear();
		resourceName.sendKeys("TestResource");
		
		employeeID.clear();
		employeeID.sendKeys("DS453");
		//Thread.sleep(5000);
		
		/*
		 * System.out.println("Employee ID: "); Scanner scan1 = new Scanner(System.in);
		 * String input1 = scan1.nextLine(); System.out.println(input1);
		 * employeeID.sendKeys(input1);
		 */
		
		address.clear();
		address.sendKeys("Hadapsar");
		
		scrollToElement(country);
		//wait.until(ExpectedConditions.elementToBeClickable(country));
		country.click();
		country1.click();		
		//Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.elementToBeClickable(state));
		state.click();
		state1.click();
		//Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.elementToBeClickable(city));
		city.click();
		city1.click();
		//Thread.sleep(3000);
		
		zip.clear();
		zip.sendKeys("411028");
		
		contactNumber.clear();
		contactNumber.sendKeys("9876543210");
		
		alternateContactNumber.clear();
		alternateContactNumber.sendKeys("1234567890");
		
		emailID.clear();
		emailID.sendKeys("test@gmail.com");
		
		//wait.until(ExpectedConditions.visibilityOf(yearBucket));
		yearBucket.click();
		YBucket.click();
		//Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.elementToBeClickable(techCategory));
		techCategory.click();
		Thread.sleep(3000);
		TCategory.click();
		
		
		scrollToElement(reportingTo);
		//wait.until(ExpectedConditions.elementToBeClickable(reportingTo));
		reportingTo.click();
		Reporting.click();
		//Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.elementToBeClickable(designation));
		designation.click();
		Desig.click();
		//Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.elementToBeClickable(status));
		status.click();
		StatusActive.click();
		//Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.visibilityOf(PExp));
		PExp.clear();
		PExp.sendKeys("70");
		
		scrollToElement(tenureInYears);
		//wait.until(ExpectedConditions.visibilityOf(tenureInYears));
		tenureInYears.clear();
		tenureInYears.sendKeys("5");
		
		//wait.until(ExpectedConditions.visibilityOf(totalYears));
		totalYears.clear();
		totalYears.sendKeys("6");
		
		//wait.until(ExpectedConditions.visibilityOf(PriSkill));
		PriSkill.clear();
		PriSkill.sendKeys("Automation Testing");
		
		//wait.until(ExpectedConditions.visibilityOf(SecSkill));
		SecSkill.clear();
		SecSkill.sendKeys("Manual Testing");
		
		//wait.until(ExpectedConditions.visibilityOf(Strengths));
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
		
		//Thread.sleep(2000);
				
		while(!DateMonths.getText().contains("MAY 1990"))
		{
			//birthDateNavButton.click();			
			js.executeScript("arguments[0].click()", DateNavPrevButton);
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
		//Thread.sleep(5000);
	}
	
	public void selectJoiningDate() throws InterruptedException {
		scrollToElement(joiningDate);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(joiningDate));
		
		highLightElement(driver, joiningDate);
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click()", joiningDate);
		 
		  Thread.sleep(2000);
			
			while(!DateMonths.getText().contains("JAN 2022"))
			{
				//birthDateNavButton.click();			
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
		  		
		System.out.println("Joining date selected");
		//Thread.sleep(3000);
	}
	
	public void searchResource(String name) throws InterruptedException {
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		highLightElement(driver, searchBox);
		
		searchBox.clear();
		searchBox.sendKeys(name);

		Thread.sleep(5000);
	}
	
	public void deleteResource(String name) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		searchBox.clear();
		searchBox.sendKeys(name);

		Thread.sleep(3000);
		
		deleteButton.click();
		/*
		 * Alert objalert=driver.switchTo().alert();
		 * System.out.println(objalert.getText()); objalert.accept();
		 */
		//yesButton.click();
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.elementToBeClickable(yesButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", yesButton);
		
		System.out.println("Resource deleted successfully");
		searchBox.clear();
		Thread.sleep(5000);
	}
	
	public void editResourceInformation() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(resourceName));

		resourceName.clear();
		resourceName.sendKeys("Test2");
		
		//employeeID.clear();
		//employeeID.sendKeys("DS8");
				
		address.clear();
		address.sendKeys("USA");
		
		scrollToElement(country);
		wait.until(ExpectedConditions.elementToBeClickable(country));
		country.click();
		Thread.sleep(2000);
		country2.click();		
				
		wait.until(ExpectedConditions.elementToBeClickable(state));
		state.click();
		Thread.sleep(2000);
		//state2.click();
		staleElementClick(5, state2, 60);	
		
		wait.until(ExpectedConditions.elementToBeClickable(city));
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
		
		wait.until(ExpectedConditions.elementToBeClickable(yearBucket));
		yearBucket.click();
		YBucket.click();
				
		wait.until(ExpectedConditions.elementToBeClickable(techCategory));
		techCategory.click();
		TCategory.click();
				
		scrollToElement(reportingTo);
		wait.until(ExpectedConditions.elementToBeClickable(reportingTo));
		reportingTo.click();
		Reporting.click();
				
		wait.until(ExpectedConditions.elementToBeClickable(designation));
		designation.click();
		Desig.click();
				
		wait.until(ExpectedConditions.elementToBeClickable(status));
		status.click();
		StatusActive.click();
				
		wait.until(ExpectedConditions.elementToBeClickable(PExp));
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
