import java.util.*;
public class LargestNumber {
    public static void main(String args[]){
         int[] a=new int[10];
         Scanner s=new Scanner(System.in);
         for(int i=0;i<10;i++){
             a[i]=s.nextInt();
         }
         int max=0;
         for(int i=0;i<10;i++){
             if(a[i]>max){
                 max=a[i];
             }
         }
         System.out.println(max);
    }
}
