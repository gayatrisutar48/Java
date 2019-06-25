package exceptionhandling;

import java.util.Scanner;

public class Throwdemo {


       static void election(int age)
        {     if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String[] args) {

            election(12);
        System.out.println("rest of the code");
        }

}
