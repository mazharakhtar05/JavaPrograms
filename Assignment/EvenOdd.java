import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.

public class EvenOdd {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num);
        
        if (num%2!=0) {
            System.out.println(num + "Is the Odd Number ");
            
        }
        else{
            System.out.println(num + " Is the Even Number ");
        }
        sc.close();

    }
}
