package fortinet;

import fortinet.course.*;
import fortinet.student.Student;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by seshasai on 15/08/2017.
 */
public class School implements Runnable{

    private String name;
    public static final int ROLL_START = 1;
    private List<Course> coursesOffered;
    private static int studentId = ROLL_START;


    public School(String name){
        this.name = name;
    }

    /**
     * registering students for course.
     */
    public boolean registerStudent(String name, Course courseName){
        for(Course course: coursesOffered){
            if(courseName.getCourseName().contentEquals(course.getCourseName())){

                course.registerStudent(new Student(name,studentId++));
                return true;
            }
        }

        return false;
    }

    /**
     * Adding courses to the school
     */
    public void addCourses(Course course){
        if(coursesOffered == null){
            coursesOffered = new ArrayList<Course>();
        }
        coursesOffered.add(course);
    }

    /**
     * Update students who are registered for the course
     */
    public void updateStudentsInCourse(String coursename, Update update){

        for(Course course : coursesOffered){
            if(course.getCourseName().contentEquals(coursename)){
                course.updateStudents(update);
                return;
            }
        }
    }

    /**
     *Program kicks off by Adding courses to the school.
     * Registering students to classes
     * update the students who are registered for the course
     */

    @Override
    public void run() {
        Course course = null;
        for(int i=1;i<=3;i++){
            if(i==1){
                course  = CourseFactory.getInstance().getCourse(CourseName.MATHS);
                addCourses(course);
                addStudents(course);
                updateStudentsInCourse(CourseName.MATHS.getName(),new Update(CourseName.MATHS.getName(),"Welcome to the course"));
            }else if(i==2){
                course  = CourseFactory.getInstance().getCourse(CourseName.SCIENCE);
                addCourses(course);
                addStudents(course);
                updateStudentsInCourse(CourseName.SCIENCE.getName(),new Update(CourseName.SCIENCE.getName(),"Welcome to the course"));
            }else{
                course  = CourseFactory.getInstance().getCourse(CourseName.SOCIAL);
                addCourses(course);
                addStudents(course);
                updateStudentsInCourse(CourseName.SOCIAL.getName(),new Update(CourseName.SOCIAL.getName(),"Welcome to the course"));
            }
        }


    }

    private void addStudents(Course course){
        for(int i=1;i<=10;i++){
            registerStudent(String.valueOf(i), course);
        }
        try {
            System.out.println("registration completed for "+ name);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
