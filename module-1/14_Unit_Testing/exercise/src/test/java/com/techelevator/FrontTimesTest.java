package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

    @Test
    public void frontTimesTest1(){

        //Arrange
        FrontTimes frontTimes1 = new FrontTimes();

        //Act
        String results = frontTimes1.generateString("Chocolate", 2);

        //Assert
        Assert.assertEquals("ChoCho", results);
    }

    @Test
    public void frontTimesTest2(){

        //Arrange
        FrontTimes frontTimes2 = new FrontTimes();

        //Act
        String results = frontTimes2.generateString("Chocolate", 3);

        //Assert
        Assert.assertEquals("ChoChoCho",results );

    }

    @Test
    public void frontTimesTest3(){

        // Arrange - declare class I want to test
        FrontTimes frontTimesTest3 = new FrontTimes();

        // Act - call the method I want to test and store the result
        String results = frontTimesTest3.generateString("Abc",3);

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals("AbcAbcAbc", results);

    }
}