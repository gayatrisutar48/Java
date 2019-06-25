package controlstatements;

class InstanceCount {
    private String name;
    int age;
   public static int numberofobjects=0;

   public InstanceCount(String n, int a) {
    this.name = n;
    this.age = a;
     numberofobjects++;
}
}
class InstanceCountMain{

    public static void main(String[]args){

        InstanceCount o1 = new InstanceCount("Rishi",24);
        InstanceCount o2=new InstanceCount("Di",32);
        InstanceCount o3=new InstanceCount("tai",30);
        InstanceCount o4=new InstanceCount("mai",28);
        System.out.println("there are "+InstanceCount.numberofobjects+" object in this class.");

        }
}