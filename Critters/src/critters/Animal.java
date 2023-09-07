
package critters;


public abstract class Animal {
    private String name;
    private int age;
    private double weight;
    private static int animalCounter;
    
    
    public abstract String makeSound();

    public Animal() {
        animalCounter++;
    }
    
    public Animal(String name){
        this.name = name;
        Animal.animalCounter++;
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
        Animal.animalCounter++;
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
        Animal.animalCounter++;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        Animal.animalCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    public static void setAnimalCounter(int animalCounter) {
        Animal.animalCounter = animalCounter;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + this.getName() + ", age=" + this.getAge() + ", weight=" + this.getWeight() + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.getWeight() == ((Animal)obj).getWeight();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}//end Animal Class
