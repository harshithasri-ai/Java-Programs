import java.io.*;
interface IntfA {
    void m1();
}

interface IntfB {
    void m2();
}

// Class implements both interfaces
class Sample implements IntfA, IntfB {

    @Override
    public void m1() {
        System.out.println("Welcome inside the method m1");
    }

    @Override
    public void m2() {
        System.out.println("Welcome inside the method m2");
    }
}

public class GFG {
    public static void main(String[] args) {

        Sample obj = new Sample();

        // Calling implemented methods
        obj.m1();
        obj.m2();
    }
}
