package ru.appline;


import ru.appline.array.ArrayWords;
import ru.appline.calculator.Calculator;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        System.out.println("Hello, my dear friend. What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "! Choose the operation! 1 - Calculator; 2 - Search for max length word");
        int chooseOperation = scanner.nextInt();
        scanner.nextLine();
        switch (chooseOperation) {
            case 1:
                new Calculator().startCalculator();
                break;
            case 2:
                new ArrayWords().startArray();
                break;
            default:
                System.out.println("Incorrect command");
        }
        System.out.println("Goodbye!");
    }
}
