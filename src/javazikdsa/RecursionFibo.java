package javazikdsa;

public class RecursionFibo {
    public static void main(String[] args) {
        System.out.println(fibo(-1));
    }
    static int fibo(int n) {
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
