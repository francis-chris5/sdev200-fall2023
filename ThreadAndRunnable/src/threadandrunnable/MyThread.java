
package threadandrunnable;


public class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    
    @Override
    public void run() {
        System.out.println("Running " + this.name);
        try{
            for(int i = 1; i < (int)(Math.random() * 10); i++){
                System.out.println(this.name + " has run " + i + " times.");
                Thread.sleep(123);
            }
        }
        catch(Exception e){
            //handle the error
        }
    }
    
    
}
