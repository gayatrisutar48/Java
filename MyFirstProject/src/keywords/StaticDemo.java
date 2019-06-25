package keywords;

public class StaticDemo {

    static int count;

    static void countDemo1(){

        count+=1;
        System.out.println("count in 1st method : "+count);
    }
    static void countDemo2(){

        count+=1;
        System.out.println("count in 2nd method : "+count);
    }
    static{
        System.out.println("Inside static block");
    }


    public static void main(String[] args) {
        countDemo1();
        countDemo2();
    }
}