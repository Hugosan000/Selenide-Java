

## 🤘 About

Petlov Project for Test Automation Training with Java and JUnit 5

- Selenium Webdriver 4.20.0
- JDK 21
- JUnit 5
- Selenide

## Running the Project

After cloning the repository, follow these steps to run the project:

### 1. Install Java Development Kit (JDK)
Make sure you have the JDK installed on your machine. You can download it from the [official Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html). The JDK version should match the one specified in the project.

### 2. Install Maven or Gradle
Depending on the project, you might need either Maven or Gradle as a build tool. You can download [Maven](https://maven.apache.org/download.cgi) or [Gradle](https://gradle.org/install/).

### 3. Import the Project into Your IDE
Open your IDE and import the project:
- **IntelliJ IDEA**: Select `File -> New -> Project from Existing Sources...` and choose the project directory.
- **Eclipse**: Select `File -> Import... -> Existing Maven Projects` (or `Existing Gradle Project` if the project uses Gradle) and choose the project directory.

### 4. Resolve the Dependencies
The project should automatically download and resolve all necessary dependencies once imported into your IDE. If not, manually trigger a Maven install (`mvn install`) or Gradle build (`gradle build`) to download the dependencies.

### 5. Run the Tests
You can run the tests by right-clicking on the test class in your IDE and selecting `Run 'Tests in 'ClassName''`. Alternatively, you can run the tests from the command line:
- For Maven: Navigate to the project directory and run `mvn test`.
- For Gradle: Navigate to the project directory and run `gradle test`.

Please note that the exact steps might vary depending on the specifics of the project and the IDE you're using.
