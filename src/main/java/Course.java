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
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Course {
    private String name;
    private DateTime startDate;
    private DateTime endDate;
    private LinkedList<Student> students;
    private LinkedList<Module> modules;


    // Initialiser method for the Course class 
    public Course(String name, DateTime start, DateTime end){
        this.name = name;
        setStartDate(start);
        setEndDate(end);
        this.students = new LinkedList<Student>();
        this.modules = new LinkedList<Module>();
    }
        
    public String summarise(){
        return "Name: "+this.name + "\tStart Date: " + formatDate(this.startDate)+"\tEnd Date: " + formatDate(this.endDate);
    }
    
    public void PrintCourseInfo(){
        System.out.println("-------------------------------------");
        System.out.println("Course Name:                 "+ this.name);
        System.out.println("Course Start Date:           "+ formatDate(this.startDate));
        System.out.println("Course End Date:             "+ formatDate(this.endDate));
        System.out.println("Students Enrolled in Course: ");
        PrintStudentList();
        System.out.println("Modules in Course:           ");
        PrintModuleList();
        System.out.println("-------------------------------------");
    }
    
    // Print list of students enrolled in module
    public void PrintStudentList(){
        for (Student s: this.students){
            System.out.println(s.summarise());
        }
    }
        
    // Print list of modules taken as part of course
    public void PrintModuleList(){
        for (Module m: this.modules){
            System.out.println(m.summarise());
        }
    }
    
    // Add a module to this course
    public void addModule(Module module){
        modules.add(module);        
        module.addCourse(this);
    }

    // Enroll a student in this course, and in every module that makes up the course
    public void addStudent(Student student){
        students.add(student);
        for (Module m: modules){
            m.addStudent(student);
            student.addModule(m);
        }
        student.addCourse(this);
    }
    
    // Set the name of this course
    public void setName(String name){
        this.name = name;
    }

    // Set the start date for this Course
    public void setStartDate(DateTime start){
        this.startDate = start;
    }

    // Set the end date for this Course
    public void setEndDate(DateTime end){
        this.endDate = end;
    }

    // Get the name of this course
    public String getName(){
        return this.name;
    }

    // Get the list of students enrolled in this course
    public LinkedList<Student> getStudents(){
        return this.students;
    }

    // Get the list of modules that make up this course
    public LinkedList<Module> getModules(){
        return this.modules;
    }

    // Get the start date for this Course
    public DateTime getStartDate(){
        return this.startDate;
    }

    // Get the end date for this Course
    public DateTime getEndDate(){
        return this.endDate;
    }
    public String formatDate(DateTime date){
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
        return date.toString(fmt);
    }
}
