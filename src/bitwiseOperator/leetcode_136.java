package bitwiseOperator;

public class leetcode_136 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int res= single(arr);
        System.out.println(res);
    }

    static int single(int[] arr){
        int uni= 0;
        for (int i = 0; i < arr.length; i++) {
            uni ^= arr[i];
        }
        return uni;
    }
}
