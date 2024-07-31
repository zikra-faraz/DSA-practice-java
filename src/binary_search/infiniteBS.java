package binary_search;
// Find position of an element in a sorted array of infinite numbers
public class infiniteBS {
    // arr.length is not specified

    public static int searchInInfiniteArray (int[] arr , int target) {
        int start = 0;
        int end = 1;
        //expand search range until target is in that range
        while (end<arr.length &&  target > arr[end]) {
           int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        if(end >= arr.length){
            end = arr.length-1;
        }
//        System.out.println( start +  "start");
//        System.out.println(end + "end");
        int res = binarySearch(arr , target , start , end);
//        System.out.println(res);
      if(res>=0) {
          return res;
      }
      return -1;
    }
    public static int binarySearch(int[] arr , int target , int start , int  end){

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

    public static void main(String[] args) {
        int[] arr = {1,2,3,34,55,66,77,88 , 89 , 91 , 95, 100 , 103, 105 , 150 , 189 , 200};
        int target = 20;
       int result =   searchInInfiniteArray(arr , target);
        System.out.println(result);
    }
}








