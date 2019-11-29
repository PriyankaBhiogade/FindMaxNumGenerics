package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumTest {
    @Test
    public void givenAt1stPositionMaxNum_WhenProper_ReturnMaxNum() {
        FindMaxNum<Integer> integerFindMaxNum = new FindMaxNum<Integer>(30,20,10);
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals(30,maxValue);
    }

    @Test
    public void givenAt2stPositionMaxNum_WhenProper_ReturnMaxNum() {
        FindMaxNum<Integer> integerFindMaxNum = new FindMaxNum<Integer>(20,30,10);
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals(30,maxValue);
    }

    @Test
    public void givenAt3stPositionMaxNum_WhenProper_ReturnMaxNum() {
        FindMaxNum<Integer> integerFindMaxNum = new FindMaxNum<Integer>(10,20,30);
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals(30,maxValue);
    }

    @Test
    public void givenAt1stPositionMaxFloatNum_WhenProper_ReturnMaxNum() {
        FindMaxNum<Float> integerFindMaxNum = new FindMaxNum<Float>(30f,20f,10f);
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals(30f,maxValue);
    }

    @Test
    public void givenAt2stPositionMaxFloatNum_WhenProper_ReturnMaxNum() {
        FindMaxNum<Float> integerFindMaxNum = new FindMaxNum<Float>(10f,30f,20f);
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals(30f,maxValue);
    }

    @Test
    public void givenAt3stPositionMaxFloatNum_WhenProper_ReturnMaxNum() {
        FindMaxNum<Float> integerFindMaxNum = new FindMaxNum<Float>(10f,20f,30f);
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals(30f,maxValue);
    }

    @Test
    public void givenAt1stPositionMaxString_WhenProper_ReturnMaxNum() {
        FindMaxNum<String> integerFindMaxNum = new FindMaxNum<String>("Peach","Apple","Banana");
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals("Peach",maxValue);
    }

    @Test
    public void givenAt2stPositionMaxString_WhenProper_ReturnMaxNum() {
        FindMaxNum<String> integerFindMaxNum = new FindMaxNum<String>("Apple","Peach","Banana");
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals("Peach",maxValue);
    }

    @Test
    public void givenAt3stPositionMaxString_WhenProper_ReturnMaxNum() {
        FindMaxNum<String> integerFindMaxNum = new FindMaxNum<String>("Apple","Banana","Peach");
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals("Peach",maxValue);
    }

    @Test
    public void givenThreeIntegerValue_WhenProper_ReturnPrintThatValue() {
        FindMaxNum<Integer> integerFindMaxNum = new FindMaxNum<Integer>(10,20,30);
        Comparable maxValue = integerFindMaxNum.findMaxValue();
        Assert.assertEquals(30,maxValue);
    }

    @Test
    public void givenMoreThanThreeInt_WhenProper_ReturnMaxInt() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber<Integer>(10,0,45,85,20,10);
        Assert.assertEquals((Integer) 85, findMaximumNumber.findMax());
    }

    @Test
    public void givenMoreThanThreeFloat_WhenProper_ReturnMaxFloatNum() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber<Float>(10.5f,0.2f,45.7f,-85.51f,20.0f,10f);
        Assert.assertEquals((Float) 45.7f, findMaximumNumber.findMax());
    }

    @Test
    public void givenMoreThanThreeString_WhenProper_ReturnMaxStringValue() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber<String>("aa","aaa","aaaa","aaaaa","-aaaaaa");
        Assert.assertEquals((String) "aaaaa", findMaximumNumber.findMax());
    }
}
