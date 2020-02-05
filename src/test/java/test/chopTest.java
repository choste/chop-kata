package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import karate.chop;

public class chopTest {
    @Test
    public void emptyArray() {
        List<Integer> testList = new ArrayList<Integer>();
        assertEquals(-1, chop.chop(3, testList));
    }

    @Test
    public void singleItem() {
        List<Integer> testList = new ArrayList<>();
        testList.add(1);

        assertEquals(-1, chop.chop(3, testList));
        assertEquals(0, chop.chop(1, testList));
    }

    @Test
    public void shortList() {
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(3);
        testList.add(5);

        assertEquals(0, chop.chop(1, testList));
        assertEquals(1, chop.chop(3, testList));
        assertEquals(2, chop.chop(5, testList));
        assertEquals(-1, chop.chop(0, testList));
        assertEquals(-1, chop.chop(2, testList));
        assertEquals(-1, chop.chop(4, testList));
        assertEquals(-1, chop.chop(6, testList));
    }

    @Test
    public void longList() {
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(3);
        testList.add(5);
        testList.add(7);

        assertEquals(0, chop.chop(1, testList));
        assertEquals(1, chop.chop(3, testList));
        assertEquals(2, chop.chop(5, testList));
        assertEquals(3, chop.chop(7, testList));
        assertEquals(-1, chop.chop(0, testList));
        assertEquals(-1, chop.chop(2, testList));
        assertEquals(-1, chop.chop(4, testList));
        assertEquals(-1, chop.chop(6, testList));
        assertEquals(-1, chop.chop(8, testList));

    }

}
