
package com.mycompany.mavenproject1;


/**
 * this was our class example introducing arrays
 * @author chris francis
 */
public class Mavenproject1 {

    
    /**
     * <p>this is the main method</p>
     * <p>a main method <b>HAS</b> to be in every java program</p>
     * @param args command line arguments passed in when we start the program
     */
    public static void main(String[] args) {
        
        if(args.length > 0){
            for(String s : args){
                System.out.println(s + " was passed into args");
            }
        }
        
        
        int[] arrayOfIntegers;
        arrayOfIntegers = new int[5];
        arrayOfIntegers[0] = 4;
        arrayOfIntegers[1] = 2;
        arrayOfIntegers[2] = 18;
        arrayOfIntegers[3] = 347;
        arrayOfIntegers[4] = 1;
        
        for(int i=0; i<arrayOfIntegers.length; i++){
            System.out.println(i  + " is holding a " + arrayOfIntegers[i]);
        }
        
        System.out.println("\n********************************************\n");
        for(int e : arrayOfIntegers){
            System.out.println("next up is a " + e);
        }
        
        
        //cannot split declaration and definition here
        double[] bunchOfNumbers = {3.14, 2.82, 1.61};
        
        for(double number : bunchOfNumbers){
            System.out.println(number + " is a floating point number");
        }
        
        
    }
}
