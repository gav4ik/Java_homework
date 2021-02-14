package ru.appline.homework14;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int[]myArray=new int[15];
        //диапазон от -20 до 20: считаем -20 входит в диапазон, 20 не входит.
        int a=-20;
        int b=19;
        System.out.println("Получаем массив:");
        for (int i=0;i<myArray.length;i++){
            myArray[i] =  a + (int)(Math.random()*(b - a));
            System.out.print(" " + myArray[i]);
            }
        int maxValue = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент массива: " + maxValue);
        int minValue = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minValue) {
                minValue = myArray[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + minValue);
        if(Math.abs(maxValue)>Math.abs(minValue)){
            System.out.println("Максимальное число по модулю: " + Math.abs(maxValue));
        }
        else System.out.println("Из максимального и минимального значения наибольшим по модулю является: " + Math.abs(minValue));


    }
}
