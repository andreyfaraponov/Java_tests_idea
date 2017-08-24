package com.company;

import java.util.Collection;
import java.util.Dictionary;

public class Test_links
{
    public static void main(String[] args)
    {
        Test t1 = new Test();
        t1.val = 200;
        Test t2 = t1;
        System.out.println(t2.val);
        ATypeName at1 = new ATypeName("Hello world!");
    }
}

class Test
{
    public int val;

    public Test()
    {
        val = 100;
    }
}

class ATypeName
{
    //some body
    public ATypeName(String s)
    {
        System.out.println(s);
    }
}