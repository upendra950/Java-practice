public class VarArr {
    public static void main(String[] args) {
        int k=average(2,4,5,7,8,9);
        System.out.println(" the average of the given numbers is: "+k);

    }
    static int average(int ...s){
        int sum=0;
        for(int i:s){
            sum=sum+i;

        }
        return sum/(s.length);
    }
}
