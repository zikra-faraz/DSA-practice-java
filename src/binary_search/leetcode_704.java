package binary_search;

public class leetcode_704 {
    static int search(int[] nums , int t){
        int start =0;
        int end  = nums.length-1;

        while (start<=end){
            int mid  = start + (end - start)/2;
            if(nums[mid]==t){
                return mid;

            } else if (t <nums[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        int[] ar = {-1,0,3,5,9,12};
        int t = 79;
        System.out.println(search(ar ,t));
    }
}
