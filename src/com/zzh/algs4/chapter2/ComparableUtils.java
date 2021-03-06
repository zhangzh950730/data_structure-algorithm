package com.zzh.algs4.chapter2;

import com.zzh.algs4.std.StdOut;

/**
 * @author ZhangZhiHao
 * @date 2021/6/28 20:34
 */
public class ComparableUtils {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        StdOut.print("{");
        StdOut.print(a[0]);
        for (int i = 1; i < a.length; i++) {
            StdOut.print(", " + a[i]);
        }
        StdOut.println("}");
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
