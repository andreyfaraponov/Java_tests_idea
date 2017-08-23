package com.company;

import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int             i;
        int             j;
        Scanner         sc;
        String          str;
        StringBuffer    line_rus;
        StringBuffer    line_eng;

        line_rus = new StringBuffer("абвгдежзийклмнопрстуфхцэюАБВГДЕЖЗИЙКЛМНОПРСТУФХЦЭЮЯЧ");
        line_eng = new StringBuffer("abvgdejziyklmnoprstufhceuABVGDEJZIYKLMNOPRSTUFHCEUJ4");
        sc = new Scanner(System.in);
        str = sc.nextLine();
        i = 0;
        while (i < str.length() && (j = -1) < 0)
        {
            while (++j < line_rus.length())
            {
                if (str.charAt(i) == 'ш' || str.charAt(i) == 'Щ')
                {
                    str = str.replaceAll("Ш", "SH");
                    str = str.replaceAll("Щ", "SH");
                }
                if (str.charAt(i) == 'ш' || str.charAt(i) == 'щ')
                {
                    str = str.replaceAll("ш", "sh");
                    str = str.replaceAll("щ", "sh");
                }
                if (str.charAt(i) == 'Ё')
                    str = str.replaceAll("Ё", "Yo");
                if (str.charAt(i) == 'Ё')
                    str = str.replaceAll("Ё", "Yo");
                if (str.charAt(i) == 'ё')
                    str = str.replaceAll("ё", "yo");
                if (str.charAt(i) == line_rus.charAt(j))
                    str = str.replace(str.charAt(i), line_eng.charAt(j));
            }
            i++;
        }
        System.out.println(str);
    }
}
