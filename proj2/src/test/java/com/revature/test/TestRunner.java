package com.revature.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (plugin = {"pretty", "html:temp"}, features="C:\\STSWorkspace\\Cukes\\src\\test\\resources\\TestCuke.feature")
public class TestRunner extends AbstractTestNGCucumberTests{

	
	
}
