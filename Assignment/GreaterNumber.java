// Define two methods to print the maximum and the minimum number respectively among three numbers 
// entered by the user.

import java.util.Scanner;

public class GreaterNumber{

    public static void main(String[] args){
  
        int[] numbers = Inputs();
        Maximum(numbers[0],numbers[1],numbers[2]);
        Minimum(numbers[0],numbers[1],numbers[2]);

  
    }

    static int[] Inputs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number:");
        int num3 = sc.nextInt();
        return new int[] {num1,num2,num3};
    }

    static void Maximum(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is the greatest number");
        }
        else if(num2>num3 && num2>num1){
            System.out.println(num2 + " is the greates number");
        }
        else{
            System.out.println(num3 + " is the greates number");
        }
    }

    static void Minimum(int num1,int num2,int num3){
        if(num1<num2 && num1<num3){
            System.out.println(num1 + " is the smallest number");
        }
        else if (num2<num3 && num2<num1){
            System.out.println(num2 + " is the smallest number");
        }
        else{
            System.out.println(num3 + " is the smallest number");
        }

    }
}