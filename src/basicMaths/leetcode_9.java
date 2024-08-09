package basicMaths;

public class leetcode_9 {
    public static void main(String[] args) {
  boolean r = isPalUseStr(-1331);
        System.out.println(r);
    }
    static boolean isPla (int a){
        if(a<0) return false;
        if(rev(a)==a){
            return true;
        }else return false;
    }

    static int rev(int a){
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


    static boolean isPalUseStr(int n) {
        String s = String.valueOf(n);
        System.out.println(s);
        int len = s.length();
        String y = "";
        for (int i = len-1; i >=0; i--) {
            y += s.charAt(i);

        }
        System.out.println(y);
        for (int i = 0; i < len/2 ; i++) {

            if(s.charAt(i) == s.charAt(len-i-1)) return true;

        }

        return false;
    }
}
