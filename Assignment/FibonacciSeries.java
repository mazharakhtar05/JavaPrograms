//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        System.out.println("Enter the number of terms in the Fibonacci series:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0 , second = 1;

        for(int i = 0; i<n; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
    
}
