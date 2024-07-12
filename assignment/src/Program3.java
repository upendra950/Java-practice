import java.util.*;
public class Program3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number to print the table");
        int a=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf(a+" x "+i+" = "+a*i+"\n");
        }

    }
}
