package ru.appline.homework13;

import java.util.Scanner;

public class TestStingWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: Я 15 Do not крутой worry 4 Be программист? happy !");
        String myStr = scanner.nextLine();
        String[] myArray = myStr.split(" ");
        int count = 0;
        for (String st : myArray) {
            if (st.trim().equals(""))
                continue;
            char[] myChar = st.toLowerCase().toCharArray();
            boolean isEng = true;
            for (char ch : myChar) {
                //считаем латиницей только английские буквы, символы игнорируем: опострофы, знаки препинания и прочие
                if (ch < 'a' || ch > 'z') {
                    isEng = false;
                    break;
                }
            }
            if (isEng) {
                count++;
                System.out.println(st);
            }
        }
        if (count== 0){
            System.out.println("Латинские слова отсутствуют.");
        }
        else System.out.println("Количество латинских слов: " + count);
    }
}
