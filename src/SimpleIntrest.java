// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleIntrest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal amount");
        int Principal = input.nextInt();
        System.out.println("Enter the rate at which SI should be calculated");
        int rate = input.nextInt();
        System.out.println("The the time period");
        int time = input.nextInt();
        int SI = (Principal * rate * time)/ 100; // Since the Rate is given in percentage, SI is divided by 100
        System.out.println("The Simple Interest is" + SI);
    }


}