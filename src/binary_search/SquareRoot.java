package binary_search;

public class SquareRoot {
    // square root of a number
    // max int after squaring less than or equal to number
    public static   int squareRoot(int n){
        int low = 1;

        int high = n;
        while (low<=high){
            long m = (low + high)/2;
            long val  = m*m;
            if(val<=(long)(n)){

                low = (int)m+1;
            }
            else {
                high = (int)m-1;
            }
        }
   return high;
    }
   // m is main number
    // n is nth root
    // n= 2 , m= 9
    public static  int Nthroot(int n , int m ){
        int low = 1;
        int high = m;
        while (low<=high){
            int mid  = (low+high)/2;
            int ans = findMultiple(m,n,mid);
//            System.out.println(ans);
            if(ans ==1){
//                System.out.println(mid);
                return mid;
            } else if (ans==0) {
                low = mid+1;
            }else {
                high = mid-1;
            }

        }
        return -1;
    }
    public static int findMultiple(int m , int n ,int i){
        // m is actual number
        // n is root times
        // i is like if i = 1 and n = 3 then 1*1*1

        //Return 1 if mid == m
        //Return 0 if mid < m
        //Return 2 if mid > m
        long ans = 1;
        for (int j = 0; j < n; j++) {
            ans *=i;
            if(ans>m) return 2;

        }
        if(ans==m){
            return 1;
        }
        return 0;

    }
    public static void main(String[] args) {
        System.out.println(Nthroot(9,1953125));
//        System.out.println(squareRoot(1743495834));
    }
}
