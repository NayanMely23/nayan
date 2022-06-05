package com.hrmproject;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HrmorangeSteps {
	WebDriver driver;
	HrmorangePage obj;

	@Given("^User visit Orange HRM home page$")
	public void user_visit_Orange_HRM_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		obj = new HrmorangePage(driver);

	}

	@When("^User type Username$")
	public void user_type_Username() throws Throwable {

		// driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		obj.getUsername().sendKeys("Admin");
	}

	@When("^User also type Password$")
	public void user_also_type_Password() throws Throwable {
		// driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		obj.getPassword().sendKeys("admin123");
	}

	@Then("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
     //driver.findElement(By.xpath("//*[@type='submit']")).click();
		obj.getLogin().click();
	}

	@Then("^User verify Welcome screen$")
	public void user_verify_Welcome_screen() throws Throwable {

	}

}
