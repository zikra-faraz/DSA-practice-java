package bitwiseOperator;

public class leetcode_29 {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,1));;
    }
    static long divide(int dividend , int divisor)
    {


        if(dividend==divisor){
            return 1;
        }
        boolean sign = true;
        if(dividend >= 0 && divisor <0) sign = false;
        if(dividend  <=0 && divisor >0  ) sign = false;
        long n  = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        divisor = Math.abs(divisor);
        long quotient = 0;
        while (n >= d)
        {
            int count =  0;
            while (n>=(d<<(count+1))){ //d* 2^count+1
                count++;
            }
                quotient += 1<<count;
              n -= d <<(count);
        }
        if(quotient == (1<<31) && (sign)){
            return Integer.MAX_VALUE;
        }
        if(quotient==(1<<31) && (sign)){
            return Integer.MIN_VALUE;
        }

        return sign? quotient : -quotient;
    }
}
