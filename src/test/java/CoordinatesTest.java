import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinatesTest {

    @ParameterizedTest
    @CsvSource({
            "M, 0:1:N",
            "MM, 0:2:N",
            "MMM, 0:3:N"
    })
    void should_be_able_to_move_north(String input, String expectedOutput) {
        MarsRover rover = new MarsRover();

        String output = rover.run(input);

        assertEquals(expectedOutput, output);
    }

    @ParameterizedTest
    @CsvSource({
            "MMMRRM, 0:2:S",
            "MMMRRMM, 0:1:S",
            "MMMRRMMM, 0:0:S",
    })
    void should_be_able_to_move_south(String input, String expectedOutput) {
        MarsRover rover = new MarsRover();

        String output = rover.run(input);

        assertEquals(expectedOutput, output);
    }
    @ParameterizedTest
    @CsvSource({
            "RM, 1:0:E",
            "RMMMMMM, 6:0:E",
    })
    void should_be_able_to_move_east(String input, String expectedOutput) {
        MarsRover rover = new MarsRover();

        String output = rover.run(input);

        assertEquals(expectedOutput, output);
    }
    @ParameterizedTest
    @CsvSource({
            "RMMMMLLMM, 2:0:W",
            "RMMMMMRRM, 4:0:W",
    })
    void should_be_able_to_move_west(String input, String expectedOutput) {
        MarsRover rover = new MarsRover();

        String output = rover.run(input);

        assertEquals(expectedOutput, output);
    }

}
