package oops;
// static methods can be  inherited but not Override
// you cannot override the method which has final keyword  before it
// poly means many  ways to represent
// type 1
 //1 compile time polymorphism / aka static polymorphism
// 2 run time polymorphism


// 1 compile  time polymorphism
// method overloading - same name but types , arguments , return types , ordring
// can be different
// Ex -> multiple constructors

// 2 runtime / dynamic polymorphism
// achieved by method overriding
public class Polymorphism {
    // @Override // this is annotation  just to specify  that function is overriden

}
// Early binding
//  when method has ffinal keyword sso  it uses compile time polymorphism

// late binding
// run time polymorphissm using overriding
// it takes time to find out which method is going  to  be called

// overriding depends on object but static don't need object that's why you
// can't override static methods
// static = you can inherit but you cannot override


//Encapsulation - wrapping up the implementation of the data members
// and methods in a class
// it focuses on internal working

//Abstraction - hiding unnecessary details and showing valuable information
// it focuses on external

// private - data hiding
// you can't access that data  also encapsulation is to make code clearer

//Encapsulation is a sub process of data hiding