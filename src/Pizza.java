public class Pizza {

    private int price;

    private Boolean vegi;

    private int extraCheesePrice=100;
    private int extraToppingPrice=150;
    private int backPackPrice=20;
    private int basePizzaprice;

    private boolean isextraCheeseadded=false ;
    private boolean isextratoppingsadded=false;
    private boolean isTakeawayadded=false;


    public Pizza(Boolean vegi) {
        this.vegi = vegi;
        if (this.vegi){
            this.price=300;
        }else {
            this.price=400;
        };
        basePizzaprice=this.price;
    }
    public void getPizzaPrice(){
       System.out.println(this.price);
    }
    public void addExtraCheese(){
        isextraCheeseadded=true;
       // System.out.println("Extra cheese added");
        this.price += extraCheesePrice;

    }
    public void addExtratoppings(){
        isextratoppingsadded=true;
       // System.out.println("Extra topping added");
        this.price += extraToppingPrice;

    }
    public void takeAway(){
        isTakeawayadded=true;
       // System.out.println("Take away");
        this.price += backPackPrice;

    }
    public void getBill(){
        String bill="";
        System.out.println("pizza:"+this.basePizzaprice);
        if(isextraCheeseadded){
            bill += "extra cheese added: "+extraCheesePrice+ "\n";
        }
        if(isextratoppingsadded){
            bill += "extra topping added: "+extraToppingPrice+ "\n";
        }
        if(isTakeawayadded){
            bill += "Take away added: "+backPackPrice+ "\n";
        }
        bill +="bill:"+this.price+ "\n";
        System.out.println(bill);
    }
}


