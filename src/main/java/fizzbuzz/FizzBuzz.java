package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<String> fizzBuzzNumers() {
        return IntStream.rangeClosed(1, 100).mapToObj(this::toFizzBuzz).collect(Collectors.toList());
    }

    private String toFizzBuzz(int number) {
        if (number == 3) {
            return "Fizz";
        }
        return Integer.toString(number);
    }
}
