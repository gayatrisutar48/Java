package controlstatements;

public class TwoDArray5 {

    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=2;i>=0;i--)
        {
            for(int j=2;j>=0;j--)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
    }
}
/*9 6 3     22 12 02
  8 5 2     21 11 01
  7 4 1     20 10 00
 */