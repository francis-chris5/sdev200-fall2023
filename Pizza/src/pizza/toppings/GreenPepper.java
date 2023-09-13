
package pizza.toppings;

import pizza.toppings.Topping;


public class GreenPepper extends Topping {

    public GreenPepper() {
    }

    @Override
    public double calculateCost() {
        return 1.05;
    }
    
}
