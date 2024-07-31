package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_442 {
    public static void main(String[] args) {
       int[] nums = {4,3,2,7,8,2,3,1};
       int[] n ={1,1,2};
       List arr = new ArrayList();
       arr = findDuplicates(n);

        System.out.println(Arrays.toString(arr.toArray()));
    }
   static List<Integer> findDuplicates (int[] nums){
        int i = 0;
        List a = new ArrayList();
        while (i< nums.length){
            int corr = nums[i]-1;
            if(nums[i]!=nums[corr]){
                swap(nums , i , corr);
            }else {
                i++;
            }
            
        }
        //find duplicates
       for (int j = 0; j < nums.length; j++) {
           if(nums[j] != j+1){
               a.add(nums[j]);
           }
           
       }
        return a;
   }
   static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
   }
}
