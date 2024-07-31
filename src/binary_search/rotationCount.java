package binary_search;

public class rotationCount {

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
      int res =  countRotation(arr);
        System.out.println(res);
    }
    static int countRotation(int[] arr){
        int pivot = findPivot(arr);
        //means array is not rotated
                if(pivot==-1){
                    return 0;
                }
                return pivot+1;
    }

    static  int findPivot (int[] arr){
        int start = 0;
        int  end = arr.length -1 ;
        while (start<=end){
            int mid = start +(end - start)/2;
            if(mid<end && arr[mid]> arr[mid +1]){
                return mid;
            }

            if (mid>start && arr[mid]<arr[mid-1]) {
                return mid -1;

            }

            if (  arr[mid] <= arr[start]) {
                end = mid-1;
            }else {
                start = mid +1;
            }
        }
        return -1;
    }



    static int searchPivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int  mid =  start +(end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }


            //if start end mid are equal elements
            if(arr[mid] == arr[end] && arr[mid] == arr[start]){
                //check if start is pivot
                if(arr[start]> arr[start+1]){
                    return start;
                }
                //skip the duplicates
                start++;
                //check if end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                //skip the duplicates

                end--;
                //because I want largest element so end  side has greater element check pivot in that areaa
            } else if (arr[start]<arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid+1;

            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
