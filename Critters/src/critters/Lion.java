
package critters;


public class Lion extends Animal {

    public Lion() {
        super();
    }

    public Lion(String name) {
        super(name);
    }

    public Lion(int age, double weight) {
        super(age, weight);
    }

    public Lion(String name, double weight) {
        super(name, weight);
    }

    public Lion(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String makeSound() {
        return "Roar!!!";
    }
    
}
