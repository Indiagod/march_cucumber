package Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contacts_Testcase1 {

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
	    
	    WebElement newbutton=driver.findElement(By.xpath("//input[@name='new']"));
	    newbutton.click();
	    
	    WebElement Lastname=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
	    Lastname.sendKeys("Srini");
	    
	    WebElement accountname=driver.findElement(By.xpath("//input[@id='con4']"));
	    accountname.sendKeys("Pradeepa");
	    
	    WebElement savebutton=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
	    savebutton.click();
	    
	    driver.quit();

	}

}
