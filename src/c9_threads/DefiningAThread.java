package c9_threads;

/*
Constructors:
■ Thread()
■ Thread(Runnable target)
■ Thread(Runnable target, String name)
■ Thread(String name)
*/

public class DefiningAThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        
        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r); // Pass your Runnable to the Thread
        t2.start();
        
        //Thread t3 = new Thread();
        //t3.run(); // Legal, but does not start a new thread
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Important job running in MyThread");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Important job running in MyRunnable");
    }
}
