package javazikdsa;



public class Palindrome {
    public static void main(String[] args) {
        String h1 = "wow";
        System.out.println(isPalindrome(h1));
    }
  static boolean isPalindrome(String str){
      str.toLowerCase();
      if(str == null || str.length()==0){
          return  true;
      }
      for (int i = 0; i < str.length()/2; i++) {
          char start = str.charAt(i);
          char end = str.charAt(str.length() -1 -i);
          if(start != end){
              return  false;
          }
      }
      return  true;

  }
}