package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {

        Replace rep ;
        @Before
        public void setUp() throws Exception {
            rep= new Replace();
        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void check() {
            String expected="faity fry";
            String actual=rep.replaceChar("daily dry");

            assertEquals(expected,actual);
        }





    }



