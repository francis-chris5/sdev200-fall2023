
package mydatastructures;


public class MyDataStructures {

    
    public static void main(String[] args) {
        MyLinkedList<Float> mll = new MyLinkedList<>();
        mll.add(3.14f);
        mll.add(1.23f);
        mll.add(2.72f);
        mll.printList();
        
        System.out.println(mll.get(1));
        
       mll.remove(1);
       mll.printList();
        
    }
    
}
