//Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyCalculate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in Rupees: ");
        double rupees = sc.nextDouble();
        double dollars = rupees * 90.66;
        System.out.println("The amount is dollars is : " + dollars);
    }
}
