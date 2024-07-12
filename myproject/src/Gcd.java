import java.util.*;

public class Gcd {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=Math.max(a,b);
        int g=1;
        for(int i=1;i<c;i++){
            if(a%i==0 && b%i==0){
                g=i;

            }
        }
        System.out.println("gcd of two numbers is "+g);
    }
}
