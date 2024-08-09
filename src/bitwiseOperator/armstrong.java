package bitwiseOperator;

public class armstrong {
    public static void main(String[] args) {
        System.out.println(armstrong(1534));
    }
    static boolean armstrong(int n){
        int og= n;
        int sum = 0;
        while (n>0){
            int num = n%10;
            sum += num*num*num;
            n /=10;
        }
        if(sum==og){
            return true;
        }else return false;
    }
}
