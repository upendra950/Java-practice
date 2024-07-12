import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the array size");
        int a=s.nextInt();
        int k[]=new int[a];
        System.out.println("enter the array elements");
        for(int i=0;i<a;i++){
            k[i]=s.nextInt();
        }
        int lar=0;
        for(int i=0;i<a;i++){
                if(lar<=k[i]){
                    lar=k[i];
                }

            }
        System.out.println("the largest number is "+lar);
    }
}
