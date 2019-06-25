package exceptionhandling;

public class ExceptionInOverriding {

  public void msg() throws Exception {
       System.out.println("parent");
    }
}
final class ExcClass extends ExceptionInOverriding {

   public void msg() throws Exception {
        System.out.println("child");

    }

    public static void main(String[] args) {

        ExceptionInOverriding obj = new ExceptionInOverriding();
        try {
            obj.msg();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
