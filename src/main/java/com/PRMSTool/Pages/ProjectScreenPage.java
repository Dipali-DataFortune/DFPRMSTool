package com.PRMSTool.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.PRMSTool.base.TestBase;

public class ProjectScreenPage extends TestBase{

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@FindBy(xpath = "//button[@class='add-project-button fuse-white mt-24 mt-md-0 mat-raised-button']")
	//@FindBy(xpath="//span[contains(text(),'ADD')]")
	WebElement addNew;
	
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement downloadFile;
	
	@FindBy(xpath = "(//span[contains(text(),'Project')])[1]")
	WebElement project;
	
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement projectFile;
	
	@FindBy(xpath = "//mat-select[@placeholder='Client']")
	WebElement clientDropdown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' ABC ')]")
	WebElement client1;
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' Van Ran Communications Services Inc. ')]")
	WebElement client2;
	
	@FindBy(xpath = "//input[@placeholder='Project Name']")
	WebElement projectName;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button' and @type='button'])[1]")
	WebElement startDate;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button' and @type='button'])[2]")
	WebElement endDate;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button' and @type='button'])[3]")
	WebElement ApproxStartDate;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button' and @type='button'])[4]")
	WebElement ApproxEndDate;

	@FindBy(xpath = "//table[@class='mat-calendar-table']//td")
	List<WebElement> allDates;
	
	@FindBy(xpath = "//input[@placeholder='Number Of Resorces']")
	WebElement resources;
	
	@FindBy(xpath = "//input[@placeholder='Duration']")
	WebElement duration;
	
	@FindBy(xpath = "//mat-select[@placeholder='Project Manager']")
	WebElement ProjectManager;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Dipali Vaidya (DS1167) ')]")
	WebElement ProjectManager1;
	
	@FindBy(xpath = "//mat-select[@placeholder='Project Lead']")
	WebElement ProjectLead;
		
	@FindBy(xpath = "//mat-option//span[contains(text(),' Shailendra Pardeshi (DS1129) ')]")
	WebElement ProjectLead1;
	
	@FindBy(xpath = "//mat-select[@placeholder='Project Type']")
	WebElement projectType;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' QA Automation ')]")
	WebElement projectType1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' BI ')]")
	WebElement projectType2;
	
	@FindBy(xpath = "//mat-select[@placeholder='Project Sub Type']")
	WebElement projectSubType;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Others ')]")
	WebElement projectSubType1;
		
	@FindBy(xpath = "//mat-select[@placeholder='Category']")
	WebElement category;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Fixed ')]")
	WebElement category1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Others ')]")
	WebElement category2;
	
	@FindBy(xpath = "//mat-select[@placeholder='Project Status']")
	WebElement ProjectStatus;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Active ')]")
	WebElement ProjectStatus1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Inactive ')]")
	WebElement ProjectStatus2;
	
	@FindBy(xpath = "//textarea[@placeholder='Description']")
	WebElement description;
	
	@FindBy(xpath = "//input[@placeholder='Search for a project']")
	WebElement searchBox;
	
	@FindBy(xpath="//mat-cell[@role='gridcell']")
	List<WebElement> searchBoxValues;
	
	@FindBy(xpath = "//button[@class='iconbutton mat-icon-button ng-tns-c41-157 mat-primary ng-star-inserted']")
	WebElement editButton;
	
	@FindBy(xpath = "(//div[@role='tab'])[2]")
	WebElement billing;
	
	@FindBy(xpath = "//mat-select[@role='listbox' and @name='ReviewCycleId']")
	WebElement reviewCycle;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Monthly ')]")
	WebElement reviewCycle1;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Weekly ')]")
	WebElement reviewCycle2;
	
	@FindBy(xpath = "//input[@placeholder='Monthly Billing Rate']")
	WebElement MonthlyBillingRate;
	
	@FindBy(xpath = "//input[@placeholder='Weekly Billing Rate']")
	WebElement WeeklyBillingRate;
	
	@FindBy(xpath = "//input[@placeholder='Hourly Billing Rate']")
	WebElement HourlyBillingRate;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'delete')]")
	WebElement deleteButton;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement yesButton;
	
	public ProjectScreenPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnProject()
	{
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(project));
		
		project.click();
	}
		
	public void clickOnAddNew() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(addNew));
		//highLightElement(driver, addNew);
		//Thread.sleep(5000);
		addNew.click();
	}
	
	public void addProjectDetails() throws InterruptedException
	{	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(clientDropdown));
		wait.until(ExpectedConditions.elementToBeClickable(clientDropdown));
		Thread.sleep(3000);
		//highLightElement(driver, clientDropdown);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", clientDropdown);
		//Thread.sleep(3000);
		//wait.until(ExpectedConditions.elementToBeClickable(client1));
		//wait.until(ExpectedConditions.elementToBeSelected(client1));
		//js.executeScript("arguments[0].click()", client1);
		client1.click();
		
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(projectName));
		projectName.clear();
		projectName.sendKeys("test");		
	}
	
	public void selectStartDate() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(startDate));
		//highLightElement(driver, startDate);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", startDate);
		//startDate.click();
		
		//Thread.sleep(2000);
			
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
		wait.until(ExpectedConditions.elementToBeClickable(endDate));
		//highLightElement(driver, endDate);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", endDate);
		//endDate.click();
		
		//Thread.sleep(2000);
			
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
		wait.until(ExpectedConditions.elementToBeClickable(ApproxStartDate));
		//highLightElement(driver, ApproxStartDate);
		//AStartDate.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ApproxStartDate);
		//Thread.sleep(2000);
			
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
		wait.until(ExpectedConditions.elementToBeClickable(ApproxEndDate));
