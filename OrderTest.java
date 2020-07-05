package javacoursework;

public class OrderTest {
    public static void main(String[] args) {
        Order or = new Order();
        /* Adding 3 pizzas to the order list*/
        or.addItem(Size.Medium, Crust.Thin, Sauce.Pesto, Top.Extra_Cheese, Top.Chilli);
        or.addItem(Size.Medium, Crust.Stuffed, Sauce.Pesto, Top.Olives, Top.Onion);
        or.addItem(Size.Small, Crust.Thin, Sauce.Pesto, Top.Chilli, Top.Pepperoni);

        System.out.println(or.orderOutput());
        System.out.println("Order Size");
        System.out.println(or.orderSize());
        System.out.println("Order Cost");
        System.out.println(or.orderCost());
        System.out.println("=============================");

        /* Here I am updating the 2nd pizza in the list (position 1) */
        or.updateSize(1, Size.Small);
        or.updateCrust(1, Crust.Thin);
        or.updateTop2(1, Top.Olives);

        System.out.println("updated size, crust and toppings 2 of 2nd pizza");
        System.out.println("=============================");
        System.out.println(or.orderOutput());
        System.out.println(or.orderSize());
        System.out.println(or.orderCost());
        System.out.println("=============================");

        /* Here I am adding in a 4th pizza */
        or.addItem(Size.Medium, Crust.Stuffed, Sauce.Pesto, Top.Olives, Top.Onion);

        System.out.println("added in a 4th pizza");
        System.out.println("=============================");
        System.out.println(or.orderOutput());
        System.out.println(or.orderSize());
        System.out.println(or.orderCost());
        System.out.println("=============================");

        /* Here I am removing the 3rd pizza in the list (position 2) */
        or.removeItem(2);

        System.out.println("removed 3rd pizza");
        System.out.println("=============================");
        System.out.println(or.orderOutput());
        System.out.println(or.orderSize());
        System.out.println(or.orderCost());

    }
}
