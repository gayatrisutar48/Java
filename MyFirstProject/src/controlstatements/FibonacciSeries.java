package controlstatements;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
       int number,rem,i,sum=0;
        System.out.println("Enter number of series length : ");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        System.out.println("Fibonacci Series is:");
        for(i=0;i<=number;i++){
           // for(int j=0;j<5;j++) {
                sum = sum + i;

                System.out.println(+sum);
            //}
        }


        }

}
