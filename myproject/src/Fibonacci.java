import java.util.*;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter a value to print n fibonacci numbers");
        int n = a.nextInt();
        int m=1,temp=0,i=0;
        int k=0;
        while(i<n){
            System.out.print(k+" ");
            temp=m+k;
            k=m;
            m=temp;
            i++;

        }




    }
}