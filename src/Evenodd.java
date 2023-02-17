// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;
public class Evenodd{
    public static void main(String[] args){
       System.out.println("Enter the Number to be checked");
       Scanner input = new Scanner(System.in);
       int num1 = input.nextInt();
       if (num1%2 == 0) {
           System.out.println("The number is Even" + num1);
       }
       else{
           System.out.println("The number is Odd" + num1);
       }
    }
}
