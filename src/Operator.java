// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Objects;
import java.util.Scanner;
public class Operator{
    public static void main(String[] args){
        System.out.println(" Enter Two number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        char operator = input.next().charAt(0);
        if (operator =='+'){

            int add = num1 + num2;
            System.out.println(" The Addition of " + num1 + num2 + " is " + add);
        }
        else if (operator =='-')  {
            int sub = num1 - num2;
            System.out.println(" The subtraction" + num1 + num2 + " is" + sub);
        }
        else if (operator =='*'){
            int mul = num1 * num2;
            System.out.println(" The Multiplication of " + num1 + num2 + " is " + mul);
        }
        else{
            int div = num1 / num2;
            System.out.println(" The Division of " + num1 + num2 +  " is" + div);
        }


    }
}