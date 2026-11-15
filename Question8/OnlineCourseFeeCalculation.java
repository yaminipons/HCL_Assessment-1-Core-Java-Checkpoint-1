import java.util.*;
abstract class Course{
    double courseFee;
    Course(double courseFee){
        this.courseFee = courseFee;
    }
    abstract double calculateDiscount();
    abstract String getCourseType();
    double calculateFinalFee(double discountPercentage){
        double discountAmount = courseFee * discountPercentage/100;
        return courseFee - discountAmount;
    }
}

class ProgrammingCourse extends Course{
    ProgrammingCourse(double courseFee){
        super(courseFee);
    }
    @Override 
    public double calculateDiscount(){
        return courseFee * 10/100;
    }
    public String getCourseType(){
        return "Data Science";
    }
}  
class DataScienceCourse extends Course{
    DataScienceCourse(double courseFee){
        super(courseFee);
    }
    @Override 
    public double calculateDiscount(){
        return courseFee * 15/100;
    }
    public String getCourseType(){
        return "Data Science";
    }
}    
class CloudCourse extends Course{
    CloudCourse(double courseFee){
        super(courseFee);
    }
    @Override 
    public double calculateDiscount(){
        return courseFee * 5/100;
    }
    public String getCourseType(){
        return "Cloud";
    }
}   
public class OnlineCourseFeeCalculation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int courseType = sc.nextInt();
        double courseFee = sc.nextDouble();
        Course course;
        if(courseType == 1){
            course = new ProgrammingCourse(courseFee);
            System.out.println("Course Type: "+course.getCourseType());
            double discountPercentage = 10.0;
            System.out.printf("Discount: %.2f\n",course.calculateDiscount());
            System.out.printf("Final Fee: %.2f\n", course.calculateFinalFee(discountPercentage));
        }
        else if(courseType == 2){
            course = new DataScienceCourse(courseFee);
            System.out.println("Course Type: "+course.getCourseType());
            double discountPercentage = 15.0;
            System.out.printf("Discount: %.2f\n",course.calculateDiscount());
            System.out.printf("Final Fee: %.2f\n", course.calculateFinalFee(discountPercentage));
        }
        else{
            course = new CloudCourse(courseFee);
            System.out.println("Course Type: "+course.getCourseType());
            double discountPercentage = 5.0;
            System.out.printf("Discount: %.2f\n",course.calculateDiscount());
            System.out.printf("Final Fee: %.2f\n", course.calculateFinalFee(discountPercentage));
        }
    }
}
