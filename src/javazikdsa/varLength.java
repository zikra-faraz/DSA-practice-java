package javazikdsa;

import java.util.Arrays;

public class varLength {
    public static void main(String[] args) {
        //variable length arguments ...
        fun(1,3,3,2,23,4);
    }
    //they should stay always at the end just spread operator
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
