
public class DaemonThread extends Thread {

    public DaemonThread(String name) {
        super(name);
    }

    public void run() {

        // Checking whether the thread is Daemon or not
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        }
        else {
            System.out.println(getName() + " is User thread");
        }
    }

    public static void main(String[] args) {

        // Creating three threads
        DaemonThread t1 = new DaemonThread("t1");
        DaemonThread t2 = new DaemonThread("t2");
        DaemonThread t3 = new DaemonThread("t3");

        // Setting user threads
        t1.setDaemon(false);
        t2.setDaemon(false);

        // Starting first two threads
        t1.start();
        t2.start();

        // Setting third thread as Daemon
        t3.setDaemon(true);
        t3.start();
    }
}
