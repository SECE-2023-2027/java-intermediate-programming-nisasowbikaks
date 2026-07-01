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
          BankAccount account = new BankAccount("ACC123", "John", 500.0);
          account.deposit(200);
          account.withdraw(800);
          System.out.println(account.getBalance());
     }
}