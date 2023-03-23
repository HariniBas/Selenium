package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin extends BaseClass{
	
 public FlipkartLogin() {
	 PageFactory.initElements(driver, this);
 }
	 @FindBy(xpath="//a[@class='_1_3w1N']")
		private WebElement login;
	 
	 @FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
		private WebElement email;
	 
	 @FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
		private WebElement signin;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getPassword() {
		
		return null;
	}	

}
