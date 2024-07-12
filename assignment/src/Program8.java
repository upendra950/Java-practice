import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the array size");
        int b=a.nextInt();
        int c[]=new int[b];
        System.out.println("enter the array elements");
        for(int j=0;j<b;j++){
            c[j]=a.nextInt();

        }
        System.out.print("array in reverse order is  ");
        for(int i=b-1;i>=0;i--){
            System.out.printf(c[i]+" ");
        }

    }
}
