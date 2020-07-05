package javacoursework;


public class PizzaTest {

    public static void main(String[] args) {
        /* A singular pizza that uses the enum classes to determine what goes on it*/
        Pizza pz = new Pizza(Size.Medium, Crust.Thin, Sauce.Pesto, Top.Extra_Cheese, Top.Chilli);

        System.out.println(pz.outputInfo());
    }


}
