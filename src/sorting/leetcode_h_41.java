package sorting;

import java.util.Arrays;

public class leetcode_h_41 {
    public static void main(String[] args) {
       int[] arr = {7,8,9,11,12};
       int[] n = {3,4,-1,1};
       int[] hel ={1,2,0};
      int res= firstMissindPositive(hel);
        System.out.println(res);

    }
    static int firstMissindPositive(int[] nums){
        int i=0;
        while (i<nums.length){
            int corr = nums[i] -1;
            if(nums[i]>0  && nums[i]<= nums.length&&nums[i]!= nums[corr]){
                swap(nums , i , corr);
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
           if(nums[j]!=j+1){
               return j+1;
           }

        }
        return nums.length+1;
    }
    static void swap (int[]  arr ,  int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
}
