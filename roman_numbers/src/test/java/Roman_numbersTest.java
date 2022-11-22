import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Roman_numbersTest {
    @ParameterizedTest
    @CsvSource({
        "1, I",
        "2, II",
        "19, XIX",
    })
    void conversion(int input, String expectedResult) {
        String result = Roman_numbers.Roman_numbers(input);

        Assertions.assertThat(result).isEqualTo(expectedResult);
    }
}
