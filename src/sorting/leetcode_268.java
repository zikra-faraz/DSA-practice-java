package sorting;

import java.util.Arrays;

public class leetcode_268 {
    public static void main(String[] args) {
    int[] arr = {3,0,1};
    int[] a = {9,6,4,2,3,5,7,0,1};
    int res = missigNumber(a);
        System.out.println(res);
cyclicSort(a);
        System.out.println(Arrays.toString(a));
    }

    static void cyclicSort(int[] nums){
        int i = 0;
        while (i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!= nums[correct]){
                swap(nums , i , correct);
            }else {
                i++;
            }
        }
    }

     static int missigNumber(int[] nums){
        cyclicSort(nums);

         for (int i = 0; i < nums.length; i++) {
//
//             System.out.println(nums[i]);
             if(nums[i] != i ){
                 return i;
             }
         }
         return nums.length;
     }
    static void swap (int[]  arr ,  int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
}
