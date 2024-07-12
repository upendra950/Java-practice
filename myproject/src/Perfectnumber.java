import java.util.*;
public class Perfectnumber {
    public static void main(String args[]){
        Scanner a= new Scanner(System.in);
        System.out.println("enter a number");
        int n=a.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if((n%i)==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}
