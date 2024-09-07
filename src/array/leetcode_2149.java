package array;

import java.util.Arrays;

public class leetcode_2149 {

    //brute approach
    static int[] rearrangeArray(int[] nums){
        int n = nums.length;
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        int  positiveIndex = 0 , negativeIndex = 0;

        for (int i = 0; i < n ; i++) {
            if(nums[i]>0){
                positive[positiveIndex++] = nums[i];
            }else {
                negative[negativeIndex++] = nums[i];
            }


        }
        for (int i = 0; i < n/2; i++) {
            nums[2*i] = positive[i];
            nums[2*i+1] = negative[i];
        }
        return nums;
    }


    // optimal approach
    static int[] rearrange(int[] arr){
        int[] new_arr = new int[arr.length];
        int positive = 0 , negative = 1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                new_arr[positive] = arr[i];
                positive +=2;
            }else {
                new_arr[negative]  = arr[i];
                negative += 2;
            }
        }
        return  new_arr;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrange(nums)));
//        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
