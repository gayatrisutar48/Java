package practicesession;

import java.util.Scanner;

public class CheckArmstrong {

    public static void main(String[] args)  {
        int c=0,a,temp;
        System.out.println("Enter number to check armstrong or not :");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number");//153
        else
            System.out.println("Not armstrong number");
    }
}

