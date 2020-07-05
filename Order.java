package javacoursework;

import java.text.DecimalFormat;
import java.util.*;

public class Order {

    private ArrayList<Pizza> item;

    public Order(){
        this.item = new ArrayList<Pizza>();
    }

    /*-- Add pizza to order --*/
    public void addItem(Size size, Crust crust, Sauce sauce, Top top1, Top top2) {
        Pizza newItem = new Pizza(size, crust, sauce, top1, top2);
        this.item.add(newItem);
    }
    /*-- Remove pizza from order -*/
    public void removeItem(int location){ this.item.remove(location);}

    /*-- Number of Pizzas in order --*/
    public double orderSize(){ return this.item.size(); }

    /*-- Order cost -- */
    public String orderCost(){
        DecimalFormat df = new DecimalFormat("#.##");
        double out = 0;
        for(int i = 0; i < this.item.size(); i++) {
            out += this.item.get(i).getTotalPrice();
        }
        return "£" + df.format(out);
    }

    /*-- Update Pizza parts --*/
    public void updateSize(int location, Size size){ this.item.get(location).setSize(size);}
    public void updateCrust(int location, Crust crust){ this.item.get(location).setCrust(crust);}
    public void updateSauce(int location, Sauce sauce){ this.item.get(location).setSauce(sauce);}
    public void updateTop1(int location, Top top1){ this.item.get(location).setTop1(top1);}
    public void updateTop2(int location, Top top2){ this.item.get(location).setTop2(top2);}

    /*-- Order output--*/
    public String orderOutput() {
        String out = "";
        for(int i = 0; i < this.item.size(); i++){
            out += this.item.get(i).outputInfo() + "\n\n";
        }
        return out;
    }
}
