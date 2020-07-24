package ru.appline.part2.gift;

public class SweetsImpl implements Sweets {
    private String name;
    private int price;
    private double weight;
    private String optionalProperties;

    public SweetsImpl(String name, int price, double weight, String optionalProperties) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.optionalProperties = optionalProperties;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getOptionalProperties() {
        return optionalProperties;
    }

    @Override
    public void setOptionalProperties(String optionalProperties) {
        this.optionalProperties = optionalProperties;
    }
}
