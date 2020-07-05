package javacoursework;

import java.text.DecimalFormat;

/*
 * @author UP896692
 */
public class Pizza {

    private Size size;
    private Crust crust;
    private Sauce sauce;
    private Top top1;
    private Top top2;

    private Order order;

    public Pizza(Size size, Crust crust, Sauce sauce, Top top1, Top top2) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.top1 = top1;
        this.top2 = top2;
    }

    /*- Setters - */
    public void setSize(Size size) { this.size = size;}
    public void setCrust(Crust crust) { this.crust = crust;}
    public void setSauce(Sauce sauce) { this.sauce = sauce;}
    public void setTop1(Top top1) { this.top1 = top1;}
    public void setTop2(Top top2) { this.top2 = top2; }

    /*- Getters - */
    public Size getSize() { return size;}
    public Crust getCrust() { return crust;}
    public Sauce getSauce() { return sauce; }
    public Top getTop1() { return top1; }
    public Top getTop2() { return top2; }

    /*- Individual Pricing -*/
    public double getSizePrice() { return size.getSizeCost();}
    public double getCrustPrice() { return crust.getCrustCost();}
    public double getSaucePrice() { return sauce.getSauceCost();}
    public double getTop1Price() { return top1.getToppingsCost();}
    public double getTop2Price() { return top2.getToppingsCost();}

    /*- Main output prices -*/
    public double getbasePrice() { return getSizePrice() + getCrustPrice();}
    public double getTotalPrice() { return getbasePrice() + (getTop1Price() * 5) + (getTop2Price() * 4) + getSaucePrice();}

    public String outputInfo() {
        DecimalFormat df = new DecimalFormat("#.##");
        String out = "";
        out += "TOTAL COST:  £" + df.format(getTotalPrice()) + "\n" +
                getSize() + " Size:  £" + getSizePrice() + "\n" +
                getCrust() + " Crust:  £" + df.format(getCrustPrice()) + "\n" +
                "BASE COST:  £" + df.format(getbasePrice()) + "\n" +
                getTop1() + " Topping:  5* £" + getTop1Price() + " = £" + (getTop1Price() * 5) + "\n" +
                getTop2() + " Topping:  4* £" + getTop2Price() + " = £" + (getTop2Price() * 4) + "\n" +
                getSauce() + " Sauce:  £" + getSaucePrice();
        return out;
    }

}
