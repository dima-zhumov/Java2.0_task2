package ru.appline.part2.gift;

public class Jellybean extends SweetsImpl {

    private String taste;

    public Jellybean(String name, int price, double weight, String taste) {
        super(name, price, weight, taste);
        this.taste = taste;
    }

}
