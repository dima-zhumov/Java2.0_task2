package org.example;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by
 *
 * @author out-zhumov-do
 * on 14.07.2020
 *
 * В данном классе реализован калькулятор,
 * который будет выполнять операции +, -, *, /
 * пока не встретит команду exit
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, my dear friend. What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "! I'm calculator");
        System.out.println("Input first number?");
        //Инициализируем первое дробное число число
        Double numberFirst = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What's your command? \"+\", \"-\", \"*\", \"/\" or exit");
        //Инициализируем переменную для выбора операции
        String operation = scanner.nextLine();
        //Пока не увидим exit либо неизвестную команду, будем выполнять операции
        while (!operation.equalsIgnoreCase("exit")) {
            System.out.println("Input second number?");
            //Инициализируем второе дробное число число
            Double numberSecond = scanner.nextDouble();
            scanner.nextLine();
            switch (operation) {
                case "+":
                    numberFirst = numberFirst + numberSecond;
                    System.out.printf("Total: %.4f \n", numberFirst);
                    break;
                case "-":
                    numberFirst = numberFirst - numberSecond;
                    System.out.printf("Total: %.4f \n", numberFirst);
                    break;
                case "*":
                    numberFirst = numberFirst * numberSecond;
                    System.out.printf("Total: %.4f \n", numberFirst);
                    break;
                case "/":
                    numberFirst = numberFirst / numberSecond;
                    System.out.printf("Total: %.4f \n", numberFirst);
                    break;
                default:
                    System.out.println("Incorrect command");
            }
            System.out.println("What's your next command? \"+\", \"-\", \"*\", \"/\" or exit");
            operation = scanner.nextLine();
        }
        System.out.println("Goodbye!");
    }
}
