import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_0_0_N_when_no_commands_given() {
        MarsRover rover = new MarsRover();

        String output = rover.run("");

        assertEquals("0:0:N", output);
    }
    @ParameterizedTest
    @CsvSource({
            "R, 0:0:E",
            "RR, 0:0:S",
            "RRR, 0:0:W",
            "RRRR, 0:0:N",
    })
    public void should_rotate_right_when_command_is_R(String input, String expectedOutput) {
        MarsRover rover = new MarsRover();

        String output = rover.run(input);

        assertEquals(expectedOutput, output);
    }
}
