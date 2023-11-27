package Assignment;

import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestTest {
    @RepeatedTest(5)
    void repeatedTest() {
        System.out.println("Repeated test");
    }
}
