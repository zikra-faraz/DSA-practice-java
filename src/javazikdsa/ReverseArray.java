package javazikdsa;

import java.sql.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,34,5};
        int reversed[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           reversed[i] = arr[arr.length -i-1];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
