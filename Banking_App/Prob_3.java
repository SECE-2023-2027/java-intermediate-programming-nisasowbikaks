import java.util.*;
class BankAccount
{
     private String accountNumber;
     private String accountHolders;
     private double balance;
     public BankAccount(String accountNumber,String accountHolders,double balance)
     {
          this.accountNumber=accountNumber;
          this.accountHolders=accountHolders;
          this.balance=balance;
     }
     public void deposit(double amount)
     {
          if(amount<0||amount==0.0)
          {
               System.out.println("Invalid Deposit amount");
          }
          balance+=amount;
     }
     public void withdraw(double amount)
     {
          if(balance>=amount)
          {
               balance-=amount;
          }
          else
          {
               System.out.println("Insufficient Funds");
          }
     }
     public double getBalance()
     {
          return balance;
     }
}
public class Prob_3
{    public static void main(String[] args)
     {
          Scanner sc=new Scanner(System.in);
          String acc=sc.next();
          String name=sc.next();
          double amount=sc.nextDouble();
          BankAccount account = new BankAccount("acc", "name", amount);
          int amounttodeposit=sc.nextInt();
          int amounttowithdraw=sc.nextInt();
          account.deposit(amounttodeposit);
          account.withdraw(amounttowithdraw);
          System.out.println("The remaining balance is:"+account.getBalance());
     }
}