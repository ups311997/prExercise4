package com.stackroute.pe4;

public class Occurence {
    public int countOccurence(String str) {


        int charcount = str.length() - str.replaceAll("a", "").length();

        return charcount;
    }
}
