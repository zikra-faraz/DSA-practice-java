package javazikdsa;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] num = {2,5,1,3,4,7};
        int n = 3;
       int[] arr = shuffle(num , n);
        for (int i = 0; i < (2*n); i++) {
            System.out.println(arr[i]);
        }


    }
    static int[] shuffle(int[] nums , int n){
        int[] shuffleArray = new int[(2*n)];
        for (int i = 0; i <n; i++) {
                shuffleArray[2*i] = nums[i];
                shuffleArray[(2*i)+1] = nums[i+n];
        }
        return shuffleArray;
    }
}
