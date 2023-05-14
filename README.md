# CMPE 202 Individual Project
# Student ID: 016650348

 CMPE 202 Individual Project created by GitHub Classroom
 
#### 1. Describe what is the primary problem you try to solve? 
Ans. The primary problem that I am trying to solve is to check whether a card is valid or not by checking the different types of credit cards i.e.,(Master card, Visa, American Express and Discover) and using the credit card number to identify the card issuer. To find the relevant objects based on card type.
 

#### 2. Describe what are the secondary problems you try to solve (if there are any)?
Ans. The first was the need to identify the credit card type based on the credit card number and verify that the credit card number was a possible account number.

Another secondary problem was how to maintain extensibility for future credit card types that might be added later. It was important to ensure that the design of the system was flexible enough to accommodate new credit card types without requiring significant modifications to the existing code.

Finally, the introduction of the feature that allowed for the parsing of multiple input files brought in a range of expectations that needed to be handled. The system needed to be able to handle different file formats, and the input files needed to be processed efficiently without compromising the accuracy of the credit card number verification process.

 
#### 3. Describe what design pattern(s) you use (use plain text and diagrams)?
Ans. To solve the primary and secondary problems, we used the following design patterns:

### 1.Factory Method Pattern:

The Factory Method Pattern is a creational pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. This pattern is suitable for our primary problem because we need to create an instance of the appropriate credit card class based on the credit card type.

To implement the Factory Method Pattern, we can create an abstract CreditCardFactory class that provides an abstract method for creating CreditCard objects. We can then create concrete factories such as VisaCCFactory, MasterCCFactory, and AmExCCFactory that implement the CreditCardFactory interface and override the createCreditCard() method to create the appropriate CreditCard subclass.

### 2. Strategy Pattern:

The Strategy Pattern is a behavioral pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern is suitable for our secondary problem because we need to verify the credit card number to ensure that it is a possible account number.

To implement the Strategy Pattern, we can create an interface called  Credit Card Number Valid onStrategy that provides a method for validating credit card numbers.
We can then create concrete strategies such as VisaCCNumberValida, onStrategy, MasterCCNumberValidationStrategy, and AmExCCNumberValidation onStrategy that implement the CreditCardNumberValida onStrategy interface and override the validate() method to perform the appropriate credit card number validation on algorithm.


### 3. Iterator Pattern:

The input files (csv , xml or json) contains a list of nodes that the system need to iterate the list so to do that we will be using iterator pattern, because it will provide us a way to access objects without being concerned about the underlying representation on of the objects.



#### 4. Describe the consequences of using this/these pattern(s)?
 
The consequences of using the Factory Method Pattern are that it provides a way to decouple the creation of objects from their use and allows for flexibility in the creation of objects. The Factory Method Pattern also makes the code easier to extend by adding new subclasses without modifying existing code. However, it can increase the complexity of the code by adding more classes.

The consequences of using the Strategy Pattern are that it allows for flexibility in selecting algorithms at run time and promotes code reuse by encapsulating algorithms in separate classes. The Strategy Pattern also makes the code easier to extend by adding new validation on strategies without modifying existing code. However, it can increase the complexity of the code by adding more classes and interfaces.

Overall, using the Factory Method and Strategy Patterns can provide a flexible and extensible solution to the primary and secondary problems described above.
 
#### Command to Run the project:
 
mvn compile exec:java -Dexec.mainClass="com.cmpe202.individualproject.main.App" -Dexec.args="src/test/java/sampleFiles/input_file.csv    src/test/java/sampleFiles/output_file.csv"
 
#### How to test Junit test?
 
Click on run all tests to see the JUnit testcases being passed.
