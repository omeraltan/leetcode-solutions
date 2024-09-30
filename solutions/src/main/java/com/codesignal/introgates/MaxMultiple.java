package com.codesignal.introgates;

/**
 * Given a divisor and a bound, find the largest integer N such that:
 * N is divisible by divisor.
 * N is less than or equal to bound.
 * N is greater than 0.
 * It is guaranteed that such a number exists.
 */

public class MaxMultiple {

    public static void main(String[] args) {
        System.out.println(solution(3, 10));
    }

    public static int solution(int divisor, int bound) {
        return  (bound / divisor) * divisor;
    }

}


