public class MainTest {

    public static void main(String[] args) {

        String expected = "Hello, Jenkins CI/CD Lab - ";
        String actual = Main.getMessage();

        if (!expected.equals(actual)) {
            throw new AssertionError(
                "Test failed: expected \"" + expected +
                "\" but got \"" + actual + "\""
            );
        }

        System.out.println("TEST PASSED: Main.getMessage()");
    }
}
