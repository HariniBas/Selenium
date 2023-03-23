package org.stepdefinition;

import org.base.BaseClass;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass {
	
	
	@Before(order=2)
	private void preconditionl() {

	windowMaximize();

	}
	
	@Before(order=1)

	private void precondition () {
	lanuchBrowser() ;

	}

	private void precondition3() {
	System. out.println ("Precondition ");

	}

	@After
	private void postConditionl() {
	closeEntireBrowser() ;

}
}