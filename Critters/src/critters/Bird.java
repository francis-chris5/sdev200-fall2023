
package critters;


public class Bird extends Animal {

    public Bird() {
        super();
        this.setSkin(Covering.FEATHERS);
    }

    public Bird(String name) {
        super(name);
        this.setSkin(Covering.FEATHERS);
    }

    public Bird(int age, double weight) {
        super(age, weight);
        this.setSkin(Covering.FEATHERS);
    }

    public Bird(String name, double weight) {
        super(name, weight);
        this.setSkin(Covering.FEATHERS);
    }

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
        this.setSkin(Covering.FEATHERS);
    }
    
    

    @Override
    public String makeSound() {
        return "Chirp Chirp";
    }
    
}
