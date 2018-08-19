package com.revature.testng;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin= {"pretty","html:C:\\temp\\cukes_tests"}, features="C:\\Users\\LiL'Birdman\\Documents\\Project2_Revature\\proj2\\src\\main\\resources\\myTest.feature", glue="C:\\Users\\LiL'Birdman\\Documents\\Project2_Revature\\proj2\\src\\test\\java\\com\\revature\\testng\\GC.java")
public class TestRunner extends AbstractTestNGCucumberTests{

	
	
}
