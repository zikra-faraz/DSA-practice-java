package sorting;

import java.util.ArrayList;
import java.util.Arrays;

// much  more optimise algo
public class mergeSort {
//divide and merge
    // divide till 1 and 1 element sort them and merge
    // first sort one  half
    // then sort second half
    // now you  have two  sorted arrays
    // move the pointer and check  which one  is smallest
    // put them into array
    public static void sort(int[] arr , int low , int high){
        // base case condition
        if(low>=high){
            return;
        }
        int mid  = (low + high)/2;
        sort(arr , low , mid);
        sort(arr, mid+1 , high);
        merge(arr , low , mid , high);

    }
    public static void merge(int[] ar , int  low , int mid , int high){
        ArrayList<Integer> temp = new  ArrayList();
        int left  = low;
        int right   = mid+1;
        while (left <= mid && right <= high){
            if(ar[left] <= ar[right]){
                temp.add(ar[left]);
                left++;
            } else {
                temp.add(ar[right]);
                right++;
            }
        }

        // for elements left in left
        while (left<=mid){
            temp.add(ar[left]);
            left++;
        }
        // for elements left in right
        while (right<= high){
            temp.add(ar[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            ar[i] = temp.get(i-low);
        }
    }
    public static void main(String[] args) {
            int[] arr = { 3,1,2,4,1,5,2};
            int  n = arr.length-1;
            sort(arr , 0 ,n );
        System.out.println(Arrays.toString(arr));
    }
}
