package constructordemo;

public class ThisUseCons {

    int a,b;

    ThisUseCons(){
        this(10,20);
        System.out.println("Inside constructor");
    }

    ThisUseCons(int a,int b){
        this.a=a;
        this.b=b;
   // void add();
    }
    void add(int a,int b){

        System.out.println("Addition is "+(a+b));
    }


    public static void main(String[] args) {
        ThisUseCons obj=new ThisUseCons();

    }
}
