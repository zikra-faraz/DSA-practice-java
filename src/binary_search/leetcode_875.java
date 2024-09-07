package binary_search;

public class leetcode_875 {
    // max value in array
    public static int max(int[] ar){
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]>m){
                m = ar[i];
            }
        }
        return m;
    }
    public static int minEatingSpeed(int[] piles, int h) {
      int high =   max(piles);
        int low  = 1;
        while (low<= high){
            int mid  = (low + high)/2;
            long hrs  = func(piles , mid);
            if(hrs<=h){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        //I want min hour to take where sum of hours = h or lesser than h not greater than h
       return low;
    }
    public static long func(int[] arr , int hourly){
        // hourly is number of  bananas per hour
        long totalhrs = 0;
        for (int i = 0; i < arr.length; i++) {
                totalhrs = totalhrs + (long)Math.ceil((double)(arr[i])/(double)(hourly));
        }
            return  totalhrs;
    }

    public static void main(String[] args) {
  int[] arr = {30,11,23,4,20};
  int[] ar = {3,6,7,11};
  int[] c = {805306368,805306368,805306368};
  int data = max(arr);
       int val = minEatingSpeed(c , 1000000000 );
        System.out.println(val);

    }
}
