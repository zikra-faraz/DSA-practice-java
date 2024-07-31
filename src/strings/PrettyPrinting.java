package strings;

import java.util.ArrayList;

// how to format a string
public class PrettyPrinting {
    public static void main(String[] args) {
        System.out.printf("Pie : %.3f\n" , Math.PI);
        //string formatting
        System.out.printf("Hello my name is %s and I am %s\n" ,"zikra" , "dumb");

        //char addition
        System.out.println('a'+ 'b');
        System.out.println((char)('a' + 3));
        //string addition
        System.out.println("a" + "b");
        // + operator in println atleast   one  should have string value
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

    }
}
