package ru.appline.part2.gift;

public class Candy extends SweetsImpl {

    private String form;

    public Candy(String name, int price, double weight, String form) {
        super(name, price, weight, form);
        this.form = form;
    }

}
