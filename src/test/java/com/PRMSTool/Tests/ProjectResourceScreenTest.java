package com.PRMSTool.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PRMSTool.Pages.ClientScreenPage;
import com.PRMSTool.Pages.LoginPage;
import com.PRMSTool.Pages.ProjectResourceScreenPage;
import com.PRMSTool.base.TestBase;

public class ProjectResourceScreenTest extends TestBase{
	
	public ProjectResourceScreenTest()
	{
		super();
	}
	
	@Test(priority = 0, enabled=true)
	public void verifyLogin()throws InterruptedException {
		LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
		lp.login(prop.getProperty("email1"),prop.getProperty("password1"));
	}
	
	@Test(priority = 1, enabled=true)
	public void verifyclickOnProjectResource()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.clickOnProjectResource();
	}
	
	@Test(priority = 2, enabled=true)
	public void verifyclickOnAddNew()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.clickOnAddNew();
	}
		
	@Test(priority = 3, enabled=true)
	public void verifyselectPercentageAllocation()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.selectPercentageAllocation();
	}
	
	@Test(priority = 4, enabled=true)
	public void verifyaddProjectResourceDetails()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.addProjectResourceDetails();
	}	
	
	@Test(priority = 5, enabled=true)
	public void verifyselectStartDate()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.selectStartDate();
	}
	
	@Test(priority = 6, enabled=true)
	public void verifyselectEndDate()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.selectEndDate();
	}
	
	@Test(priority = 7, enabled=true)
	public void verifyclickOnAdd()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnAdd();
	}
	
	@Test(priority = 8, enabled=true)
	public void verifydownloadFile()throws InterruptedException {
		ProjectResourceScreenPage prs = PageFactory.initElements(driver, ProjectResourceScreenPage.class);
		prs.downloadFile();
	}
}
