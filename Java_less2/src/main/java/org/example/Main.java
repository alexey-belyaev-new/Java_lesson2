package org.example;

import static org.example.Task1.printTask1;
import static org.example.Task2.printTask2;
import static org.example.Task3.printTask3;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main_1(String[] args) {
        int arr[] = new int[]{2, 5, 17, 18, 25, 27, 55, 59, 60, 100};// Простые числа 2,5,17,59
        int arr1[] = new int[]{101, 89, 79, 50, 48, 39, 17};
        int arr2[] = new int[]{11, 22, 3, -1, -2, -3};
        printTask1(arr1);
        printTask2(arr1);

        printTask1(arr);
        printTask2(arr);

        printTask3(arr);
        printTask3(arr1);
        printTask3(arr2);
    }
}