package fortinet.course;

import fortinet.student.Student;

/**
 * Created by seshasai on 15/08/2017.
 */
public class MathCourse extends Course {


    private final String COURSE_NAME = "Mathematics";

    public MathCourse(){
        this.courseName = COURSE_NAME;
    }

    @Override
    public void updateStudents(Update update) {
        for(Student student: registeredStudents){
            student.updateFromCourse(update);
        }
    }

}
