//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        String rev = "" ;

        for(int i = str.length()-1 ; i>=0 ; i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("The given string is a palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }

    sc.close();    
    }
    
    
}

