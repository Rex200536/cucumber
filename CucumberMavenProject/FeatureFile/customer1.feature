Feature: To test Login , Registration , Dashboard of the App

Scenario: To test Login Functionality of AUT 

Given the user launches the particular url "https://opensource-demo.orangehrmlive.com/"
#When the user given username and password "Admin" "admin123"
When the user given username and password 
#|Admin|admin123|
|username|Admin|
|password|admin123|
And the user clicks login button 
Then the user verifies the Title and url of the application 