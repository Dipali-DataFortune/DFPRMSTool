package com.PRMSTool.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PRMSTool.Pages.ClientScreenPage;
import com.PRMSTool.Pages.LoginPage;
import com.PRMSTool.Pages.ProjectResourceScreenPage;
import com.PRMSTool.Pages.ProjectScreenPage;
import com.PRMSTool.Pages.ResourceScreenPage;
import com.PRMSTool.base.TestBase;
import com.PRMSTool.util.UtilityClass;

public class ResourceScreenTest extends TestBase{

	public ResourceScreenTest()
	{
		super();
	}
	
	@Test(priority = 0, enabled=true)
	public void verifyLogin()throws InterruptedException {
		LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
		lp.login(prop.getProperty("email1"),prop.getProperty("password1"));
	}
	
	@Test(priority = 1, enabled=true)
	public void verifyclickOnResource()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.clickOnResource();
	}
	
	@Test(priority = 2, enabled=true)
	public void verifyclickOnAddNew()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.clickOnAddNew();
	}
	
	@Test(priority = 3, enabled=true)
	public void verifyaddResourceDetails()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.addResourceDetails();
	}
	
	@Test(priority = 4, enabled=true)
	public void verifyselectBirthDate()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.selectBirthDate();
	}
	
	@Test(priority = 5, enabled=true)
	public void verifyselectJoiningDate()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.selectJoiningDate();
	}
	
	@Test(priority = 6, enabled=true)
	public void verifyclickOnAdd()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnAdd();
	}
		
	@Test(priority = 7, enabled=true)
	public void verifysearch()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.searchResource("TestEdit");
	}
	
	@Test(priority = 8, enabled=true)
	public void verifyclickOnEditButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnEditButton();
	}
	
	@Test(priority = 9, enabled=true)
	public void verifyeditResourceInformation()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.editResourceInformation();
	}
	
	@Test(priority = 10, enabled=true)
	public void verifyclickOnUpdateButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnUpdateButton();
	}
	
	@Test(priority = 11, enabled=true)
	public void verifydelete()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.deleteResource("TestDelete");
	}
	
	@Test(priority = 12, enabled=true)
	public void verifydownloadFile()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.downloadFile();
	}
	
	@Test(priority = 13, enabled=true)
	public void verifydisplayAllStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayAllStatusList();
	}
		
	@Test(priority = 14, enabled=true)
	public void verifydisplayInactiveStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayInactiveStatusList();
	}
	
	@Test(priority = 15, enabled=true)
	public void verifydisplayActiveStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayActiveStatusList();
	}		
}
