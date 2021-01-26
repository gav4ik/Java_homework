package ru.appline.homework3;

public class TestArray {
    public static void main(String[] args) {
        int[]testNums = {10,20,30,40,50};
        int tmp = testNums[0];
        testNums[0]= testNums[testNums.length-1];
        testNums[testNums.length-1]=tmp;
        int aver=testNums[testNums.length/2];
        int sum=testNums[0]+aver;
        System.out.println("Сумма первого и среднего элемента массива равна " + sum);
    }
}
