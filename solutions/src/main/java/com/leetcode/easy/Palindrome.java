package com.leetcode.easy;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(222));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-123));
    }

    public static boolean isPalindrome(int x) {
        return new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }
}
