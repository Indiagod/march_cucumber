package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SFDCLoginPage {
	
	public static WebElement textbox_userid(WebDriver driver){
    	   WebElement element = driver.findElement(By.name("username"));
		return element;
    	   
       }
       
       public static WebElement textbox_Password(WebDriver driver){
    	   WebElement element=driver.findElement(By.cssSelector("#password"));
		return element;
       }
       
       public static WebElement buttonclick(WebDriver driver){
    	   WebElement element=driver.findElement(By.xpath("//input[@id='Login']"));
		return element;
    	   
       }
}
