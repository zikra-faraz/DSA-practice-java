package oops;
// something  that is not static belongs to some instance which means you have to
// create an object for non static methods and properties
public class Main {

    public void  greeting(){
        System.out.println("Hello world");
    }
    static void fun(){
        Main mn = new Main();
       mn.greeting();
    }
    public static void main(String[] args) {
     fun();
    }


}
