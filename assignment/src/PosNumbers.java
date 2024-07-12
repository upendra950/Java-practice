import java.util.Scanner;
public class PosNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter numbers ");
        while(true){
            int a=sc.nextInt();
            if(a==0){break;}
            else if(a>0){sum+=a;}
            else{continue;}
        }
        System.out.println("sum is : "+sum);
    }
}
