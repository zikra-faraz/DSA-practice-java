package array;

import java.util.HashMap;
// for positives and negatives along  with zero
public class longestSubarrayWithSumK {
        static int lengthOfSubArray(int[] arr , int  k  , int n){

            int sum = 0;
            int maxlen = 0;
            HashMap<Integer , Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if(sum == k){
                    maxlen = Math.max(maxlen , i+1);
                }
                int rem = sum -k;
                if(map.containsKey(rem)){
                    maxlen = Math.max(maxlen , i- map.get(rem));
                }


                //if value does not exist in  the Hashmap add it sum value
                if(!map.containsKey(sum)){
                    map.put(sum, i);
                }
            }
            return maxlen;
        }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int  k = 15;
        int n = arr.length;
//        System.out.println(lengthOfSubArray(arr, k ,n ));
        System.out.println(longestSumPositiveAndZero(arr, k));
    }

    static int longestSumPositiveAndZero(int[] arr , int k){
            // two pointers
        int left = 0;
        int right = 0;
        int n = arr.length;
        int maxlen = 0;
        int sum = arr[0];
        // this loop is O(n) complexity
        while (right < n){

            while (left<= right && sum > k){
                sum -= arr[left];
                left ++;
            }
          if(sum==k){
             maxlen = Math.max(maxlen , right-left+1);
          }
          right++;
          if(right<n) {
              sum += arr[right];
          }
        }
        return maxlen;
    }
}
