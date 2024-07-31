package binary_search;

import java.util.Arrays;



// brute force is the worst possible solution which means not optimized but it is working properly
//logn+logn is logn
// n+n =  n

        import java.util.Arrays;

public  class leetcode_34  {


    public static   int[] searchRange(int[] arr , int target){
        int[] ans = {-1,-1};
        int start = search(arr , target , true);
        int end = search(arr , target , false);
        ans[0] = start ;
        ans[1] = end;
        return ans;
    }


    // this  function returns the index value of target
    public static int search(int[] arr , int target , boolean firstPosition){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int  mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;

            } else if (target>arr[mid]) {
                start = mid+1;

            }else {
                ans = mid;
                if(firstPosition){
                    end= mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,5,5,7};
        int target = 5;
       int[] result = searchRange(arr , target);
        System.out.println(Arrays.toString(result));


    }
}

