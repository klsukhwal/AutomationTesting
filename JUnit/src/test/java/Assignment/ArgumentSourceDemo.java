package Assignment;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgumentSourceDemo {

    @ParameterizedTest
    @MethodSource("provideStringsForLengthTest")
    public void testWithArguments(String input, int expectedLength) {
        assertEquals(expectedLength, input.length());
    }

    private static Stream<Arguments> provideStringsForLengthTest() {
        return Stream.of(
                Arguments.of("apple", 5),
                Arguments.of("banana", 6),
                Arguments.of("orange", 6)
        );
    }
}
