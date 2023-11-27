package Assignment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

class DisabledTest {
    @Disabled
    @Test
    void testWillBeSkipped() {
    }

    @Test
    void testWillBeExecuted() {
    }
}
