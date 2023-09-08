
package critters;

import java.io.Serializable;

//serializable is necessary to write to a file
//serializable is required in beans
//comparable requires us to implement the compare to method (greater, less, or equal as ints)
public abstract class Animal implements Noisy, Serializable, Comparable {
    private String name;
    private int age;
    private double weight;
    private static int animalCounter;
    private Covering skin;
    
    
    

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

    @Override
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

    public Covering getSkin() {
        return skin;
    }

    public void setSkin(Covering skin) {
        this.skin = skin;
    }
    
    

    @Override
    public String toString() {
        return "Animal{" + "name=" + this.getName() + ", age=" + this.getAge() + ", weight=" + this.getWeight() + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.getWeight() == ((Animal)obj).getWeight();
    }



    @Override
    public int compareTo(Object obj) {
        Noisy animal;
        try{
            animal = (Noisy)obj;
        }
        catch(Exception e){
            return +1;
        }
        
        double difference = this.getWeight() - animal.getWeight();
        if(difference > 0){
            return +1;
        }
        else if(difference < 0){
            return -1;
        }
        else{
            return 0;
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}//end Animal Class
