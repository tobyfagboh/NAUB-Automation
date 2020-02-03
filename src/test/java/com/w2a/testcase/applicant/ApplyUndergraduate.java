package com.w2a.testcase.applicant;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class ApplyUndergraduate extends TestBase{

	@Test
	public void applyUndergraduate () throws InterruptedException {
		
		click("applyBtn_XPATH");
		driver.findElement(By.xpath(OR.getProperty("undergraduate_XPATH"))).click ();
		driver.findElement(By.xpath(OR.getProperty("surname_XPATH"))).sendKeys(OR.getProperty("surname_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("firstname_XPATH"))).sendKeys(OR.getProperty("firstname_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("middlename_XPATH"))).sendKeys(OR.getProperty("middlename_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("phone_XPATH"))).sendKeys(OR.getProperty("phone_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("email_XPATH"))).sendKeys(OR.getProperty("email_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("jambno_XPATH"))).sendKeys(OR.getProperty("jambno_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("country_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("countrySlct_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("password_XPATH"))).sendKeys(OR.getProperty("password_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("createAcct_XPATH"))).click();
		Thread.sleep(5000);
	} 
}
