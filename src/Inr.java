// Input currency in rupees and output in USD.
import java.util.Scanner;
public class Inr{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the amount in Indian Rs ");
        float inr = input.nextFloat();
        double usd = (inr * 0.012);
        System.out.println(" The Amount in USD is " + usd);

    }
}