
package javaapplication19;


public class Animals {
    private String name;
    private int age;
    private double weight;
    private static int animalCounter;
    public Animals next = null;
    
    
    public String makeSound(){
        return "ROAR!!!";
    }

    public Animals() {
        animalCounter++;
    }
    
    public Animals(String name){
        this.name = name;
        Animals.animalCounter++;
    }

    public Animals(int age, double weight) {
        this.age = age;
        this.weight = weight;
        Animals.animalCounter++;
    }

    public Animals(String name, double weight) {
        this.name = name;
        this.weight = weight;
        Animals.animalCounter++;
    }

    public Animals(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        Animals.animalCounter++;
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
        Animals.animalCounter = animalCounter;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + this.getName() + ", age=" + this.getAge() + ", weight=" + this.getWeight() + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.getWeight() == ((Animals)obj).getWeight();
    }
    
    
    public void iterateAndPrint(){
        Animals current = this;
        while(current != null){
            System.out.println(current.toString());
            current = current.next;
        }
    }
    
    
    public void add(Animals newAnimal){
        Animals current = this;
        while(current.next != null){
            current = current.next;
        }
        current.next = newAnimal;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}//end Animals Class

