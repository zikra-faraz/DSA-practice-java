package array;

import java.util.Arrays;

public class leetcode_31 {

    static  void nextPermutation(int[] nums){
        int n = nums.length;
        int index= -1;
        // find  the index where nums[i]<nums[i+1]
        for (int i = n-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }

//        System.out.println(index);
        if(index == -1){
            reverseArray(nums , 0 , n-1);
            System.out.println(Arrays.toString(nums));
        }  else {

            System.out.println(index);
            for (int i = n-1; i > index ; i--) {
                if(nums[i] >  nums[index]){
                    swap(nums , i  , index);
                    break;
                }
            }
            reverseArray(nums , index+1 , n-1);
            System.out.println(Arrays.toString(nums));

        }

        // from n-2 to till index find value greater than just index and than swap it




    }

    static void swap(int[] arr , int start , int end){
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }
     static void reverseArray(int[] arr ,int start , int end) {


        // Swap elements from start and end until they meet in the middle
        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,5};
        int[] a = {2,1,5,4,3,0,0};
        int[] n = {5,4,3,2};
        int[] c={1,2,3};
        nextPermutation(c);
    }
}
