Feature: Registration process 
@case
Scenario: Successfull Registration in TestMe Application
Given User should be on the login page
When User should enter the details and click register button
|Username|firstname|lastName|password|password_confirmation|Gender|E_mail|mobilenumber|DOB|Address|security_ques|Answer|
|Anushka|Anushka|sharma|anush1997|anush1997|Female|anush97@gmail.com|1234567890|21/07/1997|shakthi nagar|411011|red|

Then Successfull user registration