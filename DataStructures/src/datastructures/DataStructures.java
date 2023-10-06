
package datastructures;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

public class DataStructures {

    public static void main(String[] args) {
        
        System.out.println("--------  VECTOR  --------");
        Vector<Object> v1 = new Vector<>();
        v1.add("words");
        v1.add(3);
        v1.add(2.72);
        v1.add(true);
        
        for(Object d : v1){
            System.out.println(d);
        }
        
        for(int i=0; i<v1.size(); i++){
            System.out.println(v1.get(i));
        }
        
        
        // already saw linked list and array list
        
        System.out.println("\n\n\n------------  STACK  ---------");
        Stack<Object> s1 = new Stack<>();
        s1.push("words");
        s1.push(17);
        s1.push(3.14);
        s1.push(false);
        
        
//        System.out.println(s1.size());
//        System.out.println(s1.pop()); //pop is a return then remove from RAM
//        System.out.println(s1.size());
        
        while(!s1.empty()){
            System.out.println(s1.pop());
            System.out.println("size: " + s1.size());
        }
        
        
        System.out.println("\n\n --------QUEUE--------");
        
        Queue<Object> q1 = new LinkedList<>();
        q1.offer("words");
        q1.offer(8);
        q1.offer(1.61);
        q1.offer(true);
        
        while(!q1.isEmpty()){
            System.out.println(q1.poll());
            System.out.println("size: " + q1.size());
        }
        
        
        System.out.println("\n\n------PriorityQueue-----");
        
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.offer(3);
        pq1.offer(17);
        pq1.offer(5);
        pq1.offer(9);
        pq1.offer(2);
        
        while(!pq1.isEmpty()){
            System.out.println(pq1.poll());
        }
        
        
        System.out.println("\n\n----------SETS----------");
        
        Set<Object> s2 = new HashSet<>();
        
        s2.add(3);
        s2.add("words");
        s2.add(3.14);
        s2.add(3);
        s2.add("words");
        s2.add("different words");
        s2.add(false);
        
        for(Object s : s2){
            System.out.println(s);
        }
        
        
        s2.remove("words");
        System.out.println("... removed the 'words'");
        for(Object s : s2){
            System.out.println(s);
        }
        
        System.out.println("\n\n------------- map  ----------");
        Map<String, String> europeanCapitals = new TreeMap<>();
        europeanCapitals.put("england", "london");
        europeanCapitals.put("germany", "berlin");
        europeanCapitals.put("hungary", "budapest");
        europeanCapitals.put("france", "paris");
        europeanCapitals.put("italy", "rome");
        europeanCapitals.put("spain", "madrid");
        
        //System.out.println(europeanCapitals.get("hungary"));
        System.out.print("what country do you want to know the capital of? ");
        Scanner keyboard = new Scanner(System.in);
        String request = keyboard.next();
        if(europeanCapitals.containsKey(request)){
            System.out.println("that would be " + europeanCapitals.get(request));
        }
        else{
            System.out.println("I have no idea what the capital is.");
        }
        
        
        
        
    }//end main()
    
    
    
}
