
package collectionstreams;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class CollectionStreams {

    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> mySet = new HashSet<>();
        for(int i=0; i < 25; i++){
            mySet.add(rand.nextInt(100));
        }
        System.out.println(mySet);
        
        mySet.stream().limit(8).filter(i -> i<60).forEach(i -> System.out.print(i + ", "));
        
        System.out.println();
        System.out.println(mySet.stream().filter(i -> i < 12).reduce(0, (a, b) -> a+b));
        
        
        System.out.println();
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(mySet.stream().parallel().reduce(0, (a, b) -> a+b));
    }
    
}
