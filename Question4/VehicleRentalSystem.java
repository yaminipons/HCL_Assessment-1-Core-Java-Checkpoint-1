import java.util.*;
class Vehicle{
    double dailyRate;
    Vehicle(double dailyRate){
        this.dailyRate = dailyRate;
    }
    double calculateRentalCharge(int rentalDays){
        return dailyRate*rentalDays;
    }
    String getVehicletype(){
        return "Vehicle";
    }
}
class Car extends Vehicle{
    Car(double dailyRate){
        super(dailyRate);
    }
    @Override 
    String getVehicletype(){
        return "Car";
    }
}
class Bike extends Vehicle{
    Bike(double dailyRate){
        super(dailyRate);
    }
    @Override 
    String getVehicletype(){
        return "Bike";
    }
}
class Truck extends Vehicle{
    Truck(double dailyRate){
        super(dailyRate);
    }
    @Override 
    String getVehicletype(){
        return "Truck";
    }
}
public class VehicleRentalSystem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int vehicleType = sc.nextInt();
        int rentalDays  = sc.nextInt();
        Vehicle vehicle;
        if(vehicleType==1){
            vehicle = new Car(1500.0);
        }
        else if(vehicleType==2){
            vehicle = new Bike(600.0);
        }
        else{
            vehicle = new Truck(3000.0);
        }
        System.out.println("Vehicle Type: "+vehicle.getVehicletype());
        System.out.printf("Rental charge: $%.2f%n", vehicle.calculateRentalCharge(rentalDays));
        sc.close();
    }
}
