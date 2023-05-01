package org.example;

import java.util.Arrays;

public class Task1 {
    public static int sumPrimeNum(int arr[]) {
        int size = arr.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (prime(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }

    static boolean prime(int num) {
        if (num <= 0 && num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static void printTask1(int arr[]) {
        int size = arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < size; i++) {
            if (prime(arr[i])) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        if (sumPrimeNum(arr) > 0) {
            System.out.println("Сумма простых чисел: " + sumPrimeNum(arr));
        } else {
            System.out.println("Простых чисел в массиве нет.");
        }
    }
}
