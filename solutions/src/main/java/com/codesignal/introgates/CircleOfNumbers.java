package com.codesignal.introgates;

/**
 * Consider integer numbers from 0 to n - 1 written down along
 * the circle in such a way that the distance between any two neighboring numbers is equal (note that 0 and n - 1 are neighboring, too).
 * Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.
 */
public class CircleOfNumbers {

    public static void main(String[] args) {
        System.out.println(solution(20,19));
    }

    public static int solution(int n, int firstNumber) {
        return (firstNumber < (n / 2)) ? (n/2) + firstNumber : Math.abs((n/2) - firstNumber);
    }
}
