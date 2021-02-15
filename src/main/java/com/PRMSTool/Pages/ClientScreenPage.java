/**
 * 
 */
package com.PRMSTool.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.PRMSTool.base.TestBase;

/**
 * @author dipali.vaidya
 *
 */
public class ClientScreenPage extends TestBase {

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	//@FindBy(xpath="//div[@class='search']")
	@FindBy(xpath="//input[@placeholder='Search for a client']")
	WebElement searchBox;
	
	@FindBy(xpath="//mat-cell[@role='gridcell']")
	List<WebElement> searchBoxValues;
	
	@FindBy(xpath="//div[contains(text(),' Edit Client ')]")
	WebElement editClient;
		
	@FindBy(xpath="//button[@class='add-client-button fuse-white mt-24 mt-md-0 mat-raised-button']")
	WebElement addNew;

	@FindBy(id = "mat-input-2")
	WebElement clientName;

	@FindBy(id = "mat-input-3")
	WebElement companyUrl;

	@FindBy(id = "mat-input-4")
	WebElement clientCode;

	@FindBy(id = "mat-input-5")
	WebElement refClientCode;

	@FindBy(id = "mat-input-6")
	WebElement description;

	@FindBy(id = "mat-input-7")
	WebElement address;

	@FindBy(id = "mat-select-2")
	WebElement countryDropdown;

	@FindBy(xpath = "//mat-option/span[contains(text(),'India')]")
	WebElement india;

	@FindBy(id = "mat-select-3")
	WebElement stateDropdown;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Maharashtra')]")
	WebElement maharashtra;

	@FindBy(id = "mat-select-4")
	WebElement cityDropdown;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Pune')]")
	WebElement pune;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Mumbai')]")
	WebElement mumbai;

	@FindBy(id = "mat-input-8")
	WebElement zip;

	@FindBy(id = "mat-input-9")
	WebElement contactNumber;

	@FindBy(id = "mat-input-10")
	WebElement emailId;

	@FindBy(id = "mat-input-11")
	WebElement approxRevenue;

	@FindBy(id = "mat-input-12")
	WebElement approxPeople;

	@FindBy(id = "mat-select-5")
	WebElement domainDropdown;

	@FindBy(id = "mat-select-6")
	WebElement companyTypeDropdown;

	@FindBy(id = "mat-select-7")
	WebElement statusDropdown;

	@FindBy(id = "mat-select-8")
	WebElement bUnitDropdown;

	@FindBy(id = "mat-select-9")
	WebElement practiceDropdown;

	@FindBy(id = "mat-select-10")
	WebElement pTechDropdown;

	@FindBy(id = "mat-select-11")
	WebElement dManagerDropdown;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Amey Kulkarni')]")
	WebElement mgr1;

	@FindBy(id = "mat-input-13")
	WebElement companyFounded;

	@FindBy(id = "mat-input-14")
	WebElement yearsInBusiness;

	@FindBy(id = "mat-input-15")
	WebElement remarks;

	// @FindBy(xpath="//div[contains(text(),'Client Information')]")
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[1]")
	WebElement clientInfo;

	// @FindBy(xpath="//div[contains(text(),'Agreement Details')]")
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
	WebElement agreementDetails;

	// @FindBy(xpath="//div[contains(text(),'Stakeholder')]")
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[3]")
	WebElement stakeholder;

	@FindBy(id = "mat-input-23")
	WebElement agreementDate;

	@FindBy(xpath = "(//button[@class='mat-icon-button'])[1]")
	WebElement allDatesButton;

	@FindBy(xpath = "//table[@class='mat-calendar-table']//td")
	List<WebElement> allDates;
	
	@FindBy(xpath = "(//button[@class='mat-icon-button'])[2]")
	WebElement appSDateButton;

	@FindBy(xpath = "//span[contains(text(),'ADD')]")
	WebElement addButton;

	@FindBy(xpath = "//mat-header-cell[contains(text(),'Sr.No')]")
	WebElement srNo;

