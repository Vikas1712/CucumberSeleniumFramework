# Selenium with Cucumber framework using Page Object Model
Cucumber is a testing framework which supports Behavior Driven Development (BDD).
The main advantage of Page Object Model is that if the UI or any HTML object changes for any page, 
the test does not need any fix. Only the code within the page objects will be impacted but it does not have any impact to the test.
This porject automate a shopping a product to adidas portal End2End scenario.


## Table of Contents
* [Tech Stack used]
* [Getting started]
* [Running from IntelliJ IDEA]
* [Running from command line]
* [BDD]
* [Framework Structure]
* [Test layers]
* [Test support cross-platform]
* [Result Reporting]

## Tech Stack used
* Java 15 - coding
* Maven - project builder
* Junit - runnner
* Cucumber -BDD framework
* Extent html Report-test ooutput reporter

## Getting Started
Software to be pre-installed
* JDK 15 - https://www.oracle.com/java/technologies/javase-jdk15-downloads.html
* Maven - latest version here https://maven.apache.org/download.cgi
```
note that both tools should be set to environment variables      
```

## Running autotests from IntelliJ IDEA IDE
1. Clone repository
```
git clone https://github.com/Vikas1712/CucumberSeleniumFramework.git
```
2. Open File -> New -> Project from Existing Source -> Select `../CucumberSeleniumFramework/pom.xml` -> Click 'Next' every prompt
3. Go to `~/src/test/java/testRunner/AdidasTest.java` -> click rmb -> click 'Run...' in context menu to execute all existing tests.

## Running autotests from command line or terminal
1. Clone repository
```
git clone https://github.com/Vikas1712/CucumberSeleniumFramework.git
```
2. Open directory: `CucumberSeleniumFramework/` 
3. In command line execute:
* ```mvn test``` - exetutes all tests inside `fr-ryanair-test-cucumber-bdd/src/test/java/test_runners/` with default browser set in config file
* ```mvn -Dbrowser=chrome test``` - executes test in chrome browser
* ![Alt Text](https://github.com/Vikas1712/CucumberSeleniumFramework/blob/main/mvn%20chrome.gif)

## BDD
Tests are developed using BDD approach, BDD frameworks such as Cucumber or Specflow are an enabler, acting a “bridge” between Business & Technical Language, so basically it's aimed to write human-readable scenarios to involve non-technical people in process of automation.

## Framework Structure
* Programming language – Java 15
* Type of framework – BDD
* Page Object – Separate class for every web-page, that hold all functionality and members of that web-page using PageFactory pattern
* Test base class: Deals with all the common functions used by all the pages, responsible for test launch, for reports,pre-cond post-cond, web-driver init, loading configs etc. 
* Packages: I have separate packages for Pages, Test steps and any other framework layer
* Utility Functions: The code which is repetitive in nature such as waits, scenario context, property loader etc.
* Property File: This file (config.properties) stores the information that remains static throughout the framework such as browser specific information, application URL etc.
* VCS: Git

## Test Layers
* Pages(web-pages and elements)
* Test steps(logic implementation)
* Test launch(test runners)
* Test data(feature files)

## Tests support cross-platform browser testing
 * Windows: 
      * Chrome
      * FireFox
 * MacOS:
      * Chrome
      * FireFox

Default browser is Chrome. To change browser, go to config.properties file and set 'browser_name = firefox'. Or override this property from cmd/terminal using:
```
mvn -Dbrowser=browser_name test
```

## Results Reporting

Extent Report genarates great report for cucumber html reports using com.aventstack.extentreports.cucumber.adapter-plugin. To browse cucumber reports, go to:
```
~/test output/Spark/ExtentSpark.html     
```
* ![Alt Text](https://github.com/Vikas1712/CucumberSeleniumFramework/blob/main/ExtentReporting.gif)
* Open a file with extension ```*****.html``` in any preferrable browser

P.S. There are many opportunities to add any other convenient reporter tool to this project
