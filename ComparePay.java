package EmployeeLab;

import java.util.Comparator;

public class ComparePay implements Comparator <IPayable> {

    @Override
    public int compare(IPayable one, IPayable two) {
        if(one.calculatePay() > two.calculatePay()){
            return 1;
        }
        return -1;
    }
}
