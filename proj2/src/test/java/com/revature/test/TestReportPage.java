package com.revature.tests;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestReportPage {
	
	public static WebDriver wd = null;

	@Test(dependsOnMethods = { "com.revature.tests.TestSVPLogin.SVPlogin" }, priority = 1)
	public void openReportsPage() {
		TestSVPLogin.openChrome();
		TestSVPLogin.SVPlogin();
		TestSVPLogin.clickTab("mat-tab-label-0-6");
		String newUrl = wd.getCurrentUrl();
		Assert.assertEquals(newUrl, "https://assignforce-client.cfapps.io/reports");
	}
	
	@Test(dependsOnMethods = { "openReportsPage" }, priority = 2)
	public void clickBatchProjection() {
		WebElement element = wd.findElement(By.id("mat-expansion-panel-header-8"));
		element.click();
		WebElement elChange = wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-8\"]"));
		String visBefore = elChange.getCssValue("visibility");
		element.click();
		String visAfter = elChange.getCssValue("visibility");
		boolean changed = (visBefore == "hidden" && visAfter == "visible") ||
				(visBefore == "visible" && visAfter == "hidden");
		Assert.assertEquals(changed, true);
	}
	
	@Test(dependsOnMethods = { "openReportsPage" }, priority = 2)
	public void clickGradSummary17() {
		WebElement element = wd.findElement(By.id("mat-expansion-panel-header-9"));
		element.click();
		WebElement hiddenEl = wd.findElement(By.id("cdk-accordion-child-9"));
		String visBefore = hiddenEl.getCssValue("visibility");
		element.click();
		String visAfter = hiddenEl.getCssValue("visibility");
		boolean changed = (visBefore == "hidden" && visAfter == "visible") ||
				(visBefore == "visible" && visAfter == "hidden");
		Assert.assertEquals(changed, true);
	}
	
	@Test(dependsOnMethods = { "openReportsPage" }, priority = 2)
	public void clickTraineeSummary18() {
		WebElement element = wd.findElement(By.id("mat-expansion-panel-header-10"));
		element.click();
		WebElement hiddenEl = wd.findElement(By.id("cdk-accordion-child-10"));
		String visBefore = hiddenEl.getCssValue("visibility");
		element.click();
		String visAfter = hiddenEl.getCssValue("visibility");
		boolean changed = (visBefore == "hidden" && visAfter == "visible") ||
				(visBefore == "visible" && visAfter == "hidden");
		Assert.assertEquals(changed, true);
	}
	
	public void clickNet() {
		WebElement element = wd.findElement(By.xpath("//*[@id=\"highcharts-vkvklyq-4\"]/svg/g[6]/g/g/g[1]/text"));
		element.click();
	}
	
	public void clickNetBtn() {
		WebElement element = wd.findElement(By.xpath("//*[@id=\"highcharts-vkvklyq-4\"]/svg/g[6]/g/g/g[1]/rect"));
		element.click();
	}
	
	public void clickCustom() {
		WebElement element = wd.findElement(By.xpath("//*[@id=\"highcharts-vkvklyq-4\"]/svg/g[6]/g/g/g[3]/text"));
		element.click();
	}
	
	public void clickCustomBtn() {
		WebElement element = wd.findElement(By.xpath("//*[@id=\"highcharts-vkvklyq-4\"]/svg/g[6]/g/g/g[3]/rect"));
		element.click();
	}
	
	public void clickJava() {
		WebElement element = wd.findElement(By.xpath("//*[@id=\"highcharts-vkvklyq-4\"]/svg/g[6]/g/g/g[2]/text"));
		element.click();
	}
	
	public void clickJavaBtn() {
		WebElement element = wd.findElement(By.xpath("//*[@id=\"highcharts-vkvklyq-4\"]/svg/g[6]/g/g/g[2]/rect"));
		element.click();
	}
	
	public void clickSdet() {
		WebElement element = wd.findElement(By.xpath("//*[@id=\"highcharts-vkvklyq-4\"]/svg/g[6]/g/g/g[4]/text"));
		element.click();
	}
	
	public void clickSdetBtn() {
		WebElement element = wd.findElement(By.xpath("//*[@id=\"highcharts-vkvklyq-4\"]/svg/g[6]/g/g/g[4]/rect"));
		element.click();
	}
	
	
	public void clickTab(String tabId) { 
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(wd);
		WebElement we = wd.findElement(By.id("tabId"));
		we.click();
		System.out.println(we);
	}
}
