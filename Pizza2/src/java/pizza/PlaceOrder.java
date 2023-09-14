
package pizza;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;
import pizza.pie.Crust;
import pizza.pie.Custom;
import pizza.pie.Hawaiian;
import pizza.pie.Pie;
import pizza.pie.Supreme;
import pizza.toppings.GreenPepper;


public class PlaceOrder {
    private LinkedList<Pie> pies = new LinkedList<>();
    double price = 0.0;
    DecimalFormat df = new DecimalFormat("0.00");

    public PlaceOrder() {
        Scanner keyboard = new Scanner(System.in);
        String userInput = "";
        do{
            System.out.print("What you want, specialty or custom? ");
            userInput = keyboard.next();
            if(userInput.equals("specialty")){
                System.out.println("all we got left is hawaiian or supreme: ");
                userInput = keyboard.next();
                if(userInput.equals("hawaiian")){
                    Pie nextPie = new Hawaiian();
                    System.out.println("all we got left is deep dish: ");
                    nextPie.setCrust(Crust.DEEP_DISH);
                    pies.add(nextPie);
                }
                else{
                    Pie nextPie = new Supreme();
                    System.out.println("all we got left is deep dish: ");
                    nextPie.setCrust(Crust.DEEP_DISH);
                    pies.add(nextPie);
                }
            }
            else{
                Pie nextPie = new Custom();
                System.out.println("what toppings do you want: ");
                System.out.println("nope, you can have green peppers:");

                nextPie.addTopping(new GreenPepper());
                System.out.println("all we got left is deep dish: ");
                nextPie.setCrust(Crust.DEEP_DISH);
                pies.add(nextPie);
            }
            System.out.println("want anything else: ");
            userInput = keyboard.next();
        }while(!userInput.equals("no"));
        
        pies.forEach(p -> {
            price += p.total();
        });
        
        System.out.println("that's gonna be ");
        pies.forEach(p -> {System.out.println(p);});
        System.out.println("for a total of " + df.format(this.price));
        
    }
    
}
