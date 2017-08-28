package fortinet;

/**
 * Created by seshasai on 15/08/2017.
 */


import fortinet.course.CourseFactory;

/**
 * This is a Program to simulate some functions/operations that happen in schools
 * The scenarios that I am trying to simulate are
 * 1. Create school(extends Runnable)
 * 2. School has courses
 * 3. Students register for courses
 * 4. Whenever there is an update for the course, Students who are registered for that course gets the update.
 *
 * I have solved this problem using Design Patterns
 * I have Created a CourseFactory class that would create  course objects.
 * CourseFactory class is a Singleton class. I have made CourseFactory a singleton class
 * because different schools can use the same CourseFactory object to get course objects.
 *
 * The CourseFactory follows the Factory design pattern.
 * There are various course available like MathCourse, ScienceCourse and SocialCourse.
 * All the above mentioned courses extend the abstract class course.
 * Whenever a new course is required by the school, school uses the CourseFactory to get the required course object.
 *
 * I have used the Pub-Sub design Pattern to Solve the problem of updating students in the course.
 * Every course has methods to register, unregister students and an abstract method to update students.
 * Every course has to provide implementation for the update method.
 *
 * I have tried to simulate two schools by creating two threads.
 * Both the schools use the CourseFactory to obtain the courses.
 * Since CourseFactory is singleton only one instance is created.
 *
 * */

public class SchoolApp {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread( new School("School 1"));
        Thread t2 = new Thread( new School("School 2 "));
        System.out.println("Factory instances initially : " + CourseFactory.getNumberOfInstancesCreated());
        t1.start();
        t2.start();
        Thread.sleep(5000);
        System.out.println("Factory instances finally: " +CourseFactory.getNumberOfInstancesCreated());

    }
}
