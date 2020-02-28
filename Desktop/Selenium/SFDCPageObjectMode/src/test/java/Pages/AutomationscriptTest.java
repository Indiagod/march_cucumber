package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import Pages.SFDCLoginPage;


public class AutomationscriptTest {
	static WebDriver driver;
	@BeforeClass
	public static void initialize_driver() {
	System.setProperty("webdriver.gecko.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//geckodriver");
	//Initialize browser
	driver=new FirefoxDriver();
	}

	@Test(priority=1)
	public static void launchURL() {

	initialize_driver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	System.out.println("Application launched successfully");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
     @Test(priority=2)
	 public static void login() throws InterruptedException{
		 SFDCLoginPage.textbox_userid(driver).sendKeys("prabhu.ramaswamy-k2dj@force.com");
		    SFDCLoginPage.textbox_Password(driver).sendKeys("Bujjupappu@10");
		    SFDCLoginPage.buttonclick(driver).click();
		    Thread.sleep(10000);
		 
	 }
     
     @Test(priority=3)
     public static void myprofile(){
    	 ProfilePage.usermenu(driver).click();
    	 ProfilePage.myprofilebutton(driver).click();
    	 ProfilePage.editprofilebutton(driver).click();
    	 driver.switchTo().frame("contactInfoContentId");
    	 ProfilePage.insideframes(driver).click();
    	 ProfilePage.aboutmeinfotextbox(driver).clear();
    	 ProfilePage.aboutmeinfotextbox(driver).sendKeys("Pradeepa");
    	 ProfilePage.saveall(driver).click();
    	 driver.switchTo().defaultContent();
    	 ProfilePage.postLink(driver).click();
    	 WebElement outertext=ProfilePage.outertextbox(driver);
    	 driver.switchTo().frame(outertext);
    	 ProfilePage.textmessage(driver).sendKeys("Hello I am working in salesforce");
    	 driver.switchTo().defaultContent();
         

     }
     
  
	 
	 
}
