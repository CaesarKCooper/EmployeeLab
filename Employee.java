package EmployeeLab;

public class Employee extends Person {

    String hireDate;

    public Employee(){

    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String hireDate){
        super(name);
        this.hireDate = hireDate;

    }

    public String printBadge(){
        System.out.println("Name: " + name);
        System.out.println("Type of employee: " + this.getClass().getSimpleName());
        System.out.println("HireDate: " + hireDate);
        return "";
    }


    }
