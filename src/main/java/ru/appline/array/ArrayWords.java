package ru.appline.array;


import java.util.Scanner;

public class ArrayWords {
    public void startArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размерность массива");
        int arrayWordsSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введи " + arrayWordsSize + " слов через \",\"");
        String arrayWordsStr = scanner.nextLine();
        String arrayWords[] = arrayWordsStr.split(",");
        int maxLength = arrayWords[0].length();
        String maxLengthWord = arrayWords[0];
        for (String word : arrayWords) {
            word=word.trim();
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxLengthWord = word;
            }
        }
        System.out.println("Максимальная длина у слова \"" + maxLengthWord + "\" равна \"" + maxLength + "\"");
    }
}
