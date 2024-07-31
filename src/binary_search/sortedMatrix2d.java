package binary_search;

import java.util.Arrays;

public class sortedMatrix2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 6;
        System.out.println(Arrays.toString(search(arr , target)));
    }

    //search in the row provided between the cols provided
    //binary search in parts on remaining rows as well as cols without middle col (parts)

    static int[] binarySearch(int[][] matrix , int r , int cstart , int cend , int target){
        while (cstart <= cend){
            int mid = cstart +(cend - cstart)/2;
          if(matrix[r][mid] == target){
              return new int[]{r,mid};
          }
          if(matrix[r][mid] < target){
              cstart = mid +1;
          }else {
              cend = mid -1;
          }
        }
        return new int[]{-1,-1};
    }

    static int[] search (int[][] arr , int target){
        // now I have to reduce search space
        int rows = arr.length ;
        int cols = arr[0].length; // to check matrix may be empty
        if(cols == 0){
            return new int[]{-1,-1};
        }
        if(rows ==1){
            return binarySearch(arr , 0 , 0 , cols-1 , target);
        }
        // if rows are more than one it is a matrix now find mid col
        int rStart = 0;
        int rEnd = rows-1;
        int colMid = cols/2;
        while (rStart<rEnd-1){
            int mid = rStart + (rEnd -rStart)/2;
            if(arr[mid][colMid] == target){
                return new  int[]{mid , colMid};
            }
            if(arr[mid][colMid] < target){
                rStart = mid;
            }else {
                rEnd = mid;
            }
        }
        // now we have two rows
        // check whether the target is in the col of 2 rows

        //first check for middle col
        if (arr[rStart][colMid] == target) {
            return new int[]{rStart, colMid};
        }
        if (arr[rStart + 1][colMid] == target) {
            return new int[]{rStart + 1, colMid};
        }

        //now check for four parts
        //search in 1st half
        if (target <= arr[rStart][colMid - 1]) {
            return binarySearch(arr, rStart, 0, colMid-1, target);
        }
        // search in 2nd half
        if (target >= arr[rStart][colMid + 1] && target <= arr[rStart][cols - 1]) {
            return binarySearch(arr, rStart, colMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= arr[rStart + 1][colMid - 1]) {
            return binarySearch(arr, rStart + 1, 0, colMid-1, target);
        } else {
            return binarySearch(arr, rStart + 1, colMid + 1, cols - 1, target);
        }
    }
}
