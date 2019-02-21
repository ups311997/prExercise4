package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphTest {
    Paragraph par;

    @Before
    public void setUp() throws Exception {
        par = new Paragraph();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void checkWords() {
        String[] expected = {"and", "first", "is", "is", "last", "My", "my", "name", "name", "Poddar", "Upasana"};
        String[] actual = par.operations("My first name is Upasana and my last name is Poddar");


        assertArrayEquals(expected, actual);
    }


}