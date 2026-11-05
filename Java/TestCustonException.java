
class MyCustomException extends Exception {
}

public class TestCustomException {
    public static void main(String args[]) {

        try {
            // Throwing an object of user-defined exception
            throw new MyCustomException();
        }
        catch (MyCustomException e) {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }

        System.out.println("Rest of the code...");
    }
}
