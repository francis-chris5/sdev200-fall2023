
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
        nemo.setWeight(220);
        
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
        
        zoo.whoEatsWho(fluffy, fishy);
        
        zoo.whatsCoatingIt(buddy);
        zoo.whatsCoatingIt(nemo);
        zoo.whatsCoatingIt(simba);
        
    }
    
    public <T extends Noisy> void listen(T thing){
        System.out.println(thing.makeSound());
    }
    
    public <T> String whatIsIt(T t){
        return t.toString();
    }
    
    public <T extends Comparable & Noisy> void whoEatsWho(T first, T second){
        if(first.compareTo(second) > 0){
            System.out.println("the " + first + "  could eat the " + second);
        }
        else if(first.compareTo(second) < 0){
            System.out.println("the " + second + " could eat the " + first);
        }
    }
    
    
    public <T  extends Comparable & Noisy> void whatsCoatingIt(T t){
        switch(t.getSkin()){
            case SCALES:
                System.out.println("that sure is a scaley thing");
                break;
            case HAIR:
                System.out.println("this thing is shedding everywhere");
                break;
            case FEATHERS:
                System.out.println("those look like soft feathers");
                break;
            case SLIME:
                System.out.println("this thing sure is slippery");
                break;
            case SHELL:
                System.out.println("that's a thick shell");
                break;
            default:
                System.out.println("no idea what that is");
        }
    }
    
//    public <T> void whatsCoatingIt(T t){
//        Animal thing = (Animal)t;
//        if(thing.getSkin() == Covering.FEATHERS){
//            System.out.println("those look like soft feathers");
//        }
//        else if(thing.getSkin() == Covering.HAIR){
//            System.out.println("this thing is shedding everywhere");
//        }
//        else if(thing.getSkin() == Covering.SCALES){
//            System.out.println("that sure is a scaley thing");
//        }
//    }
}
