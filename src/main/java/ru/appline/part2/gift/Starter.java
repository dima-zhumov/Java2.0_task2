package ru.appline.part2.gift;


import java.util.ArrayList;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Sweets> sweets = new ArrayList<>();
        int fullPrice = 0;
        double fullWeight = 0;
        System.out.println("Что добавить? 1. Candy, 2. Jellybean, 3. Chocolate, 4. Удалить последную сладость, exit - Выход");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        while (!choice.equalsIgnoreCase("exit")) {
            switch (choice) {
                case "1":
                    Candy truffle = new Candy("Трюфель", 400, 100, "круглый");
                    sweets.add(truffle);
                    fullPrice = fullPrice + truffle.getPrice();
                    fullWeight = fullWeight + truffle.getWeight();
                    System.out.println("Добавлено");
                    break;
                case "2":
                    Jellybean mamba = new Jellybean("Мамба", 100, 100, "банановая");
                    sweets.add(mamba);
                    fullPrice = fullPrice + mamba.getPrice();
                    fullWeight = fullWeight + mamba.getWeight();
                    System.out.println("Добавлено");
                    break;
                case "3":
                    Chocolate milka = new Chocolate("Милка", 200, 150, "молочная");
                    sweets.add(milka);
                    fullPrice = fullPrice + milka.getPrice();
                    fullWeight = fullWeight + milka.getWeight();
                    break;
                case "4":
                    int size = sweets.size();
                    if (size > 0) {
                        fullPrice = fullPrice - sweets.get(size - 1).getPrice();
                        fullWeight = fullWeight - sweets.get(size - 1).getWeight();
                        sweets.remove(size - 1);
                        System.out.println("Последняя сладость удалена");
                    } else {
                        System.out.println("Подарок пуст");
                    }
                    break;
                default:
                    System.out.println("Некорректная операция");
            }
            System.out.println("Что добавить? 1. Candy, 2. Jellybean, 3. Chocolate, 4. Удалить последную сладость, exit - Выход");
            choice = scanner.nextLine();
        }
        System.out.println("Полная стоимость: " + fullPrice);
        System.out.println("Полный вес: " + fullWeight);
        System.out.print("Подарок состоит из: ");
        for (Sweets sweets1 : sweets) {
            System.out.println(sweets1.getName() + ", цена " + sweets1.getPrice()
                    + ", вес " + sweets1.getWeight() + ", свойства " + sweets1.getOptionalProperties() + "; ");
        }
    }
}
