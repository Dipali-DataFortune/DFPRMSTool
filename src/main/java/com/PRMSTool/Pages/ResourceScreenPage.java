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

public class ResourceScreenPage extends TestBase {

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath = "(//span[contains(text(),'Resource')])[1]")
	WebElement resource;

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
	WebElement birthDateMonths;

	@FindBy(xpath = "//table[@class='mat-calendar-table']//td")
	List<WebElement> allDates;

	@FindBy(xpath = "//button[@class='mat-calendar-next-button mat-icon-button' and @type='button']")
	WebElement birthDateNavButton;
	
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

	@FindBy(xpath = "//mat-select[@placeholder='State']")
	WebElement state;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Maharashtra ')]")
	WebElement state1;
	
	@FindBy(xpath = "//mat-select[@placeholder='City']")
	WebElement city;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Pune ')]")
	WebElement city1;
	
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
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' QA Automation ')]")
	WebElement TCategory;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Dipali Vaidya (DS1167) ')]")
	WebElement Reporting;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Senior Automation Tester Engineer ')]")
	WebElement Desig;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Active ')]")
	WebElement StatusActive;
	
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
	List <WebElement> downloadFile;
	
	public ResourceScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnResource() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(resource));

		resource.click();
	}
	
	public void downloadFile() throws InterruptedException
	{
		String downloadFilePath= "C:\\Users\\Dipali.vaidya\\Downloads";
		HashMap<String, Object> chromePref= new HashMap<String, Object>();
		chromePref.put("profile.default_content_settings.popups", 0);
		chromePref.put("download.default_directory", downloadFilePath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePref);
		
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

	public void addResourceDetails() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(resourceName));

		resourceName.sendKeys("Test1");
		employeeID.sendKeys("DS123");
		Thread.sleep(5000);
		
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
		
		zip.sendKeys("411028");
		contactNumber.sendKeys("9876543210");
		alternateContactNumber.sendKeys("1234567890");
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
		PriSkill.sendKeys("Automation Testing");
		
		wait.until(ExpectedConditions.visibilityOf(SecSkill));
		SecSkill.sendKeys("Manual Testing");
		
		wait.until(ExpectedConditions.visibilityOf(Strengths));
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
				
		while(!birthDateMonths.getText().contains("MAY 2021"))
		{
			//birthDateNavButton.click();			
			js.executeScript("arguments[0].click()", birthDateNavButton);
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
				
		//Months.click();
		js.executeScript("arguments[0].click()", Months);
		
		int total_nodes = allDates.size();
		for (int i = 0; i < total_nodes; i++) {
		String month=allDates.get(i).getText();

		if(month.equalsIgnoreCase("2021"))
		{
			allDates.get(i).click();
			break;
		}
	}
		int total_nodes1 = allMonths.size();
		for (int i = 0; i < total_nodes1; i++) {
		String monthName=allMonths.get(i).getText();

		if(monthName.equalsIgnoreCase("MAR"))
		{
			allMonths.get(i).click();
			break;
		}
	}		
		int total_nodes2 = allDates.size();
		for (int i = 0; i < total_nodes2; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("10")) {
				allDates.get(i).click();
				break;
			}
		}

		System.out.println(DateOfBirth.getText());
		System.out.println("Joining date selected");
		Thread.sleep(5000);
	}
}
