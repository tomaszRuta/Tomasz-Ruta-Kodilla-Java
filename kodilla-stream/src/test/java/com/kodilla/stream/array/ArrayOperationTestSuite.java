package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.StyledEditorKit;
import java.util.Random;

public class ArrayOperationTestSuite {

    public int[] generateArray(int n) {
        Random random = new Random();
        int Numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            int number = random.nextInt(6)+1;
            Numbers[i] = number;
        }
        return Numbers;
    }

    @Test
    public void testGetAverage() {
        //given
        double sum = 0.0;
        int numbers[] = generateArray(20);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        //when
        double expectedAverage = sum / numbers.length;
        double actulaAverage = ArrayOperations.getAverage(numbers);
        //then
        Assert.assertEquals(expectedAverage, actulaAverage, 0);
    }
}