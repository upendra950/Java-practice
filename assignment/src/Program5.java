import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no of elements to calculate averge");
        int a=s.nextInt();
        int b[]=new int[a];
        System.out.println("enter the elements");
        for(int i=0;i<a;i++){
            b[i]=s.nextInt();
        }
        int m=0;
        for(int k=0;k<b.length;k++){
            m+=b[k];

        }
        int av=m/b.length;
        System.out.println("the average of the given elemnts is "+av);

    }
}
