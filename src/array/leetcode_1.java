package array;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum/description/
public class leetcode_1 {

    // better approach
    // tc = n* logn
    // sc = n
    static int[] twoSum(int[] arr , int target ){
        int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
                    int a = arr[i];
                    int more = target - a;
               if(map.containsKey(more)){
                  return new int[]{map.get(more),i} ;
               }
               map.put(a , i);
        }
  return new  int[]{-1,-1};
    }


    // two sum without hashmap using two pointer if return ture or false
   static boolean sumTwo(int[] arr , int target){
//        Arrays.sort(arr);
        int n = arr.length;
       int left =0 ; int right = n-1;
       int sum = 0;
       while (left<=right){
           sum = arr[left] + arr[right];
           if(sum  == target) return true;
           if(sum <  target){
               left++;
           }else right--;

       }
       return false;
   }
    
    public static void main(String[] args) {
        int[] arr = {2,11,7,15};
        int target = 9;
//        System.out.println(Arrays.toString(twoSum(arr , target)));;
        System.out.println(sumTwo(arr , target));
    }
    //brute force
    // tc = n^2

      // run for loop i=0 til n
    // run inside for loop j=0 till n

    // better approach
    // run inside loop j = i+1 till n

    // if i==j continue;
    // if arr[i] + arr[j] == target
    // return i,j


    // better
    // hashing
}
