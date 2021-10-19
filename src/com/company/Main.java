package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] board = new String[10][8];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[]";
                System.out.print(board[i][j]);

            }
            System.out.println(Arrays.deepToString(board));
        }

    }
}