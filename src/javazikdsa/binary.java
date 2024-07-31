package javazikdsa;

public class binary {

    static  int bs(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid;
            mid = start + (end-start)/2;
          if(target>arr[mid])  {
              start= mid+1;
          } else if (target<arr[mid]) {
              end=mid-1;
          }else {
              return mid; 
          }
        }
        return -1;
    };
    public static void main(String[] args) {
   int[]  arr ={12,34,56,67,78,89};

   int target = 56;
   int res= bs(arr , target);
        System.out.println(res);
    }
}
