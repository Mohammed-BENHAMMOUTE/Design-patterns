# Decorator Design Pattern

_Decorator_ is a structural design pattern that lets you attach new behaviors to objects by
placing these objects inside special wrapper objects that contain the new behaviors. 

## Example we will see:
processing system that allows users to apply various transformations to documents. 
These transformations could include encryption, compression, formatting, and adding digital signatures. 
The Decorator pattern is ideal for this scenario as it allows for flexible combinations of these transformations.

here is the uml diagram for the example we will see:
![UML Diagram](/Diagrams/DecoratorDiagrams/DecoratorClassDiagram.png)

<div style="text-align: center;">

#### Key Components:
* Document: (Interface defines the methods that will be used by the classes that will implement this interface)
* BasicDocument: (Concrete class that implements the Document interface)
* DocumentDecorator: (Abstarct class that will be extended by the concrete decorators)
* EncryptionDecorator: (Concrete decorator that extends the DocumentDecorator)
* CompressionDecorator: (Concrete decorator that extends the DocumentDecorator)
* DigitalSignatureDecorator: (Concrete decorator that extends the DocumentDecorator)
* FormattingDecorator: (Concrete decorator that extends the DocumentDecorator)

</div>

## When to use the Decorator Design Pattern:
* When you want to add new functionality to an object without changing its structure.
* When you want to add several optional features to an object.
* When you want to keep the number of subclasses under control.
* When you want to avoid a permanent change to the class.
* When you want to keep the class simple and clean.
* When you want to allow the user to choose from a variety of features.
* When you want to add features at runtime.
* When you want to combine several features in various ways.
* When you want to add features in any order.
* When you want to add features more than once.
* When you want to add features to a subclass, but not to the superclass.
