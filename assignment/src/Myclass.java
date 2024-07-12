 class Class1{
    private int a;
    private int  b;
    public Class1(int a,int b){

            this.a=a;
            this.b=b;
        }
}
class Class2 extends Class1{

    public Class2(int a,int b){
        super(a,b);

        System.out.println("this class");
    }
    public void meth(int c){
        System.out.println("this is a method");
    }
}
public class Myclass {
    public static void main(String[] args) {
        Class2 ob=new Class2(4,5);
        ob.meth(6);



    }
}
