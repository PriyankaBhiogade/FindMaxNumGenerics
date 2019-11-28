package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumTest {
    @Test
    public void givenThreeInput_WhenProper_ReturnTrue() {
        Integer a = 1;
        Integer b = 7;
        Integer c = 8;
        FindMaxNum findMaxNum = new  FindMaxNum();
        Integer maxNum = findMaxNum.findMaxInteger(a,b,c);
        Assert.assertEquals((Integer)8,maxNum);
    }
}
