package practicesession;

public class DuplicateCharInStr {

    public static void main(String[] args) {

        String s = "Codekul Institute";

        char[] c = s.toCharArray();
        int i=0,j=0;
        for (i = 0; i <c.length; i++) {
            int count=0;
            for (j = i+1; j <c.length; j++) {

               if(c[i] == c[j] && (i!=j)) {
                    count++;
        //           System.out.println(c[j]+" is duplicate character in string");
               }
            }
                if(count!=0)
                {
                 System.out.println(s.charAt(i));
                }
        }
    }
}