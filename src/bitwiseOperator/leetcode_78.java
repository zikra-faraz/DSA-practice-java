package bitwiseOperator;

import  java.util.*;
// subset of a number
public class leetcode_78 {
    public static void main(String[] args) {
        int[] arr  = {1,2,3};
        List<List<Integer>> ans  = subsets(arr);
        for(List<Integer> subset : ans){
            System.out.println(subset);
        }

    }
  static List<List<Integer>> subsets(int[] arr){
        int n = arr.length;
      int subset =  1<< n;
      List<List<Integer>> ans  = new ArrayList<>();
      for (int i = 0; i < subset; i++) {
          List<Integer> subs = new ArrayList<>();
          for (int j = 0; j < n ; j++) {
              if((i & (1<<j))>0){
                   subs.add(arr[j]);
              }

          }
        ans.add(subs);

      }
      return ans;
  }

}
