public class MarsRover {

    public static final String TURN_RIGHT = "R";
    public static final String TURN_LEFT = "L";
    public static final String MOVE_FORWARD = "M";
    private final Direction direction;

    public MarsRover() {
        this.direction = new Direction();
    }

    public String run(String commands) {
        int YPosition = 0;
        String coordinates = "0:%d:%s";

        for (String command : commands.split("")) {
            if (command.equals(TURN_LEFT)) {
                direction.turnLeft();
            }
            if (command.equals(TURN_RIGHT)) {
                direction.turnRight();
            }
            if (command.equals(MOVE_FORWARD)) {
                YPosition = moveYAxis(YPosition);
            }
        }

        return String.format(coordinates, YPosition, direction.facingTo());
    }

    private int moveYAxis(int YPosition) {
        if(direction.facingTo().equals("N")) {
            YPosition++;
        }
        if(direction.facingTo().equals("S")){
            YPosition = YPosition - 1;
        }
        return YPosition;
    }

}
