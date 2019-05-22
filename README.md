# Predicates

Code examples from: [What Are Predicates In Java 8 Video](https://youtu.be/Eq8C_X5M1Lw?list=PLHYgXeZpWoDrML_Q1HFFP8R-HItWPWT4O)

## What are Predicates?
- Predicate is a Functional Interface with abstract method: **test(Object)**
- Represents a boolean valued function which takes one argument.
- Can be used in Lambda expressions.
- Syntax:
    ```java
    Predicate<Type>p = condition
    ```
    Example:
    ```java
    Predicate<Person> person = p -> p.getAge() > 30;
    ```
    
## When to Use Predicates?
- Use them when you want to evaluate a condition to filter similar or collection of objects.
- The return value will be true or false.
- Example where you can use Predicates: 
    - *Find all employees who are male and managers*
    - *Find students whose average of marks is more than 90%*
    - *Find all accounts with more than 1 million balance*

## Best Practices to Use Predicates
- Create use Predicate helper classes so that they can be accessed by various classes.
- You can then centralize filter logic with are more readable.
- Helps separate Domains and business logic.
- Make filter logic easier to test.

