package ru.appline.homework11;

import java.util.Scanner;

public class TestData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        String x = scanner.next();
        System.out.println("Введите второе число");
        int y = scanner.nextInt();
        int z = Integer.valueOf(x);
        int resultMax = Math.max(y,z);
        System.out.println("Максимальное число: " + resultMax );
        int resultMin = Math.min(y,z);
        double resMin = (double) resultMin;
        System.out.println("Минимальное число: " + resMin );


    }
}
