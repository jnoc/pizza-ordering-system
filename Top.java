package javacoursework;

public enum Top {
    None(0), Olives(0.08), Extra_Cheese(0.02), Chilli(0.06), Pepperoni(0.10),
    Mushroom(0.03), Rocket(0.05), Jalapenos(0.20), Onion(0.07), Anchovy(0.09);
    private double toppingsCost;

    Top(double toppingsCost){ this.toppingsCost = toppingsCost;}

    public double getToppingsCost() {
        return toppingsCost;
    }
}
