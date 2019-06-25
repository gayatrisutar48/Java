package practicesession;
import java.lang.String;
import java.util.Scanner;

public class CheckVowelOrConsonant {

    public static void main(String[] args) {

        System.out.print("Enter any letter from 'a' to 'z' : ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);

        if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u')
        {
            System.out.println("'" + letter + "' is vowel");
        }else
            System.out.println("'"+letter+"' is consonant");

    }
}
