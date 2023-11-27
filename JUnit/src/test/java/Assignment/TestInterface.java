package Assignment;

import org.junit.jupiter.api.Test;

interface TestInterface {
    @Test
    default void testDefault() {
        System.out.println("Default test method");
    }
}

class TestInterfaceTest implements TestInterface {
}