	@FindBy(xpath = "(//div[@class='mat-sort-header-container'])[1]")
	WebElement clientNameHeader;

	@FindBy(xpath = "(//div[@class='mat-sort-header-container'])[2]")
	WebElement BUnitHeader;

	@FindBy(xpath = "(//div[@class='mat-sort-header-container'])[3]")
	WebElement ASignedDateHeader;

	@FindBy(xpath = "(//div[@class='mat-sort-header-container'])[4]")
	WebElement statusHeader;

	@FindBy(xpath = "//mat-header-cell[contains(text(),'Sr.No')]")
	WebElement actionsHeader;
	
	@FindBy(xpath = "//mat-cell[contains(text(),' 1 ')]")
	WebElement srNoDataRow;
	
	@FindBy(xpath = "(//p[contains(text(),'Appointlink Portal Solutions')])[1]")
	WebElement clientNameDataRow;
	
	@FindBy(xpath = "//p[contains(text(),'vResourcing')]")
	WebElement BUnitDataRow;
	
	@FindBy(xpath = "//p[contains(text(),'Dec 6, 2019')]")
	WebElement ASignedDateDataRow;
	
	@FindBy(xpath = "//p[contains(text(),' Active')]")
	WebElement statusDataRow;
	
	//@FindBy(xpath = "//button[@class='iconbutton mat-icon-button ng-tns-c34-17 mat-primary ng-star-inserted']")
	@FindBy(xpath = "//mat-icon[contains(text(),'edit')]")
	WebElement editButton;
	
	@FindBy(xpath = "//button[@class='iconbutton mat-icon-button ng-tns-c34-17 mat-warn ng-star-inserted']")
	WebElement deleteButton;
	
