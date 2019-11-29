package com.generics;

public class FindMaxNum<E extends Comparable> {
    E num1;
    E num2;
    E num3;

    public FindMaxNum(E num1, E num2, E num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public <E extends Comparable> E findMaxValue() {
        E max = (E) num2;
        if (num1.compareTo(max) > 0) {
            max = (E) num1;
        } else if (num3.compareTo(max) > 0) {
            max = (E) num3;
        }
        printMax(max);
        return max;
    }
    private static <T> void printMax(T maximumValue){
        System.out.println(maximumValue);
    }
}

