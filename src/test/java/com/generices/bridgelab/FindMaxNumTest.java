package com.generices.bridgelab;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FindMaxNumTest {
    private static MaxNumber maxNumber = new MaxNumber();

/* @Description- Take three integer and check the maximum value
   using compareTo method. */

    @Test
    public void whenGivenThreeNumbersAtFirstNumberIsMaxShouldReturnMax1stPosition() {
        Integer[] intArray = {7, 6, 5};
        Integer result = maxNumber.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(7), result);
    }

    @Test
    public void whenGivenThreeNumbersAtSecondNumberIsMaxShouldReturnMax2ndposition() {
        Integer[] intArray = {4, 5, 1};
        Integer result = maxNumber.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(5), result);
    }

    @Test
    public void whenGivenThreeNumbersAtThirdNumberIsMaxShouldReturnMaxThirdPossiton() {
        Double[] doubleArray = {5.9, 2.1, 7.6};
        Double result = maxNumber.findMaximum(doubleArray);
        Assertions.assertEquals(Double.valueOf(7.6), result);
    }
}
