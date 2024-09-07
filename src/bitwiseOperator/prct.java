package bitwiseOperator;

import java.util.ArrayList;
import java.util.Arrays;

public class prct {


    static ArrayList<Integer> getSieve(int n){
        ArrayList<Integer> prime = new ArrayList<>(n+1);
        for (int i = 0; i <=n; i++) {
            prime.add(1);

        }
        prime.set(0,0);
        prime.set(1,0);
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(prime.get(i)==1){
                for (int j = i*i; j <=n ; j+=i) {
                    prime.set(j,0);

                }
            }

        }
        return prime;
    }

    static ArrayList<Integer> countPrimesInRange(ArrayList<ArrayList<Integer>> queries){
        ArrayList<Integer> primesList = getSieve(1000000);
        int count = 0;
        for (int i = 2; i < primesList.size() ; i++) {
            count = count + primesList.get(i);
             primesList.set(i , count);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            int l  = queries.get(i).get(0);
            int r = queries.get(i).get(1);
            ans.add(primesList.get(r)- primesList.get(l-1));
        }
        return ans;
    }



    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();



        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<>() {{add(3); add(10);}});
        queries.add(new ArrayList<>(Arrays.asList(2, 10)));
            for(ArrayList<Integer> qu :queries){
                System.out.println(qu.get(0));
                System.out.println(qu.get(1));
            }
       arr = countPrimesInRange(queries);
        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i));
        }
    }
}
