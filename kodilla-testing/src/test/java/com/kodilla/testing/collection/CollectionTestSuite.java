package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Testing testOddNumbersExterminatorEmptyList");
        //Given
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        Boolean isEmpty = oddNumbersExterminator.exterminate(oddNumbers).isEmpty();
        System.out.println("Checking if list is empty, Answer: " + isEmpty);
        //Then
        assertTrue(isEmpty);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing testOddNumbersExterminatorNormalList");
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        //When
        List<Integer> actualResult = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Test OK");
        //Then
        assertEquals(Arrays.asList(2, 4, 6), actualResult);
    }
}
