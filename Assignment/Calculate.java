package Assignment;

import java.util.Scanner;
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the operator:");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        sc.close();

        if (operator == '+') {
            int addition = num1+num2;
            System.out.println(addition);      
        }
        else if (operator == '-') {
            int subtraction = num1 - num2;
            System.out.println(subtraction);
        }

        else if (operator == '*') {
            int multiplication = num1*num2;
            System.out.println(multiplication);
            
        }
        else if (operator == '/') {
            if (num2!=0) {
                int division = num1/num2;
                System.out.println(division);
                
            }
            else{
                System.out.println("Cannot divide by zero");
            }
            
        }

        else{
            System.out.println("Enter the Valid Operator");
        }

    }
    
}
