package XeroProject.AutomationOfXero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Xero_TestCase1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//login();
		//incorrectpassword();
		//incorrectEmail();
		//forgotPassword();
		//freetrial();
		//freetrialwithoutfilldetails();
		//termsofuse();
		//fullofferdetails();
		//accountantorbookkeeper();
		//testalltab();
		//logout();
		//profile();
		Orginizationdetails();
	}
	
	public static void login(){
		
		System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
		driver=new ChromeDriver();
        driver.get("https://www.xero.com/us/");
        driver.manage().window().maximize();
        
        WebElement Clicklogintab=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
        Clicklogintab.click();
        
        WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
        Email.sendKeys("pradeepa.prabhu1006@gmail.com");
        
        WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("Indiagod@1");
        
        WebElement Login=driver.findElement(By.xpath("//button[@id='submitButton']"));
        Login.click();
       
	}
	
	public static void incorrectpassword(){
		
		System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
		driver=new ChromeDriver();
        driver.get("https://www.xero.com/us/");
        driver.manage().window().maximize();
        
        WebElement Clicklogintab=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
        Clicklogintab.click();
        
        WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
        Email.sendKeys("pradeepa.prabhu1006@gmail.com");
        
        WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("ABCD");
        
        WebElement Login=driver.findElement(By.xpath("//button[@id='submitButton']"));
        Login.click();
		
	}
	
      public static void incorrectEmail(){
		
		System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
		driver=new ChromeDriver();
        driver.get("https://www.xero.com/us/");
        driver.manage().window().maximize();
        
        WebElement Clicklogintab=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
        Clicklogintab.click();
        
        WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
        Email.sendKeys("abc@gmail.com");
        
        WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("Indiagod@1");
        
        WebElement Login=driver.findElement(By.xpath("//button[@id='submitButton']"));
        Login.click();
		
	 }
      
      public static void forgotPassword(){
  		
  		System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
  		driver=new ChromeDriver();
          driver.get("https://www.xero.com/us/");
          driver.manage().window().maximize();
          
          WebElement Clicklogintab=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
          Clicklogintab.click();
          
          WebElement ForgotPassword=driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
          ForgotPassword.click();
          
          WebElement Email=driver.findElement(By.xpath("//input[@id='UserName']"));
          Email.sendKeys("pradeepa.prabhu1006@gmail.com");
          
          WebElement SendEmailButton=driver.findElement(By.xpath("//span[@class='text']"));
          SendEmailButton.click();
  		
  	}


      public static void freetrial() throws InterruptedException{
    	  
    	  System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
    		driver=new ChromeDriver();
            driver.get("https://www.xero.com/us/");
            driver.manage().window().maximize();
            
            WebElement freetrial=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
            freetrial.click();
            
            WebElement Firstname=driver.findElement(By.xpath("//input[@name='FirstName']"));
            Firstname.sendKeys("abc");
            
            WebElement lastname=driver.findElement(By.xpath("//input[@name='LastName']"));
            lastname.sendKeys("def");
    	  
            WebElement email=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
            email.sendKeys("abc@gmail.com");
            
            WebElement phoneNo=driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
            phoneNo.sendKeys("123456789");
            
            WebElement country=driver.findElement(By.xpath("//select[@name='LocationCode']"));
            Select countrydropdown=new Select(country);
            countrydropdown.selectByVisibleText("United States");
            
            Thread.sleep(8000);
            		
            WebElement Termsandconditions=driver.findElement(By.xpath("//input[@name='TermsAccepted']"));
            Termsandconditions.click();
            
            WebElement GetStarted=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
            GetStarted.click();
      }
	
 public static void freetrialwithoutfilldetails() throws InterruptedException{
    	  
    	  System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
    		driver=new ChromeDriver();
            driver.get("https://www.xero.com/us/");
            driver.manage().window().maximize();
            
            WebElement freetrial=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
            freetrial.click();
            
            Thread.sleep(5000);
            WebElement gettingStarted=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
            gettingStarted.click();
            
            Thread.sleep(5000);
            WebElement email=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
            email.sendKeys("abc.com@gmail123");
            
            Thread.sleep(5000);
            WebElement Firstname=driver.findElement(By.xpath("//input[@name='FirstName']"));
            Firstname.sendKeys("abc");
            
            WebElement lastname=driver.findElement(By.xpath("//input[@name='LastName']"));
            lastname.sendKeys("def");
    	  
            WebElement email1=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
            email1.clear();
            email1.sendKeys("abc@gmail.com");
            
            WebElement phoneNo=driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
            phoneNo.sendKeys("123456789");
            
            WebElement country=driver.findElement(By.xpath("//select[@name='LocationCode']"));
            Select countrydropdown=new Select(country);
            countrydropdown.selectByVisibleText("United States");
            
            Thread.sleep(8000);
         
            WebElement Gettingstarted1=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
            Gettingstarted1.click();
           
            driver.quit();
            
            }
 
           public static void termsofuse() throws InterruptedException{
        	   System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
       		   driver=new ChromeDriver();
               driver.get("https://www.xero.com/us/");
               driver.manage().window().maximize();
               
               WebElement freetrial=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
               freetrial.click();
               
               Thread.sleep(3000);
               WebElement termsofuse=driver.findElement(By.xpath("//a[contains(text(),'Terms of Use')]"));
               termsofuse.click();
               
               Thread.sleep(5000);
               WebElement privacypolicy=driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
               privacypolicy.click();
               
               driver.quit();
        	   
           }
           
 
           public static void fullofferdetails() throws InterruptedException{
        	   System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
       		   driver=new ChromeDriver();
               driver.get("https://www.xero.com/us/");
               driver.manage().window().maximize();
               
               WebElement freetrial=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
               freetrial.click();
               
               Thread.sleep(3000);
               WebElement offerdetails=driver.findElement(By.xpath("//a[contains(text(),'offer details')]"));
               offerdetails.click();
               
               Thread.sleep(5000);
               driver.quit();
           }
           
           public static void accountantorbookkeeper() throws InterruptedException{
        	   System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
       		   driver=new ChromeDriver();
               driver.get("https://www.xero.com/us/");
               driver.manage().window().maximize();
               
               WebElement freetrial=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
               freetrial.click();
               
               Thread.sleep(3000);
               WebElement accountandbookkkeeper=driver.findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"));
               accountandbookkkeeper.click();
               
               Thread.sleep(5000);
               driver.quit();
           }
           
           public static void testalltab() throws InterruptedException{
        	   Thread.sleep(2000);
        	   WebElement dashboard=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ol[1]/li[1]/a[1]"));
        	   dashboard.click();
        	   
        	   Thread.sleep(2000);
        	   WebElement Accounting=driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
        	   Actions accountdropdown=new Actions(driver);
        	   accountdropdown.moveToElement(Accounting).click().build().perform();
        	   
        	   Thread.sleep(2000);
        	   WebElement Reports=driver.findElement(By.xpath("//a[contains(text(),'Reports')]"));
        	   Reports.click();
        	   
        	   Thread.sleep(2000);
        	   WebElement Contacts=driver.findElement(By.xpath("//button[contains(text(),'Contacts')]"));
        	   Contacts.click();
        	   
        	   Thread.sleep(2000);
               WebElement Usercompany=driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
               Actions Usercompanydropdown=new Actions(driver);
               Usercompanydropdown.moveToElement(Usercompany).click().build().perform();
               
               Thread.sleep(2000);
               WebElement setting=driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
               setting.click();
               
               Thread.sleep(2000);
               WebElement Plustab=driver.findElement(By.xpath("//li[1]//button[1]//div[1]"));
               Plustab.click();
               
               Thread.sleep(2000);
               WebElement Notification=driver.findElement(By.xpath("//li[3]//button[1]//div[1]"));
               Notification.click();
               
               Thread.sleep(2000);
               WebElement search=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ol[2]/li[2]/button[1]/div[1]"));
               search.click();
               
               Thread.sleep(2000);
               WebElement help=driver.findElement(By.xpath("//button[@class='xrh-button xrh-addon--iconbutton xrh-header--iconbutton xrh-focusable--parent xrh-focusable--parent-is-active']//*[@class='xrh-icon xrh-icon-svg']"));
               help.click();
               
           }
           
           public static void logout(){
        	   WebElement logout=driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-8']"));
        	   Actions logoutdropdown=new Actions(driver);
        	   logoutdropdown.moveToElement(logout).click().build().perform();
        	   
        	   WebElement logoutclick=driver.findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]"));
        	   logoutclick.click();
        	   
        	   WebElement usernamefield=driver.findElement(By.xpath("//input[@id='email']"));
        	   System.out.println(usernamefield.isDisplayed());
        	
        	   driver.quit();
           }
           
           public static void profile() throws InterruptedException{
        	   Thread.sleep(3000);
        	   WebElement usernamenavbutton=driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
        	   Actions usernamenavbuttondropdown=new Actions(driver);
        	   usernamenavbuttondropdown.moveToElement(usernamenavbutton).click().build().perform();
        	   
        	   Thread.sleep(3000);
        	   WebElement MyXero=driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
        	   MyXero.click();
        	   
        	   String primarywindow=driver.getWindowHandle();
       	       System.out.println("Primary Window:"+primarywindow );
       	       for(String handle: driver.getWindowHandles()) {
       	    	System.out.println("No of handle" + handle);
       	    	driver.switchTo().window(handle);
       	        }
        	   
        	   Thread.sleep(3000);
        	   System.out.println("My Profile page");
        	   WebElement usernameMyxero=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]"));
        	   Actions usernameMyxerodropdown=new Actions(driver);
        	   usernameMyxerodropdown.moveToElement(usernameMyxero).click().build().perform();
        	   
        	   Thread.sleep(3000);
        	   WebElement profile=driver.findElement(By.xpath("//li[@class='xn-h-profile-card-navigation-item grid-3 profile']//a[contains(text(),'Profile')]"));
        	   profile.click();
        	   
        	   Thread.sleep(3000);
        	   WebElement upload=driver.findElement(By.xpath("//div[@id='button-1041']"));
        	   upload.click();
        	   
        	   Thread.sleep(3000);
        	   WebElement browse=driver.findElement(By.xpath("//input[@id='filefield-1174-button-fileInputEl']"));
        	   browse.sendKeys("//Users//PrabhuRamasamy//Desktop//Tekarchworks//Image.png");
        	   
        	   Thread.sleep(3000);
        	   WebElement uploadbutton=driver.findElement(By.xpath("//span[@id='button-1178-btnInnerEl']"));
        	   uploadbutton.click();
        	   
        	   Thread.sleep(3000);
        	   WebElement save=driver.findElement(By.xpath("//span[@id='button-1164-btnInnerEl']"));
        	   save.click();
        	   
        	   driver.quit();
        	 
           }
           
           public static void Orginizationdetails() throws InterruptedException{
        	   
        	   System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
       		driver=new ChromeDriver();
               driver.get("https://www.xero.com/us/");
               driver.manage().window().maximize();
               
               WebElement Clicklogintab=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
               Clicklogintab.click();
               
               WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
               Email.sendKeys("gopala.anumanchipalli@gmail.com");
               
               WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
               Password.sendKeys("password12");
               
               WebElement Login=driver.findElement(By.xpath("//button[@id='submitButton']"));
               Login.click();
               
               WebElement AddanOrganization=driver.findElement(By.xpath("//a[@id='ext-gen1043']"));
               AddanOrganization.click();
               
               Thread.sleep(5000);
               WebElement nameofOrganization=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
               nameofOrganization.sendKeys("Self");
               
               Thread.sleep(3000);
               WebElement CountryofTaxPaid=driver.findElement(By.xpath("//body[@class='xui-body xui-background-white']//div[@id='root']//div//div//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//button[1]//div[1]"));
               Actions dropdown=new Actions(driver);
               dropdown.moveToElement(CountryofTaxPaid).click().build().perform();
               
               Thread.sleep(3000);
               WebElement Country=driver.findElement(By.xpath("//li[@id='CNTRY/US']//span[@class='xui-pickitem--text']"));
               Country.click();
               
               Thread.sleep(3000);
               WebElement Timezone=driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//button[1]//div[1]"));
               Actions TimeZoneDropdown=new Actions(driver);
               TimeZoneDropdown.moveToElement(Timezone).click().build().perform();
               
               Thread.sleep(3000);
               WebElement Time=driver.findElement(By.xpath("//span[contains(text(),'(UTC-08:00) Pacific Time (US & Canada)')]"));
               Time.click();
               
               Thread.sleep(3000);
               WebElement JobType=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
               JobType.sendKeys("Accounting");
               
               Thread.sleep(3000);
               WebElement StartTrial=driver.findElement(By.xpath("//button[@class='xui-button xui-actions--primary xui-actions--button-spacing xui-button-main xui-button-medium']"));
               StartTrial.click();
               
               driver.quit();  
        	   
           }
           
           
           
           
           
           
	

}
