package javazikdsa;

public class Average {
    public static void main(String[] args) {
        int[] arr = {1,2,34 , 4,5,6};
        float sum =0;
        for (int i = 0; i < arr.length; i++) {
          sum += arr[i];

        }
        System.out.println(arr.length);
        System.out.println(sum);
        float avg = sum/arr.length;
        System.out.println(avg);
    }
}
