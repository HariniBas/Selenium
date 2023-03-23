package org.sample;

import org.base.BaseClass;

public class Login extends BaseClass {
	public static void main (String[] args) {
		lanuchBrowser();
		launchUrl("https://mail.google.com/mail/u/0/#inbox") ;
		windowMaximize() ;

		GmailLoginPojo g = new GmailLoginPojo();
		passText("harinibaskar85@gmail.com", g.getEmail());
		passText("Baskar", g.getPassword());
		
		
	}

	


}

