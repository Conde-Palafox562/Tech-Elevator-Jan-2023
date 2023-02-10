package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

    @Test
    public void less20Test(){

        // Arrange
        Less20 less20 = new Less20();

        // Act
        boolean results = less20.isLessThanMultipleOf20(18);

        // Assert
        Assert.assertEquals(true, results);

    }
}