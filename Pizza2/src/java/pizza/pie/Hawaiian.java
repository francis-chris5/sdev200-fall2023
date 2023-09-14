
package pizza.pie;

import pizza.toppings.Ham;
import pizza.toppings.Pineapple;
import pizza.toppings.Topping;


public class Hawaiian extends Pie {

    public Hawaiian() {
        addTopping(null);
    }

    @Override
    public void addTopping(Topping topping) {
        toppings.add(new Ham());
        toppings.add(new Pineapple());
    }
    
    
    
    
}
