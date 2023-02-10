package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

    @Test
    public void nonStart1() {
        String a = "";
        String b = "";

        // Arrange - declare class I want to test
        NonStart noStart1 = new NonStart();

        // Act - call the method I want to test and store the result
        String result = noStart1.getPartialString(a, b);

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals("ellohere", noStart1.getPartialString("Hello", "There"));
    }

    @Test
    public void nonStart2() {
        String a = "";
        String b = "";

        // Arrange - declare class I want to test
        NonStart nonStart2 = new NonStart();

        // Act - call the method I want to test and store the result
        String result = nonStart2.getPartialString(a, b);

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals("avaode", nonStart2.getPartialString("java", "code"));
    }

    @Test
    public void nonStart3() {
        String a = "";
        String b = "";

        // Arrange - declare class I want to test
        NonStart nonStart3 = new NonStart();

        // Act - call the method I want to test and store the result
        String result = nonStart3.getPartialString(b, a);

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals("hotlava", nonStart3.getPartialString("shotl", "java"));
    }

    @Test
    public void nonStart4() {

        // Arrange - declare class I want to test
        NonStart nonStart4 = new NonStart();

        // Act - call the method I want to test and store the result
        String result = nonStart4.getPartialString(null, null);

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals("", result);
    }

    @Test
    public void nonStart5() {

        // Arrange - declare class I want to test
        NonStart nonStart5 = new NonStart();

        // Act - call the method I want to test and store the result
        String result = nonStart5.getPartialString("", "java");

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals("ava", result);
    }

    @Test
    public void nonStart6() {

        // Arrange - declare class I want to test
        NonStart nonStart6 = new NonStart();

        // Act - call the method I want to test and store the result
        String result = nonStart6.getPartialString("java", "" );

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals("ava", result);
    }

}