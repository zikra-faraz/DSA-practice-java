package bitwiseOperator;

public class powerXN {
    public static void main(String[] args) {
        System.out.println(power(-1.0000,-2147483648));
    }
    static double power(double x , int n){
        if(n==0 || x==1) return 1;
        if(x==-1 && n==Integer.MIN_VALUE) return 1;
        if(n==Integer.MIN_VALUE ) return 0;

        int ogx = n;
        n = Math.abs(n);
        double ans = 1;
        while (n>0){
            if(n%2==1){
                ans = ans*x;
                n = n-1;
            }else {
                n=n/2;
                x = x*x;
            }
        }

        System.out.println("ans "+ans);
        if(ogx<0){
            double a = 1/ans;
            return a;
        }
return ans;
    }
}
