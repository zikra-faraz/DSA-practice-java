package array;

import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/description/
// sort 0 1 and  2
public class leetcode_75 {
    // brute force
    // use merge sort
    // better
    // for loop  to  countt
    // optimal dutch national flag

    // intuition behind the algo everything 0 .. low-1 = 0  --> extreme left
    // from low .... mid-1 = 1
    // form mid ...high = 0/1/2 --> unsorted
    // from high +1 ... n-1 = 2
    static void sort012(int[] arr){
        int low = 0 , mid = 0 , n= arr.length , high = n-1;
         while (mid<= high){
             if(arr[mid] == 0){
                 swap(arr , low , mid);
                 mid++ ;
                 low++;
             } else if (arr[mid] ==1) {
                 mid++;
             } else {
                 swap(arr , mid ,high);
                 high--;
             }
         }
//        System.out.println(Arrays.toString(arr));
    }
 static void swap( int[] arr ,int first , int second){
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
//     System.out.println( first );
//     System.out.println("second" + second);
 }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr));
//     swap(10,12);
    }
}
