/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aideen
 */
import java.util.*; 
public class Module {
    private int ID;
    private String name;
    private String lecturer;
    private LinkedList<Student> students;
    private LinkedList<Course> courses;


    // Initialiser method for the Module class 
    public Module(int ID, String name, String lecturer){
        setID(ID);
        setName(name);
        setLecturer(lecturer);
        this.students = new LinkedList<Student>();
        this.courses = new LinkedList<Course>();
    }
    
    public String summarise(){
        return "ID: "+this.ID+"\tName: "+this.name + "\tLecturer: " + this.lecturer;
    }
    
    public void PrintModuleInfo(){
        System.out.println("-------------------------------------");
        System.out.println("Course Name:                 "+ this.name);
        System.out.println("Course ID:                   "+ this.ID);
        System.out.println("Course Lecturer:             "+ this.lecturer);
        System.out.println("Students Enrolled in Module: ");
        PrintStudentList();
        System.out.println("Courses that Module is a part of:           ");
        PrintCourseList();
        System.out.println("-------------------------------------");
    }
      
// Print list of students enrolled in module
    public void PrintStudentList(){
        for (Student s: this.students){
            System.out.println(s.summarise());
        }
    }
        
    // Print list of courses making up module
    public void PrintCourseList(){
        for (Course c: this.courses){
            System.out.println(c.summarise());
        }
    }
    
    // Set the ID for this module
    private void setID(int ID){
        this.ID = ID;
    }    
    
    // Set the name for this module
    private void setName(String name){
        this.name = name;
    }

    // Set the lecturer who is teaching this module
    private void setLecturer(String lecturer){
        this.lecturer = lecturer;
    }

    // Add a course in which this module is taken
    public void addCourse(Course course){
        courses.add(course);
    }

    // Add a student eho is taking this module
    public void addStudent(Student student){
        students.add(student);
    }

    // Get the ID for this module
    public int getID(){
        return this.ID;
    }

    // Get the name of this module
    public String getName(){
        return this.name;
    }

    // Get the lecturer teaching this module
    public String getLecturer(){
        return this.lecturer;
    }        

    // Get the list of students enrolled in this module
    public LinkedList<Student> getStudents(){
        return this.students;
    }

    // Get the list of Courses that this module is a part of
    public LinkedList<Course> getCourses(){
        return this.courses;
    }
}

