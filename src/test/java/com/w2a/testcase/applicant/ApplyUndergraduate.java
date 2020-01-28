package com.w2a.testcase.applicant;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class ApplyUndergraduate extends TestBase{

	@Test
	public void applyUndergraduate () throws InterruptedException {
		
		click("applyBtn_XPATH");
		Thread.sleep(2000);
	}
}
