package org.example;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(){
        super("mutt", "big", 50);
    }

    private double radius;


}
