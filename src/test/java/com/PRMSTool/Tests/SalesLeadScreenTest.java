/**
 * 
 */
package com.PRMSTool.Tests;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PRMSTool.Pages.LoginPage;
import com.PRMSTool.Pages.SalesLeadScreenPage;
import com.PRMSTool.base.TestBase;
import com.PRMSTool.util.UtilityClass;

/**
 * @author dipali.vaidya
 *
 */
public class SalesLeadScreenTest extends TestBase{
	
	@Test(priority = 0, enabled=true)
	public void verifyLogin()throws InterruptedException {
		LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
		lp.login(prop.getProperty("email1"),prop.getProperty("password1"));
	}
	
	@Test(priority = 1, enabled=true)
	public void verifyclickOnSalesLead()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.clickOnSalesLead();
	}	
	
	@Test(priority = 2, enabled=true)
	public void verifyclickOnAddNew()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.clickOnAddNew();
	}
	
	@Test(priority = 3, enabled=true)
	public void verifyaddSalesLeadInformation()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.addSalesLeadInformation();
	}
	
	@Test(priority = 4, enabled=true)
	public void verifyselectLastUpdatedDate()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.selectLastUpdatedDate();
	}
	
	@Test(priority = 5, enabled=true)
	public void verifyclickOnCompanyDetails()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.clickOnCompanyDetails();
	}
	
	@Test(priority = 6, enabled=true)
	public void verifyaddCompanyDetails()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.addCompanyDetails();
	}
	
	@Test(priority = 7, enabled=true)
	public void verifyclickOnOtherDetails()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.clickOnOtherDetails();
	}
	
	@Test(priority = 8, enabled=true)
	public void verifyaddOtherDetails()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.addOtherDetails();
	}
	
	@Test(priority = 9, enabled=true)
	public void verifyselectFUPDate()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.selectFUPDate();
	}
	
	@Test(priority = 10, enabled=true)
	public void verifyclickOnAdd()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnAdd();
	}
		
	@Test(priority = 11, enabled=true)
	public void verifyclickOnCloudUpload()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.clickOnCloudUpload();
	}
	
	@Test(priority = 12, enabled=true)
	public void verifydownloadFile()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.downloadFile();		
	}
	
	@Test(priority = 13, enabled=true)
	public void verifyclickOnBackButton()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.clickOnBackButton();
	}	
		
	@Test(priority = 14, enabled=true)
	public void verifysearch()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.searchSalesLead("Dipali");
	}
	
	@Test(priority = 15, enabled=true)
	public void verifyclickOnEditButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnEditButton();		
	}
	
	@Test(priority = 16, enabled=true)
	public void verifyeditSalesLeadInformation()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.editSalesLeadInformation();		
	}
	
	@Test(priority = 17, enabled=true)
	public void verifyeditLastUpdatedDate()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.editLastUpdatedDate();		
	}
	
	@Test(priority = 18, enabled=true)
	public void verifyeditCompanyDetails()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		verifyclickOnCompanyDetails();
		sl.editCompanyDetails();		
	}
	
	@Test(priority = 19, enabled=true)
	public void verifyeditOtherDetails()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		verifyclickOnOtherDetails();
		sl.editOtherDetails();		
	}
	
	@Test(priority = 20, enabled=true)
	public void verifyeditFUPDate()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.editFUPDate();		
	}
	
	@Test(priority = 21, enabled=true)
	public void verifyclickOnUpdateButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnUpdateButton();		
	}
	
	@Test(priority = 22, enabled=true)
	public void verifydeleteSalesLead()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.deleteSalesLead("Dipali");
	}
	
	@Test(priority = 23, enabled=true)
	public void verifyuploadFile()throws InterruptedException, AWTException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.uploadFile();
	}
}
