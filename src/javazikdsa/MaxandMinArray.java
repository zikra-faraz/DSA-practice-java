package javazikdsa;

public class MaxandMinArray {


    static  int maxOfArray (int[]  arr){
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];

            }
        }
 return  maxVal;
    }
    static  int minOfArray (int[]  arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<maxVal){
                maxVal = arr[i];

            }
        }
        return  maxVal;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,5};
        System.out.println(minOfArray(array));
        System.out.println( maxOfArray(array));
//        System.out.println(Integer.MIN_VALUE);
    }
}
