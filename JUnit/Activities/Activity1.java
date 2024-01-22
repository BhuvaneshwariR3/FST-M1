package activities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

    static ArrayList<String> list;

    @BeforeAll
    public static void setUp(){
        list = new ArrayList<String>();

        list.add("alpha"); // at index 0
        list.add("beta");
    }

    @Test
    public void insertTest(){
        assertEquals(2, list.size(), "Wrong size");
        list.add("gamma");
        assertEquals(3, list.size(), "Correct size");
        assertEquals("beta", list.get(3), "Wrong element");
        assertEquals("alpha", list.get(0), "alpha found! Correct element");
        assertEquals("beta", list.get(1), "beta found! Correct element");
        assertEquals("gamma", list.get(2), "gamma found! Correct element");
    }

    @Test
    public void replaceTest(){
        list.set(1, "gamma");

        // Assert size of list
        assertEquals(2, list.size(), "Wrong size");
        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("gamma", list.get(1), "Wrong element");
    }

}
