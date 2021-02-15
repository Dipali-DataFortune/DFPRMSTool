/**
 * 
 */
package com.PRMSTool.Pages;

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
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginButton);
		
		System.out.println(driver.getTitle());
	}
}
