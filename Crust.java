package javacoursework;

public enum Crust {
    Thin (1.08), Deep(1.10), Stuffed(2.14);
    private double crustCost;

    Crust(double crustCost){ this.crustCost = crustCost;}

    public double getCrustCost() {
        return crustCost;
    }
}
