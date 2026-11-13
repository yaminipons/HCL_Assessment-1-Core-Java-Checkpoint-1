import java.util.*;
abstract class Employee{
    private int employeeId;
    private String employeeName;
    Employee(int employeeId,String employeeName){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    abstract double calculateSalary();
}
class FullTimeEmployee extends Employee{
    double monthlySalary;
    FullTimeEmployee(int employeeId, String employeeName, double monthlySalary){
        super(employeeId,employeeName);
        this.monthlySalary = monthlySalary;
    }
    @Override 
    double calculateSalary(){
        return monthlySalary;
    }
}
class ContractEmployee extends Employee{
    int workingDays;
    double dailyRate;
    ContractEmployee(int employeeId, String employeeName, int workingDays, double dailyRate){
        super(employeeId,employeeName);
        this.workingDays = workingDays;
        this.dailyRate = dailyRate;
    }
    @Override 
    double calculateSalary(){
        return workingDays*dailyRate;
    }
}
public class EmployeeSalaryProcessing{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int employeeType = sc.nextInt();
        int employeeId = sc.nextInt();
        String employeeName = sc.nextLine();
        Employee emp;
        if(employeeType==1){
            double monthlySalary = sc.nextDouble();
            emp = new FullTimeEmployee(employeeId,employeeName,monthlySalary);
        }
        else{
            int workingDays = sc.nextInt();
            double dailyRate = sc.nextDouble();
            emp = new ContractEmployee(employeeId, employeeName,workingDays, dailyRate);
        }
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.printf("Salary: %.2f%n", emp.calculateSalary());
        sc.close();
    }
}