import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {
    private Utilities utils;

    @BeforeEach
    public void setup() {
        utils = new Utilities();
    }

    @Test
    void everyNthChar() {
        char[] output1 = utils.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, output1);
        char[] output2 = utils.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @Test
    void removePairs() {
        assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utils.removePairs("ABCCABDEEF"));
        assertNull(utils.removePairs(null), "Did not get null returned when argument passed was null");
        assertEquals("A", "A");
        assertEquals("", "");
    }

    @ParameterizedTest
    @CsvSource({"ABCDEFF,ABCDEF", "AB88EFFG,AB8EFG", "112233445566,123456", "ZYZQQB,ZYZQB", "A,A"})
    void removePairsParametrized(String actual, String expected) {
        // given

        // when
        String actualNoPairsString = utils.removePairs(actual);

        // then
        assertEquals(expected, actualNoPairsString);
    }

    @Test
    void converter() {
        assertEquals(300, utils.converter(10, 5));
    }

    @Test
    void shouldThrowArithmeticException() {
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
            utils.converter(10, 0);
        });
        assertEquals(ArithmeticException.class, thrown.getClass());
    }

    @Test
    void nullIfOddLength() {
        assertNull(utils.nullIfOddLength("Nieparzyste"));
        assertNotNull(utils.nullIfOddLength("Parzyste"));
    }
}