package practicesession;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random obj=new Random();
        System.out.println("Random 5 numbers between 1 to 200 are :");
        for(int i=0;i<5;i++)
            System.out.println(obj.nextInt(200));
    }
}
