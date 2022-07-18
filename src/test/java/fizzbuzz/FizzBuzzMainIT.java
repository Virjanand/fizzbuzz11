package fizzbuzz;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzMainIT {

    @Test
    void printListOfFizzBuzzNumbers() {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        PrintStream originalOutputStream = System.out;

        try {
            System.setOut(new PrintStream(bytes));
            FizzBuzzMain.main(new String[]{});
        }
        finally {
            System.setOut(originalOutputStream);
        }

        assertThat(bytes.toString()).contains("1\r\n2\r\nFizz\r\n4\r\nBuzz");
    }
}
