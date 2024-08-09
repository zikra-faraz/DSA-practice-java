package Hashing;

import java.util.Scanner;

public class hashing {
    public static void main(String[] args) {
     hashArray();

    }

    static void hashArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int length  = sc.nextInt();
        // for loop for storing array
        System.out.println("Enter elements of array");
        int[] arr = new int[length];
        for (int i = 0; i <  length ; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute
        int [] hash = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        // for loop for query number

        System.out.println("Enter queries size");
        int queryLength = sc.nextInt();
        System.out.println("Enter number to check its count");
        int[] queryArr = new int[queryLength];
        for (int i = 0; i < queryLength ; i++) {
            queryArr[i] = sc.nextInt();
            int num = queryArr[i];
            System.out.println(hash[num]);
        }
        // fetch count of number

    }


}
