package EndtoendautomationSFDC;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SFDCautomation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rememberme();
		
	}
		public static void rememberme(){
		System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
		WebDriver driver;
		driver=new ChromeDriver();	
        driver.get("https://login.salesforce.com");
      
	    WebElement username=driver.findElement(By.name("username"));
	    username.sendKeys("pradeepa.prabhu1006-n8t7@force.com");
	    
	    WebElement password=driver.findElement(By.cssSelector("#password"));
	    password.sendKeys("Indiagod@1");
	    
	    WebElement rememberme=driver.findElement(By.xpath("//input[@id='rememberUn']"));
	    rememberme.click();
	   
	    WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
	    login.click();
	    
	    WebElement adwindow=driver.findElement(By.cssSelector("a#tryLexDialogX.dialogClose"));
	    adwindow.click();
	  
	    WebElement usermenutab=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]"));
	    Actions usermenu=new Actions(driver);
	    usermenu.moveToElement(usermenutab).click().build().perform();
	
      }


	
}