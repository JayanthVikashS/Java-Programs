// Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Largestno{
    public static void main(String[] args){
        System.out.println(" Enter the two numbers");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2){
            System.out.println(" The Greatest Number is" + num1);
        }
        else{
            System.out.println(" The Greatest Number is " + num2);
        }
    }
}