package binary_search;


// peak index in a mountain array
// bi-tonic array
// first part is increasing second is decreasing


       //4
     //3   //2
   //2         //1
//1              //0
public class leetcode_852 {
    public  static  int peakInMountain(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
        while (start < end){
            int mid  = start +(end - start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in dec part of array
                end = mid;

            } else {
                start = mid+1;
            }

        }
      return  start;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,1,0};
        int[] a = {0,1,2,1,0};
      int res =   peakInMountain(a);
        System.out.println(res);
    }
}


//mid > mid+1 so it