package array;

public class leetcode_189 {
    public static void main(String[] args) {
//        rightRotateByKplace(arr , k);
    }

    static void leftRotateByKplace(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // to handle cases where k >= n

        // Reverse the first k elements
        reverse(arr, 0, k-1);

        // Reverse the rest of the elements
        reverse(arr, k, n-1);

        // Reverse the whole array
        reverse(arr, 0, n-1);

        // Print the rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    static  void rightRotateByKplace(int[] arr , int k){
        int n= arr.length;
//        System.out.println("length of array "  + n);
        k = k%n;
//        System.out.println(k);
        reverse(arr,0, n-k-1);
        reverse(arr , n-k, n-1);
        reverse(arr, 0, n-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(Arrays.toString(arr));
    }
    static  void reverse (int[] arr , int start , int end){
        while (start<= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
