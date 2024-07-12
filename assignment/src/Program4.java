import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a day number");
        int day=s.nextInt();
        System.out.println("enter no of hours");
        double hours=s.nextDouble();
        double amount=0;
        switch(day){
            case 1,2,3->{
                amount=200*hours;
                break;}
            case 4,5->{
               amount=400*hours;
                break;}
            case 6->{
               amount=600*hours;
                break;}
            case 7->{
                 amount=800*hours;

                break;}
            default->{
                System.out.println("entered a wrong number");}

        }
        if(amount>=2000){
         amount+=((amount*20)/100);
         System.out.println("amount with bonus is: "+ amount);
        }
        else{
            System.out.println("the amount is "+amount);
        }


    }
}
