public class Program11 {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        int len=0;
        try{
             len=Integer.parseInt(args[1]);
    }
        catch(Exception e){
            len=1;
        }
        System.out.printf("num is %d and len is %d",num,len);
}}
