package bitwiseOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
   isPrime(38);
        System.out.println(Arrays.toString(primeOfNumbers(780)));

        allDivisors(36);
    }
    static void isPrime(int n) {
        int  count = 0;
        for (int i = 1; i*i <= n ; i++) {
            if(n%i==0){
                count++;
                if(n/i != 0){
                        count++;
                }

            }

        }
        if(count==2) System.out.println("yes");
        else System.out.println("no its not prime");
    }

    static int[] primeOfNumbers(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =2; i*i <=n ; i++){
            if(n%i==0){
                arr.add(i);
                while (n%i == 0){
                    n = n/i;
                }
            }
        }
//        arr.add(n);
        if(n!=1){
            arr.add(n);
        }
       int[] ar = new int[arr.size()];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = arr.get(i);
        }
        return ar;
    };

    static void allDivisors(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1 ; i*i<=n ; i++){
            if(n%i==0){
                arr.add(i);
                if(n/i!=i){
                    arr.add(n/i);
                }
            }
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));

        }
    }

}
