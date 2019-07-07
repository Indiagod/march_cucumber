package Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contacts_Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	    
	    driver.manage().window().maximize();
	   
	    WebElement Contacts=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
	    Contacts.click();
	    
	    WebElement createnewview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	    createnewview.click();
	    
	    WebElement viewname=driver.findElement(By.xpath("//input[@id='fname']"));
	    viewname.sendKeys("Vivaan");
	    
	    WebElement viewUniquename=driver.findElement(By.xpath("//input[@id='devname']"));
	    viewUniquename.sendKeys("VivaanPradeepa");
	    
	    WebElement savebutton=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
	    savebutton.click();
	    
	    driver.quit();
	}

}
