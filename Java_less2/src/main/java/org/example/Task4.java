package org.example;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        printBoard(board);
        System.out.println("Validete:" + isValidSudoku(board));
    }

    private static void printBoard(char[][] board) {
        int size = board.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String isValidSudoku(char[][] board) {
        int size = board.length;
        //int b = board[0].length;
        char[] arrRow = new char[size]; //мне кажется слишком много массивов создаю, много памяти ем, но до другого решения не додумался, имея те инструменты которыми можно пользоваться
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arrRow[j] = board[j][i];
            }
            if (isVal(board[i]) == false) return Arrays.toString(board[i]);
            if (isVal(arrRow) == false) return Arrays.toString(arrRow);
        }
        return "true";
    }

    static boolean isVal(char[] arrCh) {
        int size = arrCh.length;
        char[] newArr = Arrays.copyOf(arrCh, size);
        Arrays.sort(newArr);
        for (int i = 0; i < size - 1; i++) {
            if (newArr[i] != '.' && newArr[i] == newArr[i + 1]) return false;
        }
        return true;
    }
}
