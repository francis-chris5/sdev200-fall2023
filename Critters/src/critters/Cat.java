
package critters;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(int age, double weight) {
        super(age, weight);
    }

    public Cat(String name, double weight) {
        super(name, weight);
    }

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String makeSound() {
        return "meow";
    }

    @Override
    public String toString() {
        return "Cat{" + '}';
    }
    
    
}
