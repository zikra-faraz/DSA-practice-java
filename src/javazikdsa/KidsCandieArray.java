package javazikdsa;

import java.util.ArrayList;
import java.util.Arrays;

public class KidsCandieArray {
    public static void main(String[] args) {
int[] array = {1,2,3,4,2};
        System.out.println(maxVal(array));
        int extraCandie = 1;
        ArrayList<Boolean> result = kidsWithCandies(array  , extraCandie);
        System.out.println(result);
    }
    static int maxVal(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
           if(max <arr[i]) {
               max = arr[i];
           }
        }
        return max;
    }
   static ArrayList<Boolean> kidsWithCandies (int[] candies , int extraCandie ){
       int maxCandie = maxVal(candies);
       ArrayList<Boolean> list = new ArrayList<>(candies.length);
//       Boolean[] arr = new Boolean[candies.length];
       for (int i = 0; i < candies.length; i++) {


           if(candies[i] + extraCandie >=maxCandie){
              list.add(true);
           }else {
              list.add(false);
           }
       }
       return list;
   }

}
