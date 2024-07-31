package javazikdsa;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    static int check_digits_of_num(int num){
        int  count = 0;
        while (num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    static  boolean even(int num){
        int result=check_digits_of_num(num);
        return  result%2 ==0 ;
    }

    static int even_digits(int[] arr){
       int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean res = even(arr[i]);
            if(res){
                count++;
            }

        }
        return count;
    }
//alt + enter  to convert normal for loop into iterable for loop

    public static void main(String[] args) {
      int[] arr ={1,23,444,55,66,77,8,2424};

        System.out.println( even_digits(arr));



    }
}
