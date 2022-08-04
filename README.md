# Mobile Test Automation

This project is a mobile test automation framework, which provides structured and standard way of creating automated test scripts for Mobile and API level tests across project.

This is a reusable automation framework that blends together Selenium WebDriver, Appium, RestAssured, and Cucumber JVM (incorporating Gherkin and the BDD 'Given, When Then' testing construct)

This framework supports automation of : - 
*Mobile Automation on Emulated and Physical Devices, for Android Apps and extendable to iOS.

The framework incorporates design principle of BDD (Behaviour driven development) which promotes writing acceptance tests by describing behaviour of application under test in simple english language from the perspective of its stakeholders.

Supports Custom Page Object model which represents the screens of AUT as a series of objects and encapsulates the fields represented by a page which ultimately avoids duplication and improves code maintainability and readability.

# Tools & libraries

The test automation framework is comprised of following tools and libraries

- [Cucumber-JVM](https://mvnrepository.com/artifact/io.cucumber/cucumber-java):- BDD Framework
- Custom Page Object Pattern and utility functions
- [Appium Client](https://mvnrepository.com/artifact/io.appium/java-client): - Android Mobile Automation
- [Appium Server](https://github.com/appium/appium-desktop/releases/tag/v1.22.3-4): - Mobile Native app, Hybrid App, Web app
- [JAVA](https://www.oracle.com/java/technologies/downloads/#java8): - Programming language
- [TestNg](https://mvnrepository.com/artifact/org.testng/testng): - TestNg Java testing framework
- [Maven](https://maven.apache.org/download.cgi): - Build tool
- [Git](https://git-scm.com/downloads): - Version Control
- [Github](https://github.com/): - Git repository hosted server
- [Intellij](https://www.jetbrains.com/idea/download/): - Integrated Development Environment
- [Rest-Assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured): - Restful Api framework

# Machine Configuration
Windows setup: -

- Java 8
- Git
- Maven

The basic workflow is:

1. Testers, product owners and developers write and maintain feature documents in English, using the Gherkin syntax, matching the acceptance criteria of user stories
    - New feature documents can reuse existing steps, or introduce new ones
2. Testers implement Step Definitions in Java
    - This is the code that acts as glue between each step
    - Each step definition is unique and independent - it cannot depend on order of execution or any other steps
3. When implementing new Step Definitions, the tester may need to change the way a step is phrased, to make it more explicit and unique
    - Which should be done in collaboration with the person that wrote the feature document

We believe this is a workflow that allows everyone on the team to collaborate and contribute to a rich and useful suite of tests.

## Steps

- Clone repo and save to repository
- Save, clean and build to download all Maven dependencies
- Download and install Java, Optional if Java is already installed
- Download and install Maven, Optional if Maven is already installed
- Configure environment, Add JAVA_HOME, MAVEN_HOME, ANDROID_HOME to system path
- Install Android SDK
- Install Android API
- Install Virtual Devices via AVD
- Download and install Appium Desktop
- Configure Appium server
- Upload Application Under Test, AUT, to the app folder
- Provide information about the app and devices in the Configuration.properties file
- Either right-click the TestRunner and click "Run TestRunner" or type `mvn test` from terminal

The steps above are applicable to Android devices, for iOS repeat steps 5-8 using XCode with their equivalent step.

## Running the tests

The test scripts is primarily designed for Android devices(Real and Emulator), however is can also be extended for iOS. 
Before test, tester need to upload the application to be tested to the app folder located at `resouces/app` and supplying the desired capabilities in the Configuration.properties file.
For iOS devices, the test also need to be refactored to include IOSDriver under AppUtility and IOSBy element locator on the Page Object.


Start by running `mvn test`, from the terminal from the root directory of the project by typing the command:

    mvn test

You can also run the test by right-clicking on the TestRunner and selecting "Run TestRunner"



## Writing new tests

Feature documents must go into the `test/resources/features` folder, with the `.feature` extension. 

Step definitions that are meant to be used by any feature, must go into the `test/java/steps/`

You can tag the feature you're working on with `@TestName`, and TestNG will execute test based on the tags

## Reports

After test execution, cucumber=report is automatically generated and can be access under `target/test-classes` folder and can be viewed on the browser
