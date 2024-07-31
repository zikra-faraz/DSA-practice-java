package javazikdsa;

public class RichestAccount {
    public static void main(String[] args) {
        int[][] arr = {{1,2,21},{3,5,6,},{6,7,8}};
        System.out.println(maxWealth(arr));
    }
    static int maxWealth(int[][] acc){
        int max = 0;

        for (int i = 0; i < acc.length; i++) {
            int sum = 0;
            for (int j = 0; j < acc[i].length; j++) {
//                System.out.print(acc[i][j]+" ");
                sum += acc[i][j];

            }
//            System.out.println(sum);
            if(max<sum){
                max = sum;
            }
            System.out.println(" ");
        }
       return max;
    }
}
