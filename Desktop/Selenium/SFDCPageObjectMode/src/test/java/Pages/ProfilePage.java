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
	   	    usermenu.moveToElement(usermenutab).click().build().perform();
			return usermenutab;
	       }
	       
	       public static WebElement myprofilebutton(WebDriver driver){
	       WebElement myprofile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		    myprofile.click();
			return myprofile;
	       }
		    
		    public static WebElement editprofilebutton(WebDriver driver){
		    	WebElement editprofile=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
			    editprofile.click();
				return editprofile;
		    }
		    
		    public static WebElement switchtoframe(WebDriver driver){
		    	 driver.switchTo().frame("contactInfoContentId");
				return (WebElement) driver;
		    }
		    
		    public static WebElement insideframes(WebDriver driver){
		    	Actions a=new Actions(driver);
			    WebElement About=driver.findElement(By.id("aboutTab"));
			    a.moveToElement(About).click().build().perform();
				return About;
		    }
		    
		    public static WebElement aboutmeinfotextbox(WebDriver driver){
		    	 WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		         lastname.clear();
		         lastname.sendKeys("Srini");
				return lastname;
		    }
		    

}
