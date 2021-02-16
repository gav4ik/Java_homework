package ru.appline.final_02;

import java.util.Locale;
import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 символов для уравнения: второй символ + или -, четвертый: =, Х - в любом порядке, остальное- цифры от 0 до 9");
        String myStr = scanner.nextLine().toLowerCase();
        if(myStr.length()!=5){
            System.out.println("Длина строки не равна 5");
            return;
        }
        char first=myStr.charAt(0);
        char second=myStr.charAt(1);
        char third = myStr.charAt(2);
        char fourth = myStr.charAt(3);
        char fifth = myStr.charAt(4);
        int x =0;
        if (fourth!='='){
            System.out.println("Вы не ввели знак равенства");
            return;
            }

        if(first=='x'){
            switch (second){
                case '+': x=Integer.parseInt(String.valueOf(fifth)) - Integer.parseInt(String.valueOf(third));
                break;
                case '-': x=Integer.parseInt(String.valueOf(fifth)) + Integer.parseInt(String.valueOf(third));
                break;
                default:
                    System.out.println("В качестве действия можно использовать только плюс и минус");
                    return;
            }
        } else if (third=='x') {

            switch (second) {
                case '+':
                    x = Integer.parseInt(String.valueOf(fifth)) - Integer.parseInt(String.valueOf(first));
                    break;
                case '-':
                    x = Integer.parseInt(String.valueOf(first)) - Integer.parseInt(String.valueOf(fifth));
                    break;
                default:
                    System.out.println("В качестве действия можно использовать только плюс и минус");
                    return;
            }
        } else if (fifth=='x') {

            switch (second) {
                case '+':
                    x = Integer.parseInt(String.valueOf(first)) + Integer.parseInt(String.valueOf(third));
                    break;
                case '-':
                    x = Integer.parseInt(String.valueOf(first)) - Integer.parseInt(String.valueOf(third));
                    break;
                default:
                    System.out.println("В качестве действия можно использовать только плюс и минус");
                    return;
            }

        }  else {
            System.out.println("Вы не ввели х.");
            return;
        }
        System.out.println("Ввод: " + first + " " + second + " " + third + " = " + fifth);

        System.out.println("Вывод: x = " + x);
    }
}
