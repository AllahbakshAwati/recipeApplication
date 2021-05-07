# recipeApplication
curd operation on recipe information with frond end as react and back end as sprint boot
Application: Recipe Information

Technologies for designing front end is React:

React is a one of the most popular front end view frameworks

Components
JSX
State
Props
In combination with other libraries, React helps in doing a wide variety of front end features
Forms Handling
Routing System
HTTP Requests

Spring Boot is an awesome framework to build RESTful API and Microservices.

In this Application, i combined these awesome frameworks to create full stack web application.


Required Tools:
Node v14 for npm
Visual Studio Code - Latest Version
JDK1.8
STS
Maven
For Data base i used embeded H2 data base "http://localhost:8080/h2-console/"
db crediantial:
UserName: sa
Password: password

Running Information:
React Project:
Step 1: Import react project in VS code.
step 3: install node modules
Step 4: Open terminal and give command "npm start"
Step 5: once started you can access it with URL:http://localhost:3000/

Spring Project:
Step 1: Copy the project to a location
Step 2: open command line and do cd till you reach the folder where your pom.xml is located
Step 3: run the command "mvn clean install"
Step 4: then do cd till for target directory
Step 5: run command java -jar RecipesApplication-0.0.1-SNAPSHOT.jar --spring.config.location=../application.propert
