package EmployeeLab;

public class HourlyEmployee extends Employee implements IPayable {

    double hourlyRate;
    double hoursWorked;

    public HourlyEmployee(String name, String hireDate, double hourlyRate, double hoursWorked){
        super(name);
        this.hireDate = hireDate;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }

    public void printBadge(String name, String hireDate){
        System.out.println("Name: " + name);
        System.out.println("Type of employee: " + this.getClass().getSimpleName());
        System.out.println("HireDate: " + hireDate);
    }


    @Override
    public double calculatePay() {
        double payment = hourlyRate * hoursWorked;
        return payment;
    }

    @Override
    public String toString() {
        return "HourlyEmployee";
    }
}

