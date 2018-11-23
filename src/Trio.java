public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName(){
    return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + "Trio";
    }
    public double getPrice(){
        double sandPrice = sandwich.getPrice();
        double saladPrice = salad.getPrice();
        double drinkPrice = drink.getPrice();
       if (sandPrice > saladPrice && saladPrice > drinkPrice){
           return sandPrice + saladPrice;
       }
       if (saladPrice > sandPrice && drinkPrice > sandPrice){
           return saladPrice + drinkPrice;
       }
       else{
           return sandPrice + drinkPrice;
       }
    }
}
