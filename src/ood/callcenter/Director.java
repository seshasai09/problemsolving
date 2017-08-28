package ood.callcenter;

/**
 * Created by vasumathi on 19/08/2017.
 */
public class Director extends Employee {

    public Director(String name){
        this.employeeName = name;
        this.employeeId = 999;
    }
    @Override
    public void escalateCall() {
        System.out.print("how can i help you?");
    }
}
