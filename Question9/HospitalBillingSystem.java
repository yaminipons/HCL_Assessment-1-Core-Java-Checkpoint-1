import java.util.*;
abstract class Doctor{
    double consultationCharge;
    Doctor(double consultationCharge){
        this.consultationCharge = consultationCharge;
    }
    abstract String getDoctorType();
    double calculateTotalBill(double testCharges){
        return consultationCharge;
    }
}
class GeneralPhysician extends Doctor{
    GeneralPhysician(double consultationCharge){
        super(consultationCharge);
    }
    @Override 
    public String getDoctorType(){
        return "General Physician";
    }
}
class Specialist extends Doctor{
    Specialist(double consultationCharge){
        super(consultationCharge);
    }
    @Override 
    public String getDoctorType(){
        return "Specialist";
    }
}
class Emergencydoctor extends Doctor{
    Emergencydoctor(double consultationCharge){
        super(consultationCharge);
    }
    @Override 
    public String getDoctorType(){
        return "Emergency Doctor";
    }
    public double calculateTotalBill(double testCharges){
        return consultationCharge + testCharges;
    }
}
public class HospitalBillingSystem {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int doctorType = sc.nextInt();
        double testCharges = sc.nextDouble();
        Doctor doctor;
        if(doctorType==1){
            doctor = new GeneralPhysician(500.0);
            System.out.println("Doctor Type: "+doctor.getDoctorType());
            System.out.println("Consultation charge: "+500.0);
            System.out.println("Test Charges: "+testCharges);
            System.out.println("Total bill: "+doctor.calculateTotalBill(testCharges));
        }
        else if(doctorType==2){
            doctor = new Specialist(1000.0);
            System.out.println("Doctor Type: "+doctor.getDoctorType());
            System.out.println("Consultation charge: "+1000.0);
            System.out.println("Test Charges: "+testCharges);
            System.out.println("Total bill: "+doctor.calculateTotalBill(testCharges));
        }
        else{
            doctor = new Emergencydoctor(1500.0);
            System.out.println("Doctor Type: "+doctor.getDoctorType());
            System.out.println("Consultation charge: "+1500.0);
            System.out.println("Test Charges: "+testCharges);
            System.out.println("Total bill: "+doctor.calculateTotalBill(testCharges));
        }
    }
}
