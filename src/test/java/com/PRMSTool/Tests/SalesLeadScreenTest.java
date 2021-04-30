/**
 * 
 */
package com.PRMSTool.Tests;

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
	public void verifyclickOnBackButton()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.clickOnBackButton();
	}	
	
	@Test(priority = 12, enabled=true)
	public void verifyclickOnCloudUpload()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.clickOnCloudUpload();
	}
	
	@Test(priority = 13, enabled=true)
	public void verifydownloadFile()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.downloadFile();
		verifyclickOnBackButton();
	}
		
	@Test(priority = 14, enabled=true)
	public void verifysearch()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.searchSalesLead("Hall");
	}
	
	@Test(priority = 15, enabled=true)
	public void verifyclickOnEditButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnEditButton();
		verifyclickOnBackButton();
	}	
		
	@Test(priority = 16, enabled=false)
	public void verifydeleteSalesLead()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.deleteSalesLead("testDelete");
	}
}
