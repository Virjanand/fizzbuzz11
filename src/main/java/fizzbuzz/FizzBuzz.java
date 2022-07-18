package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<String> fizzBuzzNumers() {
        return IntStream.rangeClosed(1, 100).mapToObj(i -> getString(i)).collect(Collectors.toList());
    }

    private String getString(int i) {
        if (i == 3) {
            return "Fizz";
        }
        return Integer.toString(i);
    }
}
