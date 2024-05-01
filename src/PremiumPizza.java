public class PremiumPizza extends Pizza {
    public PremiumPizza(boolean vegi){
        super(vegi);
        super.addExtraCheese();
        super.addExtratoppings();
        super.takeAway();

    }
}