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
	
	@Test(priority = 2, enabled=false)
	public void verifyclickOnAddNew()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.clickOnAddNew();
	}
	
	@Test(priority = 3, enabled=true)
	public void verifyclickOnCloudUpload()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.clickOnCloudUpload();
	}
	
	@Test(priority = 4, enabled=true)
	public void verifydownloadFile()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.downloadFile();
	}
	
	@Test(priority = 5, enabled=true)
	public void verifyclickOnFileUploadBack()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.clickOnFileUploadBack();
	}
	
	@Test(priority = 6, enabled=true)
	public void verifysearch()throws InterruptedException {
		SalesLeadScreenPage sl = PageFactory.initElements(driver, SalesLeadScreenPage.class);
		sl.searchSalesLead("Hall");
	}
	
	@Test(priority = 7, enabled=true)
	public void verifyclickOnEditButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnEditButton();
	}
}
