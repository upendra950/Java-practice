import java.util.*;
public class Program1 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        for(int i=a;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}
