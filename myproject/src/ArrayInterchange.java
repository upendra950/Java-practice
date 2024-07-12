import java.util.*;
public class ArrayInterchange {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int temp=0;
        for(int i=0;i<n/2;i++){
            temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
