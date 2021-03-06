package com.revature.testng;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllTest {

	static WebDriver d = null;

//	closeApp();
//	launchApp();
//	loginTrainer();
//	closeApp();

	public static void launchApp() {

		File chrome = new File("src/main/resources/chromedriver");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		ChromeOptions co = new ChromeOptions();
		co.addArguments("headless");
		d = new ChromeDriver(co);
		d.get("https://assignforce-client.cfapps.io/login");
	}

	public static void loginSVP() {

		boolean expand = true;
		int i = 0;
		
		while (expand && i < 10) {

			try {
				Thread.sleep(500);
				d.findElement(By.name("email")).sendKeys("svp@revature.com");
				d.findElement(By.name("password")).sendKeys("p@$$w0rd");
				d.findElement(By.name("submit")).click();
				System.out.println("Finally Log in!");
				expand = false;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;

			}
		}

	}

	public static void loginTrainer() {

		boolean expand = true;
		while (expand) {
			try {
				Thread.sleep(500);
				d.findElement(By.name("email")).sendKeys("test.trainer@revature.com");
				d.findElement(By.name("password")).sendKeys("p@$$w0rd");
				d.findElement(By.name("submit")).click();
				System.out.println("Finally Log in!");
				expand = false;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
			} catch (Exception e) {
				System.out.println("Naw");

			}
		}

	}

	public static void moveToLocationTab() {

		boolean expand = true;
		while (expand) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-tab-label-0-2")).click();
				System.out.println("Finally moved!");
				expand = false;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
			} catch (Exception e) {
				System.out.println("Naw");

			}
		}

	}

	public static void clickLocationBar() {

		boolean expand = true;
		while (expand) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-1")).click();
				System.out.println("Finally collapse");
				expand = false;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
			} catch (Exception e) {
				System.out.println("Naw");

			}
		}
		while (!expand) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-1")).click();
				System.out.println("Finally expand");
				expand = true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
			} catch (Exception e) {
				System.out.println("Naw");

			}
		}

	}

	public static void expandFirstLocation() {
		d.findElement(By.id("mat-expansion-panel-header-2")).click();
	}

	public static void collapseFirstLocation() {
		d.findElement(By.id("mat-expansion-panel-header-2")).click();
	}

	public static void addLocation() {

		try {
			Thread.sleep(500);
			d.findElement(By.className("cdk-overlay-container")).click();
//		d.findElement(By.id("cdk-overlay-23")).click();
//		d.findElement(By.id("mat-input-3")).sendKeys("FarAWAY");
			System.out.println("Finally Clicked Add Location");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void closeApp() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.quit();
	}

	public static void launchResults() {
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		d = new ChromeDriver();

		d.get("C:\\Users\\LiL'Birdman\\Documents\\Project\\Revature\\Project2\\proj2\\test-output\\Default suite\\Default test.html");

	}

	@Test
	public void testAppLaunch() {
		launchApp();
	}

	@Test(dependsOnMethods = "testAppLaunch")
	public void testLoginSVP() {
		loginSVP();
	}

	@Test(dependsOnMethods = "testLoginSVP")
	public void testMoveToLocationBar() {
		moveToLocationTab();
	}

	@Test(dependsOnMethods = "testMoveToLocationBar")
	public void testCloseApp() {
		closeApp();
	}

	@Test(dependsOnMethods = "testMoveToLocationBar")

	public void testCollapseLocation() {
		collapseFirstLocation();
	}

	@Test(dependsOnMethods = "testMoveToLocationBar")
	public void testExpandLocation() {
		expandFirstLocation();
	}

	@Test(dependsOnMethods = "testCloseApp")

	public void testLaunchResults() {
		launchResults();
	}

	@Test
	public void failTest() {

		Assert.assertEquals(false, true);
	}

	@Test
	public void failTest2() {

		Assert.assertEquals(false, true);
	}

}
