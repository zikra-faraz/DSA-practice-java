package bitwiseOperator;

public class sieve_leetcode_204 {
    static int countPrimes(int  n){
        if(n<=1) return 0;

        int count =0;
        boolean[]  prime = new boolean[n];

        // Initialize all numbers as potential primes
        for (int i = 2; i < n ; i++) {
          prime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i*i < n; i++) {
            if(prime[i]){
                for (int j = i*i; j < n ; j+=i) {
                   prime[j] = false;
                }
            }

        }

        //count primes
        for (int i = 2; i < n; i++) {
            if(prime[i]){
              count++;
                System.out.println(i);
            }
        }
        return count;
    }
   static int count(int n){
       boolean[] notPrime = new boolean[n];
       for (int i = 0; i < notPrime.length ; i++) {
           System.out.println(notPrime[i]);
       }
       int count = 0;
       for (int i = 2; i < n; i++) {
           if (notPrime[i] == false) {
               count++;

               for (int j = 2; i*j < n; j++) {
                   notPrime[i*j] = true;
               }
           }
       }

       return count;
   }

   static int countPrimelessthann(int n){
        boolean[] primes=  new boolean[n];
        int count = 0;
        if(n<=2) return 0;
        int limit = (int)Math.sqrt(n);
        // false in array means number is prime
       for (int i = 2; i<=limit ; i++) {
           if(!primes[i]){
               //now mark all multiples of i to true which means they are  composite
               for (int j = i*i; j < n ; j+=i) {
                    primes[j] = true;
               }
               
           }
       }
       for (int i = 2; i <n ; i++) {
           if(!primes[i]) {
//               System.out.println(i);
             count++;
           }
       }
      return count;
   }
    public static void main(String[] args) {
//      int res=  countPrimes(5000000);
//        System.out.println("count is "+res);
//        System.out.println(count(4));
        int res = countPrimelessthann(13);
        System.out.println(res);
    }
}
