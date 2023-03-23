package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

public class sample extends BaseClass {
	public static void main (String[] args) {
		lanuchBrowser();
		launchUrl("https://www.flipkart.com/?affid=admitad&affExtParam1=442763&affExtParam2=9a3967c040a070b925eb1272052b1b30") ;
		windowMaximize() ;

		FlipkartLoginPojo f = new FlipkartLoginPojo();
		passText("Harini", f.getEmail());
		passText("Baskar", f.getLogin());
		
		
	}
}
