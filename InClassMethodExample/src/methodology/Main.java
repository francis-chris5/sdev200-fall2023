
package methodology;


public class Main {
    
    private String message = "";
    
    public Main(String message){
        this.message = message;
    }
    
    public static void main(String[] args){
        Main main = new Main("Hello World");
        int result = main.add(34, 56);
        double doubleResult = main.add(3.14, 2.81);
        
        System.out.println("the first one is " + result + ", and the second is " + doubleResult);
        
        Main[] arr = {main, new Main("here's something else"), new Main("")};
        
        main.toTheConsole(arr);
    }
    
    /**
     * a method to add two numbers together
     * @param x the first number to add
     * @param y a number to add to the other one
     * @return <b>int</b> the sum of the two given numbers
     */
    public int add(int x, int y){
        return x+y;
    }//end add() with ints
    
    
    /**
     * an overloaded method to add two floating point numbers together
     * @param x the first number
     * @param y the second number
     * @return the sum of these numbers
     */
    public double add(double x, double y){
        double z = x + y;
        return z;
    }
    
    
    
    public void toTheConsole(Main... m){
        for(Main x : m){
            System.out.println(x.getMessage());
        }
    }

    public String getMessage() {
        return message;
    }
    
    
    
    
    
}
