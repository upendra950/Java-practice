import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number to find the largest factor");
        int a=s.nextInt();
        int k=1;
        for(int j=1;j<a;j++){
            if(a%j==0){
                k=j;
            }
        }
        System.out.printf("the largest factor of %d is %d",a,k);

    }
}
