package bitwiseOperator;

public class bitManipulation {
    public static void main(String[] args) {
        swap(5,6);

        System.out.println("set bits count are  " + countSetBits(13));
        System.out.println("another way to count set bit of a number by reset its set bit " + countSetBit(129));
    }

    //swap using xor
    static void swap(int a , int  b){
        System.out.println("before a is  " + a );
        System.out.println("before b  is  " + b);
        a = a^b;
        b =  a^b;
        a = a^b;
        //since a^a = 0
        System.out.println(a);
        System.out.println(b);
    }

    static int  countSetBits(int n){
        int count = 0;
        while (n >1){
//            if(n%2 ==1) count++;
//               n = n/2;
            if((n&1)==1) count++;
            n = n>>1;


        }
        if(n==1) count++;

        return count;
    }

    static int countSetBit(int n){
        int cnt = 0;
        while (n!=0){
            n = n & (n-1);
            cnt++;
        }
        return cnt;
    }

}