//		highLightElement(driver, ApproxEndDate);
		//AEndDate.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ApproxEndDate);
		
		//Thread.sleep(2000);
			
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
		
		duration.clear();
		duration.sendKeys("12");
		
		scrollToElement(ProjectManager);
		wait.until(ExpectedConditions.elementToBeClickable(ProjectManager));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", PM);
		ProjectManager.click();
		ProjectManager1.click();
		//Thread.sleep(3000);
	
		wait.until(ExpectedConditions.elementToBeClickable(ProjectLead));
		ProjectLead.click();
		ProjectLead1.click();
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(projectType));
		projectType.click();
		projectType1.click();
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(projectSubType));
		projectSubType.click();
		Thread.sleep(3000);
		projectSubType1.click();
		//Thread.sleep(3000);
		
		scrollToElement(category);
		wait.until(ExpectedConditions.elementToBeClickable(category));
		category.click();
		category1.click();
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(ProjectStatus));
		ProjectStatus.click();
		ProjectStatus1.click();
		//Thread.sleep(3000);
		
		scrollToElement(description);
		wait.until(ExpectedConditions.visibilityOf(description));	
		description.clear();
		description.sendKeys("test");		
	}
	
	public void addBillingDetails() throws InterruptedException
	{
		scrollToElement(billing);
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(billing));
		
		billing.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(reviewCycle));
		reviewCycle.click();
		reviewCycle1.click();
		
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(MonthlyBillingRate));
		MonthlyBillingRate.clear();
		MonthlyBillingRate.sendKeys("5000");
		
		wait.until(ExpectedConditions.visibilityOf(WeeklyBillingRate));
		WeeklyBillingRate.clear();
		WeeklyBillingRate.sendKeys("3000");
		
		wait.until(ExpectedConditions.visibilityOf(HourlyBillingRate));
		HourlyBillingRate.clear();
		HourlyBillingRate.sendKeys("2000");
		
		//Thread.sleep(5000);
		
		System.out.println("Billing details added successfully");
	}
	
	public void searchProject(String name) throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		//highLightElement(driver, searchBox);
		//Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys(name);

		//Thread.sleep(5000);
	}
	
	public void deleteProject(String name) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		//Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys(name);

		deleteButton.click();
		//Thread.sleep(3000);
		/*
		 * Alert objalert=driver.switchTo().alert();
		 * System.out.println(objalert.getText()); objalert.accept();
		 */
		//yesButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(yesButton));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", yesButton);

		System.out.println("Client deleted successfully");
	}
		
	public void editProjectInformation() throws InterruptedException
	{
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(clientDropdown));
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//clientDropdown.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", clientDropdown);
		
		wait.until(ExpectedConditions.elementToBeClickable(client2));
		js.executeScript("arguments[0].click()", client2);
		
		wait.until(ExpectedConditions.visibilityOf(projectName));
		projectName.clear();
		projectName.sendKeys("Test project");
		
		resources.clear();
		resources.sendKeys("6");
		
		duration.clear();
		duration.sendKeys("15");
		
		scrollToElement(ProjectManager);
		wait.until(ExpectedConditions.elementToBeClickable(ProjectManager));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", ProjectManager);
		//PM.click();
		ProjectManager1.click();
			
		wait.until(ExpectedConditions.elementToBeClickable(ProjectLead));
		ProjectLead.click();
		//ProjectLead1.click();
		staleElementClick(5, ProjectLead1, 60);
				
		wait.until(ExpectedConditions.elementToBeClickable(projectType));
		projectType.click();
		projectType2.click();
				
		wait.until(ExpectedConditions.elementToBeClickable(projectSubType));
		projectSubType.click();
		projectSubType1.click();
		//staleElementClick(5, projectSubType1, 60);
				
		scrollToElement(category);
		wait.until(ExpectedConditions.elementToBeClickable(category));
		category.click();
		//category2.click();
		staleElementClick(5, projectSubType1, 60);
				
		wait.until(ExpectedConditions.elementToBeClickable(ProjectStatus));
		ProjectStatus.click();
		ProjectStatus2.click();
				
		scrollToElement(description);
		wait.until(ExpectedConditions.visibilityOf(description));	
		description.clear();
		description.sendKeys("Project information updated");
		
		scrollToElement(billing);
		WebDriverWait wait1=new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(billing));
		
		billing.click();
		
		wait1.until(ExpectedConditions.elementToBeClickable(reviewCycle));
		reviewCycle.click();
		reviewCycle2.click();
						
		wait1.until(ExpectedConditions.visibilityOf(MonthlyBillingRate));
		MonthlyBillingRate.clear();
		MonthlyBillingRate.sendKeys("3000");
		
		wait1.until(ExpectedConditions.visibilityOf(WeeklyBillingRate));
		WeeklyBillingRate.clear();
		WeeklyBillingRate.sendKeys("2000");
		
		wait1.until(ExpectedConditions.visibilityOf(HourlyBillingRate));
		HourlyBillingRate.clear();
		HourlyBillingRate.sendKeys("1000");
		
		System.out.println("Project information updated successfully");
	}
}
