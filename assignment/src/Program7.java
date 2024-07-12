import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter a number to print in reverse order ");
        int k=a.nextInt();
        int sv=k;
        int t=0;
        while(k>0){
            int re=k%10;
            t=t*10+re;
            k=k/10;
        }
        System.out.printf("the reverse order of %d is %d",sv,t);
    }
}
