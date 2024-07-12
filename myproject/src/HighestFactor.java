import java.util.*;
public class HighestFactor {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int k=1;
        for(int i=1;i<a;i++){
            if (a%i==0){
                k=i;
            }

        }
        System.out.println("the  highest factor of the given number is : "+k);

    }
}
