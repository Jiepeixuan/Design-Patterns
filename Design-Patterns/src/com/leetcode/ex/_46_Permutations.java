package com.leetcode.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peixuan.xie on 2017/11/22.
 */
public class _46_Permutations {


    /**
     * Given a collection of distinct numbers, return all possible permutations.
     * <p>
     * For example,
     * [1,2,3] have the following permutations:
     * [
     * [1,2,3],
     * [1,3,2],
     * [2,1,3],
     * [2,3,1],
     * [3,1,2],
     * [3,2,1]
     * ]
     *
     * @param num
     * @return
     */
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> res = new ArrayList<>();
        permute(res, num, 0);
        return res;
    }

    private void permute(List<List<Integer>> res, int[] num, int pos) {

        if (pos == num.length) {
            List<Integer> list = new ArrayList<>();
            for (int n : num)
                list.add(n);
            res.add(list);
        }

        for (int i = pos; i < num.length; i++) {
            swap(num, pos, i);
            permute(res, num, pos + 1);
            swap(num, i, pos);
        }

    }

    private void swap(int[] num, int pos, int i) {
        int tmp = num[i];
        num[i] = num[pos];
        num[pos] = tmp;
    }

}
