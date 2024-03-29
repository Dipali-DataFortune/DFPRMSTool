/**
 * 
 */
package com.PRMSTool.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PRMSTool.Pages.ClientScreenPage;
import com.PRMSTool.Pages.LoginPage;
import com.PRMSTool.base.TestBase;
import com.PRMSTool.util.UtilityClass;

/**
 * @author dipali.vaidya
 *
 */
public class ClientScreenTest extends TestBase{

	public ClientScreenTest()
	{
		super();
	}
	
	@Test(priority = 0, enabled=true)
	public void verifyLogin()throws InterruptedException {
		LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
		lp.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	
	/*
	 * @Test(priority = 0, enabled=true) public void Login()throws
	 * InterruptedException { LoginPage lp =
	 * PageFactory.initElements(driver,LoginPage.class); //lp.login1();
	 * lp.login(prop.getProperty("email1"),prop.getProperty("password1")); }
	 */
		
	@Test(priority = 1, enabled=true)
	public void verifyclickOnAddNew()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnAddNew();
	}
	
	@Test(priority = 2, enabled=true)
	public void verifyaddNewClientInformation()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.addNewClientInformation();
	}
	
	@Test(priority = 3, enabled=true)
	public void verifyclickOnAgreementDetails()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnAgreementDetails();
	}
	
	@Test(priority = 4, enabled=true)
	public void verifyselectAgreementSignedDate()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.selectAgreementSignedDate();
	}
		
	@Test(priority = 5, enabled=true)
	public void verifyselectApproxStartDate()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.selectApproxStartDate();
	}
	
	@Test(priority = 6, enabled=true)
	public void verifyaddAgreementDetails()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.addAgreementDetails();
	}
	
	@Test(priority = 7, enabled=true)
	public void verifyclickOnStakeholderDetails()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnStakeholderDetails();
	}
	
	@Test(priority = 8, enabled=true)
	public void verifyaddStakeholderDetails()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.addStakeholderDetails();
	}
	
	@Test(priority = 9, enabled=true)
	public void verifyclickOnAdd()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnAdd();
	}
	
	@Test(priority = 10, enabled=true)
	public void verifydisplayAllStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayAllStatusList();
	}
	
	@Test(priority = 11, enabled=true)
	public void verifysearchClient()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.searchClient("testNewClient");
	}
		
	@Test(priority = 12, enabled=true)
	public void verifyeditClient()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnEditButton();
	}
	
	@Test(priority = 13, enabled=true)
	public void verifyeditClientInformation()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.editClientInformation();
	}
	
	@Test(priority = 14, enabled=true)
	public void verifyeditAgreementDetails()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnAgreementDetails();
		cp.editAgreementDetails();
	}
	
	@Test(priority = 15, enabled=true)
	public void verifyeditAgreementSignedDate()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.editAgreementSignedDate();
	}
	
	@Test(priority = 16, enabled=true)
	public void verifyeditApproxStartDate()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.editApproxStartDate();
	}
	
	@Test(priority = 17, enabled=true)
	public void verifyeditStakeholder()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnStakeholderDetails();
		cp.editStakeholder();
	}
	
	@Test(priority = 18, enabled=true)
	public void verifyclickOnUpdateClient()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnUpdateButton();
	}
	
	@Test(priority = 19, enabled=true)
	public void verifydeleteClient()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		verifydisplayAllStatusList();
		cp.deleteClient();
	}
	
	@Test(priority = 20, enabled=true)
	public void verifydownloadFile()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.downloadFile();
	}	
	
	@Test(priority = 21, enabled=true)
	public void verifydisplayInactiveStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayInactiveStatusList();
	}
	
	@Test(priority = 22, enabled=true)
	public void verifydisplayActiveStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayActiveStatusList();
	}
	
	@Test(priority = 23, enabled=true)
	public void verifydisplayvResourcingBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayvResourcingBusinessUnit();
	}
	
	@Test(priority = 24, enabled=true)
	public void verifydisplayIPBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayIndianProjectsBusinessUnit();
	}
	
	@Test(priority = 25, enabled=true)
	public void verifydisplayLicenceBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayLicenceBusinessUnit();
	}
	
	@Test(priority = 26, enabled=true)
	public void verifydisplayPracticesBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayPracticesBusinessUnit();
	}
	
	@Test(priority = 27, enabled=true)
	public void verifydisplaySafeGuardBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displaySafeGuardBusinessUnit();
	}
	
	@Test(priority = 28, enabled=true)
	public void verifydisplayAllBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayAllBusinessUnit();
	}
}
