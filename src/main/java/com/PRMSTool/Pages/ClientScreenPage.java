/**
 * 
 */
package com.PRMSTool.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
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

	@FindBy(xpath = "//input[@placeholder='Search for a client']")
	WebElement searchBox;

	@FindBy(xpath = "//mat-cell[@role='gridcell']")
	List<WebElement> searchBoxValues;

	@FindBy(xpath = "//div[contains(text(),' Edit Client ')]")
	WebElement editClient;

	//@FindBy(xpath = "//button[@class='add-client-button fuse-white mt-24 mt-md-0 mat-raised-button']")
	@FindBy(xpath = "//button[@class='add-client-button fuse-white mt-md-0 mat-raised-button']")
	WebElement addNew;

	@FindBy(xpath = "//input[@placeholder='Client Name']")
	WebElement clientName;

	@FindBy(xpath = "//input[@placeholder='Company URL']")
	WebElement companyUrl;

	@FindBy(xpath = "//input[@placeholder='auto generated']")
	WebElement clientCode;

	@FindBy(xpath = "//input[@placeholder='Reference Client Code']")
	WebElement refClientCode;

	@FindBy(xpath = "//textarea[@placeholder='Description']")
	WebElement description;

	@FindBy(xpath = "//textarea[@placeholder='Address']")
	WebElement address;

	@FindBy(xpath = "//mat-select[@placeholder='Country']")
	WebElement countryDropdown;

	@FindBy(xpath = "//mat-option/span[contains(text(),'India')]")
	WebElement countryIndia;

	@FindBy(xpath = "//mat-option/span[contains(text(),' USA ')]")
	WebElement CountryUSA;


	@FindBy(xpath = "//mat-option/span[contains(text(),' China ')]")
	WebElement CountryChina;

	
	@FindBy(xpath = "//mat-select[@placeholder='State']")
	WebElement stateDropdown;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Maharashtra')]")
	WebElement stateMaharashtra;

	@FindBy(xpath = "//mat-option/span[contains(text(),' California ')]")
	WebElement stateCalifornia;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Hebei ')]")
	WebElement stateHebei;

	@FindBy(xpath = "//mat-select[@placeholder='City']")
	WebElement cityDropdown;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Pune')]")
	WebElement cityPune;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Mumbai')]")
	WebElement cityMumbai;
	
	@FindBy(xpath = "//mat-option/span[contains(text(),' Changping ')]")
	WebElement cityChangping;

	//@FindBy(xpath = "//mat-option/span[contains(text(),' San Francisco ')]")
	@FindBy(xpath = "(//mat-option/span[contains(text(),' San Francisco ')])[1]")
	WebElement citySanFransisco;

	@FindBy(xpath = "//input[@placeholder='Zip']")
	WebElement zip;

	@FindBy(xpath = "//input[@placeholder='Contact Number']")
	WebElement contactNumber;

	@FindBy(xpath = "//input[@placeholder='Email Id']")
	WebElement emailId;

	@FindBy(xpath = "//input[@placeholder='Approx Revenue']")
	WebElement approxRevenue;

	@FindBy(xpath = "//input[@placeholder='Approx No Of People']")
	WebElement approxPeople;

	@FindBy(xpath = "//mat-select[@name='DomainId']")
	WebElement domainDropdown;

	@FindBy(xpath = "//mat-select[@name='CompanyTypeId']")
	WebElement companyTypeDropdown;

	@FindBy(xpath = "//mat-select[@name='StatusId']")
	WebElement statusDropdown;

	@FindBy(xpath = "//mat-select[@name='BusinessUnitId']")
	WebElement bUnitDropdown;

	@FindBy(xpath = "//mat-select[@name='PracticeId']")
	WebElement practiceDropdown;

	@FindBy(xpath = "//mat-select[@name='PrimaryTechnologyId']")
	WebElement pTechDropdown;

	@FindBy(xpath = "//mat-select[@name='DeliveryManagerId']")
	WebElement dManagerDropdown;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Amey Kulkarni')]")
	WebElement mgr1;

	@FindBy(xpath = "//input[@name='CompanyFoundedIn']")
	WebElement companyFounded;

	@FindBy(xpath = "//input[@name='NoOfYearsInBusiness']")
	WebElement yearsInBusiness;

	@FindBy(xpath = "//input[@placeholder='Remarks']")
	WebElement remarks;

	@FindBy(xpath = "(//div[@role='tab'])[1]")
	WebElement clientInfo;

	@FindBy(xpath = "(//div[@role='tab'])[2]")
	WebElement agreementDetails;

	@FindBy(xpath = "(//div[@role='tab'])[3]")
	WebElement stakeholder;

	@FindBy(id = "mat-input-23")
	WebElement agreementDate;

	@FindBy(xpath = "(//button[@class='mat-icon-button'])[1]")
	WebElement allDatesButton;

	@FindBy(xpath = "//table[@class='mat-calendar-table']//td")
	List<WebElement> allDates;

	@FindBy(xpath = "(//button[@class='mat-icon-button'])[2]")
	WebElement appSDateButton;

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

	@FindBy(xpath = "//mat-icon[contains(text(),'edit')]")
	WebElement editButton;

	@FindBy(xpath = "//mat-icon[contains(text(),'delete')]")
	WebElement deleteButton;

	@FindBy(xpath = "//button[@class='mat-raised-button mat-primary']")
	WebElement yesButton;

	@FindBy(xpath = "//button[@class='mat-raised-button']")
	WebElement NoButton;

	@FindBy(xpath = "//div[@class='content-card']")
	WebElement table;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Finance ')]")
	WebElement domainFinance;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Healthcare ')]")
	WebElement domainHealthcare;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Product ')]")
	WebElement companyTypeProduct;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Services ')]")
	WebElement companyTypeServices;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Active ')]")
	WebElement statusActive;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Inactive ')]")
	WebElement statusInactive;

	@FindBy(xpath = "//mat-option/span[contains(text(),' vResourcing ')]")
	WebElement businessUnitVRes;

	@FindBy(xpath = "//mat-option/span[contains(text(),' ROW ')]")
	WebElement businessUnitRow;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Java ')]")
	WebElement practiceJava;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Microsoft ')]")
	WebElement practiceMicrosoft;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Automation Testing ')]")
	WebElement primTechAutomation;

	@FindBy(xpath = "//mat-option/span[contains(text(),' MSBI ')]")
	WebElement primTechMSBI;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Dipali Vaidya (DS1167) ')]")
	WebElement delManager1;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Amey Kulkarni (DS1020) ')]")
	WebElement delManager2;

	@FindBy(xpath = "//input[@placeholder='Agreement Signed By Client']")
	WebElement agreementByClient;

	@FindBy(xpath = "//input[@placeholder='Agreement Signed By DF']")
	WebElement agreementByDF;

	@FindBy(xpath = "//input[@placeholder='Agreement Duration']")
	WebElement agreementDuration;

	@FindBy(xpath = "//input[@placeholder='Agreement Value']")
	WebElement agreementValue;

	@FindBy(xpath = "//mat-select[@name='SalesPersonId']")
	WebElement salesPerson;

	@FindBy(xpath = "//mat-select[@name='CurrencyId']")
	WebElement currency;

	@FindBy(xpath = "//mat-select[@name='BDEId']")
	WebElement BDE;

	@FindBy(xpath = "//mat-select[@name='PaymentMethodId']")
	WebElement paymentMethodDropdown;

	@FindBy(xpath = "//mat-select[@name='PaymentCycleId']")
	WebElement paymentCycleDropdown;

	@FindBy(xpath = "//mat-option/span[contains(text(),' INR ')]")
	WebElement currencyINR;

	@FindBy(xpath = "//mat-option/span[contains(text(),' USD ')]")
	WebElement currencyUSD;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Bank Fund Transfer ')]")
	WebElement paymentMethod1;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Credit Card ')]")
	WebElement paymentMethod2;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Monthly ')]")
	WebElement paymentCycle1;

	@FindBy(xpath = "//mat-option/span[contains(text(),' Weekly ')]")
	WebElement paymentCycle2;

	@FindBy(xpath = "//input[@placeholder='Stakeholder Name']")
	WebElement stakeholderName;

	@FindBy(xpath = "//input[@placeholder='Designation']")
	WebElement stakeholderDesig;

	@FindBy(xpath = "//input[@placeholder='Contact Number']")
	WebElement stakeholderNumber;

	@FindBy(xpath = "//input[@placeholder='Email Id']")
	WebElement stakeholderEmail;

	@FindBy(xpath = "//input[@placeholder='Address']")
	WebElement stakeholderAddress;

	@FindBy(xpath = "(//div[@class='mat-button-ripple mat-ripple'])[3]")
	WebElement stakeholderAdd;

	@FindBy(xpath = "//button[@class='save-client-button mat-raised-button']")
	WebElement stakeholderDiscard;

	@FindBy(xpath = "//input[@alt='Export']")
	WebElement downloadFile;

	@FindBy(xpath = "(//div[@class='mat-sort-header-stem'])[1]")
	WebElement sortingArrowClient;

	@FindBy(xpath = "(//div[@class='mat-sort-header-stem'])[2]")
	WebElement sortingArrowBUnit;

	@FindBy(xpath = "(//mat-icon[contains(text(),'edit')])[1]")
	WebElement editClient1;

	@FindBy(xpath = "//mat-table[@class='clients-table mat-table ps']//mat-header-row")
	WebElement clientNameHRow;

	@FindBy(xpath = "//mat-table[@class='clients-table mat-table ps']//mat-row")
	WebElement clientNameRow;

	@FindBy(xpath = "//mat-table[@class='clients-table mat-table ps']")
	WebElement clientDetailsTable;

	@FindBy(xpath = "(//mat-form-field[@appearance='outline'])[1]")
	WebElement clientNameField;

	@FindBy(xpath = "//span[contains(text(),'Update')]")
	WebElement updateButton;

	
	public ClientScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchClientName() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		highLightElement(driver, searchBox);

		searchBox.sendKeys("Van Ran" + Keys.ENTER);

		Thread.sleep(5000);

		wait.until(ExpectedConditions.visibilityOf(clientNameHRow));

		boolean b = clientNameHRow.isDisplayed();

		Assert.assertTrue(b);
		System.out.println(clientNameHRow.getText());

		wait.until(ExpectedConditions.visibilityOf(clientNameRow));

		boolean b1 = clientNameRow.isDisplayed();

		Assert.assertTrue(b1);
		System.out.println(clientNameRow.getText());

		/*
		 * softAssert.assertEquals(srNo.isDisplayed(), true);
		 * softAssert.assertEquals(clientNameHeader.isDisplayed(), true);
		 * softAssert.assertEquals(BUnitHeader.isDisplayed(), true);
		 * softAssert.assertEquals(ASignedDateHeader.isDisplayed(), true);
		 * softAssert.assertEquals(statusHeader.isDisplayed(), true);
		 * softAssert.assertEquals(actionsHeader.isDisplayed(), true);
		 * 
		 * System.out.println("Client Info verified");
		 * 
		 * softAssert.assertEquals(srNoDataRow.isDisplayed(), true);
		 * softAssert.assertEquals(clientNameDataRow.isDisplayed(), true);
		 * softAssert.assertEquals(BUnitDataRow.isDisplayed(), true);
		 * softAssert.assertEquals(ASignedDateDataRow.isDisplayed(), true);
		 * softAssert.assertEquals(statusDataRow.isDisplayed(), true);
		 * softAssert.assertEquals(editButton.isDisplayed(), true);
		 * softAssert.assertEquals(deleteButton.isDisplayed(), true);
		 */
	}

	public void searchClient(String name) throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(searchBox));

			highLightElement(driver, searchBox);
			Thread.sleep(5000);
			searchBox.clear();
			searchBox.sendKeys(name);

			Thread.sleep(5000);
		}

	public void deleteClient() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys("testNewClient");

		Thread.sleep(3000);
		deleteButton.click();

		//wait.until(ExpectedConditions.visibilityOf(yesButton));
		//yesButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", yesButton);

		System.out.println("Client deleted successfully");
		
		searchBox.clear();
		Thread.sleep(5000);
	}

	public void editClient() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(editButton));

		editButton.click();
	}

	public void editClientInformation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(clientName));

		clientName.clear();
		clientName.sendKeys("testEdit");

		companyUrl.clear();
		companyUrl.sendKeys("https://www.testone.com");

		//refClientCode.clear();
		//refClientCode.sendKeys("DF-4043");

		description.clear();
		description.sendKeys("Test");

		address.clear();
		address.sendKeys("Test");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", countryDropdown);
		Thread.sleep(2000);
		//js.executeScript("arguments[0].click()", CountryUSA);
		//countryDropdown.click();
		CountryChina.click();
		
		wait.until(ExpectedConditions.visibilityOf(stateDropdown));

		js.executeScript("arguments[0].click()", stateDropdown);
		Thread.sleep(2000);
		//js.executeScript("arguments[0].click()", stateCalifornia);
		//stateDropdown.click();
		//stateCalifornia.click();
		//stateBeijing.click();
		js.executeScript("arguments[0].click()", stateHebei);
		

		scrollToElement(cityDropdown);
		//js.executeScript("arguments[0].click()", cityDropdown);
		//Thread.sleep(2000);
		//js.executeScript("arguments[0].click()", citySanFransisco);
		cityDropdown.click();
		//citySanFransisco.click();
		cityChangping.click();

		zip.clear();
		zip.sendKeys("411013");

		contactNumber.clear();
		contactNumber.sendKeys("9087654321");

		emailId.clear();
		emailId.sendKeys("testClient@gmail.com");

		approxRevenue.clear();
		approxRevenue.sendKeys("12345");

		approxPeople.clear();
		approxPeople.sendKeys("5");

		js.executeScript("arguments[0].click()", domainDropdown);
		js.executeScript("arguments[0].click()", domainFinance);

		js.executeScript("arguments[0].click()", companyTypeDropdown);
		js.executeScript("arguments[0].click()", companyTypeProduct);

		js.executeScript("arguments[0].click()", statusDropdown);
		js.executeScript("arguments[0].click()", statusActive);

		companyFounded.clear();
		companyFounded.sendKeys("2010");

		scrollToElement(yearsInBusiness);
		yearsInBusiness.clear();
		yearsInBusiness.sendKeys("11");

		js.executeScript("arguments[0].click()", bUnitDropdown);
		js.executeScript("arguments[0].click()", businessUnitRow);

		js.executeScript("arguments[0].click()", practiceDropdown);
		js.executeScript("arguments[0].click()", practiceMicrosoft);

		js.executeScript("arguments[0].click()", pTechDropdown);
		js.executeScript("arguments[0].click()", primTechMSBI);

		scrollToElement(dManagerDropdown);
		js.executeScript("arguments[0].click()", dManagerDropdown);
		js.executeScript("arguments[0].click()", delManager1);

		remarks.clear();
		remarks.sendKeys("Client information updated successfully");
	}

	public void editAgreementDetails() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(agreementByClient));

		agreementByClient.clear();
		agreementByClient.sendKeys("Test agreement");

		agreementByDF.clear();
		agreementByDF.sendKeys("Test DF agreement");

		// add sales person and BDE:

		agreementDuration.clear();
		agreementDuration.sendKeys("15");

		wait.until(ExpectedConditions.visibilityOf(currency));
		currency.click();
		currencyINR.click();

		agreementValue.clear();
		agreementValue.sendKeys("150000");

		scrollToElement(paymentMethodDropdown);
		wait.until(ExpectedConditions.visibilityOf(paymentMethodDropdown));
		paymentMethodDropdown.click();
		paymentMethod2.click();

		paymentCycleDropdown.click();
		paymentCycle2.click();

		System.out.println("Agreement details updated successfully");
	}

	public void editStakeholder() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(stakeholderName));

		stakeholderName.clear();
		stakeholderName.sendKeys("Test stakeholder");

		stakeholderDesig.clear();
		stakeholderDesig.sendKeys("Test");

		stakeholderNumber.clear();
		stakeholderNumber.sendKeys("9876543211");

		stakeholderEmail.clear();
		stakeholderEmail.sendKeys("testStakeholder@gmail.com");

		stakeholderAddress.clear();
		stakeholderAddress.sendKeys("Pune");

		// stakeholderAdd.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", stakeholderAdd);
	}

	public void clickOnUpdateClient() {
		scrollToElement(updateButton);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(updateButton));

		updateButton.click();
	}

	public void checkSorting() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(sortingArrowClient));

		highLightElement(driver, sortingArrowClient);
		sortingArrowClient.click();
		System.out.println("Sorting is done in ascending order");

		Thread.sleep(5000);

		sortingArrowClient.click();
		System.out.println("Sorting is done in descending order");

		wait.until(ExpectedConditions.visibilityOf(sortingArrowBUnit));

		highLightElement(driver, sortingArrowBUnit);
		sortingArrowBUnit.click();
		Thread.sleep(5000);
	}

	public void clickOnAddNew() throws InterruptedException {
		scrollToElement(addNew);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(addNew));
		highLightElement(driver, addNew);
		Thread.sleep(5000);
		addNew.click();
	}

	public void addNewClientInformation() {
		softAssert.assertEquals(clientInfo.isDisplayed(), true);
		softAssert.assertEquals(agreementDetails.isDisplayed(), true);
		softAssert.assertEquals(stakeholder.isDisplayed(), true);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(clientName));
		clientName.clear();
		clientName.sendKeys("testNewClient");

		companyUrl.clear();
		companyUrl.sendKeys("https://www.test.com");

		softAssert.assertEquals(clientCode.isDisplayed(), true);
		System.out.println(clientCode.getText());

		refClientCode.clear();
		refClientCode.sendKeys("test");

		description.clear();
		description.sendKeys("test");

		scrollToElement(address);
		address.clear();
		address.sendKeys("test");

		scrollToElement(countryDropdown);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", countryDropdown);
		js.executeScript("arguments[0].click()", countryIndia);

		wait.until(ExpectedConditions.visibilityOf(stateDropdown));

		js.executeScript("arguments[0].click()", stateDropdown);
		js.executeScript("arguments[0].click()", stateMaharashtra);

		scrollToElement(cityDropdown);
		js.executeScript("arguments[0].click()", cityDropdown);
		js.executeScript("arguments[0].click()", cityPune);

		zip.clear();
		zip.sendKeys("411028");

		contactNumber.clear();
		contactNumber.sendKeys("9876543210");

		emailId.clear();
		emailId.sendKeys("test123@gmail.com");

		approxRevenue.clear();
		approxRevenue.sendKeys("1234567");

		approxPeople.clear();
		approxPeople.sendKeys("5");

		js.executeScript("arguments[0].click()", domainDropdown);
		js.executeScript("arguments[0].click()", domainFinance);

		js.executeScript("arguments[0].click()", companyTypeDropdown);
		js.executeScript("arguments[0].click()", companyTypeProduct);

		js.executeScript("arguments[0].click()", statusDropdown);
		js.executeScript("arguments[0].click()", statusActive);

		companyFounded.clear();
		companyFounded.sendKeys("2012");

		scrollToElement(yearsInBusiness);
		yearsInBusiness.clear();
		yearsInBusiness.sendKeys("8");

		js.executeScript("arguments[0].click()", bUnitDropdown);
		js.executeScript("arguments[0].click()", businessUnitVRes);

		js.executeScript("arguments[0].click()", practiceDropdown);
		js.executeScript("arguments[0].click()", practiceJava);

		js.executeScript("arguments[0].click()", pTechDropdown);
		js.executeScript("arguments[0].click()", primTechAutomation);

		scrollToElement(dManagerDropdown);
		js.executeScript("arguments[0].click()", dManagerDropdown);
		js.executeScript("arguments[0].click()", delManager1);

		remarks.clear();
		remarks.sendKeys("test");

		System.out.println("Client information added successfully");
	}

	public void clickOnAgreementDetails() {
		scrollToElement(agreementDetails);
		agreementDetails.click();
	}

	public void selectAgreementSignedDate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(allDatesButton));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", allDatesButton);
		Thread.sleep(2000);
		// agreementDate.sendKeys("02/01/2021");

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("26")) {
				allDates.get(i).click();
				break;
			}
		}

		System.out.println("Date selected");
		Thread.sleep(5000);
	}

	public void selectApproxStartDate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(appSDateButton));
		appSDateButton.click();

		Thread.sleep(2000);

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("27")) {
				allDates.get(i).click();
				break;
			}
		}

		System.out.println("Start date selected");
		Thread.sleep(5000);
	}
	
	public void editAgreementSignedDate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(allDatesButton));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", allDatesButton);
		Thread.sleep(2000);
		// agreementDate.sendKeys("02/01/2021");

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("29")) {
				allDates.get(i).click();
				break;
			}
		}

		System.out.println("Date selected");
		Thread.sleep(5000);
	}

	public void editApproxStartDate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(appSDateButton));
		appSDateButton.click();

		Thread.sleep(2000);

		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("30")) {
				allDates.get(i).click();
				break;
			}
		}

		System.out.println("Start date selected");
		Thread.sleep(5000);
	}

	public void addAgreementDetails() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(agreementByClient));

		agreementByClient.clear();
		agreementByClient.sendKeys("test");

		agreementByDF.clear();
		agreementByDF.sendKeys("test");

		// add sales person and BDE:

		agreementDuration.clear();
		agreementDuration.sendKeys("12");

		wait.until(ExpectedConditions.visibilityOf(currency));
		currency.click();
		currencyINR.click();

		agreementValue.clear();
		agreementValue.sendKeys("100000");

		scrollToElement(paymentMethodDropdown);
		wait.until(ExpectedConditions.visibilityOf(paymentMethodDropdown));
		paymentMethodDropdown.click();
		paymentMethod1.click();

		paymentCycleDropdown.click();
		paymentCycle1.click();

		System.out.println("Agreement details added successfully");

	}

	public void clickOnStakeholderDetails() {
		scrollToElement(stakeholder);
		stakeholder.click();
	}

	public void addStakeholderDetails() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(stakeholderName));

		stakeholderName.clear();
		stakeholderName.sendKeys("dipali");

		stakeholderDesig.clear();
		stakeholderDesig.sendKeys("test");

		stakeholderNumber.clear();
		stakeholderNumber.sendKeys("1234567890");

		stakeholderEmail.clear();
		stakeholderEmail.sendKeys("test@gmail.com");

		stakeholderAddress.clear();
		stakeholderAddress.sendKeys("test");

		// stakeholderAdd.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", stakeholderAdd);
		Thread.sleep(5000);
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
		downloadFile.click();
		Thread.sleep(3000);

		System.out.println("Client file downloaded successfully");
	}	
}
