package binary_search;

public class bs {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,55,67,77,88};
        int t = 56;
       int res=  binarySearch(arr , t);
        System.out.println(res);

    }

    public static int binarySearch(int[] arr , int target){
        int start =0 ;
        int  end = arr.length-1;
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
}
