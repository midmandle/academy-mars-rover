public class MarsRover {

    public static final String TURN_RIGHT = "R";
    public static final String TURN_LEFT = "L";

    public String run(String commands) {
        String coordinates = "0:0:";
        Direction direction = Direction.NORTH;

        if (commands.equals(TURN_LEFT+TURN_LEFT+TURN_RIGHT)) {
            return coordinates + Direction.WEST.getValue();
        }
        if (commands.equals(TURN_RIGHT+TURN_RIGHT+TURN_LEFT)) {
            return coordinates + Direction.EAST.getValue();
        }

        if(commands.contains(TURN_LEFT)) {
            for (int i = 0; i < commands.length(); i++) {
                direction = turnLeft(direction);
            }
        }

        if(commands.contains(TURN_RIGHT)) {
            direction = turnRight(commands);
        }

        return coordinates + direction.getValue();
    }

    private static Direction turnLeft(Direction currentDirection){
        switch(currentDirection) {
            case WEST -> {
                return Direction.SOUTH;
            }
            case SOUTH -> {
                return Direction.EAST;
            }
            case EAST -> {
                return Direction.NORTH;
            }
            default ->  {
                return Direction.WEST;
            }
        }
    }

    private static Direction turnRight(String commands) {
        Direction newDirection = Direction.NORTH;
        if (commands.equals(TURN_RIGHT)) {
            newDirection = Direction.EAST;
        }
        if (commands.equals(TURN_RIGHT + TURN_RIGHT)) {
            newDirection = Direction.SOUTH;
        }
        if (commands.equals(TURN_RIGHT + TURN_RIGHT + TURN_RIGHT)) {
            newDirection = Direction.WEST;
        }
        return newDirection;
    }
}
