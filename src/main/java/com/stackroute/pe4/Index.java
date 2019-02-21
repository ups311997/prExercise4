package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Index {

    public String findIndex(String str, String input) {
        Pattern pt = Pattern.compile(input);
        Matcher matcher = pt.matcher(str);
        String res = "";
        while (matcher.find()) {
            res = res + matcher.start() + "-" + matcher.end() + " ";
        }

        return res.trim();
    }
}
