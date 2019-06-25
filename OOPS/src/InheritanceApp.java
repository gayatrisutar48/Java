
class Product{

    //Attributes
    int pid;
    String name;
    int price;


    //costructor
    Product(){
        System.out.println(">> Product object constructed");
    }

    //methods

    void setProductDetails(int pid,String name,int price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }

    void showProductDetails(){
        System.out.println("Product id:"+pid+"------");
        System.out.println("Name :\t"+name);
        System.out.println("Price : \t"+price);

    }
}


public class InheritanceApp {

    public static void main(String[] args){
        Product product= new Product();
        System.out.println("product is : "+product);

        product.setProductDetails(1,"iPhoneX",70000);

        product.showProductDetails();

        System.out.println();

        Product product1=new Product();

        product1.pid=2;
        product1.name="nike shoes";
        product1.price=1000;

        product1.showProductDetails();
    }
}
