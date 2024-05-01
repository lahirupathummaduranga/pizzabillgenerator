 public class Main {
    public static void main(String[]args){
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraCheese();
        basePizza.addExtratoppings();
        basePizza.takeAway();
        basePizza.getBill();

        PremiumPizza PP=new PremiumPizza(true);
        PP.addExtraCheese();
        PP.addExtratoppings();
        PP.getBill();
    }


 }