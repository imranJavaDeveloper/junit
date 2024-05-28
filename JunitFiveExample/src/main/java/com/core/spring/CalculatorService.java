package com.core.spring;
public class CalculatorService {

    // create add method

    public static int add(int first,int second){

        int sum=first+second;
        return sum;
    }

    // create divide method
    public static int divide(int first,int second){

        int div=first/second;
        return div;
    }

    // Add two String
    public static String addTwoString(String s1,String s2){

        return s1+s2;
    }


}
