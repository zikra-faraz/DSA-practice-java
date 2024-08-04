package bitwiseOperator;
// Find ith bit of a number
public class setReset {
  //mask find ith bit
  //set turn ith bit to 1
  //reset turn ith bit to 0


  //set ==1
  //reset  clear == 0
  public static void main(String[] args) {
    System.out.println(powerOfTwo(3));
  }

  //check ith bit is set or not using bitwise operators without
  // converting numbers into bits 0 and 1
  static boolean powerOfTwo(int n) {
    return (n>0)&& (n & (n - 1)) == 0;

  }

}