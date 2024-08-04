package recursion;

public class bs {

    public static void main(String[] args) {
        int[] arr = {1,22,33,44,55,66,77};
        int t =  67;
       int res=  search(arr ,t , 0 ,arr.length-1);
        System.out.println(res);
    }

static int  search(int[] arr ,  int target , int s , int e){
    if(s>e){
        return -1;
    }
    int m  = s+(e-s)/2;
    if(arr[m] ==target){
        return m;
    }
    if(arr[m]>target){
        return search(arr , target , s , m-1 );
    }
    return search(arr , target , m+1 , e);
}
// sub recursion call is there make sure to return it whenever the function
//  has  return type
}
