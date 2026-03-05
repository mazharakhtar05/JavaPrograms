package Assignment;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the Principal Amount? ");
        float pAmount = sc.nextFloat();

        System.out.print("What is the rate of interest? ");
        float rate = sc.nextFloat();

        System.out.print("What is the time duration? ");
        float time = sc.nextFloat();

        float Si = (pAmount * rate * time)/100;

        System.out.println("Simple Interest is " + Si);

        sc.close();



        
    }
}
