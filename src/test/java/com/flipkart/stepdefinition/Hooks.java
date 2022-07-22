package com.flipkart.stepdefinition;

import com.flipkart.resource.commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends commonactions{
commonactions c=new commonactions();
@Before
public void BeforeScenario() {
	System.out.println("BeforeScenario");
	c.Lunch();
}
@After
public void AfterScenario() {
	System.out.println("AfterScenario");
	driver.quit();
}
}
