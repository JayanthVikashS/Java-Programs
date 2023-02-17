// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;
public class Name{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String Name = input.next();
        System.out.println("Welcome to Java Learning " + Name);
    }
}