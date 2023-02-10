package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

    @Test
    public void testDateFashion1() {

        // Arrange - declare class I want to test
        DateFashion dateFashion = new DateFashion();

        // Act - call the method I want to test and store the result
        int result = dateFashion.getATable(5, 10);

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDateFashion2() {

        // Arrange - declare class I want to test
        DateFashion dateFashion2 = new DateFashion();

        // Act - call the method I want to test and store the result
        int result = dateFashion2.getATable(5, 2);

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals(0, result);
    }

    @Test
    public void testDateFashion3() {

        // Arrange - declare class I want to test
        DateFashion dateFashion3 = new DateFashion();

        // Act - call the method I want to test and store the result
        int result = dateFashion3.getATable(5, 5);

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals(1, result);
    }
}