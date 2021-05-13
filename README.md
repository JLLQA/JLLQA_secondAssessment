Coverage: 89.2%
# Practical Project: Hobby Web Application

This project encapsulated concepts from all core training modules by creating a working inventory management system. This system successfully stores customer, item and order details in a MySQL database, hosted locally using MySQL Workbench, all of which are user interactable via a command-line interface. The development process used Java to design the back-end, with Mockito and JUnit for unit testing.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project.

### Prerequisites

#### List of required programs
* [Git Bash](https://git-scm.com/downloads)
* [Java](https://www.oracle.com/uk/java/technologies/javase-jdk11-downloads.html)
* [MySQL Workbench](https://www.mysql.com/downloads/)

#### Additional programs for development and testing purposes
* [Eclipse IDE](https://www.eclipse.org/downloads/)
* [Visual Studio Code]()
* [Postman]()
* [SonarQube]()

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
Step 2. Navigate to the download location and double-click to run the executeable and click "Eclipse IDE for Java Developers" followed by "Install"
	*NOTE* you must have a jdk installed alraedy before installing Eclipse or it will not install correctly
```

#### What to do if you don't have Visual Studio Code
```
Step 1. 
Step 2. 
```

#### What to do if you don't have Postman
```
Step 1. Navigate to the link above --> "Download packages" and download the relevant option for your operating system.
Step 2.
```

#### What to do if you don't have SonarQube
```
Step 1. Navigate to the link above --> "Download packages" and download the relevant option for your operating system.
Step 2. 
```

### Installing

A step by step guide to get a development environment up and running.

```
Step 1. Clone the repository to your local machine.
Step 2. Launch Eclipse
	*If you already are using Eclipse and have created a project previously*
Step 3a. Navigate File --> import --> Mavern --> Existing Mavern project --> Browse
	*If you are running Eclipse for the first time*
Step 3b. Import existing projects --> Mavern --> Existing Mavern project --> Browse
Step 4. Navigate to location of project, click folder and press "Select Folder"
*NOTE* You will know it has been successfully added when a pom.xml appears in the projects box
Step 5. Press "Finish"
*NOTE* The project ims should now be visible in the Project Explorer
Step 6. Navigate from BM--> src/main/java --> com.qa.bm --> BmApplication.java
Step 7. Right-click file and select "Run as" --> "Java application"
```

## Running the tests

To run the automated unit tests for the system

```
Step 1. Follow the installing steps above to ensure the project is within Eclipse
Step 2. Right-click the project in the project manager and select "Run as" --> "JUnit Test"
Step 3. The automated tests will then be carried out
```

### Unit Tests 

Explain what these tests test, why and how to run them

```
Give an example
```

### Integration Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

### User-Acceptance Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

## Deployment

How to deploy
```
Step 1. Clone a copy of the repository to your local machine.
Step 2. Navigate to the location of the ims-0.0.1-jar-with-dependencies.jar file.
Step 3. Right-click the folder and select "Git Bash Here".
Step 4. Once in the Git Bash terminal enter the following command:
	java -jar BM-0.0.1-SNAPSHOT.jar
Step 5. The application should be initialised when you see Spring in ASCII art appear on screen	
```

## Built With

* [Html] [Css] [JavaScript](https://www.javascript.com/) - Front-End Web Technologies
* [Java](https://www.java.com/en/) - Back-End Programming Language
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring](https://spring.io/) - API Development Platform
* [SonarQube] (https://www.sonarqube.org/) - Static Analysis
* [MySQL](https://www.mysql.com/) - Database Management
* [JUnit](https://junit.org/junit4/) - Unit Testing
* [Mockito](https://site.mockito.org/) - Unit Testing
* [Selenium]() - User-Acceptancce Testing

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
