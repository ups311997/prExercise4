package com.stackroute.pe4;

import java.util.StringTokenizer;

public class Paragraph {


    public String[] operations(String s) {

        String arr[] = new String[11];
        int c = 0;


        {
            StringTokenizer st = new StringTokenizer(s, " ");

            while (st.hasMoreTokens()) {
                arr[c] = st.nextToken();
                c++;
            }
            System.out.println("The original string is:::" + s);
            System.out.println("-------The Tokens of the strings--------");
            for (int i = 0; i < c; i++) {
                System.out.println(arr[i]);
            }
        }

        {

            {


                for (int i = 0; i < c; i++) {
                    for (int j = i + 1; j < c; j++) {
                        if (arr[j].compareToIgnoreCase(arr[i]) < 0) {
                            String t = arr[i];
                            arr[i] = arr[j];
                            arr[j] = t;
                        }
                    }
                }
            }
            System.out.println("--------The sorted array of strings---------");
            for (int k = 0; k < c; k++) {
                System.out.println(arr[k]);
            }
        }
        return arr;

    }


}