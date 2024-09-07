package array;
//https://leetcode.com/problems/max-consecutive-ones/description/
public class leetcode_485 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
      int res = findMaxOnes(arr);
        System.out.println(res);
    }
    static int findMaxOnes(int[] arr){
        int maxim = 0;
        int count  = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
                maxim = Math.max(maxim,count);
            }else {
               count=0;
            }
        }
        return maxim;
    }
}
