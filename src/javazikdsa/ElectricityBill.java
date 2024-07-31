package javazikdsa;

import java.util.Scanner;


//
//Input: U = 250
//        Output: 3500
//        Explanation:
//        Charge for the first 100 units – 10*100 = 1000
//        Charge for the 100 to 200 units – 15*100 = 1500
//        Charge for the 200 to 250 units – 20*50 = 1000
//        Total Electricity Bill = 1000 + 1500 + 1000 = 3500
//        Input: U = 95
//        Output: 950
//        Explanation:
//        Charge for the first 100 units – 10*95 = 950
//        Total Electricity Bill = 950
//150
public class ElectricityBill {

    public static void main(String[] args) {
        System.out.println(calculateBill(250));
    }
    static   int calculateBill(int units) {
        if (units <= 100) {
            int val = units * 10;
            return val;
        } else if (units <= 200) {
            return (100 * 10) + (units - 100) * 15;
        } else if(units <=300){
            return (100*10)+(100*15)+(units-200)*20;
        }
        else {
            return 0;
        }

    }
}
