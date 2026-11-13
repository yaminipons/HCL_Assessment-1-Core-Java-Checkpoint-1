import java.util.*;
class Employee {
    String employeeName;
    Employee(String employeeName) {
        this.employeeName = employeeName;
    }
    double calculateBonus() {
        return 0.0;
    }
    double calculateBonus(double amount) {
        return 0.0;
    }
}
class TechnicalEmployee extends Employee {
    double basicSalary;
    int rating;
    TechnicalEmployee(String employeeName, double basicSalary, int rating) {
        super(employeeName);
        this.basicSalary = basicSalary;
        this.rating = rating;
    }
    @Override
    double calculateBonus() {
        return basicSalary * rating * 2 / 100;
    }
    double calculateBonus(double salary, int employeeRating) {
        return salary * employeeRating * 2 / 100;
    }
}
class SalesEmployee extends Employee {
    double salesAmount;
    SalesEmployee(String employeeName, double salesAmount) {
        super(employeeName);
        this.salesAmount = salesAmount;
    }
    @Override
    double calculateBonus() {
        return salesAmount * 3 / 100;
    }
    @Override
    double calculateBonus(double amount) {
        return amount * 3 / 100;
    }
}
public class EmployeePerformanceBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeType = sc.nextInt();
        String employeeName = sc.next();
        Employee emp;
        double bonus;
        double totalEarnings;
        if (employeeType == 1) {
            double basicSalary = sc.nextDouble();
            int rating = sc.nextInt();
            TechnicalEmployee tech = new TechnicalEmployee(
                    employeeName, basicSalary, rating);
            emp = tech;
            bonus = emp.calculateBonus();
            totalEarnings = basicSalary + bonus;
        } else {
            double salesAmount = sc.nextDouble();
            emp = new SalesEmployee(employeeName, salesAmount);
            bonus = emp.calculateBonus();
            totalEarnings = salesAmount + bonus;
        }
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Bonus: %.2f%n", bonus);
        System.out.printf("Total Earnings: %.2f%n", totalEarnings);
        sc.close();
    }
}
