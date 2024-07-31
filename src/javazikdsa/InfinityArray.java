package javazikdsa;
//To find target value in sorted  infinite array ---
//Break the array as we don't know the length of the array
//Break array like (2,4,8,16) -- this is box size of sub-array in  array
//change the start and end continuously until the element found
//time complexity is O(logn)
public class InfinityArray {

    //length of the box in an array e-s+1;
    static  int findingAnswer(int[]arr , int target){
        int start = 0;
        int end=1;
        int val = arr[0];
        while(val<target){

          try {
              int newStart = end+1;
              System.out.println(newStart);
              end = end + (end - start +1)*2;
              System.out.println("end "+ end);
              start = newStart;
              val = arr[end];
          }catch (ArrayIndexOutOfBoundsException e){
             end = end/2;
              System.out.println(e);
          }

        }
        System.out.println(start);
        System.out.println(end);
//        System.out.println(start);
//        System.out.println(end);
        return Bs(arr , target , start , end);
    };

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
        int[]  array = {1,2,3,4,5,6,7,8,9,10,11,22,33,34,56,78,89,100};
        int target = 78;
        int val = findingAnswer(array , target );
        System.out.println(val);
    }
}
