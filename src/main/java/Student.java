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
import org.joda.time.*;

public class Student {
    private int ID;
    private String name;
    private DateTime DOB;
    private int age;
    private String username;
    private LinkedList<Course> courses;
    private LinkedList<Module> modules;

    // Initialiser method for the Student class 
    public Student(String name, String DOB, int ID){
        setName(name);
        setDOB(DateTime.parse(DOB));
        setID(ID);
        setAge(this.DOB);
        setUsername(this.name, this.age);
        this.courses = new LinkedList<Course>();
        this.modules = new LinkedList<Module>();
    }
    public static void main(String[] args) {
        Student aideen = new Student("Aideen McLoughlin", "1998-10-28", 17346123);
        System.out.println("ID:       "+ aideen.ID);
        System.out.println("Name:     "+ aideen.name);
        System.out.println("Age:      "+ aideen.age);
        System.out.println("DOB:      "+ aideen.DOB);
        System.out.println("Username: "+ aideen.username);
        System.out.println("Courses:  "+ aideen.courses);
        System.out.println("Modules:  "+ aideen.modules);
    }

    // Add a module to the list of modules taken by the student
    public void addModule(Module module){
        modules.add(module);
    }
    // Add a course to the list of courses taken by the student
    public void addCourse(Course course){
        courses.add(course);
    }

    // Get the student's ID number
    public int getID(){
        return this.ID;
    }

    // Get the student's full Name
    public String getName(){
        return this.name;
    }
    
    // Get the student's age
    public int getAge(){
        return this.age;
    }
    
    // Get the student's date of birth
    public DateTime getDOB(){
        return this.DOB;
    }
    
    // Get the student's username
    public String getUsername(){
        return this.username;
    }       
    
    // Get the list of courses the student is enrolled in
    public LinkedList<Course> getCourses(){
        return this.courses;
    }

    // Get the list of modules the student is enrolled in
    public LinkedList<Module> getModules(){
        return this.modules;
    }

    // Set the student's ID number
    public void setID(int ID){
        this.ID =  ID;
    }    

    // Set the student's name
    public void setName(String name){
        this.name =  name;
    }      

    // Set the student's date of birth
    public void setDOB(DateTime DOB){
        this.DOB =  DOB;
    }

    // Set the stuents username from their Full name and age
    // Username will be in the form firstname.lastname.age (all lower case)
    public void setUsername(String name, int age) {
        String modifiedName = name.replaceAll(" ",".").toLowerCase();
        this.username = modifiedName + '.'+ String.valueOf(age);
    }  

    // Set the students age using their date of birth
    public void setAge(DateTime DOB){	    
        DateTime today = DateTime.now();
        Period period = new Period(DOB, today);
        this.age = period.getYears();
    }    
}