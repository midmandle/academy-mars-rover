import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_0_0_N_when_no_commands_given() {
        MarsRover rover = new MarsRover();

        String output = rover.run("");

        assertEquals("0:0:N", output);
    }
}
