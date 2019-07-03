package XeroProject.AutomationOfXero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xero_TestCase1 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//login();
		//incorrectpassword();
		//incorrectEmail();
		forgotPassword();
        

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


	
	

}
