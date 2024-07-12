import java.util.*;
public class ReverseNumber {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("enter a number");
        int n=a.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println("the reverse order of the given number is: "+sum);
    }
}
