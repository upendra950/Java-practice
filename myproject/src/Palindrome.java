import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        int m=1000;
    while(m<=2000) {
       int i=m;
        int sum = 0;
        int k = i;
        while (i>0){
            int re = i % 10;
            sum = sum*10+re;
            i = i / 10;
        }
        if (sum == k) {
            System.out.println(k);
        }
        m++;
    }


}
}
