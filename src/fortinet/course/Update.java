package fortinet.course;

/**
 * Created by seshasai on 15/08/2017.
 */
public class Update {

    private String courseName;

    private String update;

    public Update(String courseName, String update){
        this.courseName = courseName;
        this.update = update;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

}
