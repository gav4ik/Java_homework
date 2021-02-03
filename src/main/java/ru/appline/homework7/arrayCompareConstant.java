package ru.appline.homework7;

import java.util.Scanner;

public class arrayCompareConstant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        System.out.println("Введите данные массива: " + size + " целых чисел");
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < size; j++) {
            array1[j] = sc.nextInt();
                    }
        System.out.println("Получен массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array1[i]);
            }
        System.out.println();
        final int X=5;
        final int Y=10;
        final int Z=15;
        int count = 0;
        for (int i =0; i<size; i++){
            if(array1[i]==(X) || array1[i]==(Y) || array1[i]==Z){
                System.out.println(array1[i] + " : Данное значение имеется в константах.");
                count++;
            }
            }
        if (count==0){
            System.out.println("В массиве отсутствуют совпадения с константами.");
        }
    }
}

