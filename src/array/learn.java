package array;

public class learn {

    //globally power is 10^7 and in main function it is 10^6
   static int[] a = new  int[5];
    public static void main(String[] args) {
//        int[] arr = new int[6];
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        int[] array = {1,2,3,4,5,6,7};
        int[] ar = {1,1,2,2,2,3,3};
//        int res =  SecondLargest(array);
//        System.out.println(res);
        int result = removeDupllicatesSortedArray(ar);
        System.out.println("result is " + result);
    }


    //  optimal solution for second largest
    static int SecondLargest(int[] arr){
            int largest =  arr[0];
            int sLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]>largest){
                sLargest= largest;
                largest = arr[i];
            } else if (arr[i]<largest && arr[i]>sLargest) {
                sLargest = arr[i];
            }

        }
        return sLargest;
    }


    // return count of that unique elements in duplicates sorted array
    // tc= n sc= 1
    static int removeDupllicatesSortedArray(int[] arr){
        int i =0 ;
        for (int j = 1; j < arr.length ; j++) {
            if(arr[i]!= arr[j] ){
                arr[i+1] = arr[j];
                i++;
            }
        }
        // array after changes
        for (int j = 0; j < arr.length ; j++) {
            System.out.println(arr[j]);
        }
 return i+1;
    }
}
//if finding second largest element
// brute approach -
// tc = nlogn + n
// sort and then compare second largest from last run loop from i  =n-2

//better approach -
// tc = 2n = n+n
// firts pass find largest
// second pass find second largest




//remove duplicates in-place form sorted array

// not create new array
// brute approach
//int[] arr = {1,1,2,2,2,3,3};
// use set tc = nlogn + n
//nlogn for set inserting elements // n for putting at arr index
//sc = n for set if all elements in array is unique

// optimal approach
// 2 pointer


