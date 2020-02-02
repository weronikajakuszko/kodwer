package com.kodwer.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: begin");
    }
    @After
    public void after(){
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assert.assertTrue(result.size()==0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(7);
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        evenList.add(2);
        evenList.add(4);
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numberList);
        System.out.println("Testing case - list with odd and even numbers");
        //Then
        Assert.assertEquals(evenList,result);
    }
}
