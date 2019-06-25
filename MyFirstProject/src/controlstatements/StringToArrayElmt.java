package controlstatements;

public class StringToArrayElmt {

    public static void main(String[] args) {

        String s="my name is gayatri";
        char[] c=s.toCharArray();
         for(char output:c)
         {
             if(output == ' ')
             {
                 System.out.println(output);
             }
             System.out.print(output);
         }

    }
}
