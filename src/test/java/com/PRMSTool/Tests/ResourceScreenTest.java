package com.PRMSTool.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PRMSTool.Pages.ClientScreenPage;
import com.PRMSTool.Pages.LoginPage;
import com.PRMSTool.Pages.ProjectResourceScreenPage;
import com.PRMSTool.Pages.ProjectScreenPage;
import com.PRMSTool.Pages.ResourceScreenPage;
import com.PRMSTool.base.TestBase;

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
	
	@Test(priority = 3, enabled=false)
	public void verifydownloadFile()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.downloadFile();
	}
	
	@Test(priority = 4, enabled=true)
	public void verifyaddResourceDetails()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.addResourceDetails();
	}
	
	@Test(priority = 5, enabled=true)
	public void verifyselectBirthDate()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.selectBirthDate();
	}
	
	@Test(priority = 6, enabled=true)
	public void verifyselectJoiningDate()throws InterruptedException {
		ResourceScreenPage rs = PageFactory.initElements(driver, ResourceScreenPage.class);
		rs.selectJoiningDate();
	}
	
	@Test(priority = 7, enabled=true)
	public void verifyclickOnAdd()throws InterruptedException {
		ClientScreenPage cp = PageFactory.initElements(driver, ClientScreenPage.class);
		cp.clickOnAdd();
	}
}
