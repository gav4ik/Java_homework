package ru.appline.homework12;

import java.util.Locale;
import java.util.Scanner;

public class TestSting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: I like Java!!!");
        String myStr = scanner.nextLine();
        int myCheck;
         myCheck = myStr.compareTo("I like Java!!!");
        if(myCheck!=0){
            System.out.println("Неверный ввод. Запустите программу заново.");
            return;
        }
        boolean res1;
        res1=myStr.contains("Java");
        boolean res2;
        res2=myStr.startsWith("I like");
        boolean res3;
        res3=myStr.endsWith("!!!");
        if(res1=res2=res3=true){
            System.out.println(myStr.toUpperCase());
        }
        String res4 = myStr.replaceAll("a","o");
        System.out.println(res4.substring(7,11));

}}
