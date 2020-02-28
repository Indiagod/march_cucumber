package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ProfilePage {

	       public static WebElement usermenu(WebDriver driver){
	    	 WebElement usermenutab=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]"));
	   	    Actions usermenu=new Actions(driver);
	   	    usermenu.moveToElement(usermenutab).build().perform();
			return usermenutab;
	       }
	       
	       public static WebElement myprofilebutton(WebDriver driver){
	       WebElement element=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
			return element;
	       }
		    
		    public static WebElement editprofilebutton(WebDriver driver){
		    	WebElement element=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
				return element;
		    }
		    
		    public static void switchtoframe(WebDriver driver){
		    	 driver.switchTo().frame("contactInfoContentId");
		    }
		    
		    public static WebElement insideframes(WebDriver driver){
		    	Actions a=new Actions(driver);
			    WebElement About=driver.findElement(By.id("aboutTab"));
			    a.moveToElement(About).click().build().perform();
				return About;
		    }
		    
		    public static WebElement aboutmeinfotextbox(WebDriver driver){
		    	 WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
				return lastname;
		    }
		    
		    public static WebElement saveall(WebDriver driver){
		    	 WebElement element=driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
		       	return element;
		         
		    }
		    
		    public static WebElement postLink(WebDriver driver){
		    	 WebElement element=driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
		       	return element;
		         
		    }
		    
		    public static WebElement outertextbox(WebDriver driver){
		    	 WebElement element=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
		       	return element;
		         
		    }

		    public static WebElement textmessage(WebDriver driver){
		    	 WebElement element=driver.findElement(By.xpath("/html[1]/body[1]"));
		       	return element;
		         
		    }
		    
		    
		    

}
