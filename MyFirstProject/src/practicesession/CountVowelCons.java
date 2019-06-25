package practicesession;

public class CountVowelCons {

    public static void main(String[] args) {

        String s = "codekul";
        char[] c = s.toCharArray();
        int count = 0;
        int count1=0;
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                count++;
            }else {
                count1++;
            }
        }System.out.println("vowels in string : " + count);
        System.out.println("consonants in string "+count1);
    }
}