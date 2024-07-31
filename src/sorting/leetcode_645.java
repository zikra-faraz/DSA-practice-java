package sorting;

import java.util.Arrays;

public class leetcode_645 {
    public static void main(String[] args) {
  int[] nums = {1,2,2,4};
  int[] arr = {1,1};
        System.out.println(Arrays.toString(findErrorNumbers(arr)));
    }

    static int[] findErrorNumbers(int[] nums){
        int i=0;
        while (i<nums.length){
            int corr = nums[i] -1;
            if(nums[i]!=nums[corr]){
                swap(nums , i , corr);
            }else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return new int[]{nums[j] , j+1};

            }

        }
        return new int[]{-1,-1};
    }

    static void swap (int[]  arr ,  int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
}
