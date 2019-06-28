package practicesession;

import java.util.Scanner;

public class CheckPrimeOrNot {

    public static void main(String[] args) {
int j,count,n;
        System.out.println("Enter number to check prime or not :");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        j=1;
        count=0;
        while(j<=i){
            if(i%j==0)
                count++;
            j++;
        }
        if(count==2) {
            System.out.print(i + " is prime number");
        }
        else
            System.out.println(i+" is not prime number");

       // i++;
    }
    }

