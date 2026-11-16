import java.util.*;
class Product{
    int productId;
    String productName;
    double price;
    Product(int productId, String productName, double price){
        this.productId= productId;
        this.productName = productName;
        this.price = price;
    }
    double calculateDiscount(){
        return 0.0;
    }
}
class ElectronicsProduct extends Product{
    ElectronicsProduct(int productId, String productName, double price){
        super(productId, productName, price);
    }
    @Override 
    double calculateDiscount(){
        return price*12/100;
    }
}
class ClothingProduct extends Product{
    ClothingProduct(int productId, String productName, double price){
        super(productId, productName, price);
    }
    @Override 
    double calculateDiscount(){
        return price*20/100;
    }
}
class GroceryProduct extends Product{
    GroceryProduct(int productId, String productName, double price){
        super(productId, productName, price);
    }
    @Override 
    double calculateDiscount(){
        return price*5/100;
    }
}
public class EcommerceProductPricing {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int productType = sc.nextInt();
        int productId = sc.nextInt();
        String productName = sc.next();
        double price = sc.nextDouble();
        Product product;
        if(productType==1){
            product = new ElectronicsProduct(productId,productName,price);
        }
        else if(productType==2){
            product = new ClothingProduct(productId,productName,price);
        }
        else{
            product = new GroceryProduct(productId,productName,price);
        }
        double discount = product.calculateDiscount();
        double finalPrice = price - discount;
        System.out.println("Product ID: "+productId);
        System.out.println("ProductName: "+productName);
        System.out.printf("Discount: %.2f\n",discount);
        System.out.printf("Final Price: %.2f\n", finalPrice);
    }
}