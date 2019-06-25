package controlstatements;

public class ArrayString {
    public static void main(String[] args) {
        int temp;
        int array[] = {45,25,65,10,2019,5,9,49};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        System.out.println("Sorted array elements are:");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
       // System.out.println(array[array.length - 1]);
    }
}