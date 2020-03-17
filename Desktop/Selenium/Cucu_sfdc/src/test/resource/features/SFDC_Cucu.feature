Feature:  Launch Salesforce login feature

Scenario: Login:Verify login with valid username and password
Given Salesforce login page is launched
When Enter the username in the username field
When Enter the passowrd in the password field
Then Click on login button to login
And The home page will be launched
And Close the browser
