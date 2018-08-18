package com.revature.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrainerLocations {

	static WebDriver d = null;

	public static void launchApp() {

		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		d = new ChromeDriver();
		d.get("https://assignforce-client.cfapps.io/login");
	}

	public static void loginTrainer() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
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
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;

			}
		}

		if (!(i < 10)) {
			Assert.fail();
		}
	}

	public static void moveToLocationTab() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-tab-label-0-2")).click();
				System.out.println("Finally moved!");
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

		if (!(i < 10)) {
			Assert.fail();
		}

	}

	public static void clickLocationBar() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-1")).click();
				System.out.println("Finally collapse");
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

		if (!(i < 10)) {
			Assert.fail();
		}

		int j = 0;
		while (!expand && j < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-1")).click();
				System.out.println("Finally expand");
				expand = true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				j++;
			} catch (Exception e) {
				System.out.println("Naw");
				j++;

			}
		}

	}

	public static void expandFirstLocation() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-2")).click();
				System.out.println("Finally Expanded First Location!");
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

		if (!(i < 10)) {
			Assert.fail();
		}
	}

	public static void collapseFirstLocation() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-2")).click();
				System.out.println("Finally Collapse First location!");
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

		if (!(i < 10)) {
			Assert.fail();
		}

	}

	public static void expandFirstBuilding() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-10")).click();
				System.out.println("Finally Expand First Building!");
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

		if (!(i < 10)) {
			Assert.fail();
		}
	}

	public static void moveToCircula() {
		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-tab-label-0-3")).click();
				System.out.println("Finally moved!");
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

		if (!(i < 10)) {
			Assert.fail();
		}
	}

	public static void addFocus() {
		d.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-17\"]/span[1]/mat-panel-description/button"))
				.click();

//		if(!(i < 10)) {
//			Assert.fail();
//		}

//		d.findElement(By.id("mat-input-2")).sendKeys("Troubleshoot");
//		d.findElement(By.id("mat-select-2")).click();
//		d.findElement(By.id("mat-option-111")).click();
//		d.findElement(By.xpath("//*[@id=\"mat-dialog-2\"]/app-add-focus/div[2]/button[2]")).click();

	}

	public static void expandFocusBar() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-35")).click();
				System.out.println("Finally Expanded Focus Bar!");
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

		if (!(i < 10)) {
			Assert.fail();
		}

	}

	public static void collapseFocusBar() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-35")).click();
				System.out.println("Finally Collapsed Focus Bar!");
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

		if (!(i < 10)) {
			Assert.fail();
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

		d.get("C:\\Users\\LiL'Birdman\\Documents\\Project2_Revature\\proj2\\test-output\\Default suite\\Default test.html");

	}

	/**
	 * **************** TESTS HERE ****************************
	 */

	@Test
	public void testLaunchApp() {

		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		d = new ChromeDriver();
		d.get("https://assignforce-client.cfapps.io/login");
	}

	@Test(dependsOnMethods = "testLaunchApp")
	public void testLoginTrainer() {
		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
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
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;

			}
		}

		if (!(i < 10)) {
			Assert.fail();
		}
	}

