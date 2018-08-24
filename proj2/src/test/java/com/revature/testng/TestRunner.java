package com.revature.testng;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin= {"pretty","html:C:\\temp\\proj2"}, features="C:\\project2\\Project2_Revature\\proj2\\src\\main\\resources\\LocationsTest.feature", glue="C:\\project2\\Project2_Revature\\proj2\\src\\test\\java\\com\\revature\\testng\\GC.java")
public class TestRunner extends AbstractTestNGCucumberTests{

	
	
}
