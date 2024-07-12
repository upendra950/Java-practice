import java.util.Scanner;
class Program10{
   int myFun(int a[],int mi){
        int ans=0;
        for(int i=1;i<=mi;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[j]%i==0){
                    count+=1;
                }
            }if(count==a.length){
                ans=i;
            }
        }
return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int b=sc.nextInt();
        System.out.println("enter the array elements");
        int c[]=new int[b];
        for(int k=0;k<b;k++){
            c[k]=sc.nextInt();
        }
        int mi=0;
        for(int k=0;k<c.length;k++){
            if(c[k]>=mi){
                mi=c[k];
            }
        }
        Program10 m=new Program10();
        System.out.println("the common factor of the given numbers is: "+m.myFun(c,mi));
    }
}