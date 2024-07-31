package binary_search;

public class leetcode_410 {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        splitArray(arr , 2);
    }

    public  static  int  splitArray(int[] nums , int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            // it will return the max value  of array which min range
            start = Math.max(start , nums[i]);
            end =  end + nums[i];

        }

//
//        System.out.println(start);
//        System.out.println(end);

        //binary search
        while (start<end){
            // try for middle as potential answer
            int mid = start + (end -  start)/2;
            //calculate how many  pieces you can divide this in  with  this
            // max sum
            int sum = 0;
            int pieces =1;
            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;

                }else {
                   sum +=num;
                }
            }
    if(pieces>m){
        start = mid+1;
    } else {
        end = mid;
    }


        }
        return end; // here start == end
    }
}
