package ru.appline.part3.calculator;

import ru.appline.part3.calculator.operations.Addition;
import ru.appline.part3.calculator.operations.Division;
import ru.appline.part3.calculator.operations.Multiplication;
import ru.appline.part3.calculator.operations.Subtraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {
        Starter starter = new Starter();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Hello, my dear friend. What's your name?");
            String name = reader.readLine();
            if (name.equals(""))
                throw new Exception("Name can't be empty");
            starter.startCalculator(name);
        } catch (IOException e) {
            System.out.println("Exception throws: " + e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void startCalculator(String name) {
        Calculator calculator = new Calculator();
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, " + name + "! I'm calculator!");
        System.out.println("Input first number?");
        //Инициализируем первое дробное число число
        try {
            calculator.setCurrentStorage(scanner.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("Exception throws: " + e);
        }
        scanner.nextLine();
        System.out.println("What's your command? \"+\", \"-\", \"*\", \"/\" or exit");
        //Инициализируем переменную для выбора операции
        String operation = scanner.nextLine();
        while (!operation.equalsIgnoreCase("exit")) {
            System.out.println("Input second number?");
            //Инициализируем второе дробное число число
            Double numberSecond = scanner.nextDouble();
            scanner.nextLine();
            switch (operation) {
                case "+":
                    calculator.setCurrentStorage(addition.addition(calculator.getCurrentStorage(), numberSecond));
                    System.out.printf("Total: %.4f \n", calculator.getCurrentStorage());
                    break;
                case "-":
                    calculator.setCurrentStorage(subtraction.subtraction(calculator.getCurrentStorage(), numberSecond));
                    System.out.printf("Total: %.4f \n", calculator.getCurrentStorage());
                    break;
                case "*":
                    calculator.setCurrentStorage(multiplication.multiplication(calculator.getCurrentStorage(), numberSecond));
                    System.out.printf("Total: %.4f \n", calculator.getCurrentStorage());
                    break;
                case "/":
                    try {
                        calculator.setCurrentStorage(division.division(calculator.getCurrentStorage(), numberSecond));
                        System.out.printf("Total: %.4f \n", calculator.getCurrentStorage());
                    } catch (ArithmeticException e) { //учитывая, что у нас double, исключение выполняться не будет
                        System.out.println("Can't be divisible by 0");//при делении на 0, будет бесконечность
                    }
                    break;
                default:
                    System.out.println("Incorrect command");
            }
            System.out.println("What's your next command? \"+\", \"-\", \"*\", \"/\" or exit");
            operation = scanner.nextLine();
        }
    }
}

