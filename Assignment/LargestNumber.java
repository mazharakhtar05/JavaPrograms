//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("The Largest Number is " + num1);

        }
        if(num2>num1){
            System.out.println("The Largest Number is " + num2);
        }
        if(num1==num2){
            System.out.println("Both the numbers are equal");
        }
        
        
    }

    

}
