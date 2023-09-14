
package pizza.pie;

import pizza.toppings.Pepperoni;
import pizza.toppings.Onion;
import pizza.toppings.GreenPepper;
import pizza.toppings.Sausage;
import pizza.toppings.Mushroom;
import pizza.toppings.Topping;

public class Supreme extends Pie {
    
    public Supreme(){
        addTopping(new Pepperoni());
        addTopping(new Sausage());
        addTopping(new GreenPepper());
        addTopping(new Onion());
        addTopping(new Mushroom());
    }

    @Override
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
    
    
}
