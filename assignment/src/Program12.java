import java.util.Scanner;
public class Program12 {
    private String prod_name;
    private long prod_id;
    private long price;
    private float quan_on_hand;
    public void init(long prod_id,String prod_name,long price){
        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.price=price;
    }
    public long  getNetPrice(long price){
        price+=(price*0.12);
        return price;
    }
    public void sell(long prod_id,String prod_name,long price){
        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.price=price;
        System.out.printf("the selled product details are:\n the prouct id is %d \n the product name is %s \n the product price is %d ",prod_name,prod_name,price);
    }
    public void  purchase(long prod_id,String name,long price){
        {
         System.out.printf("the details of the purchased product is \n the product id is %d\n the product name is %s\n the price is %d\n",prod_id,name,price);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the product id");
        long id=s.nextLong();
        System.out.println("enter the product name");
        String name=s.next();
        System.out.println("enter the product price");
        long pri=s.nextLong();
        Program12 obj=new Program12();
        obj.init(id,name,pri);
        //obj.purchase(23,"jahs",999);
        obj.purchase(id,name,pri);
        long d=obj.getNetPrice(pri);
        System.out.println("the price after including the tax is :"+d);
    }
}
