package practicesession;

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {

        System.out.print("Enter any one year : ");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if(year%4==0)
        {
            System.out.println(+year+ " is leap year");
        }else
            System.out.println(+year +" is not leap year");

    }
}
