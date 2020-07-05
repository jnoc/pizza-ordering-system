package javacoursework;

public enum Sauce {
    Tomato(0), Pesto(0.5);
    private double sauceCost;

    Sauce(double sauceCost){ this.sauceCost = sauceCost;}

    public double getSauceCost() {
        return sauceCost;
    }
}
