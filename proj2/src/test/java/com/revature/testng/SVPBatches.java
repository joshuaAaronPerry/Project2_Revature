package com.revature.testng;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SVPBatches {
	static WebDriver wd = null;
	private static void logout() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wd.findElement(By.id("logoutBTN")).click();
		wd.quit();
	}
private static void loginSVP() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		wd.findElement(By.name("email")).sendKeys("svp@revature.com");
		wd.findElement(By.name("password")).sendKeys("p@$$w0rd");
		wd.findElement(By.name("submit")).click();

	}
private static void createBatch() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	wd.findElement(By.id("mat-select-3")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	wd.findElement(By.xpath("//*[@id=\'mat-option-1\']")).click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e2) {
		e2.printStackTrace();
	}
	wd.findElement(By.id("mat-input-3")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	wd.findElement(By.className("mat-datepicker-toggle/button")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	wd.findElement(By.xpath("//*[@id=\'cdk-accordion-child-2\']/div/form/div[5]/button[1]")).click();

}

private static void editBatch() {
	wd.findElement(By.xpath("//*[@id=\'cdk-accordion-child-3\']/div/form/div[2]/mat-form-field[1]/div/div[1]/div[1]/mat-datepicker-toggle/button")).click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	wd.findElement(By.xpath("//*[@id='mat-datepicker-2']/div[2]/mat-month-view/table/tbody/tr[4]/td[3]/div")).click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	wd.findElement(By.xpath("//*[@id=\'cdk-accordion-child-3\']/div/form/div[2]/mat-form-field[2]/div/div[1]/div[2]/mat-datepicker-toggle/button")).click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	wd.findElement(By.xpath("//*[@id=\'mat-datepicker-3\']/div[2]/mat-month-view/table/tbody/tr[4]/td[4]/div")).click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	wd.findElement(By.xpath("//*[@id=\'cdk-accordion-child-3\']/div/form/div[5]/button[1]")).click();
}

private static void deleteTopBatch() {
	wd.findElement(By.xpath("//*[@id=\'cdk-accordion-child-0\']/div/div/mat-table/mat-row[1]/mat-cell[10]/button[2]")).click();
}

private static void launchApplication() {
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		wd = new ChromeDriver();
		wd.get("https://assignforce-client.cfapps.io");		
	}
	@Test (priority=0)
	public void testAppLaunch() {
		launchApplication();
	}
	
	@Test (dependsOnMethods="testAppLaunch",priority=1)
	public void testLoginSVP(){
		loginSVP();
	}
	
	@Test (dependsOnMethods="testLoginSVP",priority=2)
	public void selectBatchesTab() {
	boolean expand = true;
	while (expand) {
		try {
			Thread.sleep(500);
			wd.findElement(By.id("mat-tab-label-0-1")).click();
			expand = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
	
	@Test (dependsOnMethods="selectBatchesTab",priority=3)
	public void testCreateBatch() {
		createBatch();
	}
	
	@Test (priority=4)
	public void testEditBatch() {
		editBatch();
	}
	
	@Test (priority=5)
	public void testDeleteTopBatch() {
		deleteTopBatch();
	}
	
	
	@Test (priority=6)
	public void testLogout() {
		logout();
	}
	
}
