package org.example;

import java.util.Arrays;

public class Task3 {
    static int sumIndex(int[] arr) {
        int size = arr.length;
        int sumDouble = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 9 && arr[i] < 99) {
                sumDouble += i;
            }
        }
        return sumDouble;
    }

    static int[] swapVar(int[] arr) {
        int size = arr.length;
        int sum = sumIndex(arr);
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                arr[i] = sum;
            }
        }
        return arr;
    }

    static void printTask3(int[] arr1) {
        System.out.println("Исходный массив: " + Arrays.toString(arr1));
        System.out.println("Измененный массив: " + Arrays.toString(swapVar(arr1)));

    }
}
