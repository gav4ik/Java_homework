package ru.appline.final_01;

import java.util.Scanner;

public class ConverterRubDol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара");
        double currency= scanner.nextDouble();
        System.out.println("Введите сумму в рублях для конвертации в доллары");
        double rub= scanner.nextDouble();
        double res = rub/currency;
        System.out.println("Курс доллара: " + currency);
        System.out.println("Количество рублей: " + rub);
        System.out.printf("Итого: %.2f долларов.", res);
    }
}
