package array;
//https://leetcode.com/problems/missing-number/description/
public class leetcode_268 {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
           int res =  missingNumber(arr);
        System.out.println(res);
    }
    static int missingNumber(int[] arr){
        int n = arr.length+1;
        int xor1 = 0, xor2= 0;
        for (int i = 0; i < arr.length ; i++) {
            xor2 = xor2^arr[i];
            xor1 = xor1^(i+1);

        }

        return  xor1^xor2;
    }

    // if array is 1-n
//    int n = arr.length+1;
//    int xor1 = 0, xor2= 0;
//        for (int i = 0; i < arr.length-1 ; i++) {
//        xor2 = xor2^arr[i];
//        xor1 = xor1^(i+1);
//
//    }
//   xor1 = xor1^n;
//        return  xor1^xor2;
}
