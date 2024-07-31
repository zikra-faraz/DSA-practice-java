package binary_search;
// when array is sorted in increasing and decreasing
public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] inarr = {1,2,3,4,5};
        int[] decarr = {5,4,3,2,1};
       int res =  orderAgnosticSearch(inarr ,5);
       int result = orderAgnosticSearch(decarr , 5);
        System.out.println(res);
        System.out.println(result);

    }

    public  static int orderAgnosticSearch (int[] arr , int target){



        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while (start<=end){
            int mid = start +(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(target>arr[mid]){
                    end = mid-1;
                } else  {
                    start = mid+1;
                }
            }
        }


            return -1;
        }


    }








