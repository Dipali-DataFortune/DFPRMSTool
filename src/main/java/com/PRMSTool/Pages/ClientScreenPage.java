/**
 * 
 */
package com.PRMSTool.Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	@FindBy(xpath = "//button[@class='iconbutton mat-icon-button ng-tns-c34-17 mat-primary ng-star-inserted']")
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
	
	public ClientScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchClient() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		highLightElement(driver, searchBox);
		searchBox.sendKeys("Appointlink Portal Solutions");
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(table));
		Thread.sleep(5000);
		
		softAssert.assertEquals(srNo.isDisplayed(), true);
		softAssert.assertEquals(clientNameHeader.isDisplayed(), true);
		softAssert.assertEquals(BUnitHeader.isDisplayed(), true);
		softAssert.assertEquals(ASignedDateHeader.isDisplayed(), true);
		softAssert.assertEquals(statusHeader.isDisplayed(), true);
		softAssert.assertEquals(actionsHeader.isDisplayed(), true);

		System.out.println("Client Info verified");
		softAssert.assertEquals(srNoDataRow.isDisplayed(), true);
		softAssert.assertEquals(clientNameDataRow.isDisplayed(), true);
		softAssert.assertEquals(BUnitDataRow.isDisplayed(), true);
		softAssert.assertEquals(ASignedDateDataRow.isDisplayed(), true);
		softAssert.assertEquals(statusDataRow.isDisplayed(), true);
		softAssert.assertEquals(editButton.isDisplayed(), true);
		softAssert.assertEquals(deleteButton.isDisplayed(), true);		
		
		searchBox.clear();
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

		clientName.sendKeys("test3");
		companyUrl.sendKeys("test1234");
		softAssert.assertEquals(clientCode.isDisplayed(), true);
		System.out.println(clientCode.getText());
		refClientCode.sendKeys("test1234");
		description.sendKeys("test1234");
		address.sendKeys("test1234");
		
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
		approxRevenue.sendKeys("124567");
		approxPeople.clear();
		approxPeople.sendKeys("4");
		
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
		js.executeScript("arguments[0].click()", delMgr);
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
			if (date.equalsIgnoreCase("15")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("Date selected");
		Thread.sleep(5000);
	}
	
	public void selectApproxStartDate() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", appSDateButton);
		Thread.sleep(2000);
			
		int total_nodes = allDates.size();

		for (int i = 0; i < total_nodes; i++) {
			String date = allDates.get(i).getText();
			if (date.equalsIgnoreCase("10")) {
				allDates.get(i).click();
				break;
			}
		}
		
		System.out.println("Start date selected");
		Thread.sleep(5000);
	}

	public void clickOnAdd() {
		// addButton.click();
		scrollToElement(addButton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", addButton);		
	}
}
