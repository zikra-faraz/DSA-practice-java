package basicMaths;


//if division is by 10 logbase10N
// if division is by 2 logbase2N
// if N/5 than logbase5N
public class countDigits {
    public static void main(String[] args) {
     count(2446);
    }

    // time complexity is O(log10(n))
    static void count(int n){
        int cnt = 0;
        int originalNumber = n;
        while (n>0){

          int num = n%10;
         if(num!=0 && originalNumber%num ==0){
             cnt++;
         }
         n = n/10;
            System.out.println(num);

        }

        System.out.println("number of digits  "+cnt);
    }

    //count number of digits
    //(int)(log10(n)+1)
}
