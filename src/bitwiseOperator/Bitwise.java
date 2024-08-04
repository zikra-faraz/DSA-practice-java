package bitwiseOperator;

public class Bitwise {
    public static void main(String[] args) {
   int a= 68;
        System.out.println( Odd(a));
   int[] arr = {2,3,4,1,2,1,3,6,4};
   int res = Unique(arr);
        System.out.println(res);
    }

    static boolean Odd(int n){

        return (n & 1) == 1;
    }

    static int Unique(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique ^= n;
        }
        return unique;
    }


}
