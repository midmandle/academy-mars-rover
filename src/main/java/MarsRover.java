public class MarsRover {

    public static final String TURN_RIGHT = "R";

    public String run(String commands) {
        String coordinates = "0:0:";
        String direction = "N";
        if (commands.equals(TURN_RIGHT)) {
            direction = "E";
        }
        if (commands.equals(TURN_RIGHT + TURN_RIGHT)) {
            direction = "S";
        }
        if (commands.equals(TURN_RIGHT + TURN_RIGHT + TURN_RIGHT)) {
            direction = "W";
        }
        return coordinates + direction;
    }
}
