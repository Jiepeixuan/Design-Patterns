package com.leetcode.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peixuan.xie on 2017/9/11.
 */
public class _118_Pascal_Triangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        if (numRows < 0)
            return triangle;

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        return triangle;
    }

}
