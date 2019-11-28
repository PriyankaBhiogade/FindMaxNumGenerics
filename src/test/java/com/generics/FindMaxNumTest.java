package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumTest {
    @Test
    public void givenThreeIntegerValue_WhenProper_ReturnTrue() {
        Integer a = 1;
        Integer b = 7;
        Integer c = 8;
        FindMaxNum findMaxNum = new  FindMaxNum();
        Integer maxNum = findMaxNum.findMaxValue(a,b,c);
        Assert.assertEquals((Integer)8,maxNum);
    }

    @Test
    public void givenThreeFloatValue_WhenProper_ReturnTrue() {
        Float a = 1.5f;
        Float b = 7.8f;
        Float c = 8.5f;
        FindMaxNum findMaxNum = new  FindMaxNum();
        Float maxNum = findMaxNum.findMaxValue(a,b,c);
        Assert.assertEquals((Float)8.5f,maxNum);
    }

    @Test
    public void givenThreeStringValue_WhenProper_ReturnTrue() {
        String a = "PRIYANKA";
        String b = "Ram";
        String c = "Piyu";
        FindMaxNum findMaxNum = new  FindMaxNum();
        String maxNum = findMaxNum.findMaxValue(a,b,c);
        Assert.assertEquals("Ram",maxNum);
    }
}
