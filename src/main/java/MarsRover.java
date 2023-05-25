public class MarsRover {

    public static final String TURN_RIGHT = "R";
    public static final String TURN_LEFT = "L";

    public String run(String commands) {
        String coordinates = "0:0:";
        String direction = "N";
        if(commands.contains(TURN_LEFT)) {
            direction = turnLeft(commands, direction);
        }
        if(commands.contains(TURN_RIGHT)) {
            direction = turnRight(commands, direction);
        }

        return coordinates + direction;
    }
    private static String turnLeft(String commands, String direction) {
        if (commands.equals(TURN_LEFT)) {
            direction = "W";
        }
        if (commands.equals(TURN_LEFT + TURN_LEFT)) {
            direction = "S";
        }
        if (commands.equals(TURN_LEFT + TURN_LEFT + TURN_LEFT)) {
            direction = "E";
        }
        return direction;
    }

    private static String turnRight(String commands, String direction) {
        if (commands.equals(TURN_RIGHT)) {
            direction = "E";
        }
        if (commands.equals(TURN_RIGHT + TURN_RIGHT)) {
            direction = "S";
        }
        if (commands.equals(TURN_RIGHT + TURN_RIGHT + TURN_RIGHT)) {
            direction = "W";
        }
        return direction;
    }
}
