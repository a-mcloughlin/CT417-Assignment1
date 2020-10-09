/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*; 
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.*;

/**
 *
 * @author Aideen
 */
public class CourseTest {
    
    public Course testcourse;
    
    @Before
    public void setUp() {
        DateTime start = DateTime.parse("2020-01-01");
        DateTime end = DateTime.parse("2020-10-10");
        testcourse = new Course("Firstname Lastname", start,end);
    }

    @Test
    public void testGetName() {        
        System.out.println("Test: setName() and getName()");
        assertEquals(testcourse.getName(), "Firstname Lastname");
    }

    @Test
    public void testGetStartDate() { 
        System.out.println("Test: setStartDate() and getStartDate()");
        assertEquals(testcourse.getStartDate(), DateTime.parse("2020-01-01"));
    }

    @Test
    public void testGetEndDate() {
        System.out.println("Test: setEndDate() and getEndDate()");
        assertEquals(testcourse.getEndDate(), DateTime.parse("2020-10-10"));
    }

    
    @Test
    public void testAddModule() {
        System.out.println("Test: addModule() and getModules()");
        
        // Assert that LinkedList is empty
        assertEquals(testcourse.getModules(), new LinkedList<Module>());
        
        // Create and add Modules to Course
        Module testModule1 = new Module(1, "Fake Module 1", "Fake Lecturer 1");
        Module testModule2 = new Module(2, "Fake Module 2", "Fake Lecturer 2");
        testcourse.addModule(testModule1);
        testcourse.addModule(testModule2);
        
        //Assert that modules are as expected
        LinkedList<Module> testList = new LinkedList<Module>();
        testList.add(testModule1);
        testList.add(testModule2);
        assertEquals(testcourse.getModules(), testList);
        
    }

    @Test
    public void testAddStudent() {
        System.out.println("Test: addStudent() and getStudents()");
                
        // Assert that LinkedList is empty
        assertEquals(testcourse.getStudents(), new LinkedList<Student>());
        
        // Create and add Students to Course
        Student testStudent1 = new Student("Fake Name 1", "2000-01-01", 1);
        Student testStudent2 = new Student("Fake Name 2", "2000-01-01", 2);
        testcourse.addStudent(testStudent1);
        testcourse.addStudent(testStudent2);
        
        //Assert that students are as expected
        LinkedList<Student> testList = new LinkedList<Student>();
        testList.add(testStudent1);
        testList.add(testStudent2);
        assertEquals(testcourse.getStudents(), testList);
    }
}
