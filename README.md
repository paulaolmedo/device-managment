# device-managment
Spring Boot application integrated with Google Datastore running over Google App Engine 

## Steps to run:

 1 - Create new Google Cloud Project. This can be achieved with the GC UI or with "gcloud init". Then create a Datastore instance, preferably choose "southamerica-east1-c" as region.
 
 2 - Clone this repo to the GC project. 
 
 3 - Go to the root folder (the one with the pom.xml file), and run: 
        gcloud app create
        gcloud app deploy
  
 4 - The API is ready to go. I tested it with postman, but it can be done with a 'curl' inside the GC Shell. 
 
 
 @TODO: validations, better http responses, security