//	@Test(dependsOnMethods = "testLoginTrainer")
//	public void testMoveToLocationBar() {
//		boolean expand = true;
//
//		int i = 0;
//		while (expand && i < 10) {
//			try {
//				Thread.sleep(500);
//				d.findElement(By.id("mat-tab-label-0-2")).click();
//				System.out.println("Finally moved!");
//				expand = false;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Nope");
//				i++;
//			} catch (Exception e) {
//				System.out.println("Naw");
//				i++;
//
//			}
//		}
//
//		if (!(i < 10)) {
//			Assert.fail();
//		}
//	}
//
//	@Test(dependsOnMethods = "testMoveToLocationBar")
//	public void testClickLocationBar() {
//		boolean expand = true;
//
//		int i = 0;
//		while (expand && i < 10) {
//			try {
//				Thread.sleep(500);
//				d.findElement(By.id("mat-expansion-panel-header-1")).click();
//				System.out.println("Finally collapse");
//				expand = false;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Nope");
//				i++;
//			} catch (Exception e) {
//				System.out.println("Naw");
//				i++;
//
//			}
//		}
//
//		if (!(i < 10)) {
//			Assert.fail();
//		}
//
//		int j = 0;
//		while (!expand && j < 10) {
//			try {
//				Thread.sleep(500);
//				d.findElement(By.id("mat-expansion-panel-header-1")).click();
//				System.out.println("Finally expand");
//				expand = true;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Nope");
//				j++;
//			} catch (Exception e) {
//				System.out.println("Naw");
//				j++;
//
//			}
//		}
//	}
//
//	@Test(dependsOnMethods = "testClickLocationBar")
//	public void testExpandFirstLocations() {
//		boolean expand = true;
//
//		int i = 0;
//		while (expand && i < 10) {
//			try {
//				Thread.sleep(500);
//				d.findElement(By.id("mat-expansion-panel-header-2")).click();
//				System.out.println("Finally Expanded First Location!");
//				expand = false;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Nope");
//				i++;
//			} catch (Exception e) {
//				System.out.println("Naw");
//				i++;
//
//			}
//		}
//
//		if (!(i < 10)) {
//			Assert.fail();
//		}
//	}
//
//	@Test(dependsOnMethods = "testExpandFirstLocations")
//	public void testCollapseFirstLocation() {
//		boolean expand = true;
//
//		int i = 0;
//		while (expand && i < 10) {
//			try {
//				Thread.sleep(500);
//				d.findElement(By.id("mat-expansion-panel-header-2")).click();
//				System.out.println("Finally Collapse First location!");
//				expand = false;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Nope");
//				i++;
//			} catch (Exception e) {
//				System.out.println("Naw");
//				i++;
//
//			}
//		}
//
//		if (!(i < 10)) {
//			Assert.fail();
//		}
//
//	}
//
//	@Test(dependsOnMethods = "testCollapseFirstLocation")
//	public void testExpandFirstBuilding() {
//		boolean expand = true;
//
//		int i = 0;
//		while (expand && i < 10) {
//			try {
//				Thread.sleep(500);
//				d.findElement(By.id("mat-expansion-panel-header-10")).click();
//				System.out.println("Finally Expand First Building!");
//				expand = false;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Nope");
//				i++;
//			} catch (Exception e) {
//				System.out.println("Naw");
//				i++;
//
//			}
//		}
//
//		if (!(i < 10)) {
//			Assert.fail();
//		}
//	}
//

	@Test(dependsOnMethods = "testLoginTrainer")
	public void testMoveToCirculaBar() {
		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-tab-label-0-3")).click();
				System.out.println("Finally moved!");
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

		if (!(i < 10)) {
			Assert.fail();
		}
	}

//	@Test(dependsOnMethods = "testMoveToCirculaBar")
//	public void testExpandFocusBar() {
//		boolean expand = true;
//
//		int i = 0;
//		while (expand && i < 10) {
//			try {
//				Thread.sleep(500);
//				d.findElement(By.id("mat-expansion-panel-header-35")).click();
//				System.out.println("Finally Expanded Focus Bar!");
//				expand = false;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Nope");
//				i++;
//			} catch (Exception e) {
//				System.out.println("Naw");
//				i++;
//
//			}
//		}
//
//		if (!(i < 10)) {
//			Assert.fail();
//		}
//	}
//
//	@Test(dependsOnMethods = "testExpandFocusBar")
//	public void testCollapseFocusBar() {
//		boolean expand = true;
//
//		int i = 0;
//		while (expand && i < 10) {
//			try {
//				Thread.sleep(500);
//				d.findElement(By.id("mat-expansion-panel-header-35")).click();
//				System.out.println("Finally Collapsed Focus Bar!");
//				expand = false;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Nope");
//				i++;
//			} catch (Exception e) {
//				System.out.println("Naw");
//				i++;
//
//			}
//		}

//		if (!(i < 10)) {
//			Assert.fail();
//		}
//
//	}

//	@Test(dependsOnMethods = "testMoveToCirculaBar")
//	public void testAddFocus() {
//		d.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-2\"]/span[1]/mat-panel-description/button"))
//				.click();
//
////		if (!(i < 10)) {
////			Assert.fail();
////		}
////
//		d.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Troubleshoot");
//		d.findElement(By.xpath("//*[@id=\"mat-select-0\"]")).click();
//		d.findElement(By.xpath("//*[@id=\"mat-option-29\"]")).click();
//		d.findElement(By.xpath("/html/body/div[2]/div[3]")).click();
//		d.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-add-focus/div[2]/button[2]")).click();
//	}

	@Test(dependsOnMethods = "testMoveToCirculaBar")
	public void testEditFocus() {

		try {
		d.findElement(
				By.xpath("//*[@id=\"cdk-accordion-child-2\"]/div/div/mat-list/div[14]/mat-list-item/div/button[1]"))
				.click();
		d.findElement(
				By.id("//*[@id=\"mat-dialog-0\"]/app-edit-focus/div[1]/div[1]/mat-form-field/div/div[1]/div/input"))
				.sendKeys("Troubleshooters");
		d.findElement(By.xpath(
				"//*[@id=\"mat-dialog-1\"]/app-edit-focus/div[1]/div[2]/mat-form-field/div/div[1]/div/mat-select"))
				.click();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

//	@Test(dependsOnMethods = "testAddFocus")
//	public void testCloseApp() {
//		closeApp();
//	}
//
//	@Test(dependsOnMethods = "testCloseApp")
//	public void testLaunchResult() {
//		launchResults();
//	}

}
