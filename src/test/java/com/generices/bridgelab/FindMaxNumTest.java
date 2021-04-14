package com.generices.bridgelab;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FindMaxNumTest {
    private static MaxNumber maxNumber = new MaxNumber();

/* @Description- Take three integer and check the maximum value
   using compareTo method. */

    @Test
    public void whenGivenThreeNumbersAtFirstNumberIsMaxShouldReturnMaxFirstPosition() {
        Integer[] intArray = {7, 6, 5};
        Integer result = maxNumber.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(7), result);
    }

    @Test
    public void whenGivenThreeNumbersAtSecondNumberIsMaxShouldReturnMaxSecondPosition() {
        Integer[] intArray = {4, 5, 6};
        Integer result = maxNumber.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(6), result);
    }

    @Test
    public void whenGivenThreeNumbersAtThirdNumberIsMaxShouldReturnMaxSecondPosition() {
        Integer[] intArray = {4, 5, 1};
        Integer result = maxNumber.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(5), result);
    }

     @Test
    public void whenGivenThreeFloatNumberAtFirstNumberIsMaxShouldReturnMaxFirstPosition() {
        Double[] doubleArray = {5.9, 2.1, 7.6};
        Double result = maxNumber.findMaximum(doubleArray);
        Assertions.assertEquals(Double.valueOf(7.6), result);
    }
    @Test
    public void whenGivenThreeFloatNumberAtSecondNumberIsMaxShouldReturnMaxSecondPosition() {
        Double[] doubleArray = {5.9, 8.5, 7.6};
        Double result = maxNumber.findMaximum(doubleArray);
        Assertions.assertEquals(Double.valueOf(8.5), result);
    }
    @Test
    public void whenGivenThreeFloatNumberAtThirdNumberIsMaxShouldReturnMaxThirdPosition() {
        Double[] doubleArray = {5.9, 2.1, 9.6};
        Double result = maxNumber.findMaximum(doubleArray);
        Assertions.assertEquals(Double.valueOf(9.6), result);
    }
}
