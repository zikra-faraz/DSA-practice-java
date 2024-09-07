package oops;
// by default in  java every class extends Object class
public class Properties {
    // 1. Inheritance - parents pass on to children and they can use it
    // 2 . Polymorphism
    // super  is  going to e first used and then anything else


    // if type and object is of same class then no  problem

//    class Box{
//        int h;
//        int l;
//    }
//    Box b = new Box();

    // if the type of reference variable is parent class  and the object is sub class
//reefernce type defines which one has access
    // object determine which  one tto call


    //Which method will be called is depends on abject not on parent but  on child
    // known as upcasting

    // How Java knows whichh method to call? // dynamic method dispatch
   static class Shapes{
        void area(){
            System.out.println("area of shapes , I am area function inside shapes class");
        }
    }
    static  class Circle extends Shapes{
        void area(){
            System.out.println("I am inside circle");
        }
    }


    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        // here dynamic method dispatch is called
        Shapes s2 = new Circle();
        // reference type of variable s2 is Shapes class that ensures to access
        // area method while object class (Circle) determines to call the
        // function of Circle class // it is run time polymorphism
        s2.area();
    }

}
