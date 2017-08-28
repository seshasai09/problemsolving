package ood.callcenter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by vasumathi on 19/08/2017.
 */
public class CallCenter {

    private Director director;
    private Manager manager;
    private List<Employee> availableRespondents;
    private List<Employee> onCallRespondents;

    public CallCenter(){
        initialise();
        availableRespondents = new ArrayList<Employee>();
        onCallRespondents = new ArrayList<Employee>();
    }

    public void initialise(){
        addEmployees();
    }

    private void addEmployees(){
        director = new Director("Director");
        manager = new Manager("Manager");
        manager.setDirector(director);
        for(int i=0;i<10;i++){
            availableRespondents.add(new Respondent(String.valueOf(i),manager));
        }
    }

    public void dispatchCall() throws InterruptedException {
        if(availableRespondents.size()==0) {
            System.out.println("all caller are busy");
            Thread.sleep(1000);
        }
        Employee e = availableRespondents.get(0);
        availableRespondents.remove(0);
        e.setFree(false);
        onCallRespondents.add(e);
    }

    public void checkAvailableRespondents(){
        if(onCallRespondents.size()>0){
            for(int i=0;i<onCallRespondents.size();i++){
                if(onCallRespondents.get(i).isFree()){
                    availableRespondents.add(onCallRespondents.get(i));
                    onCallRespondents.remove(i);
                }
            }
        }
    }
}
