package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//. Find All Numbers Disappeared in an Array
public class leetcode_448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int[] ar = {1,1};
        cyclicSort(ar);
        System.out.println(Arrays.toString(ar));
        List a = new ArrayList();
       a =  findNumbers(ar);
        System.out.println(Arrays.toString(a.toArray()));
    }
   static void cyclicSort(int[] nums){
        int i = 0;
        while (i<nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums , i , correct);
            }else {
                i++;
            }
        }
   }
    static void swap (int[]  arr ,  int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
    static List<Integer> findNumbers(int[] nums){
         cyclicSort(nums);
         List arr = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
           if(nums[i] != i+1){
                arr.add(i+1);
           }
        }
        return arr;
    }

}
