package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

    @Test
    public void testMinCigarCount() {

        // Arrange - declare class I want to test
        CigarParty cigarParty = new CigarParty();

        // Act - call the method I want to test and store the result
        boolean results = cigarParty.haveParty(30, false);

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals(false, results);
    }
}