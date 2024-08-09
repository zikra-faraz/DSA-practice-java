package Hashing;

import java.util.Scanner;

public class StringHashing {
    public static void main(String[] args) {
     StringHashArray();
    }

    static void StringHashArray(){

        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter string");
        String s =  sc.next();


        //pre-compute
        //if lowercase
        int[]  hash  =  new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a']++;
        }



        //query
        System.out.println("Query length");
        int q = sc.nextInt();
        for (int i = 0; i < q ; i++) {
            System.out.println("Enter char to fetch its frequency");

            char c = sc.next().charAt(0);

           //Fetch
            System.out.println(hash[c-'a']);


        }
    }
}
