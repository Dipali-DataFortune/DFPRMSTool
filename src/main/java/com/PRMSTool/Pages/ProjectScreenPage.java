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
	
	//@FindBy(xpath = "//button[@class='add-project-button fuse-white mt-24 mt-md-0 mat-raised-button']")
	@FindBy(xpath = "//button[@class='add-project-button fuse-white mt-md-0 mat-raised-button']")
	//@FindBy(xpath="//span[contains(text(),'ADD')]")
	WebElement addNew;
	
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement downloadFile;
	
	@FindBy(xpath = "(//a[@href='/project'])[1]")
	//@FindBy(xpath = "(//a[@class='nav-link ng-star-inserted active accent'])[1]")	
	//(//a[@href='/project'])[1]
	WebElement project;
	
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement projectFile;
	
	@FindBy(xpath = "//mat-select[@placeholder='Select Client']")
	WebElement clientDropdown;
	
	//@FindBy(xpath = "//mat-option/span[contains(text(),' test ')]")
	@FindBy(xpath = "(//mat-option/span[contains(text(),' test ')])[1]")
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
	WebElement ActualStartDate;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button' and @type='button'])[4]")
	WebElement ActualEndDate;

	@FindBy(xpath = "//div[@class='mat-calendar-content']//table[@class='mat-calendar-table']//td")
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
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' T&M ')]")
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
	
	@FindBy(xpath = "//div[contains(text(),'Billing')]")
	WebElement billing;
	
	@FindBy(xpath = "//div[contains(text(),'Project Details')]")
	WebElement ProjectDetails;
	
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
	
	@FindBy(xpath = "//mat-option//span[contains(text(),' All ')]")
	WebElement status;
	
	@FindBy(xpath = "//div[@class='mat-calendar-controls']")
	WebElement DateMonths;
	
	@FindBy(xpath = "//button[@class='mat-calendar-next-button mat-icon-button' and @type='button']")
	WebElement DateNavButton;
	
	
	public ProjectScreenPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnProject() throws InterruptedException
	{
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(project));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		/*
		 * if(project.isDisplayed()) {
		 */
		//project.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", project);
		/*
		 * } else { System.out.println("Element is not visible"); }
		 */
	}
		
	public void clickOnAddNew() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addNew));
		//highLightElement(driver, addNew);
		//Thread.sleep(5000);
		//addNew.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", addNew);
	}
	
	public void addProjectDetails() throws InterruptedException
	{	
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(clientDropdown));
		//wait.until(ExpectedConditions.elementToBeClickable(clientDropdown));
		
		clientDropdown.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", clientDropdown);
		
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(client1));
		js.executeScript("arguments[0].click()", client1);
		//client1.click();
		
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(projectName));
		projectName.clear();
		projectName.sendKeys("test add Project");		
	}
	
	public void selectStartDate() throws InterruptedException {
		ProjectDetails.click();
		
		scrollToElement(startDate);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(startDate));

		highLightElement(driver, startDate);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", startDate);

		Thread.sleep(2000);

		while (!DateMonths.getText().contains("JAN 2022")) {
			 js.executeScript("arguments[0].click()", DateNavButton);
			//staleElementClick(5, DateNavButton, 60);
		}

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("24")) {
				allDates.get(i).click();
				//js.executeScript("arguments[0].click()", allDates.get(i));
				break;
			}
		}

		System.out.println("Start date selected");
		Thread.sleep(3000);
	}
	
	public void selectEndDate() throws InterruptedException {
		scrollToElement(endDate);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(endDate));

		highLightElement(driver, endDate);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", endDate);

		Thread.sleep(2000);

		while (!DateMonths.getText().contains("FEB 2022")) {
			js.executeScript("arguments[0].click()", DateNavButton);
			//staleElementClick(5, DateNavButton, 60);
		}

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("25")) {
				allDates.get(i).click();
				//js.executeScript("arguments[0].click()", allDates.get(i));
				break;
			}
		}

		System.out.println("End date selected");
		Thread.sleep(3000);
	}
	
	public void selectActualStartDate() throws InterruptedException {
		scrollToElement(ActualStartDate);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ActualStartDate));

		highLightElement(driver, ActualStartDate);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ActualStartDate);

		Thread.sleep(2000);

		while (!DateMonths.getText().contains("JAN 2022")) {
			js.executeScript("arguments[0].click()", DateNavButton);
			//staleElementClick(5, DateNavButton, 60);
		}

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("26")) {
				allDates.get(i).click();
				//js.executeScript("arguments[0].click()", allDates.get(i));
				break;
			}
		}

		System.out.println("Actual start date selected");
		Thread.sleep(3000);
	}
	
	public void selectActualEndDate() throws InterruptedException {
		scrollToElement(ActualEndDate);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ActualEndDate));

		highLightElement(driver, ActualEndDate);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ActualEndDate);

		Thread.sleep(2000);

		while (!DateMonths.getText().contains("FEB 2022")) {
			js.executeScript("arguments[0].click()", DateNavButton);
			//staleElementClick(5, DateNavButton, 60);
		}

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("28")) {
				allDates.get(i).click();
				//js.executeScript("arguments[0].click()", allDates.get(i));
				break;
			}
		}

		System.out.println("Actual end date selected");
		Thread.sleep(3000);
	}
	
	public void addProjectDetails1() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(resources));
		
		resources.clear();
		resources.sendKeys("4");
		
		duration.clear();
		duration.sendKeys("12");
		
		scrollToElement(ProjectManager);
		//wait.until(ExpectedConditions.elementToBeClickable(ProjectManager));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ProjectManager);
		//ProjectManager.click();
		ProjectManager1.click();
		//Thread.sleep(3000);
	
		wait.until(ExpectedConditions.elementToBeClickable(ProjectLead));
		ProjectLead.click();
		//ProjectLead1.click();
		staleElementClick(5, ProjectLead1, 60);
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
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", billing);
		//billing.click();
		
		WebDriverWait wait1=new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(reviewCycle));
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
		Thread.sleep(5000);		
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(searchBox));
		
		//status.click();

		highLightElement(driver, searchBox);
		//searchBox.clear();
		searchBox.sendKeys(name);
		Thread.sleep(2000);
	}
	
	public void deleteProject(String name) throws InterruptedException {
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		searchBox.clear();
		searchBox.sendKeys(name);
		
		Thread.sleep(3000);
		
		deleteButton.click();
		/*
		 * Alert objalert=driver.switchTo().alert();
		 * System.out.println(objalert.getText()); objalert.accept();
		 */
		//yesButton.click();
		//wait.until(ExpectedConditions.elementToBeClickable(yesButton));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", yesButton);

		System.out.println("Project deleted successfully");
		
		searchBox.clear();
		Thread.sleep(5000);
	}
		
	public void editProjectInformation() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(clientDropdown));
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//clientDropdown.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", clientDropdown);
		
		wait.until(ExpectedConditions.elementToBeClickable(client2));
		js.executeScript("arguments[0].click()", client2);
		
		//wait.until(ExpectedConditions.visibilityOf(projectName));
		//projectName.clear();
		//projectName.sendKeys("Test project");
		
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
		//projectSubType1.click();
		staleElementClick(5, projectSubType1, 60);
				
		scrollToElement(category);
		wait.until(ExpectedConditions.elementToBeClickable(category));
		category.click();
		category2.click();
		//staleElementClick(5, projectSubType1, 60);
				
		wait.until(ExpectedConditions.elementToBeClickable(ProjectStatus));
		ProjectStatus.click();
		ProjectStatus2.click();
				
		scrollToElement(description);
		//wait.until(ExpectedConditions.visibilityOf(description));	
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
	
	public void editStartDate() throws InterruptedException {
		ProjectDetails.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(startDate));

		highLightElement(driver, startDate);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", startDate);

		Thread.sleep(2000);

		while (!DateMonths.getText().contains("JAN 2022")) {
			js.executeScript("arguments[0].click()", DateNavButton);
			//DateNavButton.click();
			//staleElementClick(5, DateNavButton, 60);
		}

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("24")) {
				allDates.get(i).click();
				//js.executeScript("arguments[0].click()", allDates.get(i));
				break;
			}
		}

		System.out.println("Start date edited");
		//Thread.sleep(2000);
	}
	
	public void editEndDate() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(endDate));

		highLightElement(driver, endDate);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", endDate);

		Thread.sleep(2000);

		while (!DateMonths.getText().contains("FEB 2022")) {
			js.executeScript("arguments[0].click()", DateNavButton);
			//staleElementClick(5, DateNavButton, 60);
			//DateNavButton.click();
		}

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("22")) {
				//allDates.get(i).click();
				js.executeScript("arguments[0].click()", allDates.get(i));
				break;
			}
		}

		System.out.println("End date edited");
		//Thread.sleep(2000);
	}
	
	public void editActualStartDate() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ActualStartDate));

		highLightElement(driver, ActualStartDate);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ActualStartDate);

		Thread.sleep(2000);

		while (!DateMonths.getText().contains("JAN 2022")) {
			js.executeScript("arguments[0].click()", DateNavButton);
			//staleElementClick(5, DateNavButton, 60);
			//DateNavButton.click();
		}

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("25")) {
				//allDates.get(i).click();
				js.executeScript("arguments[0].click()", allDates.get(i));
				break;
			}
		}

		System.out.println("Actual start date edited");
		//Thread.sleep(3000);
	}
	
	public void editActualEndDate() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ActualEndDate));

		highLightElement(driver, ActualEndDate);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ActualEndDate);

		Thread.sleep(2000);

		while (!DateMonths.getText().contains("FEB 2022")) {
			js.executeScript("arguments[0].click()", DateNavButton);
			//staleElementClick(5, DateNavButton, 60);
			//DateNavButton.click();
		}

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("23")) {
				//allDates.get(i).click();
				js.executeScript("arguments[0].click()", allDates.get(i));
				break;
			}
		}

		System.out.println("Actual end date edited");
		Thread.sleep(3000);
	}
}
