package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

    @Test
    public void stringBits() {

        // Arrange - declare class I want to test
        StringBits stringBits = new StringBits();

        // Act - call the method I want to test and store the result
        String hello = "hello";
        String result = stringBits.getBits(hello);


        Assert.assertEquals("hlo", result);
    }
}