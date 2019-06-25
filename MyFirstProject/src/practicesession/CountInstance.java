package practicesession;

public class CountInstance {
         String name;
         int age;
    public static int numberofobjects= 0;

        public CountInstance(String n, int a)
        {
            this.name=n;
            this.age=a;
            numberofobjects++;
        }
    }

    class StudentsDemo
    {

        public static void main(String[]args)
        {
            CountInstance student1= new CountInstance("Michelle", 7);
            CountInstance student2= new CountInstance("Daniel", 8);
            CountInstance student3= new CountInstance("Vanessa", 9);
            CountInstance student4= new CountInstance("Ryan", 8);


            System.out.println ("There are " + CountInstance.numberofobjects + " objects in this class");
        }
    }



