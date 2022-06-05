package com.hrmproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HrmorangePage {
	
	WebDriver driver;
	public HrmorangePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtUsername']")
	private WebElement Username;
	
	@FindBy(how = How.XPATH, using = "//*[@name='txtPassword']")
	private WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//*[@type='submit']")
	private WebElement Login;
	
	
	public WebElement getLogin() {
		return Login;
	}

	public void setLogin(WebElement login) {
		Login = login;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	}
	
}
