package org.example;

public class Task2 {
    static boolean isCheckIncArr(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    static void printTask2(int[] arr) {
        boolean flag = isCheckIncArr(arr);
        if (flag) System.out.println("Последовательность возрастающая");
        else System.out.println("Последовательность не является возрастающей");
    }
}
