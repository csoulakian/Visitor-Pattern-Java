# Visitor-Pattern-Java

**Loyola University Chicago**

**COMP 373/473 - Objects/Frameworks/Patterns**

**Spring 2016 - Project 4 Visitor Pattern**

The purpose of the visitor pattern is to represent an operation to be executed on elements 
of an object structure while allowing the programmer to define new operations without having 
to change the classes that interact with the elements. In this example, there are two kinds 
of items to buy (Fruit and Book), which represent concrete elements. These two concrete elements
implement an Accept operation with an input parameter of the ShoppingCartVisitor. The classes, 
along with the Item element interface, form the ObjectStructure that can iterate through a 
collection of items and allows the visitor to visit its elements. The ShoppingCartVisitor is 
a visitor interface that declares a visit operation for each concrete element in the object.
structure. The visitor interface is implemented in ShoppingCartVisitorImpl, which implements
the visit operation on each concrete element and returns the cost of that particular item. The
visitor pattern is useful for this example because it creates a data model and separates it 
from the visitor that performs operations upon the data. This separation allows for the program
to easily be expanded to allow for other operations on the same concrete elements. Other than 
calculating the total cost in a customer's shopping cart, another visitor could assist with 
store inventory.


Resources:

- Design Patterns by Gamma, Helm, Johnson, and Vlissides (GoF)
- http://www.blackwasp.co.uk/Visitor.aspx
- http://www.journaldev.com/1769/visitor-design-pattern-in-java-example-tutorial
