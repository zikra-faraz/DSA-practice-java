package array;

public class leetcode_121 {
    public static void main(String[] args) {
        int[] ar = {7,1,5,3,6,4};
        int[] ab = {7,6,4,3,1};
        System.out.println(maxProfit(ab));
    }
    static int maxProfit(int[] arr){
        int min = arr[0] , profit = 0;
        for (int i = 0; i < arr.length; i++) {
            int  cost  = arr[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(min,arr[i]);
        }
        return profit;
    }
}
