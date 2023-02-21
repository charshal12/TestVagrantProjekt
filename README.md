# TestVagrantProjekt
**_Approach used while creating "TestVagrantProjekt" project._**
Answer: The Framework is created with: 
Language: **Java**,
Testing Framework: **Testng**,
Build tool: **Maven**,
Approach: **Test Driven and Data Driven** Testing,
IDE: **IntelliJ**.

1. Intially have placed the JSON file in Project and then i have created "Team.java" and "Player.java" classes.
2. Post that i have created a JacksonObjectMapper.java  class to map the information from the input Json file to the class Team.
3. TestNG is to be used in order to create the testcases, so i have created a "TeamConfigTest.java" as a Testclass. 
4. Above class has both the test methods "verifyOnlyFourForeignPlayersInTeam" and "verifyMinimumOneWicketKeeperInTeam" in which i have tried to answer the problems mentioned in the assignment.
5. Mentioning the Project structure with the snapshot below:


![image](https://user-images.githubusercontent.com/9412613/220277856-4d9d28e7-dc2f-4ac3-a418-a4eed254cc86.png)

6. All the dependencies are available in "pom.xml"
7. "testng.xml" file has all the information related to which Testcases we need to execute.
8. Also, in order to see the reports output directory is to be configured in "Edit Run Configuration" settings of the project.
9. You would be able to see the Default Report in 
![image](https://user-images.githubusercontent.com/9412613/220282821-a0daf2ab-f8d5-4e12-ba0b-5c40f128ecd4.png)
11. Emailable Reports can be seen in 
![image](https://user-images.githubusercontent.com/9412613/220283027-214d26b5-c353-496b-82db-6db55987d2ab.png)



_**Steps to execute the project:**_
The project can be executed primarily in 2 ways:
1. Run from IDE through maven
Pre-req: 
  Clone the project in IDE
  Clean Install the dependencies
  ![image](https://user-images.githubusercontent.com/9412613/220279369-40790bce-91ef-4b83-85b0-80c5ace7ba83.png)

  Execute the Test from maven panel 

  ![image](https://user-images.githubusercontent.com/9412613/220279528-8f1dbeb8-9516-4a09-9c35-cc5f0c10f155.png)

2. Execute the "testng.xml" file directly
Pre-req: 
  Same as above
Right-click and run testng.xml file available in Project. 
![image](https://user-images.githubusercontent.com/9412613/220280113-0e5601f7-0917-43ff-978f-24add4ee5b0b.png)


3. Execute from commandline, maven surefire plugin is used for the same in pom.xml.
Pre-req:
    Open command prompt
    Go on the path where project downloaded and we have pom.xml.
Command to execute : mvn clean test -DsuiteXmlFile=testng.xml  
![image](https://user-images.githubusercontent.com/9412613/220281684-523f13a0-cca2-43a1-b8f3-2af92dcbb251.png)

    
