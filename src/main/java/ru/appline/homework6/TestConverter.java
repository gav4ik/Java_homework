package ru.appline.homework6;


import java.util.Scanner;

public class TestConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите, что переводить: 1 - масса, 2 - расстояние");
        int vvod = scanner.nextInt();
        double res1=0;
        double res2=0;
        double res3=0;
        double res4=0;

        if(vvod == 1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - фунт, 3 - унция, 4 - стон");
            Scanner scan = new Scanner(System.in);
            int meraMass = scan.nextInt();
            System.out.println("Вы выбрали: " + meraMass);
            if (meraMass<1 || meraMass>4) {
                System.out.println("Вы ввели невалидное значение. Нужно было ввести число от 1 до 4. Запустите программу заново.");
                return;
            }
            System.out.println("Введите число");
            double n = scan.nextDouble();

            switch (meraMass) {
                case 1:
                    res1 = n;
                    res2 = n * 0.00220462;
                    res3 = n * 0.35274;
                    res4 = n * 0.000157473;
                    break;
                case 2:
                    res1 = n * 453.592;
                    res2 = n;
                    res3 = n * 16;
                    res4 = n * 0.0714286;
                    break;
                case 3:
                    res1 = n * 28.3495;
                    res2 = n * 0.0625;
                    res3 = n;
                    res4 = n * 0.00446429;
                    break;
                case 4:
                    res1 = n * 6350.29;
                    res2 = n * 14;
                    res3 = n * 224;
                    res4 = n;
                    break;
            }
            System.out.println("Результат: ");
            System.out.println("Граммы: " + res1);
            System.out.println("Фунты: " + res2);
            System.out.println("Унции: " + res3);
            System.out.println("Стоны: " + res4);
            }

        else if (vvod == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            Scanner scan = new Scanner(System.in);
            int meraDlin = scan.nextInt();
            System.out.println("Вы выбрали: " + meraDlin);
            if (meraDlin<1 || meraDlin>4){
                System.out.println("Вы ввели невалидное значение. Нужно было ввести число от 1 до 4. Запустите программу заново.");
                return;
                }
            System.out.println("Введите число");
            double n = scan.nextDouble();

            switch (meraDlin) {
                case 1:
                    res1 = n;
                    res2 = n * 0.0006214;
                    res3 = n * 1.0936;
                    res4 = n * 3.281;
                    break;
                case 2:
                    res1 = n * 1609.34;
                    res2 = n;
                    res3 = n * 1760;
                    res4 = n * 5280;
                    break;
                case 3:
                    res1 = n * 0.9144;
                    res2 = n * 0.000568182;
                    res3 = n;
                    res4 = n * 3;
                    break;
                case 4:
                    res1 = n * 0.3048;
                    res2 = n * 0.000189394;
                    res3 = n * 0.333333;
                    res4 = n;
                    break;
            }
            System.out.println("Результат: ");
            System.out.println("Метры: " + res1);
            System.out.println("Мили: " + res2);
            System.out.println("Ярды: " + res3);
            System.out.println("Футы: " + res4);
        }
        else {
            System.out.println("Вы ввели некорректное значение: " + vvod + ". Запустите программу заново.");
        }
    }
}

