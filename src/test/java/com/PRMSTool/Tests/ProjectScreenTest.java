package com.PRMSTool.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PRMSTool.Pages.ClientScreenPage;
import com.PRMSTool.Pages.LoginPage;
import com.PRMSTool.Pages.ProjectScreenPage;
import com.PRMSTool.base.TestBase;
import com.PRMSTool.util.UtilityClass;

public class ProjectScreenTest extends TestBase{
	
	@Test(priority = 0, enabled=true)
	public void verifyLogin()throws InterruptedException {
		LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
		lp.login(prop.getProperty("email1"),prop.getProperty("password1"));
	}
	
	@Test(priority = 1, enabled=true)
	public void verifyclickOnProject()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.clickOnProject();
	}	
	
	@Test(priority = 2, enabled=true)
	public void verifyclickOnAddNew()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.clickOnAddNew();
	}
	
	@Test(priority = 3, enabled=true)
	public void verifyaddProjectDetails()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.addProjectDetails();
	}
	
	@Test(priority = 4, enabled=true)
	public void verifyselectStartDate()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.selectStartDate();
	}
	
	@Test(priority = 5, enabled=false)
	public void verifyselectEndDate()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.selectEndDate();
	}
	
	@Test(priority = 6, enabled=false)
	public void verifyselectActualStartDate()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.selectActualStartDate();
	}

	@Test(priority = 7, enabled=false)
	public void verifyselectActualEndDate()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.selectActualEndDate();
	}
	
	@Test(priority = 8, enabled=false)
	public void verifyaddProjectDetails1()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.addProjectDetails1();
	}
	
	@Test(priority = 9, enabled=false)
	public void verifyaddBillingDetails()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.addBillingDetails();
	}
	
	@Test(priority = 10, enabled=false)
	public void verifyclickOnAdd()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnAdd();
	}
		
	@Test(priority = 11, enabled=false)
	public void verifysearch()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.searchProject("test1");
	}
	
	@Test(priority = 12, enabled=false)
	public void verifyclickOnEditButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnEditButton();
	}
	
	@Test(priority = 13, enabled=false)
	public void verifyeditProjectInformation()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.editProjectInformation();
	}
	
	@Test(priority = 14, enabled=false)
	public void verifyclickOnUpdateButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnUpdateButton();
	}
	
	@Test(priority = 15, enabled=false)
	public void verifydelete()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.deleteProject("test");
	}
	
	@Test(priority = 16, enabled=false)
	public void verifydownloadFile()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.downloadFile();
	}
	
	@Test(priority = 17, enabled=false)
	public void verifydisplayAllStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayAllStatusList();
	}
	
	@Test(priority = 18, enabled=false)
	public void verifydisplayInactiveStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayInactiveStatusList();
	}
	
	@Test(priority = 19, enabled=false)
	public void verifydisplayActiveStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayActiveStatusList();
	}
}
