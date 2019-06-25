
package practicesession;

public class OccurenceCharInStr {

    public static void main(String[] args) {

        String s = "codekul";

        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
           int count = 0;
            for (int j = i + 1; j < s.length(); j++) {
                if (c[i] == c[j]) {
                    count++;
                    //System.out.println(s.charAt(j)+" is repeated "+count+" times");
                }
            }
                if (count != 0) {
                    System.out.println(c[i] + " " + count);
                }
                // System.out.println(s.charAt(i));

        }
    }
}

