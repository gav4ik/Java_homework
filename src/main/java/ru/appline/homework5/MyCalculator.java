package ru.appline.homework5;
import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        System.out.println("Программа-калькулятор");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число");
        double y = scanner.nextDouble();
        double result;
        System.out.println("Введите знак вычислительного действия: плюс, минус, умножить, разделить");
        Scanner sc = new Scanner(System.in);
        char action = sc.next().charAt(0);
        System.out.println("Вы ввели: " + action);
        switch (action){
            case '+':
                result = x+y;
                System.out.println(x + " + " + y + " = " + result);
                break;
            case '-':
                result = x-y;
                System.out.println(x + " - " + y + " = "  + result);
                break;
            case '*':
                result = x*y;
                System.out.println(x + " * " + y + " = " + result);
                break;
            case '/':
                if(y==0){
                    System.out.println("Делить на ноль нельзя!");
                }
                else{
                    result = x/y;
                    System.out.println(x + "  " + y + " = "  + result);
                }
                break;
            default:
                System.out.println("Неподходящее действие для вычисления. Программа завершена. Запустите её заново.");
        }
    }
}
