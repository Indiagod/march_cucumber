Feature:  Launch Salesforce login feature

@RegressionTest
Scenario: Login:Verify login with valid username and password
Given Salesforce login page is launched
When Enter the username in the username field
When Enter the passowrd in the password field
Then Click on login button to login
And The home page will be launched
And Close the browser


Scenario: User menu dropdown 
Given Salesforce login page is launched
When Enter the username in the username field
When Enter the passowrd in the password field
Then Click on login button to login
When check for usermenu and it dropdown
When Click on usermenu in the usermenu dropdown
And Close the browser

@RegressionTest
Scenario: My Setting 
Given Salesforce login page is launched
When Enter the username in the username field
When Enter the passowrd in the password field
Then Click on login button to login
When Click on usermenu in the usermenu dropdown
Then Select MYSETTINGS from the dropdown
And Click on Personal 
Then Click on the login history 
And Click on the download login history
Then Click on display and layout 
And Select the customize my tabs from the link
Then From the custom app drop down select the Salesforce Chatter
Then Select the reports from the available tabs list
And click on Add to reports to the selected tabs list
When Click on the email link
Then Select the email setting link under that
And Enter the Email Name 
And Enter the Email Address 
And Click on automatic BCC radio button 
Then Click on Save button
And Click on Calendar and remainder
Then Click on the Activity remainder link 
And Click on Open a Test Remainder to view preview
And Close the browser

