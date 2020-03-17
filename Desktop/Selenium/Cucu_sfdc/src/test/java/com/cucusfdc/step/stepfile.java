package com.cucusfdc.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepfile extends reusablemethods{
	static WebDriver driver;
	public static void initialize_driver(){
		System.setProperty("webdriver.gecko.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//geckodriver");
	   driver = new FirefoxDriver();
	}
	
	public static void launchURL(){
		initialize_driver();
		driver.get("https://login.salesforce.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Given("^Salesforce login page is launched$")
	public void salesforce_login_page_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchURL();
		
	    
	}

	@When("^Enter the username in the username field$")
	public void enter_the_username_in_the_username_field() throws Throwable {
	   WebElement username=driver.findElement(By.id("username"));
	   enterText(username,"pradeepasrinivasan17-5lkk@force.com","Username");
	    
	}

	@When("^Enter the passowrd in the password field$")
	public void enter_the_passowrd_in_the_password_field() throws Throwable {
	   WebElement password= driver.findElement(By.id("password"));
	    enterText(password,"Bujjupappu@10","Password");
	   
	}

	@Then("^Click on login button to login$")
	public void click_on_login_button_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Login=driver.findElement(By.name("Login"));
		clickButton(Login,"login");
	   
	}

	@Then("^The home page will be launched$")
	public void the_home_page_will_be_launched() throws Throwable {
	    // Write code here that turns throw new PendingException();
		String title=driver.getTitle();
		System.out.println(title);
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	   
	}


}
