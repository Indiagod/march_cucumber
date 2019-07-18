package M_Saleforce.Maven_salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

   public class AutomationTest extends ReusableFunctions {

	   static WebDriver driver;

	@AfterClass
	public static void logger() {
	ReusableFunctions.report.endTest(logger);
	ReusableFunctions.report.flush();
	}

	@BeforeClass
	public static void initialize_driver() {
	System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");

	//Initialize browser
	driver=new ChromeDriver();
	}

	@Test(priority=1)
	public static void launchURL() {

	initialize_driver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	System.out.println("Application launched successfully");
	
	}
	@Test(priority=2)
  public static void login() throws InterruptedException{
			
	CreateTestScriptReport("login");
    WebElement username=driver.findElement(By.name("username"));
    //enterText(username,"pradeepa.prabhu1006-n8t7@force.com","Username");
    enterText(username,"pradeepa.srini-gge5@force.com","Username");
    
    WebElement password=driver.findElement(By.cssSelector("#password"));
   // enterText(password,"Indiagod@1","Password");
    enterText(password,"Bujjupappu10","Password");
    
    WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
    clickButton(login,"Login");
    Thread.sleep(3000);
    
    WebElement usermenutab=driver.findElement(By.cssSelector("#userNav-arrow"));
    Actions usermenu=new Actions(driver);
    usermenu.moveToElement(usermenutab).click().build().perform();
    
    WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
    clickButton(logout,"Logout");

    
    }
	@Test(priority=3)
  public static void remembermeSFDC() throws InterruptedException{
	  launchURL();
	  CreateTestScriptReport("remembermeSFDC");
	  WebElement Uname=driver.findElement(By.name("username"));
	    enterText(Uname,"pradeepa.srini-gge5@force.com","Username");
	    
	    WebElement password=driver.findElement(By.cssSelector("#password"));
	    enterText(password,"Bujjupappu10","Password");
	   
	    WebElement rememberme=driver.findElement(By.xpath("//input[@id='rememberUn']"));
	    clickButton(rememberme,"RememberMe");
	    
	    WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
	    clickButton(login,"Login");
	   
	   
  }
	@Test(priority=4)
  public static void forgotpassword(){
	  launchURL();
	  CreateTestScriptReport("forgotpassword");
	  WebElement username=driver.findElement(By.name("username"));
	    enterText(username,"pradeepa.srini-gge5@force.com","Username");
	    
	    WebElement forgotpassword=driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
	    clickButton(forgotpassword,"Forgotpassword");
	    
	    WebElement usernameinforgotpassword=driver.findElement(By.xpath("//input[@id='un']"));
	    enterText(usernameinforgotpassword,"pradeepa.srini-gge5@force.com","UsernameinForgotPassword");
	    
	    WebElement continuebutton=driver.findElement(By.id("continue"));
	    clickButton(continuebutton,"ContinueButton");
	   
  }
}
