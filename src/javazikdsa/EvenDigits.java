package javazikdsa;

public class EvenDigits {


    //number of digits
    //34567
    static  int numOfDigits(int num){
       int count =0;
       while (num>0){
           count++;
           num = num/10;

       }
       return  count;
    }

    static  boolean evenNumOfDigits(int num){
        if(numOfDigits(num)%2 ==0) return  true;
        return  false;
    }

    static int evenDigitsinArray(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]);
          if(evenNumOfDigits(arr[i])){
              count++;
          }

        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {23, 45, 11 , 34  , 9449 , 1 , 5};
//        System.out.println(evenDigitsinArray(nums));
        System.out.println(evenDigitsinArray(nums));
//        System.out.println(evenNumOfDigits(45678));
//        System.out.println(numOfDigits(4563442));
    }
}
