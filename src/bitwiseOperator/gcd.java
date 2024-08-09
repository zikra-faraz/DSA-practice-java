package bitwiseOperator;

public class gcd {
    static void hcf(int a , int b){
        if(a>0 && b>0){
            if(a>b) a=a%b;
            else b = b%a;
            if(a==0) System.out.println(b);
            else System.out.println(a);
        }

    }

    public static void main(String[] args) {
        hcf(5, 10);
    }
}
