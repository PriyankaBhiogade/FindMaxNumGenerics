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

   public  <E extends Comparable> E findMaxValue() {
        if(num1.compareTo(num2) > 0) {
            return (E) num1;
        }
        else if( num3.compareTo(num2) > 0){
            return (E) num3;
        }
        else {
            return (E) num2;
        }
    }
}

