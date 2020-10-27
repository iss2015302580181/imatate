package com.company;

import java.io.Serializable;
import java.util.*;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("ss");
        StringBuilder sb1 = new StringBuilder("aa");
        System.out.println(sb.append(sb1));
        List<String> a=null;
        for(String s:a){
            System.out.println("a");
        }
    }

    public static class WzClass {

    }

    interface WzInterface {
        public static void method() {

        }

        public static <K, V> Comparator<Map.Entry<K, V>> comparingByKey(Comparator<? super K> cmp) {
            Objects.requireNonNull(cmp);
            return (Comparator<Map.Entry<K, V>> & Serializable)
                    (c1, c2) -> cmp.compare(c1.getKey(), c2.getKey());
        }
    }
}

class Solution {
    int min = Integer.MAX_VALUE;

    public int shipWithinDays1(int[] weights, int D) {
        cal(1, 0, 0, weights, D);
        return min;
    }

    public int shipWithinDays(int[] weights, int D) {
        int left = 0, right = 0;
        for (int w: weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = (left + right) / 2, need = 1, cur = 0;
            for (int w: weights) {
                if (cur + w > mid) {
                    need += 1;
                    cur = 0;
                }
                cur += w;
            }
            if (need > D) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    private void cal(int level, int index, int max, int[] weight, int D) {
        if (level == D) {
            int tmp = 0;
            for (int i = index; i < weight.length; i++) {
                tmp += weight[i];
            }
            if (tmp > max)
                max = tmp;
            if (max < min)
                min = max;
            return;
        }
        int tmp = 0;
        for (int i = index; i < weight.length - D + level; i++) {
            tmp += weight[i];
            if (tmp > max)
                max = tmp;
            cal(level + 1, i + 1, max, weight, D);
        }
    }
}
