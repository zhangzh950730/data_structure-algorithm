package com.zzh.geektime.数据结构与算法之美.sort;

/**
 * @author zhangzhihao
 * @date 2020/6/21 16:04
 */
public class InsertionSort {
    public static void insertionSort(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (nums[j] > value) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 1, 3, 2};
        insertionSort(nums);
        for (int num : nums) {
            System.out.print(num);
            System.out.print(" ");
        }
    }
}
