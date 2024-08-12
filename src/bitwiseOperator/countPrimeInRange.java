package bitwiseOperator;


import java.util.ArrayList;
import java.util.List;

//print the count of primes for range l-r
public class countPrimeInRange {
    public static void main(String[] args) {
     ArrayList<Integer> arr = new ArrayList<>();
     arr= getSieve(10);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<Integer>() {{
            add(3);
            add(10);}});
        queries.add(new ArrayList<Integer>() {{
            add(2);
            add(15);}});
        System.out.println("No. of Queries: " + queries.size());
        System.out.print("Queries: ");
        for (ArrayList<Integer> query : queries) {
            System.out.println("(" + query.get(0) + ", " + query.get(1) + ")  ");

        }
        ArrayList<Integer> result = countOfRange(queries);

        System.out.println("\nNumber of primes between the ranges: " + result);
    }

    static ArrayList<Integer> getSieve(int n){
        ArrayList<Integer> primes = new ArrayList<>(n+1);
        for (int i = 0; i <=n; i++) {
           primes.add(1);
        }
                primes.set(0, 0);
                primes.set(1,0);

                for (int i = 2; i*i <=n ; i++ ){
                    if(primes.get(i)==1){
                        //check for  its multiple and turn them zero
                        for (int j = i*i; j <= n ; j+=i) {
                            primes.set(j,0);
                        }

                    }
                }
                return primes;
    }

    static ArrayList<Integer> countOfRange(ArrayList<ArrayList<Integer>> queries){
       //generate primes upto limit = 10^6
        ArrayList<Integer> primes = getSieve(1000000);
        int count = 0;
        //count primes upto each index and change that index to the count
        // for example till 2 there is one prime it will store 1
        // till 5 primes are = 2,3,5 so at 5 index value is 3
        for (int i = 2; i <primes.size() ; i++) {
            count = count+ primes.get(i);
              primes.set( i , count);
        }

        //check for count in range
        // primes(r) - primes(l-1)
        ArrayList<Integer> ans = new ArrayList<>();
        //iterate through queries
        for (int i = 0; i < queries.size(); i++) {
            int leftRange = queries.get(i).get(0);
            int RightRange = queries.get(i).get(1);
            System.out.println(primes.get(RightRange));
            System.out.println(primes.get(leftRange));
            ans.add(primes.get(RightRange) - primes.get(leftRange-1));

        }
        return ans;
    }
}
