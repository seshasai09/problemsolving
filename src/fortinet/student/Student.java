package fortinet.student;

import fortinet.course.Update;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seshasai on 15/08/2017.
 */
public class Student extends StudentAbstract{


    public Student(String name, int id){
        this.name = name;
        this.studentId = id;
    }

    @Override
    public void updateFromCourse(Update update) {
        System.out.print(name);
        System.out.println(" You have an Update from "+update.getCourseName()+" course. The Update is");
        System.out.println(update.getUpdate());
    }
}
