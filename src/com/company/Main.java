package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner         sc;
        String          str;
        int             i;
        int             j;
        StringBuffer    line_rus;
        StringBuffer    line_eng;

        line_eng = new StringBuffer("qwertyuiop[]asdfghjkl;'zxcvbnm,.QWERTYUIOP[]ASDFGHJKL;'ZXCVBNM,./");
        line_rus = new StringBuffer("йцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ");
        i = -1;
        sc = new Scanner(System.in);
        str = sc.nextLine();
        while (++i < str.length() && (j = -1) < 0)
        {
            while (++j < line_eng.length())
            {
                if (str.charAt(i) == line_eng.charAt(j))
                {
                    System.out.println(str.charAt(i));
                    str = str.replace(str.charAt(i), line_rus.charAt(j));
                }
            }
        }
        System.out.println(str);
        sc.close();
    }
}
