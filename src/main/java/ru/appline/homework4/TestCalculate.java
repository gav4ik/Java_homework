package ru.appline.homework4;
import java.util.Scanner;

public class TestCalculate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число");
        double y = scanner.nextDouble();
        System.out.println("Введите третье число");
        double z = scanner.nextDouble();

        double average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое введенных чисел равно " + average);
        double result = Math.floor(average / 2);
        System.out.println("В результате деления среднего арифметического на 2 и округления в меньшую сторону получили " + result);
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
