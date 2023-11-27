package Assignment;

import org.junit.jupiter.api.*;

class LifecycleMethodsTest {

    @BeforeAll
    static void setup() {
        System.out.println("Setup for all tests");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("Setup for each test");
    }

    @Test
    void testMethod1() {
        System.out.println("Test method 1");
    }

    @Test
    void testMethod2() {
        System.out.println("Test method 2");
    }

    @AfterEach
    void tearThis() {
        System.out.println("Tear down for each test");
    }

    @AfterAll
    static void tear() {
        System.out.println("Tear down for all tests");
    }
}