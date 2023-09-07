
package critters;

public class Dog extends Animal{
    private boolean wearsBandana;

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(int age, double weight) {
        super(age, weight);
    }

    public Dog(String name, double weight) {
        super(name, weight);
    }

    public Dog(String name, int age, double weight, boolean wearsBandana) {
        super(name, age, weight);
        this.wearsBandana = wearsBandana;
    }

    public boolean isWearsBandana() {
        return wearsBandana;
    }

    public void setWearsBandana(boolean wearsBandana) {
        this.wearsBandana = wearsBandana;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }
    
    
    
    
}
