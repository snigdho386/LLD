import BasePizza.BasePizza;
import BasePizza.Margherita;
import ToppingDecorator.ExtraCheese;
import ToppingDecorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Cost :: "+pizza1.cost());
    }
}