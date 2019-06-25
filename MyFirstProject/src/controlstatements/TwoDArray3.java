package controlstatements;

public class TwoDArray3 {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int j=0;j<3;j++){
        for (int i = 2; i >=0; i--) {

               System.out.print(+array[i][j]+" ");
            }
          System.out.println();
        }
    }
}
      /*7 4 1
        8 5 2
        9 6 3*/
