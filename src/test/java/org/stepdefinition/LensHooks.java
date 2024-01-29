package org.stepdefinition;

import org.baseclass.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LensHooks extends BaseClass{

	@Before
	public void launchingBrowser() {
	    launchBrowser();
	    maximizeBrowser();
	}
	
	@After
	public void closingBrowser() {
		closeBrowser();
		System.out.println("Thanks For Shopping");
	}
}
