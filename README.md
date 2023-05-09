# CMPE 202 Individual Project
Student ID: 016650348

 CMPE 202 Individual Project created by GitHub Classroom
 
#### 1. Describe what is the primary problem you try to solve? 
Ans. The primary problem that I am trying to solve is to check whether a card is valid or not by checking the different types of credit cards i.e.,(Master card, Visa, American Express and Discover) and using the credit card number to identify the card issuer. To find the relevant objects based on card type.
 

#### 2. Describe what are the secondary problems you try to solve (if there are any)?
Ans. The first was the need to identify the credit card type based on the credit card number and verify that the credit card number was a possible account number.
Another secondary problem was how to maintain extensibility for future credit card types that might be added later. It was important to ensure that the design of the system was flexible enough to accommodate new credit card types without requiring significant modifications to the existing code.
Finally, the introduction of the feature that allowed for the parsing of multiple input files brought in a range of expectations that needed to be handled. The system needed to be able to handle different file formats, and the input files needed to be processed efficiently without compromising the accuracy of the credit card number verification process.

 
#### 3. Describe what design pattern(s) you use (use plain text and diagrams)?
Ans. To solve the primary and secondary problems, we used the following design patterns:

##### 1.Factory Method Pattern:

This pattern is suitable for our primary problem because we need to create an instance of the appropriate credit card class based on the credit card type.

##### 2. Strategy Pattern:

This pattern is suitable for our secondary problem because we need to verify the credit card number to ensure that it is a possible account number.

##### 3. Iterator Pattern:

The input files (csv , xml or json) contains a list of nodes that the system need to iterate the list so to do that we will be using iterator pattern, because it will provide us a way to access objects without being concerned about the underlying representation on of the objects.



#### 4. Describe the consequences of using this/these pattern(s)?
 
The consequences of using the Factory Method Pattern are that it provides a way to decouple the creation of objects from their use and allows for flexibility in the creation of objects. The Factory Method Pattern also makes the code easier to extend by adding new subclasses without modifying existing code. However, it can increase the complexity of the code by adding more classes.

The consequences of using the Strategy Pattern are that it allows for flexibility in selecting algorithms at run time and promotes code reuse by encapsulating algorithms in separate classes. The Strategy Pattern also makes the code easier to extend by adding new validation on strategies without modifying existing code. However, it can increase the complexity of the code by adding more classes and interfaces.

Overall, using the Factory Method and Strategy Patterns can provide a flexible and extensible solution to the primary and secondary problems described above.


### CSV

```
✗ java -cp girish-cmpe-202.jar com.girish.Main src/main/resources/input.csv output/output.csv
Output successfully written to output.csv
```

```
✗ cat output.csv
CardNumber,CardType
5567894523129089,MasterCard
59012345678901234567890,"Invalid: more than 19 digits"
4123456789123,Visa
347856341908126,AmericanExpress
6011111100007756,Discover
3601112345678789,"Invalid: not a possible card number"
5167894523129089,MasterCard
4123456789123999,Visa
377856341908126,AmericanExpress
5367894523129089,MasterCard
"6011*890HJrt6789","Invalid: non numeric characters"
,"Invalid: empty/null card number"

```

### JSON

```
✗ java -cp girish-cmpe-202.jar com.girish.Main src/main/resources/input.json output/output.json
Output successfully written to output.json
```

```
✗ cat output.json
{
  "cards": [
    {
      "cardType": "MasterCard",
      "cardNumber": "5567894523129089"
    },
    {
      "cardType": "Invalid: more than 19 digits",
      "cardNumber": "59012345678901234567890"
    },
    {
      "cardType": "Visa",
      "cardNumber": "4123456789123"
    },
    {
      "cardType": "AmericanExpress",
      "cardNumber": "347856341908126"
    },
    {
      "cardType": "Discover",
      "cardNumber": "6011111100007756"
    },
    {
      "cardType": "Invalid: not a possible card number",
      "cardNumber": "3601112345678789"
    },
    {
      "cardType": "MasterCard",
      "cardNumber": "5167894523129089"
    },
    {
      "cardType": "Visa",
      "cardNumber": "4123456789123999"
    },
    {
      "cardType": "AmericanExpress",
      "cardNumber": "377856341908126"
    },
    {
      "cardType": "MasterCard",
      "cardNumber": "5367894523129089"
    },
    {
      "cardType": "Invalid: non numeric characters",
      "cardNumber": "6011*890HJrt6789"
    },
    {
      "cardType": "Invalid: empty/null card number",
      "cardNumber": ""
    }
  ]
}
```

### XML

```
✗ java -cp girish-cmpe-202.jar com.girish.Main src/main/resources/input.xml output/output.xml
Output successfully written to output.xml
```

```
<ArrayList>
  <item>
    <CardNumber>5567894523129089</CardNumber>
    <CardType>MasterCard</CardType>
  </item>
  <item>
    <CardNumber>59012345678901234567890</CardNumber>
    <CardType>Invalid: more than 19 digits</CardType>
  </item>
  <item>
    <CardNumber>4123456789123</CardNumber>
    <CardType>Visa</CardType>
  </item>
  <item>
    <CardNumber>347856341908126</CardNumber>
    <CardType>AmericanExpress</CardType>
  </item>
  <item>
    <CardNumber>6011111100007756</CardNumber>
    <CardType>Discover</CardType>
  </item>
  <item>
    <CardNumber>3601112345678789</CardNumber>
    <CardType>Invalid: not a possible card number</CardType>
  </item>
  <item>
    <CardNumber>5167894523129089</CardNumber>
    <CardType>MasterCard</CardType>
  </item>
  <item>
    <CardNumber>4123456789123999</CardNumber>
    <CardType>Visa</CardType>
  </item>
  <item>
    <CardNumber>377856341908126</CardNumber>
    <CardType>AmericanExpress</CardType>
  </item>
  <item>
    <CardNumber>5367894523129089</CardNumber>
    <CardType>MasterCard</CardType>
  </item>
  <item>
    <CardNumber>6011*890HJrt6789</CardNumber>
    <CardType>Invalid: non numeric characters</CardType>
  </item>
  <item>
    <CardNumber></CardNumber>
    <CardType>Invalid: empty/null card number</CardType>
  </item>
</ArrayList>
```

## Validations

### Validation that required number of arguments are passed

```
✗ java -cp girish-cmpe-202.jar com.girish.Main
Invalid syntax. Usage: java com.girish.Main <input file path> <output file path>
```

### Validation that input and output file extensions are same

```
✗ java -cp girish-cmpe-202.jar com.girish.Main src/main/resources/input.csv output/output.xml
Exception in thread "main" java.lang.RuntimeException: Input and output extensions should be the same
```

### Validation that input file path exists

```
✗ java -cp girish-cmpe-202.jar com.girish.Main input.csv output/output.csv
Exception in thread "main" java.lang.RuntimeException: Input path does not exist
```



 
#### Command to Run the project:
 
mvn compile exec:java -Dexec.mainClass="com.cmpe202.individualproject.main.App" -Dexec.args="src/test/java/sampleFiles/input_file.csv    src/test/java/sampleFiles/output_file.csv"
 
#### How to test Junit test?
 
Click on run all tests to see the JUnit testcases being passed.
