import java.util.Scanner;
interface AccountOperation{
    void  deposit(int bal);
    int getBalance();
}
public  class Account implements AccountOperation {
    private int balance=0;
    //private int balance;
    @Override
    public void deposit(int bal){
        this.balance=+bal;
        //this.balance=bal;
    }
    @Override
    public int getBalance(){
        return balance;
    }
    public static  void  main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the amount you want to deposit ");
        int bal=s.nextInt();
        Account a=new Account();
        a.deposit(bal);
        int b=a.getBalance();
        System.out.println("the total amount  in your account is : "+b);
    }

}
