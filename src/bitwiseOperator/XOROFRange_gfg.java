package bitwiseOperator;
//Find XOR of numbers from L to R
public class XOROFRange_gfg {
    public static void main(String[] args) {
        System.out.println(  xor(4,8) );
    }
    static int xor(int L , int R){
        int ans = 0;
        for (int i = L; i <= R ; i++) {
           ans ^=  i;
        }
        return ans;
    }
}
