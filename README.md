# rg-bpdts-api

This API is to call the API https://bpdts-test-app.herokuapp.com/instructions which returns a list of people who are listed as either living in London, or whose current coordinates are within 50 miles of London.
The server port details and all the other properties have been specified in application.properties file. This is a standalone Spring Boot application. A REST call is made to the website and based on whether the location is London or the coordinates of the location lies within 50 miles of London, the JSON Response is returned.