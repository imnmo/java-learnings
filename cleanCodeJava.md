Item 22: Favor static member classes over nonstatic
=======================================================

Nested class should exist only to service its enclosing class. There are four kinds of nested classes:

* Static member classes (static nested class) 
* Non-static member classes,
* Anonymous classes,
* Local classes

2., 3. and 4. are also called "Inner" classes.


## Why Use Nested Classes?

Compelling reasons for using nested classes include the following:

* It is a way of logically grouping classes that are only used in one place: 
  If a class is useful to only one other class, then it is logical to embed it in that class and keep the two together. 
  Nesting such "helper classes" makes their package more streamlined.

* It increases encapsulation: Consider two top-level classes, A and B, where B needs access to members of A that would 
  otherwise be declared private. 
  By hiding class B within class A, A's members can be declared private and B can access them. 
  In addition, B itself can be hidden from the outside world.

* It can lead to more readable and maintainable code: Nesting small classes within top-level classes places the code closer 
  to where it is used.


## Rules: ## 
If you declare a member class that does not require access to an enclosing instance, always put the static modifier in its 
declaration, making it a static
rather than a nonstatic member class.


==================================================================

1. Static member class (simplest kind of nested class)
   * Access to all enclosing class members - even the private ones
   * is a static member of its enclosing class and obeys same accessibility rules as other static members.
   * if declared private, it can only be accessed within the enclosing class.
   * If you declare a member class that does not require access to an enclosing instance, always put the static modifier 
     in its declaration
   * A static nested class interacts with the instance members of its outer class (and other classes) just like any other 
     top-level class. 
     In effect, a static nested class is behaviorally a top-level class that has been nested in another top-level class for 
     packaging convenience. 
   
   Examples:

   1.1. Entry object for each key-value pair of a HashMap. Entry does not need access to the map in contrast to KeySet which is nonstatic. 
        If you remove static from Entry, Map still works but superfluous reference to map - waste space and time. 
        See also EntrySet class which is not-static


1.   Non-static member classes
   * An inner class is a class declared as a non-static member of another class:
   * invoke methods on the enclosing instance
   * association between a nonstatic member class instance and its enclosing instance - association cannot be modified 
     thereafter
   * Association can be established automatically by invoking a nonstatic member class constructor from within an instance 
     method of the enclosing class
   * Association takes up space in the nonstatic member class instance and adds time to its construction.


   Disadvantage:
   should you ever need to allocate an instance without an enclosing instance, you'll be unable to do so, 
   as nonstatic member class instances are required to have an enclosing instance


3. Local classes
   * Typically defined in the body of a method.
   * Cannot define or declare any static members
   * Local classes in static methods, such as the class PhoneNumber, which is defined in the static method 
     validatePhoneNumber, 
     can only refer to static members of the enclosing class.
   * Not possible to declare an interface inside a block; interfaces are inherently *static*
   * You cannot declare static initializers or member interfaces in a local class

  
   Examples: LocalClassExample, ShadowTest   


4. Anonymous classes
   * Like local class but without a name 
   * It is not a member of its enclosing class.
   * Anonymous classes are permitted at any point in the code where an expression is legal. 
   * Anonymous classes have enclosing instances if and only if they occur in a nonstatic context.
   * Can be only instanciated at the point where they are declared.
   * No instanceof tests possible
   * You can't declare an anonymous class to implement multiple interfaces, or to extend a class and implement an interface 
     at the same time.
   * Because anonymous classes occur in the midst of expressions, they must be kept shortâ€” about ten lines or fewerâ€”or 
     readability will suffer.
   * Common use: create function objects on the fly.
   * Process objects, such as Runnable, Thread, or TimerTask instances. A third common use is within static factory methods 
     (see the intArrayAsList method in Item 18).
   * Anonymous classes can be compared with closures in other languages.
   * An anonymous class has access to the members of its enclosing class.
   * An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively 
     final.
   * Like a nested class, a declaration of a type (such as a variable) in an anonymous class shadows any other declarations 
     in the enclosing scope that have the same name. See Shadowing for more information.
   * In Java 8 you can use a lambda expression instead of an anonymous class expression
   
   Examples:
   4.1. AnonymousHalloClass, AnonymousClickHandlerTest, DataStructure
 
   button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e)
      {
        // do something.
      }
   });

   new Thread() {
            public void run() {
                try {
                    sleep(300);
                } 
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    System.out.println(" EXCEPTION : " + e.toString());
                }
                handler.post(mainloading);
            }
   }.start();


