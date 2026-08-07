public class StringBufferDeleteExample {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("JavaPoint");
        System.out.println("String 1: " + sb);

        // Deleting the substring from index 2 to 6
        sb = sb.delete(2, 6);
        System.out.println("After deleting: " + sb);

        sb = new StringBuffer("Let us learn Java");
        System.out.println("String 2: " + sb);

        // Deleting the substring from index 0 to 7
        sb = sb.delete(0, 7);
        System.out.println("After deleting: " + sb);
    }
}
