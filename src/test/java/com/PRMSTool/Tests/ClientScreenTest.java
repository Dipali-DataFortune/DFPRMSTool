/**
 * 
 */
package com.PRMSTool.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PRMSTool.Pages.ClientScreenPage;
import com.PRMSTool.Pages.LoginPage;
import com.PRMSTool.base.TestBase;

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
		lp.login(prop.getProperty("email1"),prop.getProperty("password1"));
	}
	
	@Test(priority = 1, enabled=true)
	public void verifysearchClient()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.searchClient();
	}
	
	@Test(priority = 2, enabled=false)
	public void verifydownloadFile()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.downloadFile();
	}
	
	@Test(priority = 3, enabled=false)
	public void verifyclickOnAddNew()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnAddNew();
	}
	
	@Test(priority = 4, enabled=false)
	public void verifyaddNewClientInformation()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.addNewClientInformation();
	}
	
	@Test(priority = 5, enabled=false)
	public void verifyclickOnAgreementDetails()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnAgreementDetails();
	}
		
	@Test(priority = 6, enabled=false)
	public void verifyselectApproxStartDate()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.selectApproxStartDate();
	}
	
	@Test(priority = 7, enabled=false)
	public void verifyaddAgreementDetails()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.addAgreementDetails();
	}
	
	@Test(priority = 8, enabled=false)
	public void verifyclickOnStakeholderDetails()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnStakeholderDetails();
	}
	
	@Test(priority = 9, enabled=false)
	public void verifyaddStakeholderDetails()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.addStakeholderDetails();
	}
	
	@Test(priority = 10, enabled=false)
	public void verifyclickOnAdd()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnAdd();
	}
}
