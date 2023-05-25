import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_0_0_N_when_no_commands_given() {
        MarsRover rover = new MarsRover();

        String output = rover.run("");

        assertEquals("0:0:N", output);
    }
    @Test
    public void should_return_0_0_E_when_command_R_is_given() {
        MarsRover rover = new MarsRover();

        String output = rover.run("R");

        assertEquals("0:0:E", output);
    }

    @Test
    public void should_return_0_0_S_when_command_RR_is_given() {
        MarsRover rover = new MarsRover();

        String output = rover.run("RR");

        assertEquals("0:0:S", output);
    }

}
