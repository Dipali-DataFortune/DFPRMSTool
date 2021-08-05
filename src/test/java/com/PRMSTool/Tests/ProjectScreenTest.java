package com.PRMSTool.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

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
	
	@Test(priority = 5, enabled=true)
	public void verifyselectEndDate()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.selectEndDate();
	}
	
	@Test(priority = 6, enabled=true)
	public void verifyselectActualStartDate()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.selectActualStartDate();
	}

	@Test(priority = 7, enabled=true)
	public void verifyselectActualEndDate()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.selectActualEndDate();
	}
	
	@Test(priority = 8, enabled=true)
	public void verifyaddProjectDetails1()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.addProjectDetails1();
	}
	
	@Test(priority = 9, enabled=true)
	public void verifyaddBillingDetails()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.addBillingDetails();
	}
	
	@Test(priority = 10, enabled=true)
	public void verifyclickOnAdd()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnAdd();
	}
	
	@Test(priority = 11, enabled=true)
	public void verifydisplayAllStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayAllStatusList();
	}
		
	@Test(priority = 12, enabled=true)
	public void verifysearch()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.searchProject("test Project");
	}
	
	@Test(priority = 13, enabled=true)
	public void verifyclickOnEditButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnEditButton();
	}
		
	@Test(priority = 14, enabled=true)
	public void verifyeditProjectInformation()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.editProjectInformation();
	}
	
	@Test(priority = 15, enabled=true)
	public void verifyeditStartDate()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.editStartDate();
	}
	
	@Test(priority = 16, enabled=true)
	public void verifyeditEndDate()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.editEndDate();
	}
	
	@Test(priority = 17, enabled=true)
	public void verifyeditActualStartDate()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.editActualStartDate();
	}
	
	@Test(priority = 18, enabled=true)
	public void verifyeditActualEndDate()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		ps.editActualEndDate();
	}
	
	@Test(priority = 19, enabled=true)
	public void verifyclickOnUpdateButton()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.clickOnUpdateButton();
	}
	
	@Test(priority = 20, enabled=true)
	public void verifydelete()throws InterruptedException {
		ProjectScreenPage ps = PageFactory.initElements(driver, ProjectScreenPage.class);
		verifydisplayAllStatusList();
		ps.deleteProject("test Project");
	}
	
	@Test(priority = 21, enabled=true)
	public void verifydownloadFile()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.downloadFile();
	}
		
	@Test(priority = 22, enabled=true)
	public void verifydisplayInactiveStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayInactiveStatusList();
	}
	
	@Test(priority = 23, enabled=true)
	public void verifydisplayActiveStatusList()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayActiveStatusList();
	}
	
	@Test(priority = 24, enabled=true)
	public void verifydisplayvResourcingBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayvResourcingBusinessUnit();
	}
	
	@Test(priority = 25, enabled=true)
	public void verifydisplayROWBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayROWBusinessUnit();
	}
	
	@Test(priority = 26, enabled=true)
	public void verifydisplayLicenceBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayLicenceBusinessUnit();
	}
	
	@Test(priority = 27, enabled=true)
	public void verifydisplayPracticesBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayPracticesBusinessUnit();
	}
	
	@Test(priority = 28, enabled=true)
	public void verifydisplaySafeGuardBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displaySafeGuardBusinessUnit();
	}
	
	@Test(priority = 29, enabled=true)
	public void verifydisplayAllBusinessUnit()throws InterruptedException {
		UtilityClass util = PageFactory.initElements(driver, UtilityClass.class);
		util.displayAllBusinessUnit();
	}
}
