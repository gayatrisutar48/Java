package exceptionhandling;

public class ExceptionDemo {

    public static void main(String[] args) {

        try{
            int i=5/0;

        }
        catch (Exception r){
            System.out.println(r);
        }
        finally {
            System.out.println("remaining code");
        }//throw new ArithmeticException("divide by zero");
    }
}
