package EndtoendautomationSFDC;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class SFDCautomation {
	static WebDriver driver;
	
		public static void main(String[] args) throws InterruptedException, SikuliException {
			// TODO Auto-generated method stub
			rememberme();
			//myprofile();
			
		}
		
		public static void rememberme() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");
	    //WebDriver driver;
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
	    Thread.sleep(5000);
	    
	    WebElement usermenutab=driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
   	    Actions usermenu=new Actions(driver);
   	    usermenu.moveToElement(usermenutab).click().build().perform();
      }

       public static void myprofile() throws InterruptedException, SikuliException{
    	   
    	   WebElement myprofile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
   	       myprofile.click();
	    
	    WebElement editprofile=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
	    editprofile.click();
	   
	    driver.switchTo().frame("contactInfoContentId");
	    Actions a=new Actions(driver);
	    WebElement contact=driver.findElement(By.id("contactTab"));
	    WebElement About=driver.findElement(By.id("aboutTab"));
	    a.moveToElement(About).click().build().perform();
       
	    Thread.sleep(5000);
        WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
        lastname.clear();
        lastname.sendKeys("Srini");
        
        WebElement saveall=driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
        saveall.click();
        
        driver.switchTo().defaultContent();
        
        Thread.sleep(5000);
        WebElement postLink=driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
        postLink.click();
        Thread.sleep(3000);
        WebElement outertextbox=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
        
        driver.switchTo().frame(outertextbox);
        
        WebElement textmessage=driver.findElement(By.xpath("/html[1]/body[1]"));
        textmessage.sendKeys("Hello I am working with salesforce");
        driver.switchTo().defaultContent();
       
        Thread.sleep(5000);
        WebElement share=driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
        share.click();
        
        Thread.sleep(5000);
        WebElement file=driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
        file.click();
        
        Thread.sleep(5000);
        WebElement uploadfile=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
        uploadfile.click();
        
        driver.findElement(By.xpath("//input[@id='chatterFile']")).sendKeys("//Users//PrabhuRamasamy//Desktop//Tekarchworks//Image.png");
        
        WebElement share1=driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
        share1.click();

        WebElement addphoto=driver.findElement(By.xpath("//body[contains(@class,'ext-webkit ext-chrome ext-mac sfdcBody brandQuaternaryBgr')]/div[@id='contentWrapper']/div[contains(@class,'bodyDiv brdPalette brandPrimaryBrd')]/table[@id='bodyTable']/tbody/tr/td[contains(@class,'noSidebarCell')]/div[@id='chatterTab']/div[contains(@class,'leftContent')]/li[contains(@class,'recElement todoElement')]/div[@id='todoItem']/div[@id='listItem-addPhoto']/a[1]"));
        addphoto.click();
        
        Thread.sleep(5000);
        Screen s=new Screen();
        Pattern choosefile=new Pattern("//Users//PrabhuRamasamy//Desktop//choosefile.jpg");
        Pattern open=new Pattern("//Users//PrabhuRamasamy//Desktop//Open.jpg");
        s.type(choosefile,"//Users//PrabhuRamasamy//Desktop//Tekarchworks//baby.jpg");
        s.click(open);
   	    }
		
	
}