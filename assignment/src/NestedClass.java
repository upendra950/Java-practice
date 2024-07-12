class Outer{
    static int x=10;
    class Inner{
        int y=15;
        public void  meth1(){
            System.out.println("this is inner class"+x+" "+y);
            //y=h;
            //return y;

        }
    }
    public void meth2(){
        System.out.println("this is outer class");
        Inner in=new Inner();
        //int j=in.meth1(14);
        //System.out.println(j);
        in.meth1();
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer ou= new Outer();
        ou.meth2();
       //Outer.Inner oi=new Outer().new Inner();
       //System.out.println(oi.meth1(14));

    }
}
