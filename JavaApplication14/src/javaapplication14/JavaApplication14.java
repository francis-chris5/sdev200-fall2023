
package javaapplication14;


public class JavaApplication14 {

    
    public static void main(String[] args) {
        JavaApplication14 T = new JavaApplication14();
        
        try{
            int q = T.otherMethod(5, 0);
            int x = 3;
            int y = 2;
            int z = x /y;
            System.out.println(z);
        }
        catch(MyException me){
            System.out.println("caught my exception");
        }
        catch(NumberFormatException nfe){
            System.out.println("that's the wrong format");
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("you weren't supposed to have zero as one of the number");
        }
        catch(Exception e){
            System.out.println("it didn't work");
            e.printStackTrace();
        }
        finally{
            System.out.println("this always runs");
        }

    }
    
    public int otherMethod(int x, int y) throws MyException{

            throw new MyException();
//            int z = x / y;
//            System.out.println("the answer is " + z);
//            return z;

    }
    
}
