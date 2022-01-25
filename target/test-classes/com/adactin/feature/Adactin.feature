Feature: Testing Adactin Application End to End Process

Scenario: Verify that user is able to login the application 

Given     user launch the application
When      user enters the valid username in the username field 
And       user enters the valid password in the password field
And       user is able to click the login button     
Then      user verify the homepage lands on to search hotel	

Scenario: Verify that user is able to passes the values in the search hotel page

When        user select the valid location values in the location field
And         user select the valid hotels values in the hotels field
And         user select the valid room type values in the room type field
And         user select the valid number of rooms vlaues in the No.Of Rooms field
And         user enter the valid check in date vlaues in the check in date field
And         user enter the valid check out data values in the check out data field 
And         user select the valid adults room values in the adults per room field
And         user select the valid children room values in the children per room field
And         user is able to click the search button
Then        user verify the search hotel lands on to search page

Scenario: Verify that user is able to search the next page to the book hotel  

When        user is able to click  the select button in the select option
And         user is able to click the  continue button  
Then        user verify the search hotel lands on to book a hotel

Scenario: Verify that user is able to passes the value in the book a hotel

When       user enter the valid first name in the first name  field
And        user enter the valid last name in the last name field
And        user enter the valid billing address in the billing address field
And        user enter the valid credit card no values in the credit card no field
And        user select the valid credit card type in the credit card field
And        user select the valid expriy date values in the expriy data field
And        user enter the valid cvv number in the cvv number field
And        user is able to click the book now button
Then       user verify the book a hotel land on to booking confirmation page

Scenario:  verify that user is able to move the booking confirmation page
When       user is able to click the logout button
Then       user is verify that booking confirmation page lands on to homepage
