# openapi-generator-spring-boot-example
This is an example Spring Boot 3 application that uses the openapi-generator-maven-plugin. It is bundled with an H2 database, and it's set to create models and APIs via the generation tool. It also incorporates the build-helper-maven-plugin so that the generated classes can then be discovered and used by your IDE. It comes with a simple implementation for the `/users` API.  
## How to run
To run the project you must use  
```
mvn spring-boot:run
```
You can then go to your browser on
```
localhost:8080/users
```
to see the results of the API call.
