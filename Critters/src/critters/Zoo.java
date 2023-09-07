
package critters;


public class Zoo {
    public static void main(String[] args){
        Zoo zoo = new Zoo();
        
        Animal buddy = new Dog("Buddy", 5, 34.2, true);
        System.out.println(buddy);
        zoo.listen(buddy);
        System.out.println(Animal.getAnimalCounter());
        
        //Animal something = new Animal();
        
        
        
        Animal simba = new Lion("Simba", 3, 600);
        System.out.println(simba);
        zoo.listen(simba);
        System.out.println(Animal.getAnimalCounter());
        
        Fish fishy = new Fish("Fishy", 2, 0.75);
        Animal nemo = new Fish();
        zoo.listen(nemo);
        nemo.setAge(3);
        nemo.setName("Nemo");
        nemo.setWeight(0.5);
        
        if(fishy.equals(nemo)){
            System.out.println("those fish seem about the same");
        }
        else{
            System.out.println("those are very different fish");
        }
        
        Cat fluffy = new Cat("fluffy", 5, 12.3);
        zoo.listen(fluffy);
        
        zoo.whatIsIt(fluffy);
        zoo.whatIsIt(nemo);
    }
    
    public <T extends Noisy> void listen(T thing){
        System.out.println(thing.makeSound());
    }
    
    public <T> String whatIsIt(T t){
        return t.toString();
    }
}
