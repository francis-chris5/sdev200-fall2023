
package threadandrunnable;


public class ThreadAndRunnable {


    public static void main(String[] args) {
//        for(int i=1; i <= 12; i++){
//            MyThread t = new MyThread("thread_" + i);
//            t.start();
//        }

        for(int i=1; i <= 12; i++){
            MyRunnable r = new MyRunnable("thread_" + i);
            r.start();
        }
    }
    
}
