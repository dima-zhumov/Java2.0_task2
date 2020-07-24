package ru.appline.part2.gift;

public class Chocolate extends SweetsImpl {

    private String kind;

    public Chocolate(String name, int price, double weight, String kind) {
        super(name, price, weight, kind);
        this.kind = kind;
    }

}
