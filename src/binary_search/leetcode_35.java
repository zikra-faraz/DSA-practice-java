package binary_search;

public class leetcode_35 {

    public  static  int searchInsert(int[] arr , int t){
        int start  = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end -start)/2;
            if(arr[mid]==t){
                return mid;
            } else if (arr[mid]<t) {
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
      return start;

    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int[] a  = {1,3};
        System.out.println(searchInsert(a , 2));
    }
}
