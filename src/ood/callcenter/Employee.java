package ood.callcenter;

/**
 * Created by vasumathi on 19/08/2017.
 */
public abstract class Employee {

    public String employeeName;

    public int employeeId;

    public boolean isFree;

    public abstract void escalateCall();

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void callComplete(){
        setFree(true);
    }


}
