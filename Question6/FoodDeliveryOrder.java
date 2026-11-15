import java.util.*;
abstract class Delivery{
    double orderAmount;
    Delivery(double orderAmount){
        this.orderAmount = orderAmount;
    }
    abstract double calculateDeliveryCharge();
}
class RegularDelivery extends Delivery{
    RegularDelivery(double orderAmount){
        super(orderAmount);
    }
    @Override 
    double calculateDeliveryCharge(){
        return orderAmount + 40.0;
    }
}
class ExpressDelivery extends Delivery{
    ExpressDelivery(double orderAmount){
        super(orderAmount);
    }
    @Override 
    double calculateDeliveryCharge(){
        return orderAmount + 80.0 + (orderAmount * 5/100);
    }
}
public class FoodDeliveryOrder {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int deliveryType = sc.nextInt();
        double orderAmount = sc.nextDouble();
        Delivery delivery;
        if(deliveryType == 1){
            delivery = new RegularDelivery(orderAmount);
            System.out.printf("%.2f",delivery.calculateDeliveryCharge());
        }
        else{
            delivery = new ExpressDelivery(orderAmount);
            System.out.printf("%.2f",delivery.calculateDeliveryCharge());
        }
    }
}
