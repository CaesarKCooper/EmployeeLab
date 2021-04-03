package EmployeeLab;

public class SalariedEmployee extends Employee implements IPayable {

    double salary = pay;


    public SalariedEmployee(String name, String hireDate, double salary) {
        super(name);
        this.hireDate = hireDate;
        this.salary = salary;

    }

    public void printBadge(String name, String hireDate) {
        System.out.println("Name: " + name);
        System.out.println("Type of employee: " + this.getClass().getSimpleName());
        System.out.println("HireDate: " + hireDate);
    }

    @Override
    public double calculatePay(){
        return salary;
    }



    public String toString() {
        return "SalariedEmployee";
    }
}

