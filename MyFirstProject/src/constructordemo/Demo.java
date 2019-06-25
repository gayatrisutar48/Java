package constructordemo;

public class Demo {
    Demo(){
        this(10,20);
        System.out.println("Inside constructor");
    }

    Demo(int a,int b){
        System.out.println("addition is "+(a+b));
    }
    public static void main(String[] args) {

        Demo d=new Demo();
    }
}
