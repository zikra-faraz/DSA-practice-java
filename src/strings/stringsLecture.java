package strings;
//every value in print function is first going to convert in string and then print it
// if you pass directly array since it is object java doen't know what to print in that object
// for arrays another toString function is being  used
public class stringsLecture {
    // anything starts with "Capital" letter is Class
    String name = "hello";
    //here String is class of java


    //heap memory has a separate pool in which same object of different reference variable
    // is created
    // if s1 nd s2  are two different string stores "zikra" then pool will store zikra
    // if you want to change s1 you can't change it as strigs are immutable
    // so s1 if changed will definitely create a new oject of string


    //comparison of strings
    //== comparator
    //if ref variable is pointing to same object it  will return true
    // creating strings with new keyword will return false
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }

}
