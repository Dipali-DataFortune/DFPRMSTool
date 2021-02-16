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

import com.PRMSTool.base.TestBase;

public class ProjectScreenPage extends TestBase{

	@FindBy(xpath = "//span[contains(text(),'ADD NEW ')]")
	WebElement addNew;
	
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement downloadFile;
	
	@FindBy(xpath = "(//span[contains(text(),'Project')])[1]")
	WebElement project;
	
	@FindBy(xpath = "//input[@alt='Export' and @mattooltip='Download excel sheet']")
	WebElement projectFile;
	
	@FindBy(xpath = "//mat-select[@name='ClientId']")
	WebElement clientDropdown;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Appointlink Portal Solutions ')]")
	WebElement appointlink;
	
	@FindBy(id = "mat-input-2")
	WebElement projectName;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button'])[1]")
	WebElement startDate;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button'])[2]")
	WebElement endDate;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button'])[3]")
	WebElement AStartDate;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button'])[4]")
	WebElement AEndDate;

	@FindBy(xpath = "//table[@class='mat-calendar-table']//td")
	List<WebElement> allDates;
	
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
		
		projectFile.click();
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
		
	//	clientDropdown.click();
	//	appointlink.click();
		Thread.sleep(5000);
		projectName.sendKeys("test");
		Thread.sleep(5000);
	}
	
	public void selectStartDate() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(startDate));
		startDate.click();
		
		Thread.sleep(2000);
			
		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("17")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("Start date selected");
		Thread.sleep(5000);
	}
	
	public void selectEndDate() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(endDate));
		endDate.click();
		
		Thread.sleep(2000);
			
		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("18")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("End date selected");
		Thread.sleep(5000);
	}
	
	public void selectActualStartDate() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(AStartDate));
		AStartDate.click();
		
		Thread.sleep(2000);
			
		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("26")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("Start date selected");
		Thread.sleep(5000);
	}
	
	public void selectActualEndDate() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(AEndDate));
		AEndDate.click();
		
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
		Thread.sleep(5000);
	}
}