	@FindBy(xpath = "//div[@class='content-card']")
	WebElement table;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Finance ')]")
	WebElement domainFinance;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Product ')]")
	WebElement cTypeProduct;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Active ')]")
	WebElement statusActive;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' vResourcing ')]")
	WebElement BUnitvRes;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Java ')]")
	WebElement bestPracJava;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Automation Testing ')]")
	WebElement primTechAutomation;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Dipali Vaidya (DS1167) ')]")
	WebElement delMgr;
	
	@FindBy(id = "mat-input-18")
	WebElement agreementByClient;
	
	@FindBy(id = "mat-input-19")
	WebElement agreementByDF;
	
	@FindBy(id = "mat-input-20")
	WebElement agreementDuration;
	
	@FindBy(id = "mat-input-21")
	WebElement agreementValue;
			
	@FindBy(id = "mat-select-12")
	WebElement salesPerson;
	
	@FindBy(id = "mat-select-13")
	WebElement currency;
	
	@FindBy(id = "mat-select-14")
	WebElement BDE;
	
	@FindBy(id = "mat-select-15")
	WebElement paymentMethod;
	
	@FindBy(id = "mat-select-16")
	WebElement paymentCycle;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' INR ')]")
	WebElement currencyINR;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Bank Fund Transfer ')]")
	WebElement pMethod;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Monthly ')]")
	WebElement pCycle;
	
	@FindBy(id = "mat-input-22")
	WebElement stakeholderName;
	
	@FindBy(id = "mat-input-23")
	WebElement stakeholderDesig;
	
	@FindBy(id = "mat-input-24")
	WebElement stakeholderNumber;
	
	@FindBy(id = "mat-input-25")
	WebElement stakeholderEmail;
	
	@FindBy(id = "mat-input-26")
	WebElement stakeholderAddress;
	
	//@FindBy(xpath = "(//button[@class='save-client-button mat-raised-button ng-tns-c42-59 ng-star-inserted'])[2]")
	@FindBy(xpath = "(//div[@class='mat-button-ripple mat-ripple'])[3]")
	WebElement stakeholderAdd;
	
	@FindBy(xpath = "//button[@class='save-client-button mat-raised-button']")
	WebElement stakeholderDiscard;
	
	@FindBy(xpath = "//input[@alt='Export']")
	WebElement downloadFile;
	
	
	public ClientScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchClient() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		highLightElement(driver, searchBox);
		//searchBox.click();
		//staleElementClick(5, searchBox, 60);
		searchBox.sendKeys("Appointlink Portal");
		
	//	List<WebElement> lookupList = webDriver.findElements(By.cssSelector(".lookup__list li a"));

		for (WebElement item : searchBoxValues) {

		if (item.getText().equals("Appointlink")) {

		//item.click();
		editButton.click();	
		Thread.sleep(3000);
		
		}
		Thread.sleep(5000);
	}
		softAssert.assertEquals(editClient.isDisplayed(), true);
		
		Thread.sleep(3000);
		/*
		 * wait.until(ExpectedConditions.visibilityOf(table)); Thread.sleep(5000);
		 * 
		 * softAssert.assertEquals(srNo.isDisplayed(), true);
		 * softAssert.assertEquals(clientNameHeader.isDisplayed(), true);
		 * softAssert.assertEquals(BUnitHeader.isDisplayed(), true);
		 * softAssert.assertEquals(ASignedDateHeader.isDisplayed(), true);
		 * softAssert.assertEquals(statusHeader.isDisplayed(), true);
		 * softAssert.assertEquals(actionsHeader.isDisplayed(), true);
		 * 
		 * System.out.println("Client Info verified");
		 * softAssert.assertEquals(srNoDataRow.isDisplayed(), true);
		 * softAssert.assertEquals(clientNameDataRow.isDisplayed(), true);
		 * softAssert.assertEquals(BUnitDataRow.isDisplayed(), true);
		 * softAssert.assertEquals(ASignedDateDataRow.isDisplayed(), true);
		 * softAssert.assertEquals(statusDataRow.isDisplayed(), true);
		 * softAssert.assertEquals(editButton.isDisplayed(), true);
		 * softAssert.assertEquals(deleteButton.isDisplayed(), true);
		 * 
		 * searchBox.clear();
		 */
	}

	public void clickOnAddNew() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addNew));
		highLightElement(driver, addNew);
		Thread.sleep(5000);
		addNew.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", addNew);
	}

	public void addNewClientInformation() {
		softAssert.assertEquals(clientInfo.isDisplayed(), true);
		softAssert.assertEquals(agreementDetails.isDisplayed(), true);
		softAssert.assertEquals(stakeholder.isDisplayed(), true);

		clientName.sendKeys("test123");
		companyUrl.sendKeys("test");
		softAssert.assertEquals(clientCode.isDisplayed(), true);
		System.out.println(clientCode.getText());
		refClientCode.sendKeys("test");
		description.sendKeys("test");
		scrollToElement(address);
		address.sendKeys("test");
		
		scrollToElement(countryDropdown);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", countryDropdown);
		js.executeScript("arguments[0].click()", india);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(stateDropdown));
		// stateDropdown.click();
		js.executeScript("arguments[0].click()", stateDropdown);
		// maharashtra.click();
		js.executeScript("arguments[0].click()", maharashtra);

		// cityDropdown.click();
		scrollToElement(cityDropdown);
		js.executeScript("arguments[0].click()", cityDropdown);
		// pune.click();
		js.executeScript("arguments[0].click()", pune);
		
		zip.sendKeys("411028");
		
		contactNumber.sendKeys("9876543210");
		emailId.sendKeys("test123@gmail.com");
		approxRevenue.clear();
		approxRevenue.sendKeys("1234567");
		approxPeople.clear();
		approxPeople.sendKeys("5");
		
	//	domainDropdown.click();
		js.executeScript("arguments[0].click()", domainDropdown);
	//	domainFinance.click();
		js.executeScript("arguments[0].click()", domainFinance);
		
		//companyTypeDropdown.click();
		js.executeScript("arguments[0].click()", companyTypeDropdown);
		//cTypeProduct.click();
		js.executeScript("arguments[0].click()", cTypeProduct);
		
		//statusDropdown.click();
		js.executeScript("arguments[0].click()", statusDropdown);
		//statusActive.click();
		js.executeScript("arguments[0].click()", statusActive);
		
		companyFounded.sendKeys("2012");
		scrollToElement(yearsInBusiness);
		yearsInBusiness.clear();
		yearsInBusiness.sendKeys("8");
		
		//bUnitDropdown.click();
		js.executeScript("arguments[0].click()", bUnitDropdown);
		//BUnitvRes.click();
		js.executeScript("arguments[0].click()", BUnitvRes);
		
		//practiceDropdown.click();
		js.executeScript("arguments[0].click()", practiceDropdown);
		//bestPracJava.click();
		js.executeScript("arguments[0].click()", bestPracJava);
		
		//pTechDropdown.click();
		js.executeScript("arguments[0].click()", pTechDropdown);
		//primTechAutomation.click();
		js.executeScript("arguments[0].click()", primTechAutomation);
		
		scrollToElement(dManagerDropdown);
		js.executeScript("arguments[0].click()", dManagerDropdown);
		js.executeScript("arguments[0].click()", mgr1);
		// dManagerDropdown.click();
		
		remarks.sendKeys("test");
		
		System.out.println("Client information added successfully");
	}

	public void clickOnAgreementDetails() throws InterruptedException {
		scrollToElement(agreementDetails);
		agreementDetails.click();
		Thread.sleep(3000);
		// allDatesButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", allDatesButton);
		Thread.sleep(2000);
		// agreementDate.sendKeys("02/01/2021");
		
		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("16")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("Date selected");
		Thread.sleep(5000);
	}
	
	public void selectApproxStartDate() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(appSDateButton));
		appSDateButton.click();
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].click()", appSDateButton);
		Thread.sleep(2000);
			
		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("19")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("Start date selected");
		Thread.sleep(5000);
	}
	
	public void addAgreementDetails()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(agreementByClient));
		
		agreementByClient.sendKeys("test");
		agreementByDF.sendKeys("test");
		
		//add sales person and BDE:
		
		agreementDuration.sendKeys("12");
		wait.until(ExpectedConditions.visibilityOf(currency));
		currency.click();		
		currencyINR.click();
		agreementValue.clear();
		agreementValue.sendKeys("100000");
		
		scrollToElement(paymentMethod);
		wait.until(ExpectedConditions.visibilityOf(paymentMethod));
		paymentMethod.click();
		pMethod.click();
		paymentCycle.click();
		pCycle.click();
		
		System.out.println("Agreement details added successfully");
		
	}
	
	public void clickOnStakeholderDetails()
	{
		scrollToElement(stakeholder);
		stakeholder.click();
	}
	
	public void addStakeholderDetails() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(stakeholderName));
		
		stakeholderName.sendKeys("dipali");
		stakeholderDesig.sendKeys("test");
		stakeholderNumber.sendKeys("1234567890");
		stakeholderEmail.sendKeys("test@gmail.com");
		stakeholderAddress.sendKeys("test");
				
		//wait.until(ExpectedConditions.visibilityOf(stakeholderAdd));
		//stakeholderAdd.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", stakeholderAdd);
		Thread.sleep(5000);
	}
	
	public void downloadFile() throws InterruptedException
	{
		String downloadFilePath= "C:\\Users\\Dipali.vaidya\\Downloads";
		HashMap<String, Object> chromePref= new HashMap<String, Object>();
		chromePref.put("profile.default_content_settings.popups", 0);
		chromePref.put("download.default_directory", downloadFilePath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePref);
		
		downloadFile.click();
		Thread.sleep(5000);
		System.out.println("File downloaded successfully");
	}

	public void clickOnAdd() {
		// addButton.click();
		scrollToElement(addButton);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", addButton);		
	}
}
