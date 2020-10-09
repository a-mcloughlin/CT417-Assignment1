/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aideen
 */
import java.util.LinkedList;
import org.junit.Test;
import org.joda.time.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    
     public Student teststudent;
     public DateTime todaysDate;
    
    @Before
    public void setUp() {
        todaysDate = DateTime.now();
        teststudent = new Student("Firstname Lastname", todaysDate.toString(), 12345678);
    }

    @Test
    public void testGetName() {        
        System.out.println("Test: setName() and getName()");
        assertEquals(teststudent.getName(), "Firstname Lastname");
    }
    
    @Test
    public void testGetID() {        
        System.out.println("Test: setID() and getID()");
        assertEquals(teststudent.getID(), 12345678);
    }    
    
    @Test
    public void testGetDOB() { 
        System.out.println("Test: setDOB() and getDOB()");
        assertEquals(teststudent.getDOB().toString(), todaysDate.toString());
    }
    @Test
    public void testGetAge() {        
        System.out.println("Test: setAge() and getAge()");
        assertEquals(teststudent.getAge(), 0);
    }
    @Test
    public void testGetUsername() {        
        System.out.println("Test: setUsername() and getUsername()");
        assertEquals(teststudent.getUsername(), "firstname.lastname.0");
    }
    @Test
    public void testAddModule() {
        System.out.println("Test: addModule() and getModules()");
        
        // Assert that LinkedList is empty
        assertEquals(teststudent.getModules(), new LinkedList<Module>());
        
        // Create and add Modules to Course
        Module testModule1 = new Module(1, "Fake Module 1", "Fake Lecturer 1");
        Module testModule2 = new Module(2, "Fake Module 2", "Fake Lecturer 2");
        teststudent.addModule(testModule1);
        teststudent.addModule(testModule2);
        
        //Assert that modules are as expected
        LinkedList<Module> testList = new LinkedList<Module>();
        testList.add(testModule1);
        testList.add(testModule2);
        assertEquals(teststudent.getModules(), testList);
    }
    
    @Test
    public void testAddCourse() {
        System.out.println("Test: addCourse() and getCourses()");
        
        // Assert that LinkedList is empty
        assertEquals(teststudent.getCourses(), new LinkedList<Course>());
        
        // Create and add Modules to CourseDateTime start = DateTime.parse("2020-01-01");
        DateTime sampledate = DateTime.now();
        Course testCourse1 = new Course("Fake Name 1", sampledate, sampledate);
        Course testCourse2 = new Course("Fake Name 2", sampledate, sampledate);
        teststudent.addCourse(testCourse1);
        teststudent.addCourse(testCourse2);
        
        //Assert that modules are as expected
        LinkedList<Course> testList = new LinkedList<Course>();
        testList.add(testCourse1);
        testList.add(testCourse2);
        assertEquals(teststudent.getCourses(), testList);
    }
}
