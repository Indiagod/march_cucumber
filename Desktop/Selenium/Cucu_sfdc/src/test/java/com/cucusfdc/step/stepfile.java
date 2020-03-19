package com.cucusfdc.step;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	@Given("^check for usermenu and it dropdown$")
	public void check_for_usermenu_and_it_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
	   WebElement usermenucheck=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]"));
	   usermenucheck.isDisplayed();
	}

	@When("^Click on usermenu in the usermenu dropdown$")
	public void click_on_usermenu_in_the_usermenu_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		WebElement usermenu=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]"));
		mousehover(driver,usermenu,"usermeanudropdown");
	}
	
	@Then("^Select MYSETTINGS from the dropdown$")
	public void select_MYSETTINGS_from_the_dropdown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement mysetting=driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
	   mysetting.click(); 
	}

	@Then("^Click on Personal$")
	public void click_on_Personal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement personalinfo=driver.findElement(By.id("PersonalInfo_font"));
		mousehover(driver,personalinfo,"personalinfodropdown");
	    
	}

	@Then("^Click on the login history$")
	public void click_on_the_login_history() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loginhistory=driver.findElement(By.id("LoginHistory_font"));
		clickButton(loginhistory,"LoginHistory");
	   
	}

	@Then("^Click on the download login history$")
	public void click_on_the_download_login_history() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement download=driver.findElement(By.cssSelector("div.pShowMore"));
		clickButton(download,"Download");
		Thread.sleep(4000);

	}

	@Then("^Click on display and layout$")
	public void click_on_display_and_layout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement displaylayout=driver.findElement(By.id("DisplayAndLayout_font"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", displaylayout);
	   mousehover(driver,displaylayout,"DisplayLayout");
	}

	@Then("^Select the customize my tabs from the link$")
	public void select_the_customize_my_tabs_from_the_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement customizetabs=driver.findElement(By.id("CustomizeTabs_font"));
	   clickButton(customizetabs,"CustomizeTabs");
	}

	@Then("^From the custom app drop down select the Salesforce Chatter$")
	public void from_the_custom_app_drop_down_select_the_Salesforce_Chatter() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement customapp=driver.findElement(By.id("p4"));
	   selectdropdown(customapp,"Salesforce Chatter", "Salesforcechatter");
	}

	@Then("^Select the reports from the available tabs list$")
	public void select_the_reports_from_the_available_tabs_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement Avaiabletabs=driver.findElement(By.id("duel_select_0"));
	   selectdropdown(Avaiabletabs,"Reports", "reports");
	}

	@Then("^click on Add to reports to the selected tabs list$")
	public void click_on_Add_to_reports_to_the_selected_tabs_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement addreport=driver.findElement(By.className("rightArrowIcon"));
	    clickButton(addreport,"AddReport");
	}

	@When("^Click on the email link$")
	public void click_on_the_email_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement email=driver.findElement(By.id("EmailSetup_font"));
	   mousehover(driver,email,"Email");
	}

	@Then("^Select the email setting link under that$")
	public void select_the_email_setting_link_under_that() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  WebElement MyEmailSettings=driver.findElement(By.id("EmailSettings_font"));
	  clickButton(MyEmailSettings,"MyEmailSettings");
	}

	@Then("^Enter the Email Name$")
	public void enter_the_Email_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement EmailName=driver.findElement(By.id("sender_name"));
	   enterText(EmailName,"Pradeepa Srinivasan","emailname");
	}

	@Then("^Enter the Email Address$")
	public void enter_the_Email_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement emailAddress=driver.findElement(By.id("sender_email"));
	    emailAddress.clear();
	    enterText(emailAddress,"pradeepasrinivasan17@gmail.com","emailaddress");
	}

	@Then("^Click on automatic BCC radio button$")
	public void click_on_automatic_BCC_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement bcc=driver.findElement(By.xpath("//input[@id='auto_bcc1'] [@value='1']"));
	    clickButton(bcc,"AutomaticBCC");
	}

	@Then("^Click on Save button$")
	public void click_on_Save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement save=driver.findElement(By.name("save"));
	    clickButton(save,"Save");
	}

	@Then("^Click on Calendar and remainder$")
	public void click_on_Calendar_and_remainder() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  WebElement calendarRemainder=driver.findElement(By.id("CalendarAndReminders_font"));
	  mousehover(driver,calendarRemainder,"Calendar&Remainder");
	}

	@Then("^Click on the Activity remainder link$")
	public void click_on_the_Activity_remainder_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement ActivityRemainder=driver.findElement(By.id("Reminders_font"));
	   clickButton(ActivityRemainder,"ActivityRemainders");
	}

	@Then("^Click on Open a Test Remainder to view preview$")
	public void click_on_Open_a_Test_Remainder_to_view_preview() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement testremainder=driver.findElement(By.id("testbtn"));
	    clickButton(testremainder,"TestRemainder");
	}


}
