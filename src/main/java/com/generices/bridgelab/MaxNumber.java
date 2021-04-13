package com.generices.bridgelab;

public class MaxNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to ");
    }
    public <T extends Comparable> T findMaximum(T[] numberArray) {
        T max = numberArray[0];
        for (T element : numberArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

}
