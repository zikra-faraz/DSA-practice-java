package javazikdsa;

public class goodPairs {

    public static void main(String[] args) {
      int[] nums ={1,1,1,1};
      int val= goodPairNum(nums);
        System.out.println(val);
    }

    static int goodPairNum(int[] arr){
        int count = 0;
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
              if(arr[i] == arr[j] && i<j){
                  count++;
              }
            }
        }
        return count;
    }




}
