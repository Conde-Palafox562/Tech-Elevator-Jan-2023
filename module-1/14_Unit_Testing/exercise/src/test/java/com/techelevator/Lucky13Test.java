package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

    @Test
    public void luckyNumberTest() {

        // Arrange - declare class I want to test
        Lucky13 luckyNumberT1 = new Lucky13();

        // Act - call the method I want to test and store the result
        boolean result = luckyNumberT1.getLucky(new int[]{0, 2, 4});

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals(true, result);
    }

    @Test
    public void luckyNumberTest2(){

        // Arrange - declare class I want to test
        Lucky13 luckyNumberT2 = new Lucky13();

        // Act - call the method I want to test and store the result
        boolean result = luckyNumberT2.getLucky(new int[]{1,2,3});

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals(false, result);

    }

    @Test
    public void luckyNumberTest3(){

        // Arrange - declare class I want to test
        Lucky13 luckyNumberT3 = new Lucky13();

        // Act - call the method I want to test and store the result
        boolean result = luckyNumberT3.getLucky(new int[]{1,2,4});

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals(false, result);

    }
}
