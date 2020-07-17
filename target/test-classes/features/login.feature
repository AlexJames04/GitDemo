Feature: Application Login

Scenario Outline: Home Page default login

Given User is on Landing page "https://www.google.co.in"
When User login into the application with valid <Username>
And User has to click on Next button
Then Enter the password <Password>
And Home page is displayed 

Examples:
|Username				|Password         |
|alejames4@gmail.com	|I'mgettingRICH11112029|
|parimala@gmail.com		|124356@1111|
|lovely21@gmail.com 	|4568254@1122|