package com.stackroute.pe4;

public class Replace {
    public String replaceChar(String str) {


        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('d', 'f');

        // Replace all the 'l' characters with 't' characters.
        String new_str1 = new_str.replace('l', 't');


        return new_str1;
    }
}
