
package pizza.pie;

import java.text.DecimalFormat;
import pizza.Pricing;
import java.util.LinkedList;
import pizza.toppings.Topping;

public abstract class Pie{
    private Crust crust;
    private boolean cheese = true;
    private boolean sauce = true;
    protected LinkedList<Topping> toppings = new LinkedList<>();
    protected double cost;
    private DecimalFormat df = new DecimalFormat("0.00");

    
    
    
    public Pie() {
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public LinkedList<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(LinkedList<Topping> toppings) {
        this.toppings = toppings;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public DecimalFormat getDf() {
        return df;
    }

    public void setDf(DecimalFormat df) {
        this.df = df;
    }

    @Override
    public String toString() {
        return "Pie{" + "crust=" + crust + ", cheese=" + cheese + ", sauce=" + sauce + ", toppings=" + toppings + ", price=" + df.format(cost) + "}";
    }

    
    public abstract void addTopping(Topping topping);
    
    public double total(){
        this.cost = 0;
        toppings.forEach(t -> {this.cost += t.calculateCost();});
        
        switch(this.crust){
            case THIN:
                this.cost += 12;
                break;
            case DEEP_DISH:
                this.cost += 15;
                break;
            case HAND_TOSSED:
                this.cost += 13.50;
                break;
            case GLUTEN_FREE:
                this.cost += 20;
                break;
        }
        return this.cost;
    }
}
