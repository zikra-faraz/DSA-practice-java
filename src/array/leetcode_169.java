package array;

import java.util.HashMap;
import java.util.Map;

public class leetcode_169 {

    // brute force approach
    // tc = O(n^2)
    static int majorityElement(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n ; j++) {
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > n/2){
                return arr[i];
            }
        }
        return -1;
    }


      //better solution
    // Hashing
    // tc = n+n
    // sc = n
    static int mEusingHashmap(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
          if(map.containsKey(arr[i])){
                    map.put(arr[i] ,  map.get(arr[i])+1);
            }else {
              map.put(arr[i], 1);
          }

        }
        for (int i = 0; i < map.size(); i++) {
            if(map.get(arr[i])> (n/2)){
                return arr[i];
            }
        }
        return -1;
    }
    // Or

    static int mEusingHashmapAnotherWay(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        // Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check for majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1; // No majority element found
    }




    //optimal solution
    //Moore's voting algorithm
    // apply moore's voting algo
    // verify if ele majority or not

    // if majority element might not exist in the array
    static int MooreVotingAlgo(int[] arr){
        int cnt = 0;
        int n = arr.length;
        int ele=0;
        for (int i = 0; i < n ; i++) {
            if(cnt == 0){
                cnt = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return ele;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i] == ele) count++;
//            if(count > n/2){
//                return ele;
//            }
//        }
//        return -1;
    }


    public static void main(String[] args) {
        int[] a = {2,4,1,3,4,4,3,4,4};
//        System.out.println(majorityElement(a));
        System.out.println(MooreVotingAlgo(a));
    }
}
