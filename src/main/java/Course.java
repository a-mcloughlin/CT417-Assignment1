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
    
    // Add a module to this course
    public void addModule(Module module){
        modules.add(module);
    }

    // Enroll a student in this course
    public void addStudent(Student student){
        students.add(student);
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
}
