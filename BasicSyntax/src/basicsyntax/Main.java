
package basicsyntax;

import java.util.Random;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        //primitive data
            //integer:
                // byte, short, int, long 
            //floating point
                //float, double
            //boolean
        int numberOne = 34;
        int secondNumber = 21;
        
        long bigNumber = 34L; //do have to explicitly say long or L on both sides of assignment
        float smallNumber = 3.14f;
        boolean yes = true; //true and false are all lowercase
        
        
        int sumOfNumbers = numberOne + secondNumber;
        int differenceOfTwoIntegers = numberOne - secondNumber;
        int product = numberOne * secondNumber;
        
        // long type of data .... cast math result into long type
        long exponent = (long)Math.pow(numberOne, secondNumber);
        
        String label = new String("Our Results");
        
        System.out.println(label);
        System.out.println(sumOfNumbers + ", " + differenceOfTwoIntegers + ", " + product + ", " + exponent);
        
        
        //find an even number
        Random rand = new Random();
        
        int randomEvenNumber = rand.nextInt(100);
        while(randomEvenNumber % 2 != 0){
            randomEvenNumber = rand.nextInt(100);
        }
        System.out.print(randomEvenNumber + "\t\s\s\bis an even number\n");
        
        
        
        double myNumber = rand.nextDouble();
        do{
            myNumber *= 2; //shorthand for myNumber = myNumber * 2
        }while(myNumber < 1.0);
        System.out.println(myNumber);
        
        
        int x, y, z;
        x = 4;  //x is 4
        y = x++; //post increment so use first --store four, then x is 5
        z = --x; //pre decrement so decrease from 5 to 4 and store the 4 
        
        System.out.println(x + ", " + y + ", " + z);
        
        System.out.println(((x++ * y--)/++z) );
        
        int counter = 0;
        while(counter < 10){
            System.out.println("while loop " + counter);
            counter++;
        }
        counter = 0;
        System.out.println("");
        for(int i=0; i<10; i++){
            System.out.println("for loop " + i);
        }
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Gimme a Single Letter!!! :");
        String userInput = keyboard.next();
        
        switch(userInput){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("that's a vowel");
                break;
            default:
                System.out.println("that's a consanant");
                break;
        }
        
        
        System.out.println("now enter an integer between 0 and 255: ");
        byte num = keyboard.nextByte();
        if(num < 20){
            System.out.println("that's itty bitty number, you should have picked something bigger");
        }
        else if(num >= 20 && num <=21){
            System.out.println("20 and 21 are good numbers");
        }
        else if(num >= 63 || num > 65){
            System.out.println("that's not a bad number either");
        }
        else{
            System.out.println("that's a rather arbritrary number");
        }
        

    }//end main()
    
}
