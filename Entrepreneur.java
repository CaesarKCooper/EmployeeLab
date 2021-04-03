package EmployeeLab;

public class Entrepreneur extends Person implements IPayable{

    double income = pay;

    public Entrepreneur(String name, double income) {
        super(name);
        this.income = income;
    }


    @Override
    public double calculatePay() {
        return income;
    }


    public String toString() {
        return "Entrepreneur";
    }
}