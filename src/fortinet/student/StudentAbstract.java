package fortinet.student;

import fortinet.course.Update;

/**
 * Created by seshasai on 15/08/2017.
 */

/**
 * This class is the Subscriber in the Pub-Sub design pattern.
 * */
public abstract class StudentAbstract {

    public String name;

    public int studentId;

    public abstract void updateFromCourse(Update update);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
