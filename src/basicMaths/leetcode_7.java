package basicMaths;
//https://leetcode.com/problems/reverse-integer/
public class leetcode_7 {
    public static void main(String[] args) {
     int res =Reverse(1534236469);
        System.out.println(res);
    }
    static int Reverse(int a){
//        if(a > (1<<31))
        int num = 0;
        int rev = 0;
        int n = Math.abs(a);
        while (n>0){
           num =  n%10;
           if(rev> (Integer.MAX_VALUE -num)/10){
               return 0;
           }
           rev = (rev*10)+num;
           n /= 10;
        }
      return a>0?rev :-rev;
    }
}
