package binary_search;
// search in rotated sorted array
// values  are distinct
public class leetcode_33 {

    // find pivot
    // search in first half
    // search in second half
    static  int findPivot (int[] arr){
        int start = 0;
        int  end = arr.length -1 ;
      while (start<=end){
          int mid = start +(end - start)/2;
          if(mid<end && arr[mid]> arr[mid +1]){
              return mid;
          }

          if (mid>start && arr[mid]<arr[mid-1]) {
              return mid -1;

          }

          if (  arr[mid] <= arr[start]) {
              end = mid-1;
          }else {
              start = mid +1;
          }
      }
       return -1;
    }

 static int bs(int[] arr , int target , int start, int end){
     while (start<=end){
         int mid = start +(end-start)/2;
         if(target<arr[mid]){
             end = mid-1;
         } else if (target > arr[mid]) {
             start = mid+1;
         }else {
             return  mid;
         }
     }
     return -1;
 }

    static int searchInRBS(int[] arr , int target){
        int pivot = findPivot(arr);
        System.out.println(pivot);
        if(pivot == -1){
            return bs(arr , target , 0 ,  arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
     if(target >= arr[0]){
         return bs(arr , target , 0 , pivot-1);
     }
     return bs(arr , target , pivot+1 , arr.length-1);
    }


    public static void main(String[] args) {
        int[] arr = { 5,6,  2,3,4};
        int[] a = {4,5,6,7,0,1,2,3} ;
        int[] c= {3,4,5,6,1,2};
        int target = 2;
        // pivot is 7
        int res = findPivot(a);
        System.out.println("Pivot is " + res);
        int result = searchInRBS(c,target );
        System.out.println("search result is " + result);
    }
// - mid > mid+1  = mid is pivot
  // mid < mid -1  = mid-1 is pivot
// start > mid
    // -- end = mid-1
    // start < mid
    // -- start  = mid +1

}


