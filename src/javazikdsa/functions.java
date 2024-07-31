package javazikdsa;

import java.util.Arrays;

public class functions {
    public static void main(String[] args) {
        String nam = "hello";
    greet(nam);
    int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
    change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void greet(String naam){
        naam="zikra"; //here creating a new object
        System.out.println("hello " + naam);
    }
    static  void change(int[] arr){
        arr[0]  = 99; //here modifying the existing object
    }
}
//{} this is block scope values initialize in this block will remain in this block