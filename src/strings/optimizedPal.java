package strings;

public class optimizedPal {
    static boolean isPalindrome(String s) {
      int left =  0;
      int right = s.length()-1;
      while (left<right){
          char leftChar = s.charAt(left);
          char rightChar = s.charAt(right);
          if(!Character.isLetterOrDigit(leftChar)){
              left++;
          } else if (!Character.isLetterOrDigit(rightChar)) {
              right--;
          } else {
              if(Character.toLowerCase(leftChar)!=Character.toLowerCase(rightChar)){
                  return false;
              }
              left++;
              right--;
          }
      }
      return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

}
