package practicesession;

public class IncrementOperator {
    public static void main(String[] args) {
        int a=10;
        int b=a++;
        int c=(++a)+(b++);
        int d=(a++)+(++b)+(c++);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}
