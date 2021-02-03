package ru.appline.homework8;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Вы ввели неподходящее число");
            return;
                    }
        int sum=0;
        int i = 1;
        while (i<=n){
            if(i%2!=0){
                sum +=i;
                }
            i++;
        }
        System.out.println("Сумма всех нечётных числел до " + n + " равна " + sum);
    }
}
