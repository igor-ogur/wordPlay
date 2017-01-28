package com.softgroup.tasks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordPlayTest {
    @Test
    public void isVowel() throws Exception {
        Assert.assertTrue(WordPlay.isVowel('A'));
        Assert.assertFalse(WordPlay.isVowel('F'));
    }

    @Test
    public void replaceVowels() throws Exception {
        String actualResult = WordPlay.replaceVowels("Hello WOrld!", '*');
        String expectedResult = "H*ll* W*rld!";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void emphasize() throws Exception {
        String actualResult = WordPlay.emphasize("dna ctgaaactga", 'a');
        String expectedResult = "dn* ctg+*+ctg+";
        Assert.assertEquals(expectedResult, actualResult);

        actualResult = WordPlay.emphasize("Mary Bella Abracadabra", 'a');
        expectedResult = "M+ry Bell+ +br*c*d*br+";
        Assert.assertEquals(expectedResult, actualResult);
    }

}