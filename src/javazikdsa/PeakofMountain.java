package javazikdsa;
//order agnostic binary search in which I don't know about the order of the
//array in which it is sorted
public class PeakofMountain {
//mountainn array also knowwn as bitonic array
    static int PeakValue(int[] arr){
        int start= 0  ;
        int end = arr.length-1;
        while(start!=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //currently in decreasing part
                end = mid;
            }
            if(arr[mid]< arr[mid+1]){
                //currently in increasing  part
                start = mid+1;
            }
        }
        return arr[start];
    }

    //finding a peak value basically finding max value in array


    //possiblities

    //1. if e[mid]> e[mid+1] then I am at decreasing part of array
    //end = mid


    //1. if e[mid]< e[mid+1] then I am at increasing part of array
    //start =  mid

    //in the end start and end both will point to the largest number

    static int Bs(int[] arr , int target , int start , int end){
        while (start<=end){
            int mid =  start + (end-start)/2;
//            System.out.println(mid);
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,45,32,22};
        int[] app ={0,1,2,1};
        System.out.println(PeakValue(arr));
        System.out.println(PeakValue(app));
    }
}
