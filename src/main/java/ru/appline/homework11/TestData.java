package ru.appline.homework11;

import java.util.Scanner;

public class TestData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        String x = "" + scanner.nextDouble();
        System.out.println("Введите второе число");
        double y = scanner.nextDouble();
        double z = Double.parseDouble(x);
        int b = (int)z;
        int a =(int)y;
        int resultMax = Math.max(a,b);
        System.out.println("Максимальное число: " + resultMax );
        int resultMin = Math.min(a,b);
        double resMin = (double) resultMin;
        System.out.println("Минимальное число: " + resMin );


    }
}
