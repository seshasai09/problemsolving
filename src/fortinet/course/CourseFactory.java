package fortinet.course;

/**
 * Created by seshasai on 15/08/2017.
 */

/**
 * This class is Singleton. So the constructor is private.
 * Any class that wants to use this class should call te getInstance method the get instance of this class.
 *
 * This class is also a Factory for course.
* */
public class CourseFactory {

    private static CourseFactory instance;
    private static int numberOfInstances;


    private CourseFactory(){

    }

    public static synchronized   CourseFactory getInstance(){
        if(instance == null){
            instance = new CourseFactory();
            numberOfInstances++;
            return instance;
        }
        return instance;
    }

    public Course getCourse(CourseName subject){
        switch(subject){
            case MATHS:  return new MathCourse();
            case SCIENCE:  return new ScienceCourse();
            case SOCIAL : return new SocialCourse();
            default : return null;
        }
    }

    public static int getNumberOfInstancesCreated(){
        return numberOfInstances;
    }
}
