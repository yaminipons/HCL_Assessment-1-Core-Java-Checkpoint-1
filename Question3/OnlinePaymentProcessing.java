import java.util.*;
interface Payment{
    double calculateFee(double amount);
}
class CreditCardPayment implements Payment{
    @Override
    public double calculateFee(double amount){
        return amount*0.02;
    }
}
class UpiPayment implements Payment{
    @Override
    public double calculateFee(double amount){
        return amount*0.05;
    }
}
class WalletPayment implements Payment{
    @Override
    public double calculateFee(double amount){
        return amount*0.01;
    }
}
public class OnlinePaymentProcessing {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int paymentType = sc.nextInt();
        double paymentAmount = sc.nextDouble();
        Payment payment;
        if(paymentType==1){
            payment = new CreditCardPayment();
        }
        else if(paymentType==2){
            payment = new UpiPayment();
        }
        else{
            payment = new WalletPayment();
        }
        double fee = payment.calculateFee(paymentAmount);
        System.out.println("Payment Amount: "+paymentAmount);
        System.out.println("Transaction fee: " + fee);
        System.out.println("Final Amount:"+(paymentAmount+fee));
        sc.close();
    }
}
