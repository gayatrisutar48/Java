package controlstatements;

public class ArrayReverse {

    public static void main(String[] args) {

        String array="codekul";
        char[] array1 = array.toCharArray();
        for(int i=array.length()-1;i>=0;i--)
        {

            System.out.print(array1[i]);
        }
    }
}
