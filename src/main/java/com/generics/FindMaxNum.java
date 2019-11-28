package com.generics;

public class FindMaxNum {
    static <E extends Comparable<E>> E findMaxValue(E a, E b, E c) {
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

