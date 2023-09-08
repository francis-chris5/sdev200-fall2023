
package critters;


public class Fish extends Animal {
    private String color;

    public Fish() {
        super();
        this.setSkin(Covering.SCALES);
    }

    public Fish(String name) {
        super(name);
        this.setSkin(Covering.SCALES);
    }

    public Fish(int age, double weight) {
        super(age, weight);
        this.setSkin(Covering.SCALES);
    }

    public Fish(String name, double weight) {
        super(name, weight);
        this.setSkin(Covering.SCALES);
    }

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
        this.setSkin(Covering.SCALES);
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fish{" + '}';
    }

    

    @Override
    public String makeSound() {
        return "boop...";
    }
    
    
    
    
}
