package practicesession;

public class AvgOfNumber {

    public static void main(String[] args) {

        int array[]={56,2,6,95,4,21,73,11,20,9,63};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];

        }int avg=sum/array.length+1;
        System.out.println("Average of number in array is "+avg);
    }
}
