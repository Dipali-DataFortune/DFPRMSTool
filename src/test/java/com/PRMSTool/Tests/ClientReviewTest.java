/**
 * 
 */
package com.PRMSTool.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PRMSTool.Pages.ClientReviewPage;
import com.PRMSTool.Pages.LoginPage;
import com.PRMSTool.Pages.ResourceScreenPage;
import com.PRMSTool.Pages.SalesLeadScreenPage;
import com.PRMSTool.base.TestBase;
import com.PRMSTool.util.UtilityClass;

/**
 * @author dipali.vaidya
 *
 */
public class ClientReviewTest extends TestBase{

	@Test(priority = 0, enabled=true)
	public void verifyLogin()throws InterruptedException {
		LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
		lp.login(prop.getProperty("email1"),prop.getProperty("password1"));
	}
		
	@Test(priority = 1, enabled=true)
	public void verifyclickOnSalesLead()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.clickOnClientReview();
	}
	
	@Test(priority = 2, enabled=true)
	public void verifyclickOnAddNew()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.clickOnAddNew();
	}
	
	@Test(priority = 3, enabled=true)
	public void verifyaddNewClientReview()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.addNewClientReview();
	}
	
	@Test(priority = 4, enabled=true)
	public void verifysearch()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.searchClientReview("testClientReview");
	}
	
	@Test(priority = 5, enabled=true)
	public void verifyclickOnEditButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnEditButton();		
	}
	
	@Test(priority = 6, enabled=true)
	public void verifyeditClientReview()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.editClientReview();
	}
	
	@Test(priority = 7, enabled=true)
	public void verifyclickOnUpdateButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnUpdateButton();		
	}
	
	@Test(priority = 8, enabled=true)
	public void verifydelete()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.deleteClientReview("testClientReview");
	}
	
	
	
	
	
	
}
