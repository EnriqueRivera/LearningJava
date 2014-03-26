package c9_threads;

public class SetName {

    public static void main(String[] args) {
        NameRunnable nr = new NameRunnable();
        Thread t = new Thread(nr);
        t.setName("Fred");      //If comment this line the result is "Thread-0"
        t.start();
        
        System.out.println("name of main thread: " + Thread.currentThread().getName());
    }
}

class NameRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("NameRunnable running");
        System.out.println("Run by "
                + Thread.currentThread().getName());
    }
}
