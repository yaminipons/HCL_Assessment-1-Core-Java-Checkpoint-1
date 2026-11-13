import java.util.*;
abstract class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    abstract double calculateFinalBalance();
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    @Override 
    double calculateFinalBalance(){
        return balance + (balance*interestRate/100);
    }
}
class CurrentAccount extends BankAccount{
    double overdraftLimit;
    CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber,balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override 
    double calculateFinalBalance(){
        return balance + overdraftLimit;
    }
}   
public class BankingAccountManagement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int accountType = sc.nextInt();
        int accountNumber = sc.nextInt();
        double balance = sc.nextDouble();
        BankAccount account;
        if(accountType==1){
            double interestRate = sc.nextDouble();
            account = new SavingsAccount(accountNumber,balance,interestRate);
        }
        else{
            double overdraftLimit = sc.nextDouble();
            account = new CurrentAccount(accountNumber,balance,overdraftLimit);
        }
        System.out.println(account.calculateFinalBalance());
        sc.close();
    }
}
