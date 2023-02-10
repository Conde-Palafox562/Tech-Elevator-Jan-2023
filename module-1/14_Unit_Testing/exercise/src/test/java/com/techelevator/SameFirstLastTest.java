package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    @Test
    public void sameFirstLast1() {

        // Arrange - declare class I want to test
        SameFirstLast sameFirstLast1 = new SameFirstLast();

        // Act - call the method I want to test and store the result
        boolean result = sameFirstLast1.isItTheSame(new int[]{1, 2, 3});

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals(false, result);
    }

    @Test
    public void sameFirstLast2() {

        // Arrange - declare class I want to test
        SameFirstLast sameFirstLast2 = new SameFirstLast();

        // Act - call the method I want to test and store the result
        boolean result = sameFirstLast2.isItTheSame(new int[]{1, 2, 3, 1});

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals(true, result);
    }

    @Test
    public void sameFirstLast3() {

        // Arrange - declare class I want to test
        SameFirstLast sameFirstLast3 = new SameFirstLast();

        // Act - call the method I want to test and store the result
        boolean result = sameFirstLast3.isItTheSame(new int[]{1, 2, 1});

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals(true, result);
    }
}