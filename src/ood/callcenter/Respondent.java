package ood.callcenter;

/**
 * Created by vasumathi on 19/08/2017.
 */
public class Respondent extends Employee {

    private Employee manager;
    private static int id = 1;


    public Respondent(String name, Employee manager){
        this.manager = manager;
        this.employeeName = name;
        id++;
    }
    @Override
    public void escalateCall() {
        manager.escalateCall();

    }
}
