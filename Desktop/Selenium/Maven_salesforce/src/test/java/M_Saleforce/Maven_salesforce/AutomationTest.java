package M_Saleforce.Maven_salesforce;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

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
	  
	  @Test(priority=18)
	   public static void Leads_Testcase1() throws InterruptedException{
		   launchURL();
			  login();
			CreateTestScriptReport("Leads_Testcase1");
		 WebElement Leads=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		 clickButton(Leads, "Leads");
		    
		    WebElement Leadsdropdown=driver.findElement(By.xpath("//select[@id='fcf']"));
		    clickButton(Leadsdropdown, "Leadsdropdown");
		    
		    driver.quit();
		   
	   }
	  @Test(priority=19)
	   public static void Leads_Testcase2() throws InterruptedException{
		   launchURL();
			  login();
			CreateTestScriptReport("Leads_Testcase2");
		WebElement Leads=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		clickButton(Leads, "LEADS");
		    
		    WebElement Leaddropdown=driver.findElement(By.xpath("//select[@id='fcf']"));
		    selectdropdown(Leaddropdown,"Today's Leads","Leaddropdown");
		    
		    WebElement usernamedropdown=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		    mousehover(driver, usernamedropdown, "UserNamedropdown");
		    
		    WebElement Logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		    clickButton(Logout, "LogOut");
		    
		  /*  Thread.sleep(5000);
		    WebElement Saveduser=driver.findElement(By.xpath("//a[@id='hint_back_chooser']"));
		    clickButton(Saveduser, "SavedUser");
		    
		    WebElement edit=driver.findElement(By.xpath("//a[@id='edit']"));
		    clickButton(edit, "EDIT");
		    
		    WebElement clear=driver.findElement(By.xpath("//img[@class='hintclearicon']"));
		    clickButton(clear, "Clear");
		    
		    WebElement save1change=driver.findElement(By.xpath("//button[@id='hint_save_edit']"));
		    clickButton(save1change, "Save1Change");
		    */
		    
		    Thread.sleep(5000);
		    WebElement username1=driver.findElement(By.xpath("//input[@id='username']"));
		    clickButton(username1, "UserName1");
		    enterText(username1,"pradeepa.srini-gge5@force.com","UserName1");
		   
		    WebElement password1=driver.findElement(By.xpath("//input[@id='password']"));
		    enterText(password1,"Bujjupappu10","PassWord1");
		    
		    WebElement login1=driver.findElement(By.xpath("//input[@id='Login']"));
		    clickButton(login1, "Login1");
		    
		    Thread.sleep(5000);
		    WebElement Leads1=driver.findElement(By.linkText("Leads"));
		    clickButton(Leads1, "LEADS1");
		    
		    WebElement go=driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
		    clickButton(go, "GO");
	   }
	  @Test(priority=20)
	   public static void Leads_Testcase3() throws InterruptedException{
		   launchURL();
			  login();
			CreateTestScriptReport("Leads_Testcase3");
		WebElement Leads=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		clickButton(Leads, "LEADS");
		    
		    WebElement newbutton=driver.findElement(By.xpath("//input[@name='new']"));
		    clickButton(newbutton, "NewButton");
		    
		    WebElement leadspassword=driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
		    enterText(leadspassword,"ABCD","LeadsPassword");
		   
		    WebElement accountname=driver.findElement(By.xpath("//input[@id='lea3']"));
		    enterText(accountname,"ABCD","AccountName");
		    
		    WebElement savebutton=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
		    clickButton(savebutton, "SaveButton");
	   }
	  
	  @Test(priority=21)
	  public static void Contacts_Testcase1() throws InterruptedException{
		  launchURL();
		  login();
		CreateTestScriptReport("Contacts_Testcase1");
		Thread.sleep(5000); 
		    WebElement Contacts=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		    clickcontacts(Contacts,"ContactsTab");
		    
		    WebElement newbutton=driver.findElement(By.xpath("//input[@name='new']"));
		    clickButton(newbutton,"NewButton");
		    
		    WebElement Lastname=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		    enterText(Lastname,"Srini","LastName");
		    
		    WebElement accountname=driver.findElement(By.xpath("//input[@id='con4']"));
		    enterText(accountname,"Pradeepa","AccountName");
		    
		    WebElement savebutton=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
		    clickButton(savebutton,"SaveButton");
		    
		    driver.quit();

		     }
		@Test(priority=22)
	  public static void Contacts_Testcase2() throws InterruptedException{
		  launchURL();
		  login();
		CreateTestScriptReport("Contacts_Testcase2");
		Thread.sleep(5000);
		   
		    WebElement Contacts=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		  clickcontacts(Contacts,"ContactsTab");
		    
		    WebElement createnewview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		    clickButton(createnewview,"CreateNewView");
		    
		    WebElement viewname=driver.findElement(By.xpath("//input[@id='fname']"));
		    enterText(viewname,"Vivaan","ViewName");
		    
		    WebElement viewUniquename=driver.findElement(By.xpath("//input[@id='devname']"));
		    enterText(viewUniquename,"VivaanPradeepa","ViewUniqueName");
		    
		    WebElement savebutton=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
		    clickButton(savebutton,"SaveButton");
		    
		    driver.quit();
	  }
		@Test(priority=23)
	  public static void Contacts_Testcase3() throws InterruptedException {
		  launchURL();
		  login();
		CreateTestScriptReport("Contacts_Testcase3");
		WebElement Contacts=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		clickcontacts(Contacts,"ContactsTab");
		    
		    Thread.sleep(3000);
		    WebElement Recentcreated=driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
		    selectdropdown(Recentcreated,"Recently Created", "RecentCreated");
		    
		    driver.quit();
	  }
		@Test(priority=24)
	  public static void Contacts_Testcase4() throws InterruptedException {
		  launchURL();
		  login();
		CreateTestScriptReport("Contacts_Testcase4");
	    WebElement Contacts=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
	    clickcontacts(Contacts,"ContactsTab");
		    
		    WebElement mycontactview=driver.findElement(By.xpath("//select[@id='fcf']"));
		    selectdropdown(mycontactview,"My Contacts", "MyContactView");
		    
		    driver.quit();
	  }
		@Test(priority=25)
	  public static void Contacts_Testcase5() throws InterruptedException {
		  launchURL();
		  login();
		CreateTestScriptReport("Contacts_Testcase5");
		  WebElement Contacts=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		  clickcontacts(Contacts,"ContactsTab");
		    
		    WebElement contactname=driver.findElement(By.xpath("//select[@id='fcf']"));
		    selectdropdown(contactname,"Vivvan", "contactname");

		    driver.quit();
		  
	  }
		@Test(priority=26)
	  public static void Contacts_Testcase6() throws InterruptedException {
		  launchURL();
		  login();
		CreateTestScriptReport("Contacts_Testcase6");
		  WebElement Contacts=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		  clickcontacts(Contacts,"ContactsTab");
		    
		    WebElement createnewview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		    clickButton(createnewview,"CreateNewView");
		    
		    WebElement UniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		    enterText(UniqueName,"EFGH","UNIQUEName");
		    
		    WebElement savebutton=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
		    clickButton(savebutton,"SaveButton");
		    
		    driver.quit();
		  
	  }
		@Test(priority=27)
	  public static void Contacts_Testcase7() throws InterruptedException {
		  launchURL();
		  login();
		CreateTestScriptReport("Contacts_Testcase7");
		  WebElement Contacts=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		  clickcontacts(Contacts,"ContactsTab");
		    
		    WebElement createnewview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		    clickButton(createnewview,"CreateNewView");
		    
		    WebElement viewname=driver.findElement(By.cssSelector("#fname"));
		    enterText(viewname,"ABCD","viewname");
		    
		    WebElement UniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		    enterText(UniqueName,"EFGH","UNIQUEName");

		    WebElement cancelbutton=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='cancel']"));
		    clickButton(cancelbutton,"CancelButton");
		    driver.quit();
		    		
	  }
		@Test(priority=28)
	  public static void Contacts_Testcase8() throws InterruptedException {
		  launchURL();
		  login();
		CreateTestScriptReport("Contacts_Testcase8");
		  WebElement Contacts=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		  clickcontacts(Contacts,"ContactsTab");
		    
		    WebElement newbutton=driver.findElement(By.xpath("//input[@name='new']"));
		    clickButton(newbutton,"newbutton");
		    
		    WebElement LastName=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		    enterText(LastName,"Indian","LastNAME");
		    
		    WebElement AccountName=driver.findElement(By.xpath("//input[@id='con4']"));
		    enterText(AccountName,"Global Media","AccountNAME");
		    
		    WebElement SaveNewButton=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save_new')]"));
		    clickButton(SaveNewButton,"SaveNewBUTTON");
		    driver.quit();
		    
	  }
		
		@Test(priority=29)
		   public static void RandomScenarios_Testcase1() throws InterruptedException{
			   launchURL();
				  login();
				CreateTestScriptReport("RandomScenarios_Testcase1");
			WebElement hometab=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
			clickButton(hometab, "HomeTab");
			    
			    WebElement firstlastnamelink=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/span[1]/h1[1]/a[1]"));
			    clickButton(firstlastnamelink, "FirstLastNamelink");
			    
			    driver.quit();
		   }
		  @Test(priority=30)
		   public static void RandomScenarios_Testcase2() throws InterruptedException{
			   launchURL();
				  login();
				CreateTestScriptReport("RandomScenarios_Testcase2");
		    WebElement hometab=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
			clickButton(hometab, "HomeTab");
			    
			    WebElement firstlastnamelink=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/span[1]/h1[1]/a[1]"));
			    clickButton(firstlastnamelink, "FirstLastNamelink");
			    
			    WebElement editcontact=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
			    clickButton(editcontact, "EditContact");
			    
			    switchFrameid(driver, "contactInfoContentId");
			    
			    WebElement contact=driver.findElement(By.id("contactTab"));
			    WebElement About=driver.findElement(By.id("aboutTab"));
			    mousehover(driver, About, "AboutTab");
			
		      
			    Thread.sleep(5000);
		       WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		       lastname.clear();
		       enterText(lastname,"ABCDEF","LastName");
		       
		       WebElement saveall=driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
		       clickButton(saveall, "SaveAll");

		       driver.switchTo().defaultContent();
		   }
		  @Test(priority=31)
		   public static void RandomScenarios_Testcase3() throws InterruptedException{
			   launchURL();
				  login();
				CreateTestScriptReport("RandomScenarios_Testcase3");
		    WebElement plus=driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a"));
		    clickButton(plus, "PLUS");
			    
			    Thread.sleep(2000);
			    WebElement customizeTab=driver.findElement(By.xpath("//input[@name='customize']"));
			    clickButton(customizeTab, "CustomizeTab");
			    
			    Thread.sleep(2000);
			    WebElement removetab=driver.findElement(By.xpath("//select[@id='duel_select_1']//option[contains(text(),'Chatter')]"));
			    clickButton(removetab, "RemoveTab");
			    
			    Thread.sleep(2000);
			    WebElement remove=driver.findElement(By.xpath("//img[@class='leftArrowIcon']"));
			    clickButton(remove, "Remove");
			    
			    Thread.sleep(2000);
			    WebElement savebutton=driver.findElement(By.xpath("//input[@name='save']"));
			    clickButton(savebutton, "SaveButton");
			    
			    WebElement usermenutab=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			    mousehover(driver, usermenutab, "UserMenuTab");
			    
			    WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			    clickButton(logout, "LogOut");
			    
			    Thread.sleep(5000);
			    WebElement Saveduser=driver.findElement(By.xpath("//a[@id='hint_back_chooser']"));
			    clickButton(Saveduser, "SavedUser");
			    
			    WebElement edit=driver.findElement(By.xpath("//a[@id='edit']"));
			    clickButton(edit, "Edit");
			    
			    WebElement clear=driver.findElement(By.xpath("//img[@class='hintclearicon']"));
			    clickButton(clear, "Clear");
			    
			    WebElement save1change=driver.findElement(By.xpath("//button[@id='hint_save_edit']"));
			    clickButton(save1change, "Save1change");
			    
			    WebElement username1=driver.findElement(By.xpath("//input[@id='username']"));
			    username1.clear();
			    enterText(username1,"pradeepa.srini-gge5@force.com","Username1");
			    
			    WebElement password1=driver.findElement(By.xpath("//input[@id='password']"));
			    enterText(password1,"Bujjupappu10","Password1");
			    
			    WebElement login1=driver.findElement(By.xpath("//input[@id='Login']"));
			    clickButton(login1, "Login1");
		   }
		  @Test(priority=32) 
		   public static void RandomScenarios_Testcase4() throws InterruptedException{
			   launchURL();
				  login();
				CreateTestScriptReport("RandomScenarios_Testcase4");
		    Thread.sleep(2000);
			    WebElement hometab=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
			    clickButton(hometab, "Hometab");
			    
			    Thread.sleep(2000);
			    WebElement currentdatelink=driver.findElement(By.cssSelector("body.hasMotif.homeTab.homepage.ext-webkit.ext-chrome.ext-mac.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(3) table.outer td.oRight div.bPageTitle:nth-child(2) div.ptBody.secondaryPalette div.greeting:nth-child(2) div.content span.pageDescription > a:nth-child(1)"));
			    clickButton(currentdatelink, "Currentdatelink");
			    
			    Thread.sleep(2000);
			    WebElement EightPMLink=driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
			    clickButton(EightPMLink, "EightPMLink");
			    
			    Thread.sleep(2000);
			    WebElement SubjectcombLink=driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
			    clickButton(SubjectcombLink, "SubjectcombLink");
			    
			    String MainWindow=driver.getWindowHandle();		
				
		       // To handle all new opened window.				
		           Set<String> s1=driver.getWindowHandles();		
		       Iterator<String> i1=s1.iterator();		
		       		
		       while(i1.hasNext())			
		       {		
		           String ChildWindow=i1.next();		
		           		
		           if(!MainWindow.equalsIgnoreCase(ChildWindow))			
		           {    		
		                
		                   // Switching to Child window
		                   driver.switchTo().window(ChildWindow);	                                                                                                           
		                   driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();	
		           }		
		       }		
		       // Switching to Parent window i.e Main Window.
		           driver.switchTo().window(MainWindow);
			  
		        WebElement EndTime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		        mousehover(driver, EndTime, "EndTime");
		        
		        WebElement selectEndTime=driver.findElement(By.xpath("//div[@id='timePickerItem_42']"));
		        clickButton(selectEndTime, "selectEndTime");
		        
		        Thread.sleep(3000);
		        WebElement savebutton=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
		        clickButton(savebutton, "savebutton");
		        
		        driver.quit();
		   }
		  @Test(priority=33)
		   public static void RandomScenarios_Testcase5() throws InterruptedException{
			   launchURL();
				  login();
				CreateTestScriptReport("RandomScenarios_Testcase5");
			WebElement hometab=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
			clickButton(hometab, "HomeTab");
			    
			    Thread.sleep(2000);
			    WebElement currentdatelink=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/span[2]/a[1]"));
			    clickButton(currentdatelink, "Currentdatelink");
			    
			    Thread.sleep(2000);
			    WebElement EightPMLink=driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
			    clickButton(EightPMLink, "EightPMLink");
			    
			    Thread.sleep(2000);
			    WebElement SubjectcombLink=driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
			    clickButton(SubjectcombLink, "SubjectcombLink");
			 
			    String MainWindow=driver.getWindowHandle();		
				
		       // To handle all new opened window.				
		           Set<String> s1=driver.getWindowHandles();		
		       Iterator<String> i1=s1.iterator();		
		       		
		       while(i1.hasNext())			
		       {		
		           String ChildWindow=i1.next();		
		           		
		           if(!MainWindow.equalsIgnoreCase(ChildWindow))			
		           {    		
		                
		                   // Switching to Child window
		                   driver.switchTo().window(ChildWindow);	                                                                                                           
		                   driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();	
		           }		
		       }		
		       // Switching to Parent window i.e Main Window.
		           driver.switchTo().window(MainWindow);
			  
		        WebElement EndTime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		        mousehover(driver, EndTime, "EndTime");
		        
		        WebElement selectEndTime=driver.findElement(By.xpath("//div[@id='timePickerItem_38']"));
		        clickButton(selectEndTime, "SelectEndTime");
		       
		        Thread.sleep(2000);
		        WebElement Recurrence=driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
		        clickButton(Recurrence, "ReCurrence");
		        
		        Thread.sleep(2000);
		        WebElement FrequencyWeekly=driver.findElement(By.xpath("//input[@id='rectypeftw']"));
		        selectRadioButton(FrequencyWeekly,"FrequencyWeekly");
		        
		        Thread.sleep(2000);
		        WebElement RecurrenceEndTime=driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		        mousehover(driver, RecurrenceEndTime, "RecurrenceEndTime");
			    
			     WebElement dateaftertwoweek=driver.findElement(By.xpath("//td[contains(text(),'16')]"));
			     clickButton(dateaftertwoweek, "Dateaftertwoweek");
			   
			     Thread.sleep(3000);
		        WebElement SaveButton=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"));
		        clickButton(SaveButton, "SaveButton");
		        
		        Thread.sleep(2000);
		        WebElement monthview=driver.findElement(By.xpath("//img[@class='monthViewIcon']"));
		        clickButton(monthview, "monthview");
		        
		        driver.quit();
			   
			   
		   }	
	  
	  
	  
	  
	  
	  
	  
}
   
