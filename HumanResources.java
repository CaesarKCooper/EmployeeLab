package EmployeeLab;

import java.util.ArrayList;
import java.util.Arrays;

import static EmployeeLab.Person.pay;

public class HumanResources {


    public void issueBadge(ArrayList<Employee> employees ) {

        for (Employee y : employees) {
            System.out.println(y.printBadge());

        }
    }

        public void printPaymentInfo(IPayable person){
            System.out.println(person.getClass().getSimpleName() + " Should be paid: " + person.calculatePay());

        }

        public void payPerson(IPayable[] payablePeople){
            for(IPayable people : payablePeople){
                printPaymentInfo(people);
            }




            }



            }
















