package recursion.arrays;

public class Question {
    // find array is sorted or not
   static boolean isSorted(int[] arr , int index){
       // base condition
       if(index == arr.length -1){
           return true;
       }
        return  arr[index] < arr[index+1] && isSorted(arr , index+1);

   }


}
