package ru.appline.final_04;
import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку:");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String answer = "Заархивированный вирус";
        System.out.println("Первая попытка. У вас есть возможность воспользоваться подсказкой: введите слово Подсказка или введите ответ");
        Scanner scanner = new Scanner(System.in);
        String otvet = scanner.nextLine().toLowerCase();
        if (otvet.equals("подсказка")) {
            System.out.println("Вы выбрали подсказку: Это сжатая компьютерная зараза. Теперь введите отгадку.");
            otvet = scanner.nextLine().toLowerCase();
            if (otvet.equals(answer.toLowerCase())) {
                System.out.println("Правильно!");
                return;
            } else {
                System.out.println("Обидно, приходи в другой раз");
                return;
            }
        } else if (otvet.equals(answer.toLowerCase())) {
            System.out.println("Правильно!");
            return;
        } else {
            System.out.println("Подумай еще!");
            while (true) {
                otvet = scanner.nextLine().toLowerCase();
                if (otvet.equals(answer.toLowerCase())) {
                    System.out.println("Правильно!");
                    return;
                } else if (otvet.equals("подсказка")) {
                    System.out.println("Подсказка уже недоступна.");
                    continue;
                } else {
                    System.out.println("Подумай еще!");
                    while (true) {
                        otvet = scanner.nextLine().toLowerCase();
                        if (otvet.equals(answer.toLowerCase())) {
                            System.out.println("Правильно!");
                            return;
                        } else if (otvet.equals("подсказка")) {
                            System.out.println("Подсказка уже недоступна.");
                            continue;
                        } else {
                            System.out.println("Обидно, приходи в другой раз");
                            return;
                        }
                    }
                }
                }
            }
        }
    }

