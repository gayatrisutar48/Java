package practicesession;

public class ReverseNumber {
static int i;
    static String s="123456789";
        static void forLoop() {
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
        static void whileLooop(){
            i=s.length()-1;
            while(i>=0){
                System.out.print(s.charAt(i));
                i--;
            }
            System.out.println();
        }
        static void recursionLoop(){
           i=s.length()-1;
            if(i>=0){
                System.out.print(s.charAt(i));
               // recursionLoop();
            i--;
            }                recursionLoop();

        }

    public static void main(String[] args) {
        forLoop();
        whileLooop();
recursionLoop();


    }

}


