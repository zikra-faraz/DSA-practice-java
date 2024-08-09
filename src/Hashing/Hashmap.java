package Hashing;

import java.util.*;


// finding the number frequency in an array in O(1) complexity
public class Hashmap {
    public static void main(String[] args) {
   HashmapSearch();
    }

    static void HashmapSearch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of length of array");
        int lenOfArray = sc.nextInt();
        int[]  arr = new int[lenOfArray];
        System.out.println("Enter value of array");
        for (int i = 0; i < lenOfArray; i++) {

            arr[i] = sc.nextInt();
        }

        // pre compute
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < lenOfArray; i++) {
            int num = arr[i];
           map.merge(num , 1 , Integer::sum);
        }

        //query
        System.out.println("Enter query size");
        int q= sc.nextInt();
        for (int i = 0; i < q ; i++) {
            System.out.println("enter number4");
            int num = sc.nextInt();
            //fetch numbers frequency
            if(map.get(num)==null){
                System.out.println(map.getOrDefault(num, 0));
            }else {
                System.out.println(map.get(num));
            }



        }
    }
}
