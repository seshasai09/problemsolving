import java.util.*;

/**
 * Created by vasumathi on 19/08/2017.
 */
public class ComparatorExample {

    public class Student{
        private String name;
        private int age;
        private int grade;
        public Student (String name, int age, int grade){
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString(){
            return name + ", " + age +", "+ grade;
        }
    }

    public class GradeComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.grade - o2.grade;
        }
    }

    public static void main(String[] args){
       /* ComparatorExample ce = new ComparatorExample();
        ce.runExample();*/
        int cnt=0;
        for(int i=1;i<=Math.sqrt(Math.abs(16));i++){
            if(i*i>=4 && i*i<=16) {
                System.out.println(i);
                cnt++;
            }
        }
        System.out.print (cnt);


    }

    public void runExample(){
        Student[] container = new Student[5];
        container[0] = new Student("s1",20,50);
        container[1] = new Student("s2",20,60);
        container[2] = new Student("s3",20,70);
        container[3] = new Student("s4",20,80);
        container[4] = new Student("s5",20,90);
        List<Student> al = new ArrayList<Student>();
        al.add(container[0]);
        al.add(container[1]);
        al.add(container[2]);
        al.add(container[3]);
        al.add(container[4]);
        Collections.sort(al,new GradeComparator());

        Arrays.sort(container,new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return o1.grade-o2.grade;
            }
        });
        for(Student s : container){
            System.out.println(s);
        }

        al.forEach(a-> System.out.println(a));




    }
}
