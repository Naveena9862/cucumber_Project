Feature: login functionality in TestMeApp
Scenario Outline: login
Given user is on the login page
When user enters the cresdentials "<username>" and "<password>"
Then user logins successfully
Examples:
|username|password|
|Lalitha|Password123|