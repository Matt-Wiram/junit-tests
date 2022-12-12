import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class StudentTest {

    Student empty;
    Student studentWithOne;
    Student studentWithMany;

    @Before
    public void setUp(){
        empty= new Student(1, "none", new ArrayList<>());

        studentWithOne = new Student(2, "one", new ArrayList<>());
        studentWithOne.addGrade(80);

        studentWithMany = new Student(3, "many", new ArrayList<>());
        studentWithMany.addGrade(80);
        studentWithMany.addGrade(90);
        studentWithMany.addGrade(90);
        studentWithMany.addGrade(80);
    }

    @Test
    public void testIsEmpty(){
        assertTrue(empty.grades.isEmpty());
        assertFalse(studentWithOne.grades.isEmpty());
    }

    @Test
    public void testSize(){
        assertEquals(0, empty.grades.size());
        assertEquals(1, studentWithOne.grades.size());
        // Testing sizes is tricky, setting boundaries is always a good idea.
        // Test 0, 1 and many but not 2
        assertEquals(4, studentWithMany.grades.size());
    }

    @Test
    public void testAdd(){
        // Making sure the emptyKitchen returns true
        assertTrue(empty.grades.isEmpty());

        // Add any tortilla to make it not empty anymore
        empty.grades.add(80);

        // Making sure the emptyKitchen returns false once we add an element to it
        assertFalse(empty.grades.isEmpty());

        // Making sure the other instances of are not empty since they added items in the setUp method
        assertFalse(studentWithOne.grades.isEmpty());
        assertFalse(studentWithMany.grades.isEmpty());
    }

//    @Test
//    public void testRemove(){
//        // Trying to pop from an empty kitchen
//        emptyKitchen.pop();
//        // The void method should catch the if statement and the size should be still 0
//        assertEquals(0, emptyKitchen.size());
//
//        kitchenWithOne.pop();
//        assertEquals(0, kitchenWithOne.size());
//
//        kitchenWithMany.pop();
//        assertEquals(3, kitchenWithMany.size());
//    }

//    @Test
//    public void testContains(){
//        assertFalse(emptyKitchen.contains("blue corn"));
//        assertTrue(kitchenWithOne.contains("yellow corn"));
//        assertTrue(kitchenWithMany.contains("white corn"));
//    }
}
