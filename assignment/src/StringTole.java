import java.util.Scanner;

public class StringTole {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numnber of strings do you want to enter ");
        int sum=0;
        int b= sc.nextInt();
        int a[]=new int[b];
        System.out.println("enter the values in strings");
        for (int i = 0; i <b;i++){
                try{
                String s=sc.next();
                a[i]=Integer.parseInt(s);
            }
        catch(Exception e){
            a[i]=0;
        }}
        for(int j=0;j<a.length;j++){
                sum=sum+a[j];
            }
         System.out.println("sum of the given values is: "+sum);
    }
}
