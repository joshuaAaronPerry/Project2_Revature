<<<<<<< HEAD:proj2/src/test/java/com/revature/testng/SVPTabTester.java
package com.revature.test;

import org.testng.annotations.Test;

public class SVPTabTester {
  @Test
  public void f() {
  }
}
=======
package com.revature.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SVPTrainers {

	@Test(dependsOnMethods = {"openSVPTrainers"})
	public void addTrainer() {
		WebElement btn = TestSVPLogin.wd.findElement(By.xpath("//*[@id=\"trainersDiv\"]/mat-toolbar-row[1]/mat-toolbar/button"));
		List<WebElement> trainers = TestSVPLogin.wd.findElements(By.className("ng-star-inserted"));
		btn.click();
		String exfirst = "josh";
		String exlast = "perry";
		String exemail = "josh@perry.com";
		int beforeTrainers = trainers.size();
		List<WebElement> inputs = TestSVPLogin.wd.findElements(By.className("mat-input-element"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		WebElement first = null;
		WebElement last = null;
		WebElement email = null;
		for(WebElement we : inputs) {
			if(we.getAttribute("formcontrolname") != null && we.getAttribute("formcontrolname").equals("firstName"))
				first = we;
			if(we.getAttribute("formcontrolname") != null && we.getAttribute("formcontrolname").equals("lastName"))
				last = we;
			if(we.getAttribute("formcontrolname") != null && we.getAttribute("formcontrolname").equals("email"))
				email = we;
		}
		first.click();
		first.sendKeys(exfirst);
		last.click();
		last.sendKeys(exlast);
		email.click();
		email.sendKeys(exemail);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> buttons =TestSVPLogin.wd.findElements(By.className("mat-button"));
		System.out.println(buttons);
		for(WebElement we : buttons) {
			we.click();
			break;
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		trainers = TestSVPLogin.wd.findElements(By.className("ng-star-inserted"));
		int afterTrainers = trainers.size();
		Assert.assertEquals(afterTrainers, beforeTrainers+5);
	}
	
	@Test(dependsOnMethods = { "com.revature.tests.TestSVPLogin.SVPlogin" })
	public void openSVPTrainers() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		TestSVPLogin.clickTab("mat-tab-label-0-4");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String newUrl = TestSVPLogin.wd.getCurrentUrl();
		Assert.assertEquals(newUrl, "https://assignforce-client.cfapps.io/trainers");
	}
}
>>>>>>> origin/josh:proj2/src/test/java/com/revature/test/SVPTrainers.java
