package array;

import java.util.Arrays;

public class letfRotateby1place {


    static void  leftRotate1place(int[] arr){
       int temp  = arr[0];
        for (int i = 1; i < arr.length; i++) {
          arr[i-1] = arr[i];

        }
        arr[arr.length-1] =  temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] a = { 1,2,3,4,5,6,7};
//        leftRotate1place(a);
  int[] arr =  {-1,-100,3,99};
        System.out.println("left rotate array by kth places");
//        leftRotatebykPlaces(a, 21);
//        //optimal solution
//       rightRotateByKplace(arr,2);
    }


    // brute method
    static  void leftRotatebykPlaces(int[] arr , int k){
        int n = arr.length;
        k = k%n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];

        }

        //shifting
        for (int i = k; i < n; i++) {
            arr[i-k] = arr[i];
        }
        // adding to last temp variables
        for (int i = n-k; i < n; i++) {
            arr[i] = temp[i-(n-k)];
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //optimal for left rotate by k places
    // tc = 2n sc= 1
    //  reverse first part reverse second part and then whole


    //leetcode 189

}
