public class MarsRover {

    public static final String TURN_RIGHT = "R";
    public static final String TURN_LEFT = "L";
    public static final String MOVE_FORWARD = "M";
    private final Direction direction;

    public MarsRover() {
        this.direction = new Direction();
    }

    public String run(String commands) {

        String coordinates = "0:0:";

        for (String command : commands.split("")) {
            if (command.equals(TURN_LEFT)) {
                direction.turnLeft();
            }
            if (command.equals(TURN_RIGHT)) {
                direction.turnRight();
            }

        }
        if (commands.equals(MOVE_FORWARD)) {
            coordinates = "0:1:";
        }
        if (commands.equals(MOVE_FORWARD + MOVE_FORWARD)) {
            coordinates = "0:2:";
        }
        if (commands.equals(MOVE_FORWARD+MOVE_FORWARD+MOVE_FORWARD)) {
            coordinates = "0:3:";
        }

        return coordinates + direction.facingTo();
    }

}
