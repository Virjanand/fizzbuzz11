package fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void get100NumbersAsString() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzzNumers()).hasSize(100);
    }

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "3, Fizz",
            "5, Buzz",
            "6, Fizz",
            "10, Buzz",
            "15, FizzBuzz",
            "30, FizzBuzz",
    })
    void replaceNumberWithFizzBuzzString(int number, String fizzBuzzString) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzzNumers().get(number - 1)).isEqualTo(fizzBuzzString);
    }
}
