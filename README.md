Coverage: 89.2%
# Practical Project: Hobby Web Application

This project aimed at creating a Spring Boot web application for creating and managing Burger Monsters. The front-end was built using HTML and CSS setting up the API calls via JavaScript to get the data from my database, hosted on a locally on MySQL Workbench, which was connected by the back-end, designed using the Java Spring framework. SonarQube was used to improve the code base quality via static analysis and Selenium, Mockito and Junit to handle the testing.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project.

### Prerequisites

#### List of required programs
* [Git Bash](https://git-scm.com/downloads)
* [Java](https://www.oracle.com/uk/java/technologies/javase-jdk11-downloads.html)
* [MySQL Workbench](https://www.mysql.com/downloads/)

#### Additional programs for development and testing purposes
* [Eclipse IDE](https://www.eclipse.org/downloads/)
* [Visual Studio Code](https://code.visualstudio.com/)
* [Postman](https://www.postman.com/downloads/)
* [SonarQube](https://www.sonarqube.org/downloads/)

#### What to do if you don't have Git Bash
```
Step 1. Navigate to the link above and download the relevant option for your operating system.
Step 2. Once downloaded navigate to the files location on your local machine, double-click and press "Run".
Step 3. Once you are running the installer, after reading the license press "Next".
Step 4. Select the destination location and press "Next".
Step 5. Leave the selected components as they are and press "Next".
Step 6. Leave the default start menu folder as it is and press "Next".
Step 7. Change the default editor to your personal preference and press "Next".
Step 8. Leave the PATH environment as "Use Git from Git Bash only" and press "Next".
Step 9. Leave the backend as OpenSSL and press "Next".
Step 10. Leave the line ending conversations as default and press "Next".
Step 11. Leave the Terminal Emulator as default and press "Next".
Step 12. Leave the extra options as default and press "Next".
Step 13. Do not add experimental options and press "Install".
Step 14. Wait for the install to end and press "Finish".
```

#### What to do if you don't have Java
```
Step 1. Navigate to the link above and download the relevant option for your operating system.
Step 2. Navigate to the download location and double-click to run the executeable and click every "Next" followed by "Close".
Step 3. Open the Start Menu and type 'environment' and click "Edit the system environment variables"
Step 4. Click "Environmental Variables..." in the bottom right of the Advanced tab.
Step 5. Click "New" under the System variables panel and click "OK" after entering:
	Variable name: JAVA_HOME
	Variable value: C:\Program Files\Java\jdk-11.0.10
Step 6. Select the Path variable under the User variables panel. Click "Edit" --> "New" and add:
	%JAVA_HOME%\bin
Step 7. Click "OK" until all windows are closed.
Step 8. Open a command prompt and type:
	java -version
	This should display the java version if you've installed it correctly.
```

#### What to do if you don't have MySQL Workbench
```
Step 1. Navigate to the link above and download the installer
Step 2. Navigate to the download location and double-click to run the executeable and select the "Custom".
Step 3. Select MySQL Server 8.0 and MySQL Workbench.
Step 4. Press "Next" and use the default location (C:\Program Files\MySQL\MySQL Server 8.0).
Step 5. Open a command prompt and enter the following commands:
         cd C:\Program Files\MySQL\MySQL Server 8.0\bin
         mysqld --console --initialize
	*NOTE* If a firewall warning pops up onto the screen, tick both Private and Public network and then press "Allow Access".     
	*NOTE* Take note of the temporary user password generated.
Step 6. Check the server initialised correctly by running the command:
         mysqld --console
Step 7. Minimise the window, open a new command prompt and reset the super-user password to 'root' by entering the following commands:
	cd C:\Program Files\MySQL\MySQL Server 8.0\bin
	mysql -u root -p
	*this is where you will be prompted for the temporary password you noted down earlier*
	ALTER USER 'root'@'localhost' IDENTIFIED BY 'root';
Step 8. Close all command prompts.
Step 9. Run a new command prompt as administrator and enter the following commands:
	cd C:\Program Files\MySQL\MySQL Server 8.0\bin
	mysqld --install
Step 10. Locate MySQL within Windows Services and click "Start".
Step 11. Open the Start Menu and type 'env' and click "Edit the system environment variables"
Step 12. Click "Environmental Variables..." in the bottom right of the Advanced tab.
Step 13. Click "New" under the System variables panel and click "OK" after entering:
	Variable name: MYSQL_HOME
	Variable value: C:\Program Files\MySQL Server 8.0
Step 14. Scroll to find the Path variable. Click "Edit" --> "New" and add:
	%MYSQL_HOME%\bin
Step 15. Click "OK" until all windows are closed.
```

#### What to do if you don't have Eclipse IDE
```
Step 1. Navigate to the link above --> "Download packages" and download the relevant option for your operating system.
Step 2. Navigate to the download location and double-click to run the executeable and click "Eclipse IDE for Java Developers" followed by "Install".
	*NOTE* you must have a jdk installed alraedy before installing Eclipse or it will not install correctly.
```

#### What to do if you don't have Visual Studio Code
```
Step 1. Navigate to the link above --> "Download".
Step 2. Navigate to the download location and double-click to run the executeable.
Step 3. Accept the agreement and click "Next".
Step 4. Leave defaults and click "Next".
Step 5. Click install.
```

#### What to do if you don't have Postman
```
Step 1. Navigate to the link above --> "Download the app" and download the relevant option for your operating system.
Step 2. Navigate to the download location and double-click to run the executeable.
```

#### What to do if you don't have SonarQube
```
Step 1. Navigate to the link above --> Community --> "Download for free".
	*NOTE* the download should start automatically.
Step 2. Unzip the folder.
Step 3. Navigate to bin\windows-x86-64 --> StartSonar.bat and double click the file.
	*NOTE* cmd should popup if done correctly.
Step 4. Navigate to the location of the clone repository --> Backend --> BM
Step 5. Right click in the folder --> Git Bash here.
Step 6. Once in the Git Bash enter the following command:
	mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=admin -Dsonar.password=admin
Step 7. Open a web browser and go to http://localhost:9000
	*NOTE* if you are presented with "Log In to SonarQube" it has worked correctly.
```

### Installing

A step by step guide to get a development environment up and running.

```
Step 1. Clone the repository to your local machine.
Step 2. Launch Eclipse.
	*If you already are using Eclipse and have created a project previously*
Step 3a. Navigate File --> import --> Mavern --> Existing Mavern project --> Browse
	*If you are running Eclipse for the first time*
Step 3b. Import existing projects --> Mavern --> Existing Mavern project --> Browse
Step 4. Navigate to location of project, click folder and press "Select Folder".
	*NOTE* You will know it has been successfully added when a pom.xml appears in the projects box.
Step 5. Press "Finish"
	*NOTE* The project BM should now be visible in the Project Explorer
	*NOTE* Repeat for BM testing
```

## Running the tests

To run the automated unit and integration tests for the system

```
Step 1. Follow the installing steps above to ensure the project is within Eclipse.
Step 2. Right-click the project `BM` in the project manager and select "Run as" --> "JUnit Test".
Step 3. The automated tests will then be carried out.
```

To run the automated user-acceptance tests for the system

```
Step 1. Follow the installing steps above to ensure the project is within Eclipse.
Step 2. Open the file `application properties` located in src/main/resources in project `BM`.
Step 3. Change "prod" to "deve".
Step 4. Right-click the project `BM` in the project manager and select "Run as" --> "Spring Boot App".
Step 5. Right-click the project `BMTesting` in the project manager and select "Run as" --> "JUnit Test".
```

### Unit Tests 

A unit is the smallest piece of code that can be isolated logically within the system.

Unit testing is the automated method in which each unit is tested in turn.

An example of a unit test can be seen below:

```java
void testDelete() {
	final long ID = 1L;

	Mockito.when(repo.existsById(ID)).thenReturn(false);

	assertEquals(true, this.service.remove(ID));

	Mockito.verify(repo, Mockito.times(1)).deleteById(ID);
	Mockito.verify(repo, Mockito.times(1)).existsById(ID);
}
```

### Integration Tests 
Integration testing is when individual units are integrated or combined and tested as one.

An example of a integration test can be seen below:

```java
void testCreate() throws Exception {
	this.mockMVC
		.perform(post("/create").contentType(MediaType.APPLICATION_JSON)
			.content(this.mapper.writeValueAsString(new BM("Jim", "Bun", "Tomato", "Yes"))))
		.andExpect(status().isCreated())
		.andExpect(content().json(this.mapper.writeValueAsString(new BM(2L, "Jim", "Bun", "Tomato", "Yes"))));
}
```

### User-Acceptance Tests 
A user-acceptance test is: ["A process of verifying that a solution works for the user"](https://en.m.wikipedia.org/wiki/Acceptance_testing#User_acceptance_testing)

An example of a user-acceptance test can be seen below:

```java
public void testClearDelete(){
	driver.get(URL + "/Pages/delete.html");
	DeletePage bm = PageFactory.initElements(driver, DeletePage.class);
	bm.deleteBM(3L);
	bm.getClearBtn().click();
	WebElement createdText = this.driver.findElement(By.id("delete"));
	String check = createdText.getText();
	assertEquals("",check);
}
```

## Deployment

How to deploy
```
Step 1. Clone a copy of the repository to your local machine.
Step 2. Follow the steps above from [Installing](### Installing)
Step 3. Navigate from BM--> src/main/resources --> application-prod.properties and follow the instructions within the file
Step 4. Navigate to the location of the BM-0.0.1-SNAPSHOT.jar file in clone repository folder.
Step 5. Right-click in the folder and select "Git Bash Here".
Step 6. Once in the Git Bash terminal enter the following command:
	java -jar BM-0.0.1-SNAPSHOT.jar
Step 7. The application should be initialised when you see Spring in ASCII art appear on screen	
```

## Built With

* [Html](https://en.wikipedia.org/wiki/HTML), [Css](https://en.wikipedia.org/wiki/CSS) & [JavaScript](https://www.javascript.com/) - Front-End Web Technologies
* [Java](https://www.java.com/en/) - Back-End Programming Language
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring](https://spring.io/) - API Development Platform
* [SonarQube](https://www.sonarqube.org/) - Static Analysis
* [MySQL](https://www.mysql.com/) - Database Management
* [JUnit](https://junit.org/junit4/) - Unit Testing
* [Mockito](https://site.mockito.org/) - Unit Testing
* [Selenium](https://www.selenium.dev/) - User-Acceptancce Testing

## Versioning

* [Git](http://github.com/) was used for versioning.

## Authors

* **Jordan Lewis** - *Project Author*

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* I would like to thank Savannah Vaithilingham, Aswene Sivaraj and Vinesh Ghela for all their help they've given me throughout this project
* I would also like to apologise to them for finding bugs that made them say; "That's not meant to happen".
