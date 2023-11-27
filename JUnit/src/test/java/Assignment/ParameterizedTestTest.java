package Assignment;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ParameterizedTestTest {
    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    void testWithStringParameter(String argument) {
        assertTrue(argument.length() > 0);
    }
}
