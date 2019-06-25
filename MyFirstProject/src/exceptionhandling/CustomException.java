package exceptionhandling;

import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {
        System.out.println("enter age : ");
        Scanner scanner=new Scanner(System.in);
        try{
            int i=0;
            i=scanner.nextInt();
            if(i<18){
                System.out.println("not valid user");
            }else System.out.println("vote please");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
