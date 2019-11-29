package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumTest {
    @Test
    public void givenThreeIntegerValue_WhenProper_ReturnTrue() {
        Integer a = 1;
        Integer b = 7;
        Integer c = 8;
        FindMaxNum<Integer> integerFindMaxNum = new FindMaxNum<Integer>(a, b, c);
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals(8,maxValue);
    }

    @Test
    public void givenThreeFloatValue_WhenProper_ReturnTrue() {
        Float a = 1.5f;
        Float b = 7.8f;
        Float c = 8.5f;
        FindMaxNum<Float> floatFindMaxNum = new FindMaxNum<Float>(a, b, c);
        Comparable maxValue = floatFindMaxNum.findMaxValue();
        Assert.assertEquals(8.5f,maxValue);
    }

    @Test
    public void givenThreeStringValue_WhenProper_ReturnTrue() {
        String a = "PRIYANKA";
        String b = "Ram";
        String c = "Piyu";
        FindMaxNum<String> stringFindMaxNum = new FindMaxNum<String>(a, b, c);
        Comparable maxValue = stringFindMaxNum.findMaxValue();
        Assert.assertEquals("Ram",maxValue);
    }
    @Test
    public void givenThreeIntegerValue_WhenProper_ReturnPrintThatValue() {
        Integer a = 10;
        Integer b = 20;
        Integer c = 30;
        FindMaxNum<Integer> integerFindMaxNum = new FindMaxNum<Integer>(a, b, c);
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals(30,maxValue);
    }
}
