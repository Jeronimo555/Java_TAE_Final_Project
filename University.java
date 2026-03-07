package Java_TAE_Project_1;

import java.util.ArrayList;
import java.util.UUID;

public class University {
    private ArrayList<Class> list_of_classes;
    private ArrayList<Teacher> list_of_teachers;
    private ArrayList<Student> list_of_Students;

    public University() {
        this.list_of_classes = new ArrayList<>();
        this.list_of_teachers = new ArrayList<>();
        this.list_of_Students = new ArrayList<>();
    }


    public Student createStudent(String name, int age){
        String uniqueID = UUID.randomUUID().toString();

        Student student = new Student(uniqueID, name,age);
        getListOfStudents().add(student);

        return student;
    }

    public Class createClass(String name, Teacher teacher, String classroom){
        Class new_class = new Class(name,teacher,classroom);
        getListOfClasses().add(new_class);

        return new_class;
    }

    public Teacher createPartTimeTeacher(String name, int age, int hours_per_week){
        PartTimeTeacher teacher = new PartTimeTeacher(name,age,hours_per_week);
        getListOfTeachers().add(teacher);

        return teacher;
    }

    public Teacher  createFullTimeTeacher(String name, int age, int years_of_experience){
        FullTimeTeacher teacher = new FullTimeTeacher(name,age,years_of_experience);
        getListOfTeachers().add(teacher);

        return teacher;
    }

    public void printTeachers(){
        int list_length = getListOfTeachers().size();

        for (byte i = 0; i<list_length;i++){
            Teacher teacher = getListOfTeachers().get(i);
            System.out.println("Teacher name: " + teacher.getName());
            System.out.println("Teacher status: " + teacher.toString());
            System.out.println("Age: " + teacher.getAge());
            System.out.println("Salary: " + teacher.getSalary() + "$" + "\n");
        }
    }

    public void printStudents(){
        int list_length = getListOfStudents().size();

        for (byte i = 0; i<list_length;i++){
            Student student = getListOfStudents().get(i);
            System.out.println("Student name: " + student.getName());
            System.out.println("Age: " + student.getAge());
        }
    }



    public ArrayList<Class> getListOfClasses() {
        return list_of_classes;
    }

    public ArrayList<Teacher> getListOfTeachers() {
        return list_of_teachers;
    }

    public ArrayList<Student> getListOfStudents() {
        return list_of_Students;
    }
}
