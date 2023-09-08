
package critters;

public class Cat extends Animal {

    public Cat() {
        super();
        this.setSkin(Covering.HAIR);
    }

    public Cat(String name) {
        super(name);
        this.setSkin(Covering.HAIR);
        
    }

    public Cat(int age, double weight) {
        super(age, weight);
        this.setSkin(Covering.HAIR);
    }

    public Cat(String name, double weight) {
        super(name, weight);
        this.setSkin(Covering.HAIR);
    }

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
        this.setSkin(Covering.HAIR);
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
