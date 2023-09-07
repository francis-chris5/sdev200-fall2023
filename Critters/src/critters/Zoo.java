
package critters;


public class Zoo {
    public static void main(String[] args){
        Animal buddy = new Animal("Buddy", 5, 34.2);
        System.out.println(buddy);
        System.out.println(Animal.getAnimalCounter());
        Animal other = new Animal();
        System.out.println(Animal.getAnimalCounter());
        
        Animal simba = new Lion("Simba", 3, 600);
        System.out.println(simba);
        System.out.println(Animal.getAnimalCounter());
        
        Fish fishy = new Fish("Fishy", 2, 0.75);
        Animal nemo = new Fish();
        nemo.setAge(3);
        nemo.setName("Nemo");
        nemo.setWeight(0.5);
        
        if(fishy.equals(nemo)){
            System.out.println("those fish seem about the same");
        }
        else{
            System.out.println("those are very different fish");
        }
    }
}
