# Selenide-Java

### Project Summary: Donation Point Registration

This project is a Java application designed to automate the registration process for animal donation points. The goal is to streamline the creation of donation points, enabling more people to contribute to the well-being of animals.

The application leverages Selenium, a powerful tool for automating web browser interactions. Selenium allows for simulating user interactions with the registration page, automatically filling out form fields, and submitting the form.

Additionally, the project uses Selenide, a user interface testing library built on top of Selenium. Selenide simplifies the creation of automated tests by providing a high-level, user-friendly API. It enables developers to write concise, readable tests, enhancing the maintainability of the test code.

The project includes two main tests:

1. **happyPath()**: This test verifies the scenario where all data is correctly entered. It creates a new donation point with a name, email, postal code, number, details, and types of accepted animals. After submission, it checks if a success message is displayed.

2. **wrongEmail()**: This test verifies the scenario where the entered email is invalid. It attempts to create a new donation point with an incorrect email and checks if the application prevents the creation of the donation point.

This project exemplifies how test automation can improve software quality by enabling developers to quickly identify and fix issues. Additionally, it demonstrates the potential of automation to make repetitive processes more efficient.

# How to Install the Selenide Library in Your Java Project

https://selenide.org/quick-start.html

To install Selenide in your Java project, you need to add it as a dependency in your project's build file. The process differs slightly depending on whether you're using Maven or Gradle as your build tool.

## For Maven

Add the following dependency to your `pom.xml` file:

```xml
<dependencies>
    <!-- other dependencies -->
    <dependency>
        <groupId>com.codeborne</groupId>
        <artifactId>selenide</artifactId>
        <version>5.25.1</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

Please replace `5.25.1` with the latest version of Selenide.

## For Gradle

Add the following dependency to your `build.gradle` file:

```groovy
dependencies {
    // other dependencies
    testImplementation 'com.codeborne:selenide:5.25.1'
}
```

Again, replace `5.25.1` with the latest version of Selenide.

After adding the dependency, you should be able to import and use Selenide in your Java files. Remember to refresh your project dependencies after updating the build file. In VS Code, you can do this by right-clicking on the `pom.xml` or `build.gradle` file and selecting "Update Project" or similar.

# With Selenide

![code](https://github.com/Hugosan000/Selenide-Java/assets/61331185/6f69577f-c0a4-449b-ac67-a57ced1bb3e3)

# Without Selenide

![code2](https://github.com/Hugosan000/Selenide-Java/assets/61331185/702acaa5-8d35-498c-b0e2-3f08afebffc8)
