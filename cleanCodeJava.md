Item 22: Favor static member classes over nonstatic
=======================================================

Nested class should exist only to service its enclosing class. There are four kinds of nested classes:

* Static member classes (static nested class) 
## 
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