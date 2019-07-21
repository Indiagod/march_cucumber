package M_Saleforce.Maven_salesforce;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

   public class AutomationTest extends ReusableFunctions {

	   static WebDriver driver;

	@AfterClass
	public static void logger() {
	ReusableFunctions.report.endTest(logger);
	ReusableFunctions.report.flush();
	}

	@BeforeClass
	public static void initialize_driver() {
	System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");

	//Initialize browser
	driver=new ChromeDriver();
	}

	@Test(priority=1)
	public static void launchURL() {

	initialize_driver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	System.out.println("Application launched successfully");
	
	}
	@Test(priority=2)
  public static void login() throws InterruptedException{
			
	CreateTestScriptReport("login");
    WebElement username=driver.findElement(By.name("username"));
    //enterText(username,"pradeepa.prabhu1006-n8t7@force.com","Username");
    enterText(username,"pradeepa.srini-gge5@force.com","Username");
    
    WebElement password=driver.findElement(By.cssSelector("#password"));
    //enterText(password,"Indiagod@1","Password");
    enterText(password,"Bujjupappu10","Password");
    
    WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
    clickButton(login,"Login");
    Thread.sleep(3000);
    
    WebElement usermenutab=driver.findElement(By.xpath("//div[@id='userNavButton']"));
    Actions usermenu=new Actions(driver);
    usermenu.moveToElement(usermenutab).click().build().perform();
    
    }
	@Test(priority=3)
  public static void remembermeSFDC() throws InterruptedException{
	  launchURL();
	  CreateTestScriptReport("remembermeSFDC");
	  WebElement Uname=driver.findElement(By.name("username"));
	    enterText(Uname,"pradeepa.srini-gge5@force.com","Username");
	    
	    WebElement password=driver.findElement(By.cssSelector("#password"));
	    enterText(password,"Bujjupappu10","Password");
	   
	    WebElement rememberme=driver.findElement(By.xpath("//input[@id='rememberUn']"));
	    clickButton(rememberme,"RememberMe");
	    
	    WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
	    clickButton(login,"Login");
	   
	   
  }
	@Test(priority=4)
  public static void forgotpassword(){
	  launchURL();
	  CreateTestScriptReport("forgotpassword");
	  WebElement username=driver.findElement(By.name("username"));
	    enterText(username,"pradeepa.srini-gge5@force.com","Username");
	    
	    WebElement forgotpassword=driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
	    clickButton(forgotpassword,"Forgotpassword");
	    
	    WebElement usernameinforgotpassword=driver.findElement(By.xpath("//input[@id='un']"));
	    enterText(usernameinforgotpassword,"pradeepa.srini-gge5@force.com","UsernameinForgotPassword");
	    
	    WebElement continuebutton=driver.findElement(By.id("continue"));
	    clickButton(continuebutton,"ContinueButton");
	   
  }
	
	@Test(priority=4)
	   public static void usermenu() throws InterruptedException{
		   launchURL();
			  login();
			CreateTestScriptReport("usermenu");
		Thread.sleep(5000);   
	    WebElement usermenutab=driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
	    mousehover(driver, usermenutab,"usermenutab");
		    
		    WebElement logout=driver.findElement(By.linkText("Logout"));
		    clickButton(logout,"logout");
		    System.out.println("Logout successfully");
		    driver.quit();
	   }
	   @Test(priority=5)
	   public static void MyProfile() throws InterruptedException{
		   launchURL();
			  login();
			CreateTestScriptReport("MyProfile");
		Thread.sleep(4000);   
	    WebElement usermenutab=driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
	    mousehover(driver,usermenutab , "usermenutab");
		    
		    WebElement myprofile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		    clickButton(myprofile,"myprofile");
		    
		    WebElement editprofile=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		    clickButton(editprofile,"editprofile");
		   
		    switchFrameid(driver,"contactInfoContentId");
		    
		    WebElement contact=driver.findElement(By.id("contactTab"));
		    WebElement About=driver.findElement(By.id("aboutTab"));
		    mousehover(driver, About, "AboutTab");
		   
	      
		    Thread.sleep(5000);
	       WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
	       lastname.clear();
	       enterText(lastname,"Srini","Lastname");
	       
	       WebElement saveall=driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
	       clickButton(saveall,"saveall");
	       
	       switchtoDefaultFrame(driver);
	       
	       Thread.sleep(5000);
	       WebElement postLink=driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
	       clickButton(postLink,"PostLink");
	       
	       Thread.sleep(3000);
	       WebElement outertextbox=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
	       
	       switchframe(driver, outertextbox);
	       
	       WebElement textmessage=driver.findElement(By.xpath("/html[1]/body[1]"));
	       textmessage.sendKeys("Hello I am working with salesforce");
	       driver.switchTo().defaultContent();
	      
	       Thread.sleep(5000);
	       WebElement share=driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
	       clickButton(share,"Share");
	       
	       Thread.sleep(5000);
	       WebElement file=driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
	       clickButton(file,"File");
	       
	       Thread.sleep(5000);
	       WebElement uploadfile=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
	       clickButton(uploadfile,"Uploadfile");

	       WebElement choosefilePath=driver.findElement(By.xpath("//input[@id='chatterFile']"));
	       enterText(choosefilePath,"//Users//PrabhuRamasamy//Desktop//Tekarchworks//Image.png","ChooseFile");
	       
	       WebElement share1=driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
	       clickButton(share1,"Share1");

	       WebElement addphoto=driver.findElement(By.xpath("//body[contains(@class,'ext-webkit ext-chrome ext-mac sfdcBody brandQuaternaryBgr')]/div[@id='contentWrapper']/div[contains(@class,'bodyDiv brdPalette brandPrimaryBrd')]/table[@id='bodyTable']/tbody/tr/td[contains(@class,'noSidebarCell')]/div[@id='chatterTab']/div[contains(@class,'leftContent')]/li[contains(@class,'recElement todoElement')]/div[@id='todoItem']/div[@id='listItem-addPhoto']/a[1]"));
	       clickButton(addphoto,"Addphoto");
	       
	       Thread.sleep(5000);
	      // WebElement choosefileforprofilepic=driver.findElement(By.xpath("/html[1]/body[1]/span[1]/form[1]/input[2]"));
	     //  enterText(choosefileforprofilepic,"//Users//PrabhuRamasamy//Desktop//Tekarchworks//baby.jpg","ChooseFile");
	       
	      // WebElement SaveButton=driver.findElement(By.xpath("/html[1]/body[1]/span[1]/form[1]/div[1]/input[1]"));
	      // clickButton(SaveButton,"SaveButton");
	      // Screen s=new Screen();
	      // Pattern choosefile=new Pattern("//Users//PrabhuRamasamy//Desktop//choosefile.jpg");
	      // Pattern open=new Pattern("//Users//PrabhuRamasamy//Desktop//Open.jpg");
	    //   s.type(choosefile,"//Users//PrabhuRamasamy//Desktop//Tekarchworks//baby.jpg");
	      // s.click(open);
	       driver.quit();
	       
	   }
	   @Test(priority=6)
	   public static void MySettings() throws InterruptedException{
		   launchURL();
			  login();
			CreateTestScriptReport("MySettings");
		   Thread.sleep(3000);
		   WebElement usermenutab=driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		   mousehover(driver, usermenutab, "usermenutab");
		    
		    WebElement mysetting=driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		    clickButton(mysetting,"Mysetting");
		    
		    WebElement personalinfotab=driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
		    mousehover(driver, personalinfotab, "personalinfotab");
		    
		    WebElement loginhistory=driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
		    clickButton(loginhistory,"LoginHistory");
		    Thread.sleep(5000);
		   
		    WebElement loginhistorylink=driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		    mousehover(driver, loginhistorylink, "loginhistorylink");
		    
		    Thread.sleep(5000);
		    WebElement displaylayouttab=driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"));
		    mousehover(driver, displaylayouttab, "displaylayouttab");
	       
		    Thread.sleep(2000);
		    WebElement customizemytab=driver.findElement(By.cssSelector("#CustomizeTabs_font"));
		    mousehover(driver, customizemytab, "customizemytab");
		 
		   
		    WebElement customapp=driver.findElement(By.xpath("//select[@id='p4']"));
		    selectdropdown(customapp,"Salesforce Chatter", "SalesforceChatter");
		   
		    WebElement addreports=driver.findElement(By.xpath("//select[@id='duel_select_0']"));
		    selectdropdown(addreports,"Reports", "Reports");
		    
		    WebElement rightarrow=driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		    clickButton(rightarrow,"RightArrow");
		    
		    Thread.sleep(2000);
		    WebElement savebutton=driver.findElement(By.xpath("//input[@name='save']"));
		    clickButton(savebutton,"SaveButton");
		    
		    WebElement Email=driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']"));
		    mousehover(driver,Email, "Email");
		    
		    WebElement MyEmailSetting=driver.findElement(By.cssSelector("#EmailSettings_font"));
		    clickButton(MyEmailSetting,"MyEmailSetting");

		    WebElement Emailname=driver.findElement(By.xpath("//input[@id='sender_name']"));
		    Emailname.clear();
		    enterText(Emailname,"Pradeepa","Emailname");
		    
		    WebElement bcc=driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
		    selectRadioButton(bcc,"ClickOnBCC");
		    
		    Thread.sleep(2000);
		    WebElement save=driver.findElement(By.xpath("//input[@name='save']"));
		    clickButton(save,"Save");
		    System.out.println("Email Setting updated successfully");
		    
		    Thread.sleep(2000);
		    WebElement calenderReminders=driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
		    mousehover(driver,calenderReminders, "calenderReminders");
		    
		    WebElement activityremainder=driver.findElement(By.xpath("//span[@id='Reminders_font']"));
		    clickButton(activityremainder,"ActivityRemainder");
		     
		    Thread.sleep(2000);
		    WebElement Opentestremainder=driver.findElement(By.xpath("//input[@id='testbtn']"));
		    clickButton(Opentestremainder,"OpentestRemainder");
		    
		    driver.quit();
	   }
	   @Test(priority=7)
	   public static void Developerconsole() throws InterruptedException, AWTException{
		   launchURL();
			  login();
			CreateTestScriptReport("Developerconsole");
		WebElement usermenutab=driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		mousehover(driver,usermenutab, "usermenutab");
		    
		    WebElement devconsole=driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
		    clickButton(devconsole,"DevConsole");
		    
		    Thread.sleep(2000);
		    Robot rt=new Robot();
		 
		    rt.keyPress(KeyEvent.VK_META);
		    rt.keyPress(KeyEvent.VK_W);
		    driver.quit();
		   
		   
	   }
	   
	   @Test(priority=8)
	   public static void createanacc() throws InterruptedException{
	 	  launchURL();
	 	  login();
	 	CreateTestScriptReport("createanacc");
	 	  WebElement Accounts=driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
	 	  mousehover(driver, Accounts, "Accounts");
	 	    
	 	      Thread.sleep(2000);
	       WebElement newbutton=driver.findElement(By.xpath("//input[contains(@title,'New')]"));
	       clickButton(newbutton, "NewButton");
	        
	       WebElement accname=driver.findElement(By.xpath("//input[@id='acc2']"));
	       accname.clear();
	       enterText(accname,"PradeepaNew","accountname");
	       
	       Thread.sleep(2000);
	       WebElement save=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"));
	       clickButton(save, "SAVE");
	      
	       driver.quit();
	   }
	   @Test(priority=9)
	   public static void createnewview() throws InterruptedException{
	 	  launchURL();
	 	  login();
	 	CreateTestScriptReport("createnewview");
	 	    WebElement Accounts=driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
	   mousehover(driver, Accounts, "Accounts");
	 	    
	       WebElement createnew=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	       clickButton(createnew,"CreateNew");
	       
	       WebElement viewname=driver.findElement(By.xpath("//input[@id='fname']"));
	       enterText(viewname,"Pradeepa","ViewName");
	       
	       WebElement viewuniquename=driver.findElement(By.xpath("//input[@id='devname']"));
	       enterText(viewuniquename,"PradeepaPrabhu","viewuniquename");
	       
	       Thread.sleep(5000);
	       WebElement save=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
	       clickButton(save,"SAVE");
	       
	       driver.quit();
	   }
	   @Test(priority=10)
	   public static void Editview() throws InterruptedException{
	 	  launchURL();
	 	  login();
	 	CreateTestScriptReport("Editview");
	 	WebElement Accounts=driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
	 	    mousehover(driver, Accounts, "Accounts");
	 	    
	 	    WebElement viewdropdown=driver.findElement(By.xpath("//select[@id='fcf']"));
	 	    selectdropdown(viewdropdown,"Pradeeepa","viewdropdown");
	 	    
	 	    WebElement edit=driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]"));
	 	    edit.click();
	 	    
	 	    WebElement viewnewname=driver.findElement(By.xpath("//input[@id='fname']"));
	 	    enterText(viewnewname,"PradeeepaNew","viewnewname");
	 	    
	 	    WebElement filterfield=driver.findElement(By.xpath("//select[@id='fcol1']"));
	 	    selectdropdown(filterfield,"Account Name","FilterField");
	 	    
	 	    WebElement operator=driver.findElement(By.xpath("//select[@id='fop1']"));
	 	    selectdropdown(operator,"contains","Operator");

	 	    WebElement value=driver.findElement(By.xpath("//input[@id='fval1']"));
	 	    enterText(value,"a","value");
	 	    
	 	    WebElement selectfield=driver.findElement(By.xpath("//select[@id='colselector_select_1']//option[contains(text(),'Last Activity')]"));
	 	    
	 	    clickButton(selectfield,"selectfield");
	 	    
	 	    WebElement rightarrow=driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
	 	    clickButton(rightarrow,"rightarrow");
	 	    
	 	    Thread.sleep(5000);
	 	    WebElement savebutton=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
	 	    clickButton(savebutton,"savebutton");
	 	    
	 	    driver.quit();
	   }
	   @Test(priority=11)
	    public static void MergeAccountsSFDC() throws InterruptedException{
	 	   launchURL();
	 		  login();
	 		CreateTestScriptReport("MergeAccountsSFDC");
	     WebElement Accounts=driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
	 	    mousehover(driver, Accounts, "Accounts");
	 	    
	 	    Thread.sleep(2000);
	 	    WebElement mergeacc=driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
	 	    clickButton(mergeacc, "MergeAcc");
	 	   
	 	    WebElement searchbox=driver.findElement(By.xpath("//input[@id='srch']"));
	 	    enterText(searchbox,"Pradeepa","searchbox");
	 	    
	 	    WebElement searchbutton=driver.findElement(By.xpath("//input[@name='srchbutton']"));
	 	    clickButton(searchbutton, "SearchButton");
	 	    
	 	    WebElement checkboxtomergeacc=driver.findElement(By.xpath("//input[@id='cid0']"));
	 	    SelectCheckBox(checkboxtomergeacc);
	 	    
	 	    WebElement nextbutton=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='goNext']"));
	 	    clickButton(nextbutton, "NextButton");
	 	    
	 	    Thread.sleep(2000);
	 	    WebElement merge=driver.findElement(By.xpath("//div[@class='pbTopButtons']//input[@name='save']"));
	 	    clickButton(merge, "Merge");
	 	    driver.quit();
	    }
	   
	   @Test(priority=12)
	   public static void createaccreport() throws InterruptedException{
	 	  launchURL();
	 	  login();
	 	CreateTestScriptReport("createaccreport");
	     WebElement Accounts=driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
	     mousehover(driver, Accounts, "Accounts");
	 	    
	 	    WebElement lastactivity=driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
	 	    clickButton(lastactivity, "LastActivity");	    
	 	    
	 	    driver.quit();
	   }
	   
	   @Test(priority=13)
	   public static void createoptyTC1() throws InterruptedException{
		   launchURL();
			  login();
			CreateTestScriptReport("createoptyTC1");
		   
		WebElement opportunities=driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		clickButton(opportunities, "OPPortunities");
		    
		    WebElement opportunitydropdown=driver.findElement(By.xpath("//select[@id='fcf']"));
		    opportunitydropdown.isDisplayed();
		    
		    System.out.println("The Opportunities dropdown is present");
		    
		    driver.quit();
	   }
	  @Test(priority=14)
	   public static void createoptyTC2() throws InterruptedException{
		   launchURL();
			  login();
			CreateTestScriptReport("createoptyTC2");
	      WebElement opportunities=driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		  clickButton(opportunities, "OPPortunities");
		    
		    WebElement newbutton=driver.findElement(By.xpath("//input[@name='new']"));
		    clickButton(newbutton, "NewButton");
		    
		    WebElement oppname=driver.findElement(By.xpath("//input[@id='opp3']"));
		    enterText(oppname,"Testing","OppName");
		    
		    WebElement Accountname=driver.findElement(By.xpath("//input[@id='opp4']"));
		    enterText(Accountname,"Testing","AccountName");
		    
		    WebElement Date=driver.findElement(By.xpath("//input[@id='opp9']"));
	    mousehover(driver, Date, "Date");
		    
		    WebElement today=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[3]"));
	 	clickButton(today, "TODAY");
		    Thread.sleep(5000);
		    
		    WebElement stage=driver.findElement(By.xpath("//select[@id='opp11']"));
		    selectdropdown(stage,"Meeting Scheduled", "stage");
		    
		    WebElement Leadsource=driver.findElement(By.xpath("//select[@id='opp6']"));
		    selectdropdown(Leadsource,"Other", "Leadsource");
		    
		    WebElement savebutton=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
		    clickButton(savebutton, "SaveButton");
	   }
	  @Test(priority=15)
	   public static void createoptyTC3() throws InterruptedException{
		   launchURL();
			  login();
			CreateTestScriptReport("createoptyTC3");
	   WebElement opportunities=driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
	   clickButton(opportunities, "OPPortunities");
	    
	    WebElement oppPipeline=driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
	    clickButton(oppPipeline, "OppPipeline");
	    
	    driver.quit();
	  }
	  @Test(priority=16)
	   public static void createoptyTC4() throws InterruptedException{
		   launchURL();
			  login();
			CreateTestScriptReport("createoptyTC4");
	    WebElement opportunities=driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
	    clickButton(opportunities, "OPPortunities");
		    
		    WebElement StuckOpportunities=driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		    clickButton(StuckOpportunities, "STUCKOpportunities");
		    
		    driver.quit();
	   }
	  @Test(priority=17)
	   public static void createoptyTC5() throws InterruptedException{
		   launchURL();
			  login();
			CreateTestScriptReport("createoptyTC5");
	    WebElement opportunities=driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		    opportunities.click();
		    
		    WebElement Quarterlysummary=driver.findElement(By.xpath("//select[@id='quarter_q']"));
		    selectdropdown(Quarterlysummary,"Current and Next FQ","Quarterlysummary");

		    Thread.sleep(3000);
		    WebElement Include=driver.findElement(By.xpath("//select[@id='open']"));
		    selectdropdown(Include,"All Opportunities","Include");
		    
		    WebElement RunReports=driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']"));
		    clickButton(RunReports, "RunReports");
		    driver.quit();
	   }
	  
	  
	  
	  
	  
	  
	  
	  
}
   
