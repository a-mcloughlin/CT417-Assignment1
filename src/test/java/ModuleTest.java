/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aideen
 */
public class ModuleTest {
        
    public Module testmodule;
    
    @Before
    public void setUp() {
        testmodule = new Module(1, "Test Module 101", "Firstname Secondname");
    }

    @Test
    public void testGetName() {        
        System.out.println("Test: setName() and getName()");
        assertEquals(testmodule.getName(), "Test Module 101");
    }
    
    @Test
    public void testGetID() {        
        System.out.println("Test: setID() and getID()");
        assertEquals(testmodule.getID(), 1);
    }
        
    @Test
    public void testGetLecturer() {        
        System.out.println("Test: setLecturer() and getLecturer()");
        assertEquals(testmodule.getLecturer(), "Firstname Secondname");
    }
    
    @Test
    public void testAddCourse() {
        System.out.println("Test: addCourse() and getCourses()");
        
        // Assert that LinkedList is empty
        assertEquals(testmodule.getCourses(), new LinkedList<Course>());
        
        // Create and add Modules to CourseDateTime start = DateTime.parse("2020-01-01");
        DateTime sampledate = DateTime.now();
        Course testCourse1 = new Course("Fake Name 1", sampledate, sampledate);
        Course testCourse2 = new Course("Fake Name 2", sampledate, sampledate);
        testmodule.addCourse(testCourse1);
        testmodule.addCourse(testCourse2);
        
        //Assert that modules are as expected
        LinkedList<Course> testList = new LinkedList<Course>();
        testList.add(testCourse1);
        testList.add(testCourse2);
        assertEquals(testmodule.getCourses(), testList);
    }

    @Test
    public void testAddStudent() {
        System.out.println("Test: addStudent() and getStudents()");
                
        // Assert that LinkedList is empty
        assertEquals(testmodule.getStudents(), new LinkedList<Student>());
        
        // Create and add Students to Course
        Student testStudent1 = new Student("Fake Name 1", "2000-01-01", 1);
        Student testStudent2 = new Student("Fake Name 2", "2000-01-01", 2);
        testmodule.addStudent(testStudent1);
        testmodule.addStudent(testStudent2);
        
        //Assert that students are as expected
        LinkedList<Student> testList = new LinkedList<Student>();
        testList.add(testStudent1);
        testList.add(testStudent2);
        assertEquals(testmodule.getStudents(), testList);
    }
}