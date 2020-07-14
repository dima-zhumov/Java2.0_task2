package org.example;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by
 *
 * @author out-zhumov-do
 * on 14.07.2020
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, my dear friend. What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "! I'm calculator");
        System.out.println("Input first number?");
        Double numberFirst = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What's your command? \"+\", \"-\", \"*\", \"/\" or exit");
        String operation = scanner.nextLine();
        while (!operation.equalsIgnoreCase("exit")) {
            System.out.println("Input second number?");
            Double numberSecond = scanner.nextDouble();
            scanner.nextLine();
            switch (operation) {
                case "+":
                    numberFirst = numberFirst + numberSecond;
                    System.out.println("Total: " + numberFirst);
                    break;
                case "-":
                    numberFirst = numberFirst - numberSecond;
                    System.out.println("Total: " + numberFirst);
                    break;
                case "*":
                    numberFirst = numberFirst * numberSecond;
                    System.out.println("Total: " + numberFirst);
                    break;
                case "/":
                    numberFirst = numberFirst / numberSecond;
                    System.out.println("Total: " + numberFirst);
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
