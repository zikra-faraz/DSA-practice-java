package array;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-subarray/description/
public class leetcode_53 {
    static int[] MaximumSubArray(int[] arr){

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start  = -1;
        int end  = -1;


        for (int i = 0; i < arr.length ; i++) {
            if(sum==0){
              start = i;
            }
            sum  += arr[i];

            if(sum> max){
                max = sum;
                end = i;
            }
            if(sum < 0 ){
                sum  = 0;
            }
        }
        System.out.println(start);
        System.out.println(end);
        int n= end-start+1;
        int[] ar = new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i] = arr[start+i];
        }
        return ar;
    }

    public static void main(String[] args) {
        int[] n = {-2,1,-3,4,-1,2,1,-5,4};
        int[] aa = {1};
        int[] abc = {5,4,-1,7,8};
        System.out.println(Arrays.toString(MaximumSubArray(n)));
    }
}
