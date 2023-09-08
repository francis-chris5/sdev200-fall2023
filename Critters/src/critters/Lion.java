
package critters;


public class Lion extends Animal {

    public Lion() {
        super();
        this.setSkin(Covering.HAIR);
    }

    public Lion(String name) {
        super(name);
        this.setSkin(Covering.HAIR);
    }

    public Lion(int age, double weight) {
        super(age, weight);
        this.setSkin(Covering.HAIR);
    }

    public Lion(String name, double weight) {
        super(name, weight);
        this.setSkin(Covering.HAIR);
    }

    public Lion(String name, int age, double weight) {
        super(name, age, weight);
        this.setSkin(Covering.HAIR);
    }

    @Override
    public String makeSound() {
        return "Roar!!!";
    }

    @Override
    public String toString() {
        return "Lion{" + '}';
    }
    
}
