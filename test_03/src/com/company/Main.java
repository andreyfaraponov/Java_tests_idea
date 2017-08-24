package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int orig = 42;
        Main x = new Main();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    int go(int arg)
    {
        arg *= 2;
        return (arg);
    }
}
