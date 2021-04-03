package EmployeeLab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CheckCashingPlace {

    public static void main(String[] args) {

        HumanResources humanResources = new HumanResources();
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("James", "3/2/2002",1000.00 );
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Micheal", "2/6/2001", 20.00, 20.00);
        Entrepreneur entrepreneur1 = new Entrepreneur("Chris", 1000000.00);


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(salariedEmployee1);
        employees.add(hourlyEmployee1);

        IPayable[] payablePeople = {salariedEmployee1, hourlyEmployee1, entrepreneur1};

        ArrayList<IPayable> unSortedPeople = new ArrayList<>();
        unSortedPeople.add(entrepreneur1);
        unSortedPeople.add(salariedEmployee1);
        unSortedPeople.add(hourlyEmployee1);


        humanResources.issueBadge(employees);
        System.out.println("Prior to sorting by pay..");
        humanResources.payPerson(payablePeople);
        System.out.println(" ");
        System.out.println("After sorting by pay...");

        ComparePay c = new ComparePay();

        Collections.sort(unSortedPeople, c);


        for(IPayable p : unSortedPeople){
            System.out.println(p + " Should be paid " + p.calculatePay());
        }












    }
}
