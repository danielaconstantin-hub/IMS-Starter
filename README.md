Coverage: 69%
IMS PROJECT

One Paragraph of project description goes here

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```- Java 8 (https://www.oracle.com/java/technologies/downloads/#java8)
Guide on how to install Java provided by Oracle (https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)

- MySQL 8 (https://dev.mysql.com/downloads/windows/installer/8.0.html)
Guide from MySQL site (https://dev.mysql.com/doc/refman/8.0/en/installing.html)*
* Note that we need MySQL Server and MySQL Workbench for hosting a database and running queries

- Eclipse IDE (https://www.eclipse.org/downloads/)
Guide on installation from the Eclipse website (https://www.eclipse.org/downloads/packages/installer)

- Maven (https://maven.apache.org/download.cgi)
Guide on installation for Maven provided on their website (https://maven.apache.org/install.html)
Give examples
```

### Installing

Cloning the repository from GitHub: To clone a repository, run the following command in a Git Bash or Terminal, ensuring you are in a suitable location for the folder to be cloned to.
```
Give the example
https://github.com/danielaconstantin-hub/IMS-Starter


Importing the project to Eclipse:

In Eclipse, Navigate to File > Import
From here we need to import an Existing Maven Project
and Select Folder on the root folder of the cloned repository
After importing the project, right click the project in the Package Explorer
Maven > Update Project
This will force the dependencies to download/update.

Configuring MySQL Database:

Navigate to the ims_full_schema.sql(src/main/resources/ims_full_schema.sql) and ims_test_data.sql(src/main/resources/ims_test_data.sql).
Once these are open in MySQL, first run ims_full_schema.sql, followed by ims_test_data.sql. This will create the tables 
and fill in some test data to be used with the application*.

* You may need to modify the db.properties file (src/main/resources/db.properties) 
to match the IP Address, username and password with your MySQL configuration.
This will also need to be done to the db.properties file (src/test/resources/db.properties)
to run any of the JUnit tests.

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

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

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
