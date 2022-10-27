# Sorting App Project
Complete the task to get a practical grasp of Apache Maven and its major features. You will need to create a Maven-based project – Sorting App. It is a small Java application that takes up to ten command-line arguments as integer values, sorts them in the ascending order, and then prints them into standard output.

It will take you about 3 hours to complete the task.

Please be aware that this task status is mandatory.

Please read carefully and do the following:

1. Create a Maven project and specify its GAV settings, encoding, language level, etc.
2. Write the code implementing the app specification.
3. Configure the Maven project to build a runnable jar containing application and its dependencies.
4. Share the project using a public Git repository.
## How this task will be evaluated:
Please be aware that we expect the completed task to meet the following criteria:

- Maven Project of the model version 4.0.0 should be used.
- Java 8 as a source and target version for the Compile stage should be used.
- Maven properties in the configuration should be used.
- A dependency should be introduced, for example, the Commons-IO library.
- Packages should be used.
- Javadoc for a public API should be created.
- Unit tests should be created with the help of JUnit 4.12.
- Parametrized unit tests should be used.
- Tests for the application should be created and corner cases should be covered. Corner cases are the cases with zero, one, ten, and more than 10 arguments. To know more about corner cases, please review an article.
- A project should be configured to build a runnable jar.
Resource files should be used in the project (optional).

## You can get the maximum of 30 points for this task. To pass the task, you need to get 70% of the points.

|                  Criteria/Points                   |                         0 point                          |                             3 points                             |                        6 points                         |9 points|12 points|
|:--------------------------------------------------:|:--------------------------------------------------------:|:----------------------------------------------------------------:|:-------------------------------------------------------:|:--------------:|:--------------:|
|         *Configuration of the dependency*          |        The required dependency is not configured.        | A dependency is introduced, for example, the Commons-IO library. ||||
|    *The version of the dependency or property*     | The wrong version of the dependency or property is used. |      The valid version of the dependency/ property is used.      ||||
|            *The presence of unit tests*            |             There are no unit tests at all.              |       Unit tests are created with the help of JUnit 4.12.        ||||
|    *The coverage of corner cases in unit tests*    |       Corner cases are not covered in unit tests.        |      One out of four corner cases is covered in unit tests.      | Two out of four corner cases are covered in unit tests. |Three out of four corner cases are covered in unit tests.|All corner cases are covered in unit tests.|
| *The use of Maven properties in the configuration* |                 No properties are used.                  |         Maven properties are used in the configuration.          ||||
|         *The presence of the runnable jar*         |         There is no runnable jar configuration.          |        The project is configured to build a runnable jar.        ||||
|        *The use of parametrized unit tests*        |          There are no parametrized unit tests.           |               Parametrized unit tests are created.               ||||