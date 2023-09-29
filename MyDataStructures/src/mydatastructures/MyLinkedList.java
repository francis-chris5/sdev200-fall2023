
package mydatastructures;


public class MyLinkedList<T> {
    
    private Node head;
    
   class Node{
        public T element;
        public Node next;
        
        public Node(T t){
            element = t;
            next = null;
        }

        @Override
        public String toString() {
            return element + "";
        }
        
        
    }//end Node class

    public void add(T t){
        Node element = new Node(t);
        if(head == null){
            head = element;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = element;
        }
    }//end add()
    
    
    public void printList(){
        Node current = head;
        System.out.println("[");
        while(current != null){
            System.out.println(current + ", ");
            current = current.next;
        }
        System.out.println("\b]");
    }
    
    
    public T get(int i){
        Node current = head;
        if(i == 0){
            return head.element;
        }
        int counter = 0;
        while(current != null && counter <= i){
            current = current.next;
            counter++;
        }
        if(current == null){
            return null;
        }
        return current.element;
    }
    
    
    public void remove(int i){
         Node current = head;
        if(i == 0){
            Node temp = head.next;
            head = null;
            head = temp;
        }
        int counter = 0;
        while(current.next.next != null && counter <= i){
            current = current.next;
            counter++;
        }
        if(current.next != null){
            Node temp = current.next.next;
            current.next = null;
            current.next = temp;
        }
    }
    
    
    
    
}//end MyLinkedList class
