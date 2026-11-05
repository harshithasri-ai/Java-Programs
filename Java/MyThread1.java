public class MyThread extends Thread {

public void run() {  
    System.out.println("v1");  

    try {  
        Thread.sleep(500);  
    }  
    catch (InterruptedException ie) {  
    }  

    System.out.println("v2");  
}  

public static void main(String[] args) {  

    MyThread t1 = new MyThread();  
    MyThread t2 = new MyThread();  

    t1.start();  
    t2.start();

}
}
