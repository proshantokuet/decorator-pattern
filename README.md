# decorator-pattern


## What is decorator pattern?
Decorator pattern allows us to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

## Implementation steps
We are going to create an example of Shape.
1. Shape is the name of the interface
2. Rectangle  class and Circle class will be concrete classes implementing the ‘Shape’ interface.
3. ShapeDecorator is our abstract decorator class implementing the same ‘Shape’ interface.
4. RedShapeDecorator is a concrete class implementing ShapeDecorator.
5. DecoratorPatternDemo, our demo class will use RedShapeDecorator to decorate Shape objects.

## Which problem solve decorator pattern?.
Imagine that you’re working on a Shape drawing library which lets other programs draw their shape.

The initial version of the library was based on the Circle draw that had only a few fields, a constructor and a single draw method.The draw method draw a circle.
After a few days later you have a request to draw rectangle ,Square etc. then you can extend Shape interface for every Rectangle or Square.I think the problem will be solved.But not at all. 
after a days you need to WhiteColorRectangle, BlackColor Rectangle what you do?.

To solve this kind of problem decorator pattern will be used.

## When to use decorator pattern?.
1. When we wish to add, enhance or perhaps remove the behavior or state of objects.
2. When we just want to modify the functionality of a single object of the class and leave others unchanged.

 



