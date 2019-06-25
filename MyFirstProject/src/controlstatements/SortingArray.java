package controlstatements;

public class SortingArray {
    public static void main(String[] args) {
       // int temp = 0;
        int array[] = {89, 45, 2, 88, 101, 44, 2, 76, 34, 11};
        System.out.println("sorted array elements are:");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            for (i = 0; i < array.length; i++) {
                System.out.println( + array[i]);

            }
        }
    }
}