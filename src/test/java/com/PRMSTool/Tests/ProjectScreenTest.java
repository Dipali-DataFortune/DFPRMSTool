package com.PRMSTool.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PRMSTool.Pages.ClientScreenPage;
import com.PRMSTool.Pages.LoginPage;
import com.PRMSTool.Pages.ProjectScreenPage;
import com.PRMSTool.base.TestBase;

public class ProjectScreenTest extends TestBase{

	public ProjectScreenTest()
	{
		super();
	}
	
	@Test(priority = 0, enabled=true)
	public void verifyLogin()throws InterruptedException {
		LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
		lp.login(prop.getProperty("email1"),prop.getProperty("password1"));
	}
	
	@Test(priority = 1, enabled=true)
	public void verifyclickOnProject()throws InterruptedException {
		ProjectScreenPage cp = PageFactory.initElements(driver, ProjectScreenPage.class);
		cp.clickOnProject();
	}
	
	@Test(priority = 2, enabled=false)
	public void verifydownloadFile()throws InterruptedException {
		ProjectScreenPage cp = PageFactory.initElements(driver, ProjectScreenPage.class);
		cp.downloadFile();
	}
	
	@Test(priority = 3, enabled=true)
	public void verifyclickOnAddNew()throws InterruptedException {
		ProjectScreenPage cp = PageFactory.initElements(driver, ProjectScreenPage.class);
		cp.clickOnAddNew();
	}
	
	@Test(priority = 4, enabled=true)
	public void verifyaddProjectDetails()throws InterruptedException {
		ProjectScreenPage cp = PageFactory.initElements(driver, ProjectScreenPage.class);
		cp.addProjectDetails();
	}
	
	@Test(priority = 5, enabled=true)
	public void verifyselectStartDate()throws InterruptedException {
		ProjectScreenPage cp = PageFactory.initElements(driver, ProjectScreenPage.class);
		cp.selectStartDate();
	}
	
	@Test(priority = 6, enabled=true)
	public void verifyselectEndDate()throws InterruptedException {
		ProjectScreenPage cp = PageFactory.initElements(driver, ProjectScreenPage.class);
		cp.selectEndDate();
	}
	
	@Test(priority = 7, enabled=true)
	public void verifyselectActualStartDate()throws InterruptedException {
		ProjectScreenPage cp = PageFactory.initElements(driver, ProjectScreenPage.class);
		cp.selectActualStartDate();
	}

	@Test(priority = 8, enabled=true)
	public void verifyselectActualEndDate()throws InterruptedException {
		ProjectScreenPage cp = PageFactory.initElements(driver, ProjectScreenPage.class);
		cp.selectActualEndDate();
	}
	
	@Test(priority = 9, enabled=true)
	public void verifyaddProjectDetails1()throws InterruptedException {
		ProjectScreenPage cp = PageFactory.initElements(driver, ProjectScreenPage.class);
		cp.addProjectDetails1();
	}
	
	@Test(priority = 10, enabled=true)
	public void verifyaddBillingDetails()throws InterruptedException {
		ProjectScreenPage cp = PageFactory.initElements(driver, ProjectScreenPage.class);
		cp.addBillingDetails();
	}
	
	@Test(priority = 11, enabled=true)
	public void verifyclickOnAdd()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnAdd();
	}
}
