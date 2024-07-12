import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the range element to print the prime numbers");
        int a=s.nextInt();
        for(int i=1;i<a;i++){
            int c=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    c+=1;
                    if(c==2){
                        break;
                    }
                }
            }
            if(c<2){
                System.out.print(i+" ");
            }
        }

    }
}
