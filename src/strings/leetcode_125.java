package strings;
//https://leetcode.com/problems/valid-palindrome/
public class leetcode_125 {
    static boolean isPal(String s){
       s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "");
//        System.out.println(s);
        for (int i = 0; i < s.length()/2; i++) {
                int start = s.charAt(i);
                int end =  s.charAt(s.length()-1-i);
                if(start!=end) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPal("A man, a plan, a canal: Panama"));;
    }
}
