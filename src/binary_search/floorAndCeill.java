package binary_search;

public class floorAndCeill {
  // floor  = largest no. in  array <=x
  // ceil = smallest no. in array >=x
  static int floor(int[] arr , int target){
    int ans = -1;
    int low = 0;
    int high = arr.length -1;
    while (low<=high){
      int mid = low + (high-low)/2;

          if (arr[mid]<=target) {
            ans = arr[mid];
            low = mid +1;
        } else {
          high = mid-1;
        }
    }
    return ans;
  }
  // ceil is lower bound
  static int ceil(int[] arr , int target){
    int ans = -1;
    int low = 0;
    int high = arr.length -1;
    while (low<=high){
      int mid = low + (high-low)/2;
       if (arr[mid]>=target) {
        low = mid +1;
      } else {
        high = mid-1;
      }
    }
    return low;
  }




    public static void main(String[] args) {
        int[] c = {1,2,5,8,9,12};
        int t = 3;
      System.out.println( floor(c,t));;
      System.out.println(ceil(c,t));
    }
}
