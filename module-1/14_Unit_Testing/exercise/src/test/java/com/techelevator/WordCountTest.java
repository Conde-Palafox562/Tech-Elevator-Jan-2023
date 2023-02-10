package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

    @Test
    public void wordCountTest(){

        // Arrange - declare class I want to test
        WordCount wordCount = new WordCount();
        String[] words = {"ba", "ba", "black", "sheep"};

        Map<String,Integer> wordsToAdd = new HashMap<>();
        wordsToAdd.put("ba", 2);
        wordsToAdd.put("black", 1);
        wordsToAdd.put("sheep", 1);

        // Act - call the method I want to test and store the result
        Map<String, Integer> result = wordCount.getCount(words);

        // Assert - make sure result is the same as what we expect
        Assert.assertEquals(wordsToAdd, result);
    }
}