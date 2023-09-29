
package javaapplication19;


public class JavaApplication19 {

    
    public static void main(String[] args) {
        Animals listOfAnimals = new Animals("fido", 3, 88);
        listOfAnimals.add(new Animals("fluffy", 1, 4));
        listOfAnimals.add(new Animals("spike", 12, 43));
        
        listOfAnimals.iterateAndPrint();
    }
    
}
