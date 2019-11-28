package com.generics;

public class FindMaxNum {

    public Integer findMaxInteger(Integer a, Integer b, Integer c) {
        if(a.compareTo(b) > 0) {
            return a;
        }
        else if( c.compareTo(b) > 0){
            return c;
        }
        else {
            return b;
        }
    }

    public Float findMaxFloat(Float a, Float b, Float c) {
        if(a.compareTo(b) > 0) {
            return a;
        }
        else if( c.compareTo(b) > 0){
            return c;
        }
        else {
            return b;
        }
    }

    public String findMaxString(String a, String b, String c) {
        if(a.compareTo(b) > 0) {
            return a;
        }
        else if( c.compareTo(b) > 0){
            return c;
        }
        else {
            return b;
        }
    }
}

