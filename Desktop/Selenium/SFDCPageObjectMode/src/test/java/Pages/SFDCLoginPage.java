package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SFDCLoginPage {

       public static WebElement textbox_userid(WebDriver driver){
    	   WebElement username = driver.findElement(By.name("username"));
		return username;
    	   
       }
       
       public static WebElement textbox_Password(WebDriver driver){
    	   WebElement password=driver.findElement(By.cssSelector("#password"));
		return password;
       }
       
       public static WebElement buttonclick(WebDriver driver){
    	   WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		return login;
    	   
       }
}
