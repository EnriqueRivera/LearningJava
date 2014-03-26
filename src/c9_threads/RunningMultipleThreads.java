package c9_threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
If you have a reference to a Thread, and you call start(), it's started. If you call
start() a second time, it will cause an exception (an IllegalThreadStateException,
which is a kind of RuntimeException,

The yield( ) Method So what does the static Thread.yield() have to
do with all this? Not that much, in practice. What yield() is supposed to do is
make the currently running thread head back to runnable to allow other threads of
the same priority to get their turn. So the intention is to use yield() to promote
graceful turn-taking among equal-priority threads. In reality, though, the yield()
method isn't guaranteed to do what it claims, and even if yield() does cause a
thread to step out of running and back to runnable, there's no guarantee the yielding
thread won't just be chosen again over all the others! So while yield() might—and
often does—make a running thread give up its slot to another runnable thread of the
same priority, there's no guarantee.
A yield() won't ever cause a thread to go to the waiting/sleeping/ blocking
state. At most, a yield() will cause a thread to go from running to runnable, but
again, it might have no effect at all.

The join( ) Method
The non-static join() method of class Thread lets one thread "join onto the end"
of another thread. If you have a thread B that can't do its work until another thread
A has completed its work, then you want thread B to "join" thread A. This means that
thread B will not become runnable until A has finished (and entered the dead state).
 */
public class RunningMultipleThreads {

    public static void main(String[] args) {
        // Make one Runnable
        NameRunnable2 nr = new NameRunnable2();
        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);
        one.setName("Fred");
        two.setName("Lucy");
        three.setName("Ricky");
        
        one.setPriority(Thread.MIN_PRIORITY);
        two.setPriority(Thread.NORM_PRIORITY);
        three.setPriority(Thread.MAX_PRIORITY);
        
        one.start();
        
        try {
            one.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(RunningMultipleThreads.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        two.start();
        three.start();        
    }
}

class NameRunnable2 implements Runnable {

    public void run() {
        for (int x = 1; x <= 5; x++) {
            System.out.println("Run by "
                    + Thread.currentThread().getName()
                    + ", x is " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NameRunnable2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
