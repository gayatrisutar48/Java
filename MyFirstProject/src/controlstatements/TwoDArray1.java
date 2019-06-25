package controlstatements;

public class TwoDArray1 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k <3; k++) {
                if(i==k)
                System.out.print(array[i][k] + " ");
            }

            System.out.println();
        }
    }
}

     /*1
         5
           9 */
