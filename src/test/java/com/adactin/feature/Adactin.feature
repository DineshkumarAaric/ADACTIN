Feature: Login functionality for adactin application


Background:
Given the user is loggedin the application
Then goes to the landing page
	
	
@login
Scenario Outline:Successful login into the adactin application with valid credential
When user enter application url 
And user enter "<username>" as username
And user enter "<password>" as password 
Then user verify the username in the homepage

Examples:
|username|password|
|kaviyarkmk|test@1234|
|ragu1234|ragu1234|
|Mahamilky|hari.9500|

@Hotelsearch
Scenario: Sucessfull SearchHotel into the adactin application
When user enter location 
And user enter hotels
And user enter room
And user enter children
Then user verify the username in the searchpage

@booking
Scenario: Sucessfull SearchHotel into the adactin application
When user click continue
Then user click radio button

@payment
Scenario: Sucessfull SearchHotel into the adactin application
When user enter firstname
And user enter lastname
And user enter address
And user enter cardnumber
And user enter carddetails
And user enter expirymonth
And user enter expiryyear
And user enter ccv
Then user click booking button
