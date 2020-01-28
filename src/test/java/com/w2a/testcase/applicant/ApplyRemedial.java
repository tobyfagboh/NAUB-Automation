package com.w2a.testcase.applicant;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class ApplyRemedial extends TestBase{
	
	
	@Test
	public void applyRemedial () throws InterruptedException {
		click("HomeloginBtn_XPATH");
		Thread.sleep(2000);
	}

}
