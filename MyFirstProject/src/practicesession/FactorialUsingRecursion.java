package practicesession;

public class FactorialUsingRecursion {

    public static int fact(int n){
        if(n==1) {
            return 1;
        } else
            return(n*fact(n-1));
    }
    public static void main(String[] args) {
      //  new FactorialUsingRecursion().fact(11);
        System.out.println("Factorial is "+fact(5));
    }
}
