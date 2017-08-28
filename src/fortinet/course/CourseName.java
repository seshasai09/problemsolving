package fortinet.course;

/**
 * Created by seshasai on 17/08/2017.
 */
public enum CourseName {

    MATHS("Mathematics"), SCIENCE("Science"), SOCIAL("Social");
    String name;

     CourseName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
