package controlstatements;

public class TwoDArray4 {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i <3; i++) {

            for (int j = 2; j >=0; j--) {

                System.out.print(+array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
/*3 2 1     02 01 00
  6 5 4     12 11 10
  9 8 7     22 21 20
 */