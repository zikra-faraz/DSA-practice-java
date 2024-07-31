package binary_search;
// find  in mountain array
// return min index
public class leetcode_1095 {

    // half part is incraesing  annd haalf is dec

    // dividing tthem peaak element
    public static  int peakValueIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid +1;
            }  else {
                end=  mid;
            }
        }
return start;
    }

    public static int orderAgnostic(int[] arr , int target , int start , int end){

        boolean isAsc = arr[start]<arr[end];

        while (start<=end){
            int mid = start +(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(target>arr[mid]){
                    end = mid-1;
                } else  {
                    start = mid+1;
                }
            }
        }


        return -1;
    }

    public static int search(int[] arr ,int target){
      int peakValue =   peakValueIndex(arr);
     int res =  orderAgnostic(arr ,target , 0 , peakValue);
     if(res != -1){
        return  res ;
     }
    int result = orderAgnostic(arr  , target , peakValue +1 ,  arr.length-1);
     return  result;
    }
    //find peak search first orderAgnostic binary search
    // in inc part then in dec part
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,2,1,0};
        int t = 2;
        //output 1
        int res= search(arr , 0);
        System.out.println(res);
    }


}
