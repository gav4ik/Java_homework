package ru.appline.homework9;

import java.util.Scanner;

public class TestCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        double[] nums = new double[size];
        System.out.println("Введите элементы массива в количестве " + size );
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < size; j++) {
            nums[j] = sc.nextDouble();
        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
        double sum=0;

        for(int i=0; i<size; i++){
            sum+=nums[i];
        }
        double average=sum/size;
        System.out.println("Cреднее арифметическое элементов массива: " + average);
        System.out.println("Итоговый массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]*average);
        }
        System.out.println();
    }
}
