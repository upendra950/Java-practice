import java.util.Scanner;
public class Counter {
    private int number;
    public int increment(int number){
          number=++number;

        System.out.printf("\n the number after increment is :  ");
        return number;

    }
    public int decrement(int number){
        number =--number;
        System.out.printf("\n the number after decrement is:  ");
        return number;
    }
    Counter(){
        this.number=0;
    }
    Counter(int number){
       this. number=number;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
       Counter c =new Counter();
        Counter c2=new Counter( n);
        Counter c3=new Counter();
        System.out.println(c3.increment(n));
        System.out.println(c3.decrement(n));


    }
}
