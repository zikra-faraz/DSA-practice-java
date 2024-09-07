package strings;
//https://leetcode.com/problems/valid-anagram/description/
public class leetcode_242 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
          boolean res =     isAnagram(s, t);
        System.out.println(res);
    }

    static boolean isAnagram(String s , String t){
        if(s.length() != t.length()) return false;
       int[] alphabets = new int[26];
       for(int i =0; i<s.length(); i++) alphabets[s.charAt(i) - 'a']++;
        for(int i =0; i<t.length(); i++) alphabets[t.charAt(i) - 'a']--;
//        for (int i = 0; i < alphabets.length; i++) {
//            System.out.println(alphabets[i]);
//        }
        for (int i : alphabets) if (i != 0) return false;

//        for (int i = 0; i < alphabets.length; i++) {
//            if (alphabets[i] != 0) {
//                return false;
//            }
//        }




        return true;
    }

}
