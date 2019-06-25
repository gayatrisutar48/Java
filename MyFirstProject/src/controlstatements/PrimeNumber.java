package controlstatements;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter number to check that number is prime or not:");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();

        if(number<2) {
            System.out.println("Not Prime");
        }
            for(int i=2;i<=number/i;i++)
            {
                if(number%i==0)
                    System.out.println("Not Prime");
                //number=number / i;
            }

        System.out.println("prime");
    }

}


