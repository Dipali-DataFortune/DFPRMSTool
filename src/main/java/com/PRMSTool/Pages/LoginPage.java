/**
 * 
 */
package com.PRMSTool.Pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.PRMSTool.base.TestBase;

/**
 * @author dipali.vaidya
 *
 */
public class LoginPage extends TestBase {

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	//@FindBy(xpath="(//div[@class='mat-form-field-infix'])[1]")
	@FindBy(xpath="//input[@id='mat-input-0']")	
	WebElement email;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='submit-button mat-raised-button mat-accent']")
	WebElement loginButton;
	
	@FindBy(id="details-button")
	WebElement advancedButton;
	
	@FindBy(xpath="//a[contains(text(),'Proceed to 192.168.3.50 (unsafe)')]")
	WebElement proceedLink;
	
	@FindBy(xpath="//button[@class='microsoft m-12 p-0 mat-raised-button ng-tns-c32-14 ng-star-inserted']")
	WebElement signInWithMicrosoft;
	
	//@FindBy(xpath="//input[@class='form-control ltr_override input ext-input text-box ext-text-box']")
	@FindBy(xpath="//input[@name='loginfmt']")	
	WebElement emailID;
	
	@FindBy(xpath="//input[@name='passwd']")
	WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Sign in']")
	WebElement signIn;
	
	@FindBy(xpath="//input[@id='KmsiCheckboxField']")
	WebElement dontShowAgain;
		
	@FindBy(xpath="//input[@value='Yes']")
	WebElement YesButton;
	
	@FindBy(xpath="//input[@value='Next']")
	WebElement nextButton;
		
	@FindBy(xpath="//span[@class='username mr-12 ng-star-inserted']")
	WebElement userName;
	
	@FindBy(xpath="//button[@class='user-button mat-button'] //mat-icon[@role='img']")
	WebElement userID;
	
	@FindBy(xpath="(//button[@class='mat-menu-item'])[2]")
	WebElement LogOut;
		
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void login(String uname, String pwd) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(advancedButton));
				
		advancedButton.click();
		proceedLink.click();
		
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys(uname);
		password.sendKeys(pwd);
		
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginButton);
						
		System.out.println(driver.getTitle());
	}
	
	public void login()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(signInWithMicrosoft));
		
		signInWithMicrosoft.click();
	}
	
	public void login1() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(advancedButton));
				
		advancedButton.click();
		proceedLink.click();
				
		wait.until(ExpectedConditions.visibilityOf(signInWithMicrosoft));
		
		signInWithMicrosoft.click();
		
		Thread.sleep(5000);
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindowId=it.next();
		String childWindowId=it.next();
		
		driver.switchTo().window(childWindowId);
		
		wait.until(ExpectedConditions.visibilityOf(emailID));
		emailID.sendKeys("dipali.vaidya@datafortune.com");
		nextButton.click();
		passwordField.sendKeys("test");
		
		signIn.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(dontShowAgain));
		dontShowAgain.click();
		
		YesButton.click();
		
		driver.switchTo().window(parentWindowId);
		Thread.sleep(5000);
		
		/*
		 * System.out.println(driver.getCurrentUrl());
		 * wait.until(ExpectedConditions.visibilityOf(userName));
		 * System.out.println(userName.getText());
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(userID)); userID.click();
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(LogOut)); LogOut.click();
		 */	
		
	}
}
