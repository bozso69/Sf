import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class testList {
    private list testPeople = new list();

    @BeforeEach
    public void init() {
        testPeople.add("Gyula");
        testPeople.add("Gizi");
    }


    @AfterEach
    void destory() {
        testPeople.removeAll();
    }

    @Test
    public void testSize(){
        assertEquals( 2, testPeople.size(), "Méret ellenörzés megbukott");
    }
    @Test
    public void testIsEmpty(){
        assertFalse(testPeople.isEmpty());
    }
@Test
    public void testAdd(){
        testPeople.add("Jani");
        assertEquals(3,testPeople.size());
}

    //@Test(expected = NoSuchElementException.class)
    @Test
    public void testRemove(){
        System.out.println("testPeople.size() = " + testPeople.size());
        testPeople.remove("Gizi");
        assertEquals(1, testPeople.size(),"Remove hiba");

    }
    @Test
    public void testRemoveAll(){
        testPeople.removeAll();
        assertTrue(testPeople.isEmpty());
    }

}