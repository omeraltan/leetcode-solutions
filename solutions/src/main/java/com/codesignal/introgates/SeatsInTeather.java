package com.codesignal.introgates;

/**
 * Given the total number of rows and columns in the theater
 * (nRows and nCols, respectively), and the row and column you're sitting in,
 * return the number of people who sit strictly behind you and in your column or to the left,
 * assuming all seats are occupied.
 */

public class SeatsInTeather {

    public static void main(String[] args) {
        System.out.println(solution(16,11, 5,3));
    }

    public static int solution(int nCols, int nRows, int col, int row) {
        return (nCols - (col-1)) * (nRows - (row));
    }

}
