package javazikdsa;

public class Binarysearch {
    static  int bs  (int[] arr , int target){
            int start = 0;
            int end = arr.length-1;


//        System.out.println(start);
//        System.out.println(end);
         while(start<=end){
             int  mid = start+ (end-start)/2;
//             System.out.println(mid);
             if(target == arr[mid]){
                 return mid;
             }
             if(target < arr[mid]){
                 end = mid-1;
             }else {
                 start = mid+1;
             }


         }

//        while (start<=end){
//            int  mid = start+ (end-start)/2;
//            System.out.println(mid);
//            if(target == arr[mid]){
//                return  mid;
//            }
//        }
     return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,67,89};
        int t = 1;
       int val =  bs(arr , t) ;
        System.out.println(val);
    }
}
//dsa python-project