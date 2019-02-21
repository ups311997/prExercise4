package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IndexTest {
    Index ind;

    @Before
    public void setUp() throws Exception {
        ind = new Index();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String expected = "4-6 10-12 27-29";
        String actual = ind.findIndex("She sells seashells by the seashore", "se");

        assertEquals(expected, actual);
    }

}