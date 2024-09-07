package array;

import java.util.*;

//https://leetcode.com/problems/3sum/description/
public class leetcode_15 {
    // tc = O(n^3) * log(no. of uniques lists) - becuase of set data structure
    // sc = 2* O(no. of triplets)




    // brute force  approach
    static List<List<Integer>> threeSum(int[] arr){
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                   if(arr[i]+ arr[j]+ arr[k] ==  0){
                    List<Integer> lst = Arrays.asList(arr[i] , arr[j] , arr[k]);
                    //sorting elements in ascending order
                    lst.sort(null);
                    set.add(lst);
                   }
                }
            }
        }
        // convert set into  list
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

    // better is to use Hashing
    // tc = n^2 * logm
    // logm for hashset
    // sc = n + no. of lists *2
    static List<List<Integer>> tripletSumHashing(int[] arr){
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i+1; j < arr.length; j++) {
                int third = -(arr[i]+arr[j]);
                if(set.contains(third)){
                    List<Integer> lst  = Arrays.asList(arr[i] , arr[j], third);
                    lst.sort(null);
                    st.add(lst);
                }
                set.add(arr[j]);
            }

        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    // optimal approach
    // 2 pointer approach

    // continue means do not go down further into the code just go  to i++
    static void tripletOptimal(int[] arr){
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(i>0 && arr[i] == arr[i-1]) continue;
             
        }
    }


    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
//        tripletOptimal(arr);
        List<List<Integer>> ans = tripletSumHashing( arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
    }

