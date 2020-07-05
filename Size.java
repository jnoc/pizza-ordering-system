package javacoursework;

public enum Size {
    Small(9.45), Medium(11.87), Large(15.90);
    private double sizeCost;

    Size(double sizeCost) { this.sizeCost = sizeCost;}

    public double getSizeCost() {
        return sizeCost;
    }

    void setSize(Size valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
