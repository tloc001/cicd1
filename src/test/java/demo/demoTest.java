package demo;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class demoTest {
    @Test
    public void sum() {
        demo demo = new demo();
        assertEquals(demo.sum(1,2),3);
    }
    @Test
    public void sub() {
        demo demo = new demo();
        assertEquals(demo.sum(1,2),-1);
    }
}