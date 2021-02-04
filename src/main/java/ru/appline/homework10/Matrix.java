package ru.appline.homework10;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        System.out.println("Количество строк: ");
        int rows = scanner.nextInt();
        System.out.println("Количество столбцов: ");
        int columns = scanner.nextInt();
        int[][] myMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Введите элемент myMatrix[" + i + "][" + j + "]:");
                myMatrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println("Полученная матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Вывод первой строки матрицы, где каждый элемент увеличен в 3 раза: ");
        for (int j = 0; j < columns; j++) {
            System.out.print(myMatrix[0][j] * 3 + " ");
        }

    }
}


