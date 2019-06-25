package controlstatements;

public class TwoDArray2 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 2; i >=0; i--) {

            for (int j = 2; j >=0; j--) {

                    System.out.print(+array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
      /*9 8 7
        6 5 4
        3 2 1*/