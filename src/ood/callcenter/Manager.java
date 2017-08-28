package ood.callcenter;

/**
 * Created by vasumathi on 19/08/2017.
 */
public class Manager extends Employee{


    public Employee director;

    public Manager(String name){
        this.employeeName = name;
        this.employeeId = 888;
    }
    @Override
    public void escalateCall() {
        director.escalateCall();
    }


    public Employee getDirector() {
        return director;
    }

    public void setDirector(Employee director) {
        this.director = director;
    }
}
