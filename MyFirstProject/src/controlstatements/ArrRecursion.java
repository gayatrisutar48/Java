package controlstatements;

public class ArrRecursion {

    int array[] = {5, 85, 12, 9, 41, 20, 10, 6, 8, 11};

       // System.out.println("array elements are :");

     void printElmt(int i) {

         for(i=0;i<array.length;i++) {
             System.out.println(+array[i]);
         }
         printElmt(i);

    }
//break;

    public static void main(String[] args) {

        ArrRecursion arrRecursion=new ArrRecursion();
        arrRecursion.printElmt(0);
    }
}



