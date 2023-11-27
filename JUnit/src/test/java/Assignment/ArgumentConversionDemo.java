package Assignment;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgumentConversionDemo {

    @ParameterizedTest
//    @ConvertWith(StringToIntegerConverter.class)
    public void testWithConvertedArgument(int number) {
        assertEquals(42, number);
    }

    static class StringToIntegerConverter extends SimpleArgumentConverter {
        @Override
        protected Object convert(Object source, Class<?> targetType) {
            assertEquals(String.class, source.getClass(), "Can only convert from String");
            assertEquals(Integer.class, targetType, "Can only convert to Integer");
            return Integer.parseInt((String) source);
        }
    }
}
