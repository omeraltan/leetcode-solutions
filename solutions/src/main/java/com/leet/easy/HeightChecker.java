package com.leet.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *      Height Checker
 */

public class HeightChecker {

    public static void main(String[] args) {
        //int[] heights = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] heights = new int[]{5, 1, 2, 3, 4};
        System.out.println("Output : " + new HeightChecker().heightChecker(heights));
    }

    public int heightChecker(int[] heights) {

        int value = 0;

        if (heights == null || heights.length == 0) {
            return 0;
        }else{
            List<Integer> list = Arrays.stream(heights)
                .boxed()
                .collect(Collectors.toList());
            List<Integer> list1 = new ArrayList<>(list);
            Collections.sort(list1);
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list1.size(); j++) {
                    if (list.get(i) != list1.get(i)) {
                        value++;
                        break;
                    }
                }
            }
        }
        return value;
    }
}
