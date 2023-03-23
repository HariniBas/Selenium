
package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin extends BaseClass {
	public GmailLogin() {
		 PageFactory.initElements(driver, this);
	 }
		 @FindBy(xpath="//input[@type='email']")
			private WebElement email;
		 
		 @FindBy(xpath="//span[text()='Next']")
			private WebElement signin;
		 
		 @FindBy(xpath="//input[@type='password']")
			private WebElement password;

		public WebElement getEmail() {
			return email;
		}
		public WebElement getSignin() {
			return signin;
		}

		public WebElement getPassword() {
			
			return password;
		}
		
		
		
	}

	



