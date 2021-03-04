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

	@FindBy(xpath = "//button[@class='add-client-button fuse-white mt-24 mt-md-0 mat-raised-button']")
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
	WebElement countryIndia;

	@FindBy(xpath = "//mat-option/span[contains(text(),'USA')]")
	WebElement CountryUSA;

	@FindBy(id = "mat-select-3")
	WebElement stateDropdown;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Maharashtra')]")
	WebElement stateMaharashtra;

	@FindBy(xpath = "//mat-option/span[contains(text(),'California')]")
	WebElement stateCalifornia;

	@FindBy(id = "mat-select-4")
	WebElement cityDropdown;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Pune')]")
	WebElement cityPune;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Mumbai')]")
	WebElement cityMumbai;

	@FindBy(xpath = "//mat-option/span[contains(text(),' San Fransisco ')]")
	WebElement citySanFransisco;

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

	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[1]")
	WebElement clientInfo;

	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
	WebElement agreementDetails;

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
	WebElement paymentMethodDropdown;

	@FindBy(id = "mat-select-16")
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

	// mat-table[@class='clients-table mat-table ps']

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

	public void searchClient() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys("testUpdate");

		Thread.sleep(5000);

		softAssert.assertEquals(srNo.isDisplayed(), true);
		softAssert.assertEquals(clientNameHeader.isDisplayed(), true);
		softAssert.assertEquals(BUnitHeader.isDisplayed(), true);
		softAssert.assertEquals(ASignedDateHeader.isDisplayed(), true);
		softAssert.assertEquals(statusHeader.isDisplayed(), true);
		softAssert.assertEquals(actionsHeader.isDisplayed(), true);

		Thread.sleep(5000);
	}

	public void deleteClient() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		Thread.sleep(5000);
		searchBox.clear();
		searchBox.sendKeys("testDelete");

		deleteButton.click();
		Thread.sleep(3000);
		/*
		 * Alert objalert=driver.switchTo().alert();
		 * System.out.println(objalert.getText()); objalert.accept();
		 */
		yesButton.click();

		System.out.println("Client deleted successfully");
	}

	public void editClient() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(editButton));

		editButton.click();
	}

	public void editClientInformation() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(clientName));

		clientName.clear();
		clientName.sendKeys("Test Client");

		companyUrl.clear();
		companyUrl.sendKeys("https://www.test.com");

		refClientCode.clear();
		refClientCode.sendKeys("DF-4043");

		description.clear();
		description.sendKeys("Test");

		address.clear();
		address.sendKeys("Pune");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", countryDropdown);
		js.executeScript("arguments[0].click()", CountryUSA);

		wait.until(ExpectedConditions.visibilityOf(stateDropdown));

		js.executeScript("arguments[0].click()", stateDropdown);
		js.executeScript("arguments[0].click()", stateCalifornia);

		scrollToElement(cityDropdown);
		js.executeScript("arguments[0].click()", cityDropdown);
		js.executeScript("arguments[0].click()", citySanFransisco);

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

	public void editAgreementDetails() {
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

	public void editStakeholder() {
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
		clientName.sendKeys("test123");

		companyUrl.clear();
		companyUrl.sendKeys("test");

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
			if (date.equalsIgnoreCase("25")) {
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
			if (date.equalsIgnoreCase("26")) {
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
