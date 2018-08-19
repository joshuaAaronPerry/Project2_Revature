package com.revature.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSVPSettingsPage {

	//public static WebDriver wd = null;
	
	@Test(dependsOnMethods = { "com.revature.tests.TestLogin.SVPlogin" })
	public void openSVPSettingsPage() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestSVPLogin.clickTab("mat-tab-label-0-5");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String newUrl = TestSVPLogin.wd.getCurrentUrl();
		Assert.assertEquals(newUrl, "https://assignforce-client.cfapps.io/profile/svp@revature.com");
	}
	
	@Test(dependsOnMethods = { "openSVPSettingsPage" })
	public void testProfileBtn() {
		WebElement btn = TestSVPLogin.wd.findElement(By.xpath("//*[@id=\"profileDiv\"]/mat-card/mat-toolbar-row/mat-toolbar/button"));
		String contentBefore = TestSVPLogin.wd.findElement(By.id("profilecontent")).getAttribute("innerhtml");
		btn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String contentAfter = TestSVPLogin.wd.findElement(By.id("profilecontent")).getAttribute("innerhtml");
		boolean change = contentBefore.equals(contentAfter);
		Assert.assertEquals(change, true);
	}
}
