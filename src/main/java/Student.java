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
import org.joda.time.format.*;

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
    
    public String summarise(){
        return "ID: "+this.ID+"\tName: "+this.name + "\tDOB: " + formatDate(this.DOB)+ "\tUsername: " + this.username;
    }
    
    public void PrintStudentInfo(){
        System.out.println("-------------------------------------");
        System.out.println("Student Name:                 "+ this.name);
        System.out.println("Student ID:                   "+ this.ID);
        System.out.println("Student Username:             "+ this.username);
        System.out.println("Student Date of Birth:        "+ formatDate(this.DOB));
        System.out.println("Student Age:                  "+ this.age);
        System.out.println("Modules that Student is enrolled in: ");
        PrintModuleList();
        System.out.println("Courses that Student is enrolled in:           ");
        PrintCourseList();
        System.out.println("-------------------------------------");
    }
        
    // Print list of courses student is taking
    public void PrintCourseList(){
        for (Course c: this.courses){
            System.out.println(c.summarise());
        }
    }
    
    // Print list of modules student is taking
    public void PrintModuleList(){
        for (Module m: this.modules){
            System.out.println(m.summarise());
        }
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
    
    public String formatDate(DateTime date){
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
        return date.toString(fmt);
    }
}