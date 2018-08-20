<<<<<<< HEAD
package com.revature.tests;
=======
package com.revature.test;
>>>>>>> d91f982c9e8c0dd4538a8e31894cb71c1031fcc6

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTrainerSettings {

<<<<<<< HEAD
	@Test(dependsOnMethods = { "com.revature.tests.TestTrainerLogin.trainerLogin" })
=======
	@Test(dependsOnMethods = { "com.revature.test.TestTrainerLogin.trainerLogin" })
>>>>>>> d91f982c9e8c0dd4538a8e31894cb71c1031fcc6
	public void openTrainSettingsPage() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		TestSVPLogin.clickTab("mat-tab-label-0-7");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String newUrl = TestSVPLogin.wd.getCurrentUrl();
		Assert.assertEquals(newUrl, "https://assignforce-client.cfapps.io/settings");
	}
	
	@Test(dependsOnMethods = { "openTrainSettingsPage" })
	public void resetTrainerSettings() {
		WebElement we = TestSVPLogin.wd.findElement(By.id("mat-input-0"));
		String val1 = we.getAttribute("value");
		we.clear();
		we.sendKeys("2");
		we = TestSVPLogin.wd.findElement(By.id("mat-input-1"));
		String val2 = we.getAttribute("value");
		we.clear();
		we.sendKeys("20");
		we = TestSVPLogin.wd.findElement(By.id("mat-input-2"));
		String val3 = we.getAttribute("value");
		we.clear();
		we.sendKeys("30");
		we = TestSVPLogin.wd.findElement(By.id("mat-input-3"));
		String val4 = we.getAttribute("value");
		we.clear();
		we.sendKeys("15");
		WebElement btn = TestSVPLogin.wd.findElement(By.xpath("/html/body/app-root/app-settings/form/mat-grid-list/div/mat-grid-tile[19]/figure/button"));
		btn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String newVal1 = TestSVPLogin.wd.findElement(By.id("mat-input-0")).getAttribute("value");
		String newVal2 = TestSVPLogin.wd.findElement(By.id("mat-input-1")).getAttribute("value");
		String newVal3 = TestSVPLogin.wd.findElement(By.id("mat-input-2")).getAttribute("value");
		String newVal4 = TestSVPLogin.wd.findElement(By.id("mat-input-3")).getAttribute("value");
		boolean resetWorked = val1.equals(newVal1) && val2.equals(newVal2) && 
				val3.equals(newVal3) && val4.equals(newVal4);
		Assert.assertEquals(resetWorked, true);
	}

}
