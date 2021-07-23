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
	public void verifyclickOnClientReview()throws InterruptedException {
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
	
	@Test(priority = 9, enabled=true)
	public void verifydisplayDateJanuary()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateJanuary();
	}
	
	@Test(priority = 10, enabled=true)
	public void verifydisplayDateJanuary1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateJanuary1();
	}

	@Test(priority = 11, enabled=true)
	public void verifydisplayDateFebruary()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateFebruary();
	}
	
	@Test(priority = 12, enabled=true)
	public void verifydisplayDateFebruary1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateFebruary1();
	}
	
	@Test(priority = 13, enabled=true)
	public void verifydisplayDateMarch()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateMarch();
	}
	
	@Test(priority = 14, enabled=true)
	public void verifydisplayDateMarch1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateMarch1();
	}
	
	@Test(priority = 15, enabled=true)
	public void verifydisplayDateApril()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateApril();
	}
	
	@Test(priority = 16, enabled=true)
	public void verifydisplayDateApril1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateApril1();
	}
	
	@Test(priority = 17, enabled=true)
	public void verifydisplayDateMay()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateMay();
	}
	
	@Test(priority = 18, enabled=true)
	public void verifydisplayDateMay1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateMay1();
	}
	
	@Test(priority = 19, enabled=true)
	public void verifydisplayDateJune()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateJune();
	}
	
	@Test(priority = 20, enabled=true)
	public void verifydisplayDateJune1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateJune1();
	}
	
	@Test(priority = 21, enabled=true)
	public void verifydisplayDateJuly()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateJuly();
	}
	
	@Test(priority = 22, enabled=true)
	public void verifydisplayDateJuly1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateJuly1();
	}
	
	@Test(priority = 23, enabled=true)
	public void verifydisplayDateAugust()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateAugust();
	}
	
	@Test(priority = 24, enabled=true)
	public void verifydisplayDateAugust1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateAugust1();
	}
	
	@Test(priority = 25, enabled=true)
	public void verifydisplayDateSeptember()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateSeptember();
	}
	
	@Test(priority = 26, enabled=true)
	public void verifydisplayDateSeptember1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateSeptember1();
	}
	
	@Test(priority = 27, enabled=true)
	public void verifydisplayDateOctober()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateOctober();
	}
	
	@Test(priority = 28, enabled=true)
	public void verifydisplayDateOctober1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateOctober1();
	}
	
	@Test(priority = 29, enabled=true)
	public void verifydisplayDateNovember()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateNovember();
	}
	
	@Test(priority = 30, enabled=true)
	public void verifydisplayDateNovember1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateNovember1();
	}
	
	@Test(priority = 31, enabled=true)
	public void verifydisplayDateDecember()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateDecember();
	}
	
	@Test(priority = 32, enabled=true)
	public void verifydisplayDateDecember1()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayDateDecember1();
	}
	
	@Test(priority = 33, enabled=true)
	public void verifydisplayYearAll()throws InterruptedException {
		ClientReviewPage cr = PageFactory.initElements(driver, ClientReviewPage.class);
		cr.displayYearAll();
	}	
}
