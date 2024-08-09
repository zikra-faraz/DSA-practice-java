package bitwiseOperator;

public class convert2binary {
    public static void main(String[] args) {
        System.out.println(convert2bin(13));
        String s ="100";
        System.out.println(Convert2decimal(s));
//        System.out.println("anothert method " + covert2decimal(s));
    }


    static StringBuilder convert2bin(int n){
        // Time complexity = log2n
        // space complexity = log2n
        //tc  is determined by the number of iterations in the while loop.
        // The number of bits required to represent a number n in binary is approximately
        //log2n
        StringBuilder reversed = new StringBuilder();
        String binary  = "";
        while (n!=0){
            if(n%2 ==1) binary += "1";
            else binary += "0";
            n = n/2;
        }
        reversed.append(binary);
        reversed.reverse();
       return reversed;
    }

   static int Convert2decimal(String str){
        //tc O(len)
       //sc O(1)
        int len = str.length();
       System.out.println("length of  " +len);
        int num = 0;
        int p2 = 1;
       for (int i = 0;i<len; i++) {
           System.out.println("index"+i);
           System.out.println("char" + str.charAt(i));
             if(str.charAt(len-i-1)=='1'){
             num += 1<<i;
             }
       }
       return num;
   }


}
