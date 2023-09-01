

import java.util.LinkedList;
import java.util.List;


public class NewClass {
    
    public static void main(String[] args){
        List<Integer> myInts = new LinkedList<>();
            myInts.add(5);
            myInts.add(7);
            myInts.add(3);
            
            
         for(int i = 0; i < myInts.size(); i++){
             System.out.println(myInts.get(i));
         }
         
         
            
         for(Integer i : myInts){
             System.out.println(i);
         }
         
         
         
         myInts.forEach(i ->{
             System.out.println(i);
         } );
    }
    
}
