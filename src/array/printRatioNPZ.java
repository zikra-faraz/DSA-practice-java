package array;

import java.util.Scanner;

public class printRatioNPZ {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(int[] arr) {

        int n = arr.length;
        int zeroCount = 0;
        int plusCount = 0;
        int minusCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else if (arr[i] > 0) {
                plusCount++;
            } else {
                minusCount++;
            }
        }

        double plusRatio = (double) plusCount / n;
        double minusRatio = (double) minusCount / n;
        double zeroRatio = (double) zeroCount / n;

        System.out.printf("%.6f\n", plusRatio);
        System.out.printf("%.6f\n", minusRatio);
        System.out.printf("%.6f\n", zeroRatio);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter values of array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        plusMinus(arr);

        scanner.close();
    }
}
















