/**
 * 
 */
package com.PRMSTool.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.PRMSTool.base.TestBase;

/**
 * @author dipali.vaidya
 *
 */
public class ClientReviewPage extends TestBase{

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath = "(//a[@href='/clientreview'])[1]")
	WebElement clientReview;

	@FindBy(xpath = "//input[@placeholder='Search for a Client Review']")
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@class='add-project-button fuse-white mt-md-0 mat-raised-button']")
	WebElement addNew;
	
	@FindBy(xpath="//mat-select[@placeholder='DateMaster']")
	WebElement dateMasterDropDown;
	
	@FindBy(xpath="//mat-select[@placeholder='YearMaster']")
	WebElement yearMasterDropDown;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' All ')]")
	WebElement dateMasterAll;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 January ')]")
	WebElement dateMasterJanuary1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-30 January ')]")
	WebElement dateMasterJanuary2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 February ')]")
	WebElement dateMasterFebruary1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-28 February ')]")
	WebElement dateMasterFebruary2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 March ')]")
	WebElement dateMasterMarch1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-31 March ')]")
	WebElement dateMasterMarch2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 April ')]")
	WebElement dateMasterApril1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-30 April ')]")
	WebElement dateMasterApril2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 May ')]")
	WebElement dateMasterMay1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-31 May ')]")
	WebElement dateMasterMay2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 June ')]")
	WebElement dateMasterJune1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-30 June ')]")
	WebElement dateMasterJune2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 July ')]")
	WebElement dateMasterJuly1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-31 July ')]")
	WebElement dateMasterJuly2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 August ')]")
	WebElement dateMasterAugust1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-31 August ')]")
	WebElement dateMasterAugust2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 September ')]")
	WebElement dateMasterSeptember1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-30 September ')]")
	WebElement dateMasterSeptember2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 October ')]")
	WebElement dateMasterOctober1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-31 October ')]")
	WebElement dateMasterOctober2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 November ')]")
	WebElement dateMasterNovember1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-30 November ')]")
	WebElement dateMasterNovember2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 December ')]")
	WebElement dateMasterDecember1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-31 December ')]")
	WebElement dateMasterDecember2;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' All ')]")
	WebElement yearMasterAll;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 2019 ')]")
	WebElement yearMaster2019;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 2020 ')]")
	WebElement yearMaster2020;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 2021 ')]")
	WebElement yearMaster2021;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 2022 ')]")
	WebElement yearMaster2022;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 2023 ')]")
	WebElement yearMaster2023;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 2024 ')]")
	WebElement yearMaster2024;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 2025 ')]")
	WebElement yearMaster2025;
	
	@FindBy(xpath = "(//mat-icon[contains(text(),'arrow_back')])[2]")
	WebElement NewClientReviewArrow;
	
	@FindBy(xpath = "//div[contains(text(),'Client Review Details')]")
	WebElement clientReviewDetails;
	
	@FindBy(xpath = "//mat-select[@name='ClientId']")
	WebElement ClientDropDown;
	
	@FindBy(xpath = "//mat-select[@name='ProjectId']")
	WebElement ProjectDropDown;
	
	@FindBy(xpath="//mat-select[@name='DateMasterId']")
	WebElement dateDropDown;
	
	@FindBy(xpath="//mat-select[@name='YearMasterId']")
	WebElement yearDropDown;
	
	@FindBy(xpath = "//mat-select[@name='CustomerEngagement']")
	WebElement customerEngagementDropDown;
	
	@FindBy(xpath = "//mat-select[@name='Staffing']")
	WebElement StaffingDropDown;
	
	@FindBy(xpath = "//mat-select[@name='Team']")
	WebElement TeamDropDown;
	
	@FindBy(xpath = "//mat-select[@name='Delivery']")
	WebElement DeliveryDropDown;
	
	@FindBy(xpath = "//mat-select[@name='Technology']")
	WebElement TechnologyDropDown;
	
	@FindBy(xpath = "//mat-select[@name='PaymentStatus']")
	WebElement PaymentStatusDropDown;
	
	@FindBy(xpath = "//mat-select[@name='OverAll']")
	WebElement OverAllDropDown;
	
	@FindBy(xpath = "//textarea[@placeholder='Remarks']")
	WebElement remark;

	@FindBy(xpath = "//input[@placeholder='Customer Engagement Remark']")
	WebElement customerEngagementRemark;
	
	@FindBy(xpath = "//input[@placeholder='Staffing Remark']")
	WebElement staffingRemark;
	
	@FindBy(xpath = "//input[@placeholder='Team Remark']")
	WebElement teamRemark;
	
	@FindBy(xpath = "//input[@placeholder='Delivery Remark']")
	WebElement deliveryRemark;
	
	@FindBy(xpath = "//input[@placeholder='Technology Remark']")
	WebElement technologyRemark;
	
	@FindBy(xpath = "//input[@placeholder='Payment Status Remark']")
	WebElement paymentStatusRemark;
	
	@FindBy(xpath = "//input[@placeholder='Over All Remark']")
	WebElement overAllRemark;
	
	//@FindBy(xpath = "//button[@class='save-client-button mat-raised-button ng-tns-c34-186 ng-star-inserted']")
	@FindBy(xpath = "//span[contains(text(),'ADD')]")
	WebElement addButton;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' test ')]")
	WebElement clientTest;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' testClientReview ')]")
	WebElement clientTestClientReview;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' testProject ')]")
	WebElement projectTestProject;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' clientReviewProject ')]")
	WebElement projectclientReviewProject;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' abc ')]")
	WebElement clientAbc;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' abcproject ')]")
	WebElement projectAbc;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 1-15 August ')]")
	WebElement date;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 2021 ')]")
	WebElement year;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 15-30 January ')]")
	WebElement date1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' 2022 ')]")
	WebElement year1;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' Green ')]")
	WebElement greenColor;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' Orange ')]")
	WebElement orangeColor;
	
	@FindBy(xpath = "//mat-option[@role='option']/span[contains(text(),' Red ')]")
	WebElement redColor;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'delete')]")
	WebElement deleteButton;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement yesButton;
	
	
	public ClientReviewPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnClientReview() throws InterruptedException {
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(clientReview));

		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", clientReview);
	}

	public void clickOnAddNew() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addNew));
		highLightElement(driver, addNew);

		Thread.sleep(5000);
		addNew.click();
	}
	
	public void searchClientReview(String name) throws InterruptedException {
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
	
	public void addNewClientReview() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(NewClientReviewArrow));
		
		softAssert.assertEquals(NewClientReviewArrow.isDisplayed(), true);
		//softAssert.assertEquals(addButton.isEnabled(), true);  //is enabled
		
		softAssert.assertEquals(clientReviewDetails.isDisplayed(), true);
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ClientDropDown);
		Thread.sleep(2000);
		//ClientDropDown.click();
		js.executeScript("arguments[0].click()", clientTestClientReview);
		//clientTest.click();
		
		Thread.sleep(2000);
		//ProjectDropDown.click();
		//projectTestProject.click();
		js.executeScript("arguments[0].click()", ProjectDropDown);
		js.executeScript("arguments[0].click()", projectclientReviewProject);
		
		Thread.sleep(2000);
		//dateDropDown.click();
		//date.click();
		js.executeScript("arguments[0].click()", dateDropDown);
		js.executeScript("arguments[0].click()", date);
		
		//softAssert.assertEquals(year.isDisplayed(), true);
		Thread.sleep(2000);
		//customerEngagementDropDown.click();
		//greenColor.click();		
		js.executeScript("arguments[0].click()", customerEngagementDropDown);
		js.executeScript("arguments[0].click()", greenColor);
		
		Thread.sleep(2000);
		customerEngagementRemark.clear();
		customerEngagementRemark.sendKeys("test remark");
		
		Thread.sleep(2000);
		//StaffingDropDown.click();
		//orangeColor.click();
		js.executeScript("arguments[0].click()", StaffingDropDown);
		js.executeScript("arguments[0].click()", orangeColor);
		
		staffingRemark.clear();
		staffingRemark.sendKeys("test remark");
		
		scrollToElement(TeamDropDown);
		Thread.sleep(2000);
		//TeamDropDown.click();
		//redColor.click();
		js.executeScript("arguments[0].click()", TeamDropDown);
		js.executeScript("arguments[0].click()", redColor);
		
		teamRemark.clear();
		teamRemark.sendKeys("test remark");
		
		Thread.sleep(2000);
		//DeliveryDropDown.click();
		//greenColor.click();
		js.executeScript("arguments[0].click()", DeliveryDropDown);
		js.executeScript("arguments[0].click()", greenColor);
		
		deliveryRemark.clear();
		deliveryRemark.sendKeys("test remark");
		
		Thread.sleep(2000);
		//TechnologyDropDown.click();
		//orangeColor.click();
		js.executeScript("arguments[0].click()", TechnologyDropDown);
		js.executeScript("arguments[0].click()", orangeColor);
		
		technologyRemark.clear();
		technologyRemark.sendKeys("test remark");
		
		scrollToElement(PaymentStatusDropDown);
		Thread.sleep(2000);
		//PaymentStatusDropDown.click();
		//redColor.click();
		js.executeScript("arguments[0].click()", PaymentStatusDropDown);
		js.executeScript("arguments[0].click()", redColor);
		
		paymentStatusRemark.clear();
		paymentStatusRemark.sendKeys("test remark");
		
		Thread.sleep(2000);
		//OverAllDropDown.click();
		//greenColor.click();
		js.executeScript("arguments[0].click()", OverAllDropDown);
		js.executeScript("arguments[0].click()", greenColor);
		
		overAllRemark.clear();
		overAllRemark.sendKeys("test remark");
		
		remark.clear();
		remark.sendKeys("test remark");		
		
		scrollToElement(addButton);
		//addButton.click();
		js.executeScript("arguments[0].click()", addButton);
		
		System.out.println("Client review added successfully");
	}
	
	public void editClientReview() throws InterruptedException
	{
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		/*
		 * js.executeScript("arguments[0].click()", ClientDropDown); Thread.sleep(2000);
		 * //ClientDropDown.click(); js.executeScript("arguments[0].click()",
		 * clientAbc); //clientTest.click();
		 * 
		 * Thread.sleep(2000); //ProjectDropDown.click(); //projectTestProject.click();
		 * js.executeScript("arguments[0].click()", ProjectDropDown);
		 * js.executeScript("arguments[0].click()", projectAbc);
		 * 
		 * Thread.sleep(2000);
		 */
		//dateDropDown.click();
		//date.click();
		js.executeScript("arguments[0].click()", dateDropDown);
		js.executeScript("arguments[0].click()", date1);
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click()", yearDropDown);
		js.executeScript("arguments[0].click()", year1);
		
		//customerEngagementDropDown.click();
		//greenColor.click();		
		js.executeScript("arguments[0].click()", customerEngagementDropDown);
		js.executeScript("arguments[0].click()", redColor);
		
		Thread.sleep(2000);
		customerEngagementRemark.clear();
		customerEngagementRemark.sendKeys("edit remark");
		
		Thread.sleep(2000);
		//StaffingDropDown.click();
		//orangeColor.click();
		js.executeScript("arguments[0].click()", StaffingDropDown);
		js.executeScript("arguments[0].click()", greenColor);
		
		staffingRemark.clear();
		staffingRemark.sendKeys("edit remark");
		
		scrollToElement(TeamDropDown);
		Thread.sleep(2000);
		//TeamDropDown.click();
		//redColor.click();
		js.executeScript("arguments[0].click()", TeamDropDown);
		js.executeScript("arguments[0].click()", orangeColor);
		
		teamRemark.clear();
		teamRemark.sendKeys("edit remark");
		
		Thread.sleep(2000);
		//DeliveryDropDown.click();
		//greenColor.click();
		js.executeScript("arguments[0].click()", DeliveryDropDown);
		js.executeScript("arguments[0].click()", redColor);
		
		deliveryRemark.clear();
		deliveryRemark.sendKeys("edit remark");
		
		Thread.sleep(2000);
		//TechnologyDropDown.click();
		//orangeColor.click();
		js.executeScript("arguments[0].click()", TechnologyDropDown);
		js.executeScript("arguments[0].click()", greenColor);
		
		technologyRemark.clear();
		technologyRemark.sendKeys("edit remark");
		
		scrollToElement(PaymentStatusDropDown);
		Thread.sleep(2000);
		//PaymentStatusDropDown.click();
		//redColor.click();
		js.executeScript("arguments[0].click()", PaymentStatusDropDown);
		js.executeScript("arguments[0].click()", orangeColor);
		
		paymentStatusRemark.clear();
		paymentStatusRemark.sendKeys("edit remark");
		
		Thread.sleep(2000);
		//OverAllDropDown.click();
		//greenColor.click();
		js.executeScript("arguments[0].click()", OverAllDropDown);
		js.executeScript("arguments[0].click()", redColor);
		
		overAllRemark.clear();
		overAllRemark.sendKeys("edit remark");
		
		remark.clear();
		remark.sendKeys("edit remark");		
		
		System.out.println("Client review updated successfully");
	}
	
	public void deleteClientReview(String name) throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(searchBox));
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		yearMasterDropDown.click();
		yearMasterAll.click();
		
		Thread.sleep(5000);
		
		searchBox.clear();
		searchBox.sendKeys(name);

		Thread.sleep(3000);
		
		deleteButton.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", yesButton);
		
		System.out.println("Resource deleted successfully");
		searchBox.clear();
		Thread.sleep(5000);
	}	
	
	public void displayDateJanuary() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterJanuary1));
		dateMasterJanuary1.click();
				
		System.out.println("Displayed all the client reviews added in the month of 1-15 January");	
	}
	
	public void displayDateJanuary1() throws InterruptedException
	{
		Thread.sleep(3000);
				
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterJanuary2));
		dateMasterJanuary2.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", dateMasterJanuary2);
		
		System.out.println("Displayed all the client reviews added in the month of 15-30 January");		
	}
	
	public void displayDateFebruary() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterFebruary1));
		dateMasterFebruary1.click();
				
		System.out.println("Displayed all the client reviews added in the month of 1-15 February");	
				
	}
	
	public void displayDateFebruary1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterFebruary2));
		dateMasterFebruary2.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", dateMasterFebruary2);
		
		System.out.println("Displayed all the client reviews added in the month of 15-28 February");		
	}
	
	public void displayDateMarch() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterMarch1));
		dateMasterMarch1.click();		
		
		System.out.println("Displayed all the client reviews added in the month of 1-15 March");
	}
	
	public void displayDateMarch1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterMarch2));
		dateMasterMarch2.click();
		
		System.out.println("Displayed all the client reviews added in the month of 15-31 March");		
	}
	
	public void displayDateApril() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterApril1));
		dateMasterApril1.click();
				
		System.out.println("Displayed all the client reviews added in the month of 1-15 April");				
	}
	
	public void displayDateApril1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterApril2));
		dateMasterApril2.click();
		
		System.out.println("Displayed all the client reviews added in the month of 15-30 April");		
	}
	
	public void displayDateMay() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterMay1));
		dateMasterMay1.click();
				
		System.out.println("Displayed all the client reviews added in the month of 1-15 May");		
	}
	
	public void displayDateMay1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterMay2));
		dateMasterMay2.click();
		
		System.out.println("Displayed all the client reviews added in the month of 15-31 May");		
	}
	
	public void displayDateJune() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterJune1));
		dateMasterJune1.click();
				
		System.out.println("Displayed all the client reviews added in the month of 1-15 June");	
	}
	
	public void displayDateJune1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterJune2));
		dateMasterJune2.click();
		
		System.out.println("Displayed all the client reviews added in the month of 15-30 June");		
	}
	
	public void displayDateJuly() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterJuly1));
		dateMasterJuly1.click();
				
		System.out.println("Displayed all the client reviews added in the month of 1-15 July");		
	}
	
	public void displayDateJuly1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterJuly2));
		dateMasterJuly2.click();
		
		System.out.println("Displayed all the client reviews added in the month of 15-31 July");		
	}
	
	public void displayDateAugust() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterAugust1));
		dateMasterAugust1.click();
				
		System.out.println("Displayed all the client reviews added in the month of 1-15 August");	
		
	}
	
	public void displayDateAugust1() throws InterruptedException
	{	
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterAugust2));
		dateMasterAugust2.click();
		
		System.out.println("Displayed all the client reviews added in the month of 15-31 August");		
	}
	
	public void displayDateSeptember() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterSeptember1));
		dateMasterSeptember1.click();
				
		System.out.println("Displayed all the client reviews added in the month of 1-15 September");			
	}
	
	public void displayDateSeptember1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterSeptember2));
		dateMasterSeptember2.click();
		
		System.out.println("Displayed all the client reviews added in the month of 15-30 September");		
	}
	
	public void displayDateOctober() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterOctober1));
		dateMasterOctober1.click();
				
		System.out.println("Displayed all the client reviews added in the month of 1-15 October");		
	}
	
	public void displayDateOctober1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterOctober2));
		dateMasterOctober2.click();
		
		System.out.println("Displayed all the client reviews added in the month of 15-31 October");		
	}
	
	public void displayDateNovember() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterNovember1));
		dateMasterNovember1.click();
				
		System.out.println("Displayed all the client reviews added in the month of 1-15 November");		
	}
	
	public void displayDateNovember1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterNovember2));
		dateMasterNovember2.click();
		
		System.out.println("Displayed all the client reviews added in the month of 15-30 November");		
	}
	
	public void displayDateDecember() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
				
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", status);
	
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterDecember1));
		dateMasterDecember1.click();
				
		System.out.println("Displayed all the client reviews added in the month of 1-15 December");		
	}
	
	public void displayDateDecember1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dateMasterDropDown));
		
		dateMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(dateMasterDecember2));
		dateMasterDecember2.click();
		
		System.out.println("Displayed all the client reviews added in the month of 15-31 December");		
	}
	
	public void displayYearAll()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(yearMasterDropDown));
		
		yearMasterDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(yearMasterAll));
		yearMasterAll.click();
		//staleElementClick(5, yearMasterAll, 60);
				
		System.out.println("Displayed all the years");
	}
}
