package c9_threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.applet.AppletViewer;

/*
Synchronization and Locks
How does synchronization work? With locks. Every object in Java has a built-in lock
that only comes into play when the object has synchronized method code. When
we enter a synchronized non-static method, we automatically acquire the lock
associated with the current instance of the class whose code we're executing (the
this instance). Acquiring a lock for an object is also known as getting the lock,
or locking the object, locking on the object, or synchronizing on the object.
Since there is only one lock per object, if one thread has picked up the lock, no
other thread can pick up the lock until the first thread releases (or returns) the lock.
This means no other thread can enter the synchronized code (which means it can't
enter any synchronized method of that object) until the lock has been released.
Typically, releasing a lock means the thread holding the lock (in other words, the
thread currently in the synchronized method) exits the synchronized method.
At that point, the lock is free until some other thread enters a synchronized
method on that object.

Remember the following key points about locking and
synchronization:
¡ Only methods (or blocks) can be synchronized, not variables or classes.
¡ Each object has just one lock.
¡ Not all methods in a class need to be synchronized. A class can have both
synchronized and non-synchronized methods.
¡ If two threads are about to execute a synchronized method in a class, and
both threads are using the same instance of the class to invoke the method,
only one thread at a time will be able to execute the method. The other
thread will need to wait until the first one finishes its method call. In other
words, once a thread acquires the lock on an object, no other thread can
enter any of the synchronized methods in that class (for that object).
¡ If a class has both synchronized and non-synchronized methods, multiple
threads can still access the class's non-synchronized methods! If you have
methods that don't access the data you're trying to protect, then you don't
need to synchronize them. Synchronization can cause a hit in some cases (or
even deadlock if used incorrectly), so you should be careful not to overuse it.
¡ If a thread goes to sleep, it holds any locks it has.it doesn't release them.
¡ A thread can acquire more than one lock. For example, a thread can enter a
synchronized method, thus acquiring a lock, and then immediately invoke
a synchronized method on a different object, thus acquiring that lock as
well. As the stack unwinds, locks are released again. Also, if a thread acquires
a lock and then attempts to call a synchronized method on that same
object, no problem. The JVM knows that this thread already has the lock for
this object, so the thread is free to call other synchronized methods on the
same object, using the lock the thread already has.
¡ You can synchronize a block of code rather than a method.
*/

public class Synchronizing {

}

class AccountDanger implements Runnable {

    private Account acct = new Account();

    public static void main(String[] args) {
        AccountDanger r = new AccountDanger();
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        one.setName("Fred");
        two.setName("Lucy");
        one.start();
        two.start();
    }

    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName()
                    + " is going to withdraw");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName()
                    + " completes the withdrawal");
        } else {
            System.out.println("Not enough in account for "
                    + Thread.currentThread().getName()
                    + " to withdraw " + acct.getBalance());
        }
    }
    
    //Synchronized blocks on method marked static
    public static void getCount(){
        
        synchronized(AccountDanger.class/*That's called a class literal.*/) {
        }
        
        //or
        
        try {
            Class ad = Class.forName("AccountDanger");
            synchronized(ad){
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccountDanger.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

class Account {

    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
