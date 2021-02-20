package ru.appline.final_03;

import java.util.Scanner;

public class DifferentChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int ks = Integer.parseInt(scanner.nextLine());
        String[] myArray = new String[ks];
        int[] quant = new int[ks]; //массив для подсчета уникальных символов в кажой строке массива
        System.out.println("Введите строку символов");
        for (int i = 0; i < ks; i++) {
            myArray[i] = scanner.nextLine();
            for (int j = 0; j < myArray[i].length(); j++) {
                char ch = myArray[i].charAt(j);
                String str = myArray[i].substring(j + 1);
                //сравниваем поочередно каждый элемент массива с остальными и в случае отсутствия совпадений в каждом цикле прибаляем 1.
               if (str.indexOf(ch) == -1) {
                   quant[i]++;
                }
            }
        }
        //Ищем максимальный элемент массива,т.е. строку с наибольшим количеством уникальных символов, и получаем его индекс
        int maxValue=0;
        int indexOfMaxValue=0;
        for (int k = 0; k < ks; k++) {
            if (quant[k]>maxValue){
                maxValue=quant[k];
                indexOfMaxValue=k;
            }
        }
        System.out.println("Строка с наибольшим количеством уникальных символов: " + myArray[indexOfMaxValue]);
    }
    }