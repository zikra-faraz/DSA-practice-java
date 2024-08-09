package bitwiseOperator;

import java.util.Arrays;

public class leetcode_832 {
    static int[][] flip(int[][] img){
      for(int[] n : img){
          for (int i = 0; i <( img[0].length+1)/2; i++) {
              int temp   = n[i]^1;
              n[i] = n[img[0].length-i-1]^1;
              n[img[0].length-i-1] = temp;

          }
      }
      return img;
    }

    public static void main(String[] args) {
        int[][] ar = {{1,1,0},{1,0,1},{0,0,0}};
        flip(ar);
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.println(ar[i][j]);
            }

        }
    }
}
