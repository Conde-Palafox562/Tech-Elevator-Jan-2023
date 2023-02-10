package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {

    @Test
    public void maxEndTest1() {

        //Arrange
        MaxEnd3 maxEndT1 = new MaxEnd3();

        //Act
        int[] result = maxEndT1.makeArray(new int[]{1, 2, 3});

        //Assert
        Assert.assertArrayEquals(new int[]{3, 3, 3}, result);
    }

    @Test
    public void maxEndTest2() {

        //Arrange
        MaxEnd3 maxEndT2 = new MaxEnd3();

        //Act
        int[] result = maxEndT2.makeArray(new int[]{11, 5, 9});

        //Assert
        Assert.assertArrayEquals(new int[]{11, 11, 11}, result);
    }

    @Test
    public void maxEndTest3() {

        //Arrange
        MaxEnd3 maxEndT3 = new MaxEnd3();

        //Act
        int[] result = maxEndT3.makeArray(new int[]{2, 11, 3});

        //Assert
        Assert.assertArrayEquals(new int[]{3, 3, 3}, result);
    }
}

