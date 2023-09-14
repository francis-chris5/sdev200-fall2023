
package pizza.pie;

import pizza.toppings.Topping;


public class Custom extends Pie {

    @Override
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
}
