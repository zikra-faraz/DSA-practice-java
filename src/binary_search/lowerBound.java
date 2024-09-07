package binary_search;
// smallest index such that arr[ind] >= x
// ceil
public class lowerBound {

    public static int binarySearch(int[] arr , int target){
        int start =0 ;
        int  end = arr.length-1;
        int ans = arr.length;
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
        return ans;
    }


    // upper bound
    // smallest index such that arr[ind]>target

    public static int binarySearchUpperBound(int[] arr , int target ){
        int start =0 ;
        int  end = arr.length-1;
        int ans = arr.length;
        while (start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                ans = mid;
                end = mid -1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a  = {1,2,3,3,5,8,8,10,10,11};
        int t = 7;
//        System.out.println(binarySearch(a,t));
        System.out.println(binarySearchUpperBound(a ,7));
    }
}
