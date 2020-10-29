package com.h3c.leetcode;

import java.util.*;

//2020-10-27 1481
public class WzSolution {
    public static void main(String[] args) {
        //new Solution().findLeastNumOfUniqueInts(new int[]{5, 5, 4}, 1);
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1222);
        set.remove(1);
        set.remove(2);
        set.remove(1222);
        System.out.println();

    }
}

//class Solution {
//    public int findLeastNumOfUniqueInts(int[] arr, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        TreeSet<Integer> set = new TreeSet<>((i, j) -> {
//            if (i > j)
//                return 1;
//            else
//                return -1;
//        });
//        for (int i : arr) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
//        for (Integer i : map.values()) {
//            set.add(i);
//        }
//        for (; k > 0; ) {
//            int tmp = set.first();
//            k = k - tmp;
//            set.remove(tmp);
//        }
//        return k == 0 ? set.size() : set.size() + 1;
//    }
//}
